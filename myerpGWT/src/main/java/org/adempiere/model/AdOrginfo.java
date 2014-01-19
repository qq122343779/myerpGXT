package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_orginfo")
public class AdOrginfo extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtypeId;
	private Integer cCalendarId;
	private Integer cLocationId;
	private String created;
	private Integer createdby;
	private Integer dropshipWarehouseId;
	private String duns;
	private String email;
	private String fax;
	private Boolean isactive;
	private Integer logoId;
	private Integer mWarehouseId;
	private Integer paGoalId;
	private Integer parentOrgId;
	private String phone;
	private String phone2;
	private String receiptfootermsg;
	private Integer supervisorId;
	private String taxid;
	private Integer transferbankId;
	private Integer transfercashbookId;
	private String updated;
	private Integer updatedby;

	public AdOrginfo() {
	}

	public AdOrginfo(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Id
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_ORGTYPE_ID", columnDefinition="INT")
	public Integer getAdOrgtypeId() {
		return adOrgtypeId;
	}

	public void setAdOrgtypeId(Integer adOrgtypeId) {
		this.adOrgtypeId = adOrgtypeId;
	}

	@Basic
	@Column(name="C_CALENDAR_ID", columnDefinition="INT")
	public Integer getCCalendarId() {
		return cCalendarId;
	}

	public void setCCalendarId(Integer cCalendarId) {
		this.cCalendarId = cCalendarId;
	}

	@Basic
	@Column(name="C_LOCATION_ID", columnDefinition="INT")
	public Integer getCLocationId() {
		return cLocationId;
	}

	public void setCLocationId(Integer cLocationId) {
		this.cLocationId = cLocationId;
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
	@Column(name="DROPSHIP_WAREHOUSE_ID", columnDefinition="INT")
	public Integer getDropshipWarehouseId() {
		return dropshipWarehouseId;
	}

	public void setDropshipWarehouseId(Integer dropshipWarehouseId) {
		this.dropshipWarehouseId = dropshipWarehouseId;
	}

	@Basic
	@Column(nullable=false, length=11)
	public String getDuns() {
		return duns;
	}

	public void setDuns(String duns) {
		this.duns = duns;
	}

	@Basic
	@Column(length=60)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(length=40)
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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
	@Column(name="LOGO_ID", columnDefinition="INT")
	public Integer getLogoId() {
		return logoId;
	}

	public void setLogoId(Integer logoId) {
		this.logoId = logoId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT")
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(name="PA_GOAL_ID", columnDefinition="INT")
	public Integer getPaGoalId() {
		return paGoalId;
	}

	public void setPaGoalId(Integer paGoalId) {
		this.paGoalId = paGoalId;
	}

	@Basic
	@Column(name="PARENT_ORG_ID", columnDefinition="INT")
	public Integer getParentOrgId() {
		return parentOrgId;
	}

	public void setParentOrgId(Integer parentOrgId) {
		this.parentOrgId = parentOrgId;
	}

	@Basic
	@Column(length=40)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic
	@Column(length=40)
	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@Basic
	@Column(length=1023)
	public String getReceiptfootermsg() {
		return receiptfootermsg;
	}

	public void setReceiptfootermsg(String receiptfootermsg) {
		this.receiptfootermsg = receiptfootermsg;
	}

	@Basic
	@Column(name="SUPERVISOR_ID", columnDefinition="INT")
	public Integer getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Integer supervisorId) {
		this.supervisorId = supervisorId;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getTaxid() {
		return taxid;
	}

	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}

	@Basic
	@Column(name="TRANSFERBANK_ID", columnDefinition="INT")
	public Integer getTransferbankId() {
		return transferbankId;
	}

	public void setTransferbankId(Integer transferbankId) {
		this.transferbankId = transferbankId;
	}

	@Basic
	@Column(name="TRANSFERCASHBOOK_ID", columnDefinition="INT")
	public Integer getTransfercashbookId() {
		return transfercashbookId;
	}

	public void setTransfercashbookId(Integer transfercashbookId) {
		this.transfercashbookId = transfercashbookId;
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