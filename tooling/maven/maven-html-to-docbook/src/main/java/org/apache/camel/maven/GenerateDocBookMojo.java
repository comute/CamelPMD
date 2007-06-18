/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileWriter;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.net.URL;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NamedNodeMap;

import org.w3c.tidy.Tidy;

/**
 * Goal which extracts the content of a wiki page and converts it to docbook
 * format
 * 
 * @goal htmlToDocbook
 * @phase process-sources
 */
public class GenerateDocBookMojo extends AbstractMojo {

	/**
	 * Base URL.
	 * 
	 * @parameter expression="${baseURL}"
	 *            default-value="http://activemq.apache.org/camel/"
	 * @required
	 */
	private String baseURL;

	/**
	 * List of resources
	 * 
	 * @parameter
	 */
	private String[] resources;

	/**
	 * List of author's fullname
	 * 
	 * @parameter
	 */
	private String[] authors;

	/**
	 * Location of the xsl file.
	 * 
	 * @parameter expression="${configDirectory}"
	 *            default-value="${basedir}/src/styles/docbook.xsl"
	 * @required
	 */
	private String xslFile;

	/**
	 * Location of the output directory.
	 * 
	 * @parameter expression="${project.build.directory}/docbkx/source"
	 */
	private String outputPath;

	/**
	 * @parameter expression="${title}"
	 * @required
	 */
	private String title;

	/**
	 * @parameter expression="${subtitle}"
	 */
	private String subtitle;

	/**
	 * @parameter expression="${version}" default-value="${project.version}"
	 */
	private String version;

	/**
	 * @parameter expression="${legalNotice}"
	 */
	private String legalNotice;

	/**
	 * Location of image files.
	 * 
	 * @parameter expression="${imageLocation}"
	 *            ${project.build.directory}/docbkx/source/images"
	 */
	private String imageLocation;

	private String chapterId;

	private String chapterTitle;

	public void execute() throws MojoExecutionException {
		File outputDir = new File(outputPath);
		if (!outputDir.exists()) {
			outputDir.mkdirs();
		}
		this.createMainXML();

		for (int i = 0; i < resources.length; ++i) {
			this.setChapterId( removeExtension(resources[i]));
			this.setChapterTitle( removeExtension(resources[i]));

			process(resources[i]);
		}

	}

	
	/**
	 * Extract the wiki content and tranform it into docbook format
	 * 
	 * @param resource
	 */
	public void process(String resource) {

		Tidy tidy = new Tidy();
		ByteArrayOutputStream out;

		tidy.setXmlOut(true);
		try {
			out = new ByteArrayOutputStream();
			URL u = new URL(baseURL + resource);
			Document doc = tidy.parseDOM(
					new BufferedInputStream(u.openStream()), out);
			out.close();
			// let's extract the div element with class="wiki-content
			// maincontent"
			NodeList nodeList = doc.getElementsByTagName("div");
			for (int i = 0; i < nodeList.getLength(); ++i) {
				Node node = nodeList.item(i);

				NamedNodeMap nm = node.getAttributes();
				Node attr = nm.getNamedItem("class");

				if (attr != null
						&& attr.getNodeValue().equalsIgnoreCase(
								"wiki-content maincontent")) {

					// These attributes will be used by xsl to
					Element element = (Element) node;
					element.setAttribute("chapterId", chapterId);
					element.setAttribute("chapterTitle", chapterTitle);
					element.setAttribute("baseURL", baseURL);
					element.setAttribute("imageLocation", imageLocation);

					DOMSource source = new DOMSource(node);

					 
					BufferedOutputStream output = new BufferedOutputStream(
							new FileOutputStream(outputPath + File.separator
									+ removeExtension(resource) + ".xml"));
					StreamResult result = new StreamResult(output);
					TransformerFactory tFactory = TransformerFactory
							.newInstance();
					Transformer transformer = tFactory
							.newTransformer(new StreamSource(xslFile));
					transformer.transform(source, result);

					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(this.toString() + e.toString());
		}
	}
	
	
	/*
	 *  create the main docbook xml file 
	 */
	public void createMainXML() {
		try {

			PrintWriter out = new PrintWriter(new FileWriter(outputPath
					+ File.separator + title + ".xml"));

			out
					.println("<!DOCTYPE book PUBLIC \"-//OASIS//DTD DocBook XML V4.4//EN\" \"http://www.oasis-open.org/docbook/xml/4.4/docbookx.dtd\" ");
			out.println("[");

			for (int i = 0; i < resources.length; ++i) {
				out.println("<!ENTITY " +  removeExtension(resources[i]) + " SYSTEM \"" +  removeExtension(resources[i])
						+ ".xml\">");
			}

			out.println("]>");
			out.println("<book>");
			out.println("<bookinfo>");
			out.println("<title>" + title + "</title>");
			out.println("<subtitle>" + subtitle + "</subtitle>");
			out.println("<releaseinfo>" + version + "</releaseinfo>");
			out.println(" <authorgroup>");
			if (authors != null) {
				for (int i = 0; i < authors.length; ++i) {
					StringTokenizer name = new StringTokenizer(authors[i]);
					String fname = name.nextToken();
					String lname = "";
					if (name.hasMoreTokens()) {
						lname = name.nextToken();
					}
					out.println("<author>");
					out.println("<firstname>" + fname + "</firstname>");
					out.println("<surname>" + lname + "</surname>");
					out.println("</author>");

				}
			}

			out.println("</authorgroup>");
			out.println("<legalnotice>");
			if (legalNotice != null && legalNotice.length() > 0) {
				out.println("<para>");
				out.println(legalNotice);
				out.println("</para>");
			} else {
				out
						.println("<para>Licensed to the Apache Software Foundation (ASF) under one or more");
				out
						.println("contributor license agreements. See the NOTICE file distributed with");
				out
						.println("this work for additional information regarding copyright ownership. The");
				out
						.println("ASF licenses this file to You under the Apache License, Version 2.0 (the");
				out
						.println("\"License\"); you may not use this file except in compliance with the");
				out
						.println("License. You may obtain a copy of the License at</para>");
				out
						.println("<para>http://www.apache.org/licenses/LICENSE-2.0</para>");
				out
						.println("<para>Unless required by applicable law or agreed to in writing,");
				out
						.println(" software distributed under the License is distributed on an \"AS IS\"");
				out
						.println("BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or");
				out
						.println("implied. See the License for the specific language governing permissions");
				out.println("and limitations under the License.</para>");
			}

			out.println("</legalnotice>");
			out.println("</bookinfo>");
			out.println("<toc></toc>");

			for (int i = 0; i < resources.length; ++i) {
				out.println("&" + removeExtension(resources[i]) + ";");
			}

			out.println("</book>");
			out.flush();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getChapterId() {
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterTitle() {
		return chapterTitle;
	}

	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}
	
	public String removeExtension(String resource) {
		int index = resource.indexOf('.');
		return resource.substring(0, index);		
	}
}
