package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_pricelist_version")
public class MPricelistVersion extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private Integer mDiscountschemaId;
	private Integer mPricelistId;
	private Integer mPricelistVersionBaseId;
	private Integer mPricelistVersionId;
	private String name;
	private String proccreate;
	private String updated;
	private Integer updatedby;
	private String validfrom;

	public MPricelistVersion() {
	}

	public MPricelistVersion(Integer mPricelistVersionId) {
		this.mPricelistVersionId = mPricelistVersionId;
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
	@Column(name="M_DISCOUNTSCHEMA_ID", nullable=false)
	public Integer getMDiscountschemaId() {
		return mDiscountschemaId;
	}

	public void setMDiscountschemaId(Integer mDiscountschemaId) {
		this.mDiscountschemaId = mDiscountschemaId;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", nullable=false)
	public Integer getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(Integer mPricelistId) {
		this.mPricelistId = mPricelistId;
	}

	@Basic
	@Column(name="M_PRICELIST_VERSION_BASE_ID")
	public Integer getMPricelistVersionBaseId() {
		return mPricelistVersionBaseId;
	}

	public void setMPricelistVersionBaseId(Integer mPricelistVersionBaseId) {
		this.mPricelistVersionBaseId = mPricelistVersionBaseId;
	}

	@Id
	@Column(name="M_PRICELIST_VERSION_ID")
	public Integer getMPricelistVersionId() {
		return mPricelistVersionId;
	}

	public void setMPricelistVersionId(Integer mPricelistVersionId) {
		this.mPricelistVersionId = mPricelistVersionId;
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
	@Column(length=1)
	public String getProccreate() {
		return proccreate;
	}

	public void setProccreate(String proccreate) {
		this.proccreate = proccreate;
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
	@Column(nullable=false)
	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
}