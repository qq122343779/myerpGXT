package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_issueknown")
public class RIssueknown extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String issuestatus;
	private String issuesummary;
	private Integer lineno;
	private String loggername;
	private String processing;
	private Integer rIssueknownId;
	private Integer rIssuerecommendationId;
	private Integer rIssuestatusId;
	private Integer rRequestId;
	private String releaseno;
	private String sourceclassname;
	private String sourcemethodname;
	private String updated;
	private Integer updatedby;

	public RIssueknown() {
	}

	public RIssueknown(Integer rIssueknownId) {
		this.rIssueknownId = rIssueknownId;
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
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	@Column(length=2000)
	public String getIssuestatus() {
		return issuestatus;
	}

	public void setIssuestatus(String issuestatus) {
		this.issuestatus = issuestatus;
	}

	@Basic
	@Column(nullable=false)
	public String getIssuesummary() {
		return issuesummary;
	}

	public void setIssuesummary(String issuesummary) {
		this.issuesummary = issuesummary;
	}

	@Basic
	public Integer getLineno() {
		return lineno;
	}

	public void setLineno(Integer lineno) {
		this.lineno = lineno;
	}

	@Basic
	@Column(length=60)
	public String getLoggername() {
		return loggername;
	}

	public void setLoggername(String loggername) {
		this.loggername = loggername;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Id
	@Column(name="R_ISSUEKNOWN_ID")
	public Integer getRIssueknownId() {
		return rIssueknownId;
	}

	public void setRIssueknownId(Integer rIssueknownId) {
		this.rIssueknownId = rIssueknownId;
	}

	@Basic
	@Column(name="R_ISSUERECOMMENDATION_ID")
	public Integer getRIssuerecommendationId() {
		return rIssuerecommendationId;
	}

	public void setRIssuerecommendationId(Integer rIssuerecommendationId) {
		this.rIssuerecommendationId = rIssuerecommendationId;
	}

	@Basic
	@Column(name="R_ISSUESTATUS_ID")
	public Integer getRIssuestatusId() {
		return rIssuestatusId;
	}

	public void setRIssuestatusId(Integer rIssuestatusId) {
		this.rIssuestatusId = rIssuestatusId;
	}

	@Basic
	@Column(name="R_REQUEST_ID")
	public Integer getRRequestId() {
		return rRequestId;
	}

	public void setRRequestId(Integer rRequestId) {
		this.rRequestId = rRequestId;
	}

	@Basic
	@Column(nullable=false, length=4)
	public String getReleaseno() {
		return releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}

	@Basic
	@Column(length=60)
	public String getSourceclassname() {
		return sourceclassname;
	}

	public void setSourceclassname(String sourceclassname) {
		this.sourceclassname = sourceclassname;
	}

	@Basic
	@Column(length=60)
	public String getSourcemethodname() {
		return sourcemethodname;
	}

	public void setSourcemethodname(String sourcemethodname) {
		this.sourcemethodname = sourcemethodname;
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
}