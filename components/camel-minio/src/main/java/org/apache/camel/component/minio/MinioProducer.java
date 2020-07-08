/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.minio;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import io.minio.MinioClient;
import io.minio.ObjectWriteResponse;
import io.minio.PutObjectArgs;
import io.minio.UploadObjectArgs;
import org.apache.camel.*;
import org.apache.camel.support.DefaultProducer;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.IOHelper;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.URISupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.services.s3.model.BucketCannedACL;

/**
 * A Producer which sends messages to the Minio Simple Storage
 */
public class MinioProducer extends DefaultProducer {

    private static final Logger LOG = LoggerFactory.getLogger(MinioProducer.class);

    private transient String minioProducerToString;

    public MinioProducer(final Endpoint endpoint) {
        super(endpoint);
    }

    public static Message getMessageForResponse(final Exchange exchange) {
        return exchange.getMessage();
    }

    @Override
    public void process(final Exchange exchange) throws Exception {
        MinioOperations operation = determineOperation(exchange);
        if (ObjectHelper.isEmpty(operation)) {
            processSingleOp(exchange);
        } else {
            MinioClient minioClient = getEndpoint().getMinioClient();
            switch (operation) {
                case copyObject:
                    copyObject(minioClient, exchange);
                    break;
                case deleteObject:
                    deleteObject(minioClient, exchange);
                    break;
                case listBuckets:
                    listBuckets(minioClient, exchange);
                    break;
                case deleteBucket:
                    deleteBucket(minioClient, exchange);
                    break;
                case listObjects:
                    listObjects(minioClient, exchange);
                    break;
                case getObject:
                    getObject(minioClient, exchange);
                    break;
                case getObjectRange:
                    getObjectRange(minioClient, exchange);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation");
            }
        }
    }

    public void processSingleOp(final Exchange exchange) throws Exception {

        final String bucketName = determineBucketName(exchange);
        final String key = determineKey(exchange);
        Map<String, String> objectMetadata = determineMetadata(exchange);
        Map<String, String> extraHeaders = determineExtraHeaders(exchange);

        File filePayload = null;
        InputStream is;
        ByteArrayOutputStream baos;
        Object obj = exchange.getIn().getMandatoryBody();
        PutObjectArgs.Builder putObjectRequest = null;
        UploadObjectArgs.Builder uploadObjectRequest;

        // Need to check if the message body is WrappedFile
        if (obj instanceof WrappedFile) {
            obj = ((WrappedFile<?>) obj).getFile();
        }
        if (obj instanceof File) {
            filePayload = (File) obj;
            is = new FileInputStream(filePayload);
        } else {
            is = exchange.getIn().getMandatoryBody(InputStream.class);
            if (objectMetadata.containsKey(Exchange.CONTENT_LENGTH)) {
                if (objectMetadata.get("Content-Length").equals("0") && ObjectHelper.isEmpty(exchange.getProperty(Exchange.CONTENT_LENGTH))) {
                    LOG.debug("The content length is not defined. It needs to be determined by reading the data into memory");
                    baos = determineLengthInputStream(is);
                    objectMetadata.put("Content-Length", String.valueOf(baos.size()));
                    is = new ByteArrayInputStream(baos.toByteArray());
                } else {
                    if (ObjectHelper.isNotEmpty(exchange.getProperty(Exchange.CONTENT_LENGTH))) {
                        objectMetadata.put("Content-Length", exchange.getProperty(Exchange.CONTENT_LENGTH, String.class));
                    }
                }
            }
        }
        putObjectRequest = PutObjectArgs.builder().stream(is, is.available(), -1).extraHeaders(extraHeaders).userMetadata(objectMetadata);

        if (getConfiguration().getServerSideEncryption() != null) {
            putObjectRequest.sse(getConfiguration().getServerSideEncryption());
        }

        LOG.trace("Put object from exchange...");

        ObjectWriteResponse putObjectResult = getEndpoint().getMinioClient().putObject(putObjectRequest.build());

        LOG.trace("Received result...");

        Message message = getMessageForResponse(exchange);
        message.setHeader(MinioConstants.E_TAG, putObjectResult.etag());
        if (putObjectResult.versionId() != null) {
            message.setHeader(MinioConstants.VERSION_ID, putObjectResult.versionId());
        }

        IOHelper.close(is);

        if (getConfiguration().isDeleteAfterWrite() && filePayload != null) {
            FileUtil.deleteFile(filePayload);
        }
    }

    private Map<String, String> determineExtraHeaders(Exchange exchange) {
        Map<String, String> extraHeaders = new HashMap<>();
        String storageClass = determineStorageClass(exchange);
        if (storageClass != null) {
            extraHeaders.put("X-Amz-Storage-Class", storageClass);
        }

        String cannedAcl = exchange.getIn().getHeader(MinioConstants.CANNED_ACL, String.class);
        if (cannedAcl != null) {
            extraHeaders.put("x-amz-acl", cannedAcl);
        }

        BucketCannedACL acl = exchange.getIn().getHeader(MinioConstants.ACL, BucketCannedACL.class);
        if (acl != null) {
            // note: if cannedacl and acl are both specified the last one will
            // be used. refer to
            // PutObjectRequest#setAccessControlList for more details
            extraHeaders.put("x-amz-acl", acl.toString());
        }
        return extraHeaders;
    }

    private void copyObject(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {
        final String bucketName = determineBucketName(exchange);
        final String sourceKey = determineKey(exchange);
        final String destinationKey = exchange.getIn().getHeader(MinioConstants.DESTINATION_KEY, String.class);
        final String bucketNameDestination = exchange.getIn().getHeader(MinioConstants.BUCKET_DESTINATION_NAME, String.class);
        if (getConfiguration().isPojoRequest()) {
            Object payload = exchange.getIn().getMandatoryBody();
            if (payload instanceof CopyObjectRequest) {
                CopyObjectResponse result;
                result = minioClient.copyObject((CopyObjectRequest) payload);
                Message message = getMessageForResponse(exchange);
                message.setBody(result);
            }
        } else {
            if (ObjectHelper.isEmpty(bucketNameDestination)) {
                throw new IllegalArgumentException("Bucket Name Destination must be specified for copyObject Operation");
            }
            if (ObjectHelper.isEmpty(destinationKey)) {
                throw new IllegalArgumentException("Destination Key must be specified for copyObject Operation");
            }
            CopyObjectRequest.Builder copyObjectRequest = CopyObjectRequest.builder();
            copyObjectRequest = CopyObjectRequest.builder().destinationBucket(bucketNameDestination).destinationKey(destinationKey).copySource(bucketName + "/" + sourceKey);

            if (getConfiguration().isUseAwsKMS()) {
                if (ObjectHelper.isNotEmpty(getConfiguration().getAwsKMSKeyId())) {
                    copyObjectRequest.ssekmsKeyId(getConfiguration().getAwsKMSKeyId());
                }
            }

            if (getConfiguration().isUseCustomerKey()) {
                if (ObjectHelper.isNotEmpty(getConfiguration().getCustomerKeyId())) {
                    copyObjectRequest.sseCustomerKey(getConfiguration().getCustomerKeyId());
                }
                if (ObjectHelper.isNotEmpty(getConfiguration().getCustomerKeyMD5())) {
                    copyObjectRequest.sseCustomerKeyMD5(getConfiguration().getCustomerKeyMD5());
                }
                if (ObjectHelper.isNotEmpty(getConfiguration().getCustomerAlgorithm())) {
                    copyObjectRequest.sseCustomerAlgorithm(getConfiguration().getCustomerAlgorithm());
                }
            }

            CopyObjectResponse copyObjectResult = minioClient.copyObject(copyObjectRequest.build());

            Message message = getMessageForResponse(exchange);
            if (copyObjectResult.versionId() != null) {
                message.setHeader(MinioConstants.VERSION_ID, copyObjectResult.versionId());
            }
        }
    }

    private void deleteObject(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {
        final String bucketName = determineBucketName(exchange);
        final String sourceKey = determineKey(exchange);
        if (getConfiguration().isPojoRequest()) {
            Object payload = exchange.getIn().getMandatoryBody();
            if (payload instanceof DeleteObjectRequest) {
                minioClient.deleteObject((DeleteObjectRequest) payload);
                Message message = getMessageForResponse(exchange);
                message.setBody(true);
            }
        } else {

            DeleteObjectRequest.Builder deleteObjectRequest = DeleteObjectRequest.builder().bucket(bucketName).key(sourceKey);
            minioClient.deleteObject(deleteObjectRequest.build());

            Message message = getMessageForResponse(exchange);
            message.setBody(true);
        }
    }

    private void listBuckets(MinioClient minioClient, Exchange exchange) {
        ListBucketsResponse bucketsList = minioClient.listBuckets();

        Message message = getMessageForResponse(exchange);
        message.setBody(bucketsList.buckets());
    }

    private void deleteBucket(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {
        final String bucketName = determineBucketName(exchange);

        if (getConfiguration().isPojoRequest()) {
            Object payload = exchange.getIn().getMandatoryBody();
            if (payload instanceof DeleteBucketRequest) {
                DeleteBucketResponse resp = minioClient.deleteBucket((DeleteBucketRequest) payload);
                Message message = getMessageForResponse(exchange);
                message.setBody(resp);
            }
        } else {

            DeleteBucketRequest.Builder deleteBucketRequest = DeleteBucketRequest.builder().bucket(bucketName);
            DeleteBucketResponse resp = minioClient.deleteBucket(deleteBucketRequest.build());

            Message message = getMessageForResponse(exchange);
            message.setBody(resp);
        }
    }

    private void getObject(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {

        if (getConfiguration().isPojoRequest()) {
            Object payload = exchange.getIn().getMandatoryBody();
            if (payload instanceof GetObjectRequest) {
                ResponseInputStream<GetObjectResponse> res = minioClient.getObject((GetObjectRequest) payload, ResponseTransformer.toInputStream());
                Message message = getMessageForResponse(exchange);
                message.setBody(res);
            }
        } else {
            final String bucketName = determineBucketName(exchange);
            final String sourceKey = determineKey(exchange);
            GetObjectRequest.Builder req = GetObjectRequest.builder().bucket(bucketName).key(sourceKey);
            ResponseInputStream<GetObjectResponse> res = minioClient.getObject(req.build(), ResponseTransformer.toInputStream());

            Message message = getMessageForResponse(exchange);
            message.setBody(res);
        }
    }

    private void getObjectRange(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {
        final String bucketName = determineBucketName(exchange);
        final String sourceKey = determineKey(exchange);
        final String rangeStart = exchange.getIn().getHeader(MinioConstants.RANGE_START, String.class);
        final String rangeEnd = exchange.getIn().getHeader(MinioConstants.RANGE_END, String.class);

        if (getConfiguration().isPojoRequest()) {
            Object payload = exchange.getIn().getMandatoryBody();
            if (payload instanceof GetObjectRequest) {
                ResponseInputStream<GetObjectResponse> res = minioClient.getObject((GetObjectRequest) payload, ResponseTransformer.toInputStream());
                Message message = getMessageForResponse(exchange);
                message.setBody(res);
            }
        } else {

            if (ObjectHelper.isEmpty(rangeStart) || ObjectHelper.isEmpty(rangeEnd)) {
                throw new IllegalArgumentException("A Range start and range end header must be configured to perform a range get operation.");
            }

            GetObjectRequest.Builder req = GetObjectRequest.builder().bucket(bucketName).key(sourceKey)
                    .range("bytes=" + Long.parseLong(rangeStart) + "-" + Long.parseLong(rangeEnd));
            ResponseInputStream<GetObjectResponse> res = minioClient.getObject(req.build(), ResponseTransformer.toInputStream());

            Message message = getMessageForResponse(exchange);
            message.setBody(res);
        }
    }

    private void listObjects(MinioClient minioClient, Exchange exchange) throws InvalidPayloadException {
        final String bucketName = determineBucketName(exchange);

        if (getConfiguration().isPojoRequest()) {
            Object payload = exchange.getIn().getMandatoryBody();
            if (payload instanceof ListObjectsRequest) {
                ListObjectsResponse objectList = minioClient.listObjects((ListObjectsRequest) payload);
                Message message = getMessageForResponse(exchange);
                message.setBody(objectList.contents());
            }
        } else {

            ListObjectsResponse objectList = minioClient.listObjects(ListObjectsRequest.builder().bucket(bucketName).build());

            Message message = getMessageForResponse(exchange);
            message.setBody(objectList.contents());
        }
    }

    private MinioOperations determineOperation(Exchange exchange) {
        MinioOperations operation = exchange.getIn().getHeader(MinioConstants.Minio_OPERATION, MinioOperations.class);
        if (operation == null) {
            operation = getConfiguration().getOperation();
        }
        return operation;
    }

    private Map<String, String> determineMetadata(final Exchange exchange) {
        Map<String, String> objectMetadata = new HashMap<>();

        Long contentLength = exchange.getIn().getHeader(MinioConstants.CONTENT_LENGTH, Long.class);
        if (contentLength != null) {
            objectMetadata.put("Content-Length", String.valueOf(contentLength));
        }

        String contentType = exchange.getIn().getHeader(MinioConstants.CONTENT_TYPE, String.class);
        if (contentType != null) {
            objectMetadata.put("Content-Type", contentType);
        }

        String cacheControl = exchange.getIn().getHeader(MinioConstants.CACHE_CONTROL, String.class);
        if (cacheControl != null) {
            objectMetadata.put("Cache-Control", cacheControl);
        }

        String contentDisposition = exchange.getIn().getHeader(MinioConstants.CONTENT_DISPOSITION, String.class);
        if (contentDisposition != null) {
            objectMetadata.put("Content-Disposition", contentDisposition);
        }

        String contentEncoding = exchange.getIn().getHeader(MinioConstants.CONTENT_ENCODING, String.class);
        if (contentEncoding != null) {
            objectMetadata.put("Content-Encoding", contentEncoding);
        }

        String contentMD5 = exchange.getIn().getHeader(MinioConstants.CONTENT_MD5, String.class);
        if (contentMD5 != null) {
            objectMetadata.put("Content-Md5", contentMD5);
        }

        return objectMetadata;
    }

    /**
     * Reads the bucket name from the header of the given exchange. If not
     * provided, it's read from the endpoint configuration.
     *
     * @param exchange The exchange to read the header from.
     * @return The bucket name.
     * @throws IllegalArgumentException if the header could not be determined.
     */
    private String determineBucketName(final Exchange exchange) {
        String bucketName = exchange.getIn().getHeader(MinioConstants.BUCKET_NAME, String.class);

        if (ObjectHelper.isEmpty(bucketName)) {
            bucketName = getConfiguration().getBucketName();
            LOG.trace("Minio Bucket name header is missing, using default one [{}]", bucketName);
        }

        if (bucketName == null) {
            throw new IllegalArgumentException("Minio Bucket name header is missing or not configured.");
        }

        return bucketName;
    }

    private String determineKey(final Exchange exchange) {
        String key = exchange.getIn().getHeader(MinioConstants.KEY, String.class);
        if (ObjectHelper.isEmpty(key)) {
            key = getConfiguration().getKeyName();
        }
        if (key == null) {
            throw new IllegalArgumentException("Minio Key header is missing.");
        }
        return key;
    }

    private String determineStorageClass(final Exchange exchange) {
        String storageClass = exchange.getIn().getHeader(MinioConstants.STORAGE_CLASS, String.class);
        if (storageClass == null) {
            storageClass = getConfiguration().getStorageClass();
        }

        return storageClass;
    }

    private ByteArrayOutputStream determineLengthInputStream(InputStream is) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int count;
        while ((count = is.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }
        return out;
    }

    protected MinioConfiguration getConfiguration() {
        return getEndpoint().getConfiguration();
    }

    @Override
    public String toString() {
        if (minioProducerToString == null) {
            minioProducerToString = "MinioProducer[" + URISupport.sanitizeUri(getEndpoint().getEndpointUri()) + "]";
        }
        return minioProducerToString;
    }

    @Override
    public MinioEndpoint getEndpoint() {
        return (MinioEndpoint) super.getEndpoint();
    }

}
