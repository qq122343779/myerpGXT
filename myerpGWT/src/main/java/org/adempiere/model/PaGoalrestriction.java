package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_goalrestriction")
public class PaGoalrestriction extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBpGroupId;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private String goalrestrictiontype;
	private Boolean isactive;
	private Integer mProductCategoryId;
	private Integer mProductId;
	private String name;
	private Integer orgId;
	private Integer paGoalId;
	private Integer paGoalrestrictionId;
	private String updated;
	private Integer updatedby;

	public PaGoalrestriction() {
	}

	public PaGoalrestriction(Integer paGoalrestrictionId) {
		this.paGoalrestrictionId = paGoalrestrictionId;
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
	@Column(name="C_BP_GROUP_ID", columnDefinition="INT")
	public Integer getCBpGroupId() {
		return cBpGroupId;
	}

	public void setCBpGroupId(Integer cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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
	@Column(nullable=false, length=1)
	public String getGoalrestrictiontype() {
		return goalrestrictiontype;
	}

	public void setGoalrestrictiontype(String goalrestrictiontype) {
		this.goalrestrictiontype = goalrestrictiontype;
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
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT")
	public Integer getMProductCategoryId() {
		return mProductCategoryId;
	}

	public void setMProductCategoryId(Integer mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
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
	@Column(name="ORG_ID", columnDefinition="INT")
	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	@Basic
	@Column(name="PA_GOAL_ID", columnDefinition="INT", nullable=false)
	public Integer getPaGoalId() {
		return paGoalId;
	}

	public void setPaGoalId(Integer paGoalId) {
		this.paGoalId = paGoalId;
	}

	@Id
	@Column(name="PA_GOALRESTRICTION_ID", columnDefinition="INT")
	public Integer getPaGoalrestrictionId() {
		return paGoalrestrictionId;
	}

	public void setPaGoalrestrictionId(Integer paGoalrestrictionId) {
		this.paGoalrestrictionId = paGoalrestrictionId;
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