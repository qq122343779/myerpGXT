package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_wf_processdata")
public class AdWfProcessdata extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adWfProcessId;
	private Integer adWfProcessdataId;
	private String attributename;
	private String attributevalue;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AdWfProcessdata() {
	}

	public AdWfProcessdata(Integer adWfProcessdataId) {
		this.adWfProcessdataId = adWfProcessdataId;
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
	@Column(name="AD_WF_PROCESS_ID", columnDefinition="INT", nullable=false)
	public Integer getAdWfProcessId() {
		return adWfProcessId;
	}

	public void setAdWfProcessId(Integer adWfProcessId) {
		this.adWfProcessId = adWfProcessId;
	}

	@Id
	@Column(name="AD_WF_PROCESSDATA_ID", columnDefinition="INT")
	public Integer getAdWfProcessdataId() {
		return adWfProcessdataId;
	}

	public void setAdWfProcessdataId(Integer adWfProcessdataId) {
		this.adWfProcessdataId = adWfProcessdataId;
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
	@Column(length=60)
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