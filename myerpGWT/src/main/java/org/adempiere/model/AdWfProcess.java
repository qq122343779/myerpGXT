package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_wf_process")
public class AdWfProcess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adMessageId;
	private Integer adOrgId;
	private Integer adTableId;
	private Integer adUserId;
	private Integer adWfProcessId;
	private Integer adWfResponsibleId;
	private Integer adWorkflowId;
	private String created;
	private Integer createdby;
	private String isactive;
	private Integer priority;
	private String processed;
	private String processing;
	private Integer recordId;
	private String textmsg;
	private String updated;
	private Integer updatedby;
	private String wfstate;

	public AdWfProcess() {
	}

	public AdWfProcess(Integer adWfProcessId) {
		this.adWfProcessId = adWfProcessId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_MESSAGE_ID")
	public Integer getAdMessageId() {
		return adMessageId;
	}

	public void setAdMessageId(Integer adMessageId) {
		this.adMessageId = adMessageId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(name="AD_USER_ID")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Id
	@Column(name="AD_WF_PROCESS_ID")
	public Integer getAdWfProcessId() {
		return adWfProcessId;
	}

	public void setAdWfProcessId(Integer adWfProcessId) {
		this.adWfProcessId = adWfProcessId;
	}

	@Basic
	@Column(name="AD_WF_RESPONSIBLE_ID", nullable=false)
	public Integer getAdWfResponsibleId() {
		return adWfResponsibleId;
	}

	public void setAdWfResponsibleId(Integer adWfResponsibleId) {
		this.adWfResponsibleId = adWfResponsibleId;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID", nullable=false)
	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="RECORD_ID", nullable=false)
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@Basic
	@Column(length=2000)
	public String getTextmsg() {
		return textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getWfstate() {
		return wfstate;
	}

	public void setWfstate(String wfstate) {
		this.wfstate = wfstate;
	}
}