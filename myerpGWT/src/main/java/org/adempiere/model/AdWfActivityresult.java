package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_wf_activityresult")
public class AdWfActivityresult extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adWfActivityId;
	private Integer adWfActivityresultId;
	private String attributename;
	private String attributevalue;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AdWfActivityresult() {
	}

	public AdWfActivityresult(Integer adWfActivityresultId) {
		this.adWfActivityresultId = adWfActivityresultId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_WF_ACTIVITY_ID", columnDefinition="INT", nullable=false)
	public Integer getAdWfActivityId() {
		return adWfActivityId;
	}

	public void setAdWfActivityId(Integer adWfActivityId) {
		this.adWfActivityId = adWfActivityId;
	}

	@Id
	@Column(name="AD_WF_ACTIVITYRESULT_ID", columnDefinition="INT")
	public Integer getAdWfActivityresultId() {
		return adWfActivityresultId;
	}

	public void setAdWfActivityresultId(Integer adWfActivityresultId) {
		this.adWfActivityresultId = adWfActivityresultId;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getAttributename() {
		return attributename;
	}

	public void setAttributename(String attributename) {
		this.attributename = attributename;
	}

	@Basic
	@Column(length=2000)
	public String getAttributevalue() {
		return attributevalue;
	}

	public void setAttributevalue(String attributevalue) {
		this.attributevalue = attributevalue;
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
	@Column(columnDefinition="INT", nullable=false)
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
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}