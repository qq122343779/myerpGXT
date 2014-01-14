package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_accessstage")
@IdClass(org.adempiere.model.CmAccessstagePK.class)
public class CmAccessstage extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cmAccessprofileId;
	private Integer cmCstageId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String updated;
	private Integer updatedby;

	public CmAccessstage() {
	}

	public CmAccessstage(Integer cmAccessprofileId, Integer cmCstageId) {
		this.cmAccessprofileId = cmAccessprofileId;
		this.cmCstageId = cmCstageId;
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
	@Column(name="CM_ACCESSPROFILE_ID")
	public Integer getCmAccessprofileId() {
		return cmAccessprofileId;
	}

	public void setCmAccessprofileId(Integer cmAccessprofileId) {
		this.cmAccessprofileId = cmAccessprofileId;
	}

	@Id
	@Column(name="CM_CSTAGE_ID")
	public Integer getCmCstageId() {
		return cmCstageId;
	}

	public void setCmCstageId(Integer cmCstageId) {
		this.cmCstageId = cmCstageId;
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