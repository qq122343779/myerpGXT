package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="asp_form")
public class AspForm extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adFormId;
	private Integer adOrgId;
	private Integer aspFormId;
	private Integer aspLevelId;
	private String aspStatus;
	private String created;
	private Integer createdby;
	private String isactive;
	private String updated;
	private Integer updatedby;

	public AspForm() {
	}

	public AspForm(Integer aspFormId) {
		this.aspFormId = aspFormId;
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
	@Column(name="AD_FORM_ID", nullable=false)
	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
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
	@Column(name="ASP_FORM_ID")
	public Integer getAspFormId() {
		return aspFormId;
	}

	public void setAspFormId(Integer aspFormId) {
		this.aspFormId = aspFormId;
	}

	@Basic
	@Column(name="ASP_LEVEL_ID", nullable=false)
	public Integer getAspLevelId() {
		return aspLevelId;
	}

	public void setAspLevelId(Integer aspLevelId) {
		this.aspLevelId = aspLevelId;
	}

	@Basic
	@Column(name="ASP_STATUS", nullable=false, length=1)
	public String getAspStatus() {
		return aspStatus;
	}

	public void setAspStatus(String aspStatus) {
		this.aspStatus = aspStatus;
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