package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_revenuerecognition")
public class CRevenuerecognition extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cRevenuerecognitionId;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String istimebased;
	private String name;
	private Integer nomonths;
	private String recognitionfrequency;
	private String updated;
	private Integer updatedby;

	public CRevenuerecognition() {
	}

	public CRevenuerecognition(Integer cRevenuerecognitionId) {
		this.cRevenuerecognitionId = cRevenuerecognitionId;
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

	@Id
	@Column(name="C_REVENUERECOGNITION_ID")
	public Integer getCRevenuerecognitionId() {
		return cRevenuerecognitionId;
	}

	public void setCRevenuerecognitionId(Integer cRevenuerecognitionId) {
		this.cRevenuerecognitionId = cRevenuerecognitionId;
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
	@Column(nullable=false, length=1)
	public String getIstimebased() {
		return istimebased;
	}

	public void setIstimebased(String istimebased) {
		this.istimebased = istimebased;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	public Integer getNomonths() {
		return nomonths;
	}

	public void setNomonths(Integer nomonths) {
		this.nomonths = nomonths;
	}

	@Basic
	@Column(length=1)
	public String getRecognitionfrequency() {
		return recognitionfrequency;
	}

	public void setRecognitionfrequency(String recognitionfrequency) {
		this.recognitionfrequency = recognitionfrequency;
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