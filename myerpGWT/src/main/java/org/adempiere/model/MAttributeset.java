package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_attributeset")
public class MAttributeset extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private Integer guaranteedays;
	private Boolean isactive;
	private Boolean isguaranteedate;
	private Boolean isguaranteedatemandatory;
	private Boolean isinstanceattribute;
	private Boolean islot;
	private Boolean islotmandatory;
	private Boolean isserno;
	private Boolean issernomandatory;
	private String lotchareoverwrite;
	private String lotcharsoverwrite;
	private Integer mAttributesetId;
	private Integer mLotctlId;
	private Integer mSernoctlId;
	private String mandatorytype;
	private String name;
	private String sernochareoverwrite;
	private String sernocharsoverwrite;
	private String updated;
	private Integer updatedby;

	public MAttributeset() {
	}

	public MAttributeset(Integer mAttributesetId) {
		this.mAttributesetId = mAttributesetId;
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
	@Column(columnDefinition="INT")
	public Integer getGuaranteedays() {
		return guaranteedays;
	}

	public void setGuaranteedays(Integer guaranteedays) {
		this.guaranteedays = guaranteedays;
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
	@Column(nullable=false)
	public Boolean isIsguaranteedate() {
		return isguaranteedate;
	}

	public void setIsguaranteedate(Boolean isguaranteedate) {
		this.isguaranteedate = isguaranteedate;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsguaranteedatemandatory() {
		return isguaranteedatemandatory;
	}

	public void setIsguaranteedatemandatory(Boolean isguaranteedatemandatory) {
		this.isguaranteedatemandatory = isguaranteedatemandatory;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsinstanceattribute() {
		return isinstanceattribute;
	}

	public void setIsinstanceattribute(Boolean isinstanceattribute) {
		this.isinstanceattribute = isinstanceattribute;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIslot() {
		return islot;
	}

	public void setIslot(Boolean islot) {
		this.islot = islot;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIslotmandatory() {
		return islotmandatory;
	}

	public void setIslotmandatory(Boolean islotmandatory) {
		this.islotmandatory = islotmandatory;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsserno() {
		return isserno;
	}

	public void setIsserno(Boolean isserno) {
		this.isserno = isserno;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssernomandatory() {
		return issernomandatory;
	}

	public void setIssernomandatory(Boolean issernomandatory) {
		this.issernomandatory = issernomandatory;
	}

	@Basic
	@Column(length=1)
	public String getLotchareoverwrite() {
		return lotchareoverwrite;
	}

	public void setLotchareoverwrite(String lotchareoverwrite) {
		this.lotchareoverwrite = lotchareoverwrite;
	}

	@Basic
	@Column(length=1)
	public String getLotcharsoverwrite() {
		return lotcharsoverwrite;
	}

	public void setLotcharsoverwrite(String lotcharsoverwrite) {
		this.lotcharsoverwrite = lotcharsoverwrite;
	}

	@Id
	@Column(name="M_ATTRIBUTESET_ID", columnDefinition="INT")
	public Integer getMAttributesetId() {
		return mAttributesetId;
	}

	public void setMAttributesetId(Integer mAttributesetId) {
		this.mAttributesetId = mAttributesetId;
	}

	@Basic
	@Column(name="M_LOTCTL_ID", columnDefinition="INT")
	public Integer getMLotctlId() {
		return mLotctlId;
	}

	public void setMLotctlId(Integer mLotctlId) {
		this.mLotctlId = mLotctlId;
	}

	@Basic
	@Column(name="M_SERNOCTL_ID", columnDefinition="INT")
	public Integer getMSernoctlId() {
		return mSernoctlId;
	}

	public void setMSernoctlId(Integer mSernoctlId) {
		this.mSernoctlId = mSernoctlId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getMandatorytype() {
		return mandatorytype;
	}

	public void setMandatorytype(String mandatorytype) {
		this.mandatorytype = mandatorytype;
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
	public String getSernochareoverwrite() {
		return sernochareoverwrite;
	}

	public void setSernochareoverwrite(String sernochareoverwrite) {
		this.sernochareoverwrite = sernochareoverwrite;
	}

	@Basic
	@Column(length=1)
	public String getSernocharsoverwrite() {
		return sernocharsoverwrite;
	}

	public void setSernocharsoverwrite(String sernocharsoverwrite) {
		this.sernocharsoverwrite = sernocharsoverwrite;
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