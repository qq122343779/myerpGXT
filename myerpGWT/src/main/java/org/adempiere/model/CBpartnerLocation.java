package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bpartner_location")
public class CBpartnerLocation extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cLocationId;
	private Integer cSalesregionId;
	private String created;
	private Integer createdby;
	private String fax;
	private String isactive;
	private String isbillto;
	private String isdn;
	private String ispayfrom;
	private String isremitto;
	private String isshipto;
	private String name;
	private String phone;
	private String phone2;
	private String updated;
	private Integer updatedby;

	public CBpartnerLocation() {
	}

	public CBpartnerLocation(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
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
	@Column(name="C_BPARTNER_ID", nullable=false)
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Id
	@Column(name="C_BPARTNER_LOCATION_ID")
	public Integer getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	@Basic
	@Column(name="C_LOCATION_ID")
	public Integer getCLocationId() {
		return cLocationId;
	}

	public void setCLocationId(Integer cLocationId) {
		this.cLocationId = cLocationId;
	}

	@Basic
	@Column(name="C_SALESREGION_ID")
	public Integer getCSalesregionId() {
		return cSalesregionId;
	}

	public void setCSalesregionId(Integer cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
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
	@Column(length=40)
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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
	public String getIsbillto() {
		return isbillto;
	}

	public void setIsbillto(String isbillto) {
		this.isbillto = isbillto;
	}

	@Basic
	@Column(length=40)
	public String getIsdn() {
		return isdn;
	}

	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIspayfrom() {
		return ispayfrom;
	}

	public void setIspayfrom(String ispayfrom) {
		this.ispayfrom = ispayfrom;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsremitto() {
		return isremitto;
	}

	public void setIsremitto(String isremitto) {
		this.isremitto = isremitto;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsshipto() {
		return isshipto;
	}

	public void setIsshipto(String isshipto) {
		this.isshipto = isshipto;
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