package com.iris.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bug_Details")
public class BugDetails {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="bug_alloction_id")
private int bugAllocateId;

@Column(name="user_id")
private int userId;

@Column(name="project_Id")
private String projectId;

@Column(name="bug_Type_Id")
private String bugTypeId;

@Column(name="sev_Id")
private String severityId;

@Column(name="status_id")
private String statusId;


@Column(name="planed_Assign_Date")
private Date plannedStartdate;

@Column(name="planed_End_Date")
private Date plannedEndDate;

@Column(name="actual_Start_Date")
private Date actualStartDate;

@Column(name="actual_End_Date")
private Date actualEndDate;

@Column(name="description")
private String desc;

@Override
public String toString() {
	return "BugDetails [bugAllocateId=" + bugAllocateId + ", userId=" + userId + ", projectId=" + projectId
			+ ", bugTypeId=" + bugTypeId + ", severityId=" + severityId + ", statusId=" + statusId
			+ ", plannedStartdate=" + plannedStartdate + ", plannedEndDate=" + plannedEndDate + ", actualStartDate="
			+ actualStartDate + ", actualEndDate=" + actualEndDate + ", desc=" + desc + "]";
}

public int getBugAllocateId() {
	return bugAllocateId;
}

public void setBugAllocateId(int bugAllocateId) {
	this.bugAllocateId = bugAllocateId;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getProjectId() {
	return projectId;
}

public void setProjectId(String projectId) {
	this.projectId = projectId;
}

public String getBugTypeId() {
	return bugTypeId;
}

public void setBugTypeId(String bugTypeId) {
	this.bugTypeId = bugTypeId;
}

public String getSeverityId() {
	return severityId;
}

public void setSeverityId(String severityId) {
	this.severityId = severityId;
}

public String getStatusId() {
	return statusId;
}

public void setStatusId(String statusId) {
	this.statusId = statusId;
}

public Date getPlannedStartdate() {
	return plannedStartdate;
}

public void setPlannedStartdate(Date plannedStartdate) {
	this.plannedStartdate = plannedStartdate;
}

public Date getPlannedEndDate() {
	return plannedEndDate;
}

public void setPlannedEndDate(Date plannedEndDate) {
	this.plannedEndDate = plannedEndDate;
}

public Date getActualStartDate() {
	return actualStartDate;
}

public void setActualStartDate(Date actualStartDate) {
	this.actualStartDate = actualStartDate;
}

public Date getActualEndDate() {
	return actualEndDate;
}

public void setActualEndDate(Date actualEndDate) {
	this.actualEndDate = actualEndDate;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}



}
