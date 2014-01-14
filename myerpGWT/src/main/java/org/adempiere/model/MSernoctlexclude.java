package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_sernoctlexclude")
public class MSernoctlexclude extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adTableId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String issotrx;
	private Integer mSernoctlId;
	private Integer mSernoctlexcludeId;
	private String updated;
	private Integer updatedby;

	public MSernoctlexclude() {
	}

	public MSernoctlexclude(Integer mSernoctlexcludeId) {
		this.mSernoctlexcludeId = mSernoctlexcludeId;
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
	@Column(name="AD_TABLE_ID", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
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
	@Column(nullable=false, length=1)
	public String getIssotrx() {
		return issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}

	@Basic
	@Column(name="M_SERNOCTL_ID", nullable=false)
	public Integer getMSernoctlId() {
		return mSernoctlId;
	}

	public void setMSernoctlId(Integer mSernoctlId) {
		this.mSernoctlId = mSernoctlId;
	}

	@Id
	@Column(name="M_SERNOCTLEXCLUDE_ID")
	public Integer getMSernoctlexcludeId() {
		return mSernoctlexcludeId;
	}

	public void setMSernoctlexcludeId(Integer mSernoctlexcludeId) {
		this.mSernoctlexcludeId = mSernoctlexcludeId;
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