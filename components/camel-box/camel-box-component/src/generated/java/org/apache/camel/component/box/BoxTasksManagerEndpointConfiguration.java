
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxTasksManager
 */
@ApiParams(apiName = "tasks", apiMethods = "addAssignment,add,delete,deleteAssignment,tasks,assignmentInfo,assignments,info,updateInfo")
@UriParams
@Configurer
public final class BoxTasksManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam(description = "The action the task assignee will be prompted to do")
    private com.box.sdk.BoxTask.Action action;
    @UriParam(description = "The user to assign to task")
    private com.box.sdk.BoxUser assignTo;
    @UriParam(description = "The day at which this task is due")
    private java.util.Date dueAt;
    @UriParam(description = "The id of file to add task to")
    private String fileId;
    @UriParam(description = "The updated information")
    private com.box.sdk.BoxTask.Info info;
    @UriParam(description = "An optional message to include with the task")
    private String message;
    @UriParam(description = "The id of task assignment to delete.Skip navigation links")
    private String taskAssignmentId;
    @UriParam(description = "The id of task to add assignment for")
    private String taskId;

    public com.box.sdk.BoxTask.Action getAction() {
        return action;
    }

    public void setAction(com.box.sdk.BoxTask.Action action) {
        this.action = action;
    }

    public com.box.sdk.BoxUser getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(com.box.sdk.BoxUser assignTo) {
        this.assignTo = assignTo;
    }

    public java.util.Date getDueAt() {
        return dueAt;
    }

    public void setDueAt(java.util.Date dueAt) {
        this.dueAt = dueAt;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.box.sdk.BoxTask.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxTask.Info info) {
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTaskAssignmentId() {
        return taskAssignmentId;
    }

    public void setTaskAssignmentId(String taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
