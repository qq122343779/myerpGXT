package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_resourcetype")
public class SResourcetype extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String allowuomfractions;
	private Integer cTaxcategoryId;
	private Integer cUomId;
	private BigDecimal chargeableqty;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String isdateslot;
	private String issingleassignment;
	private String istimeslot;
	private Integer mProductCategoryId;
	private String name;
	private String onfriday;
	private String onmonday;
	private String onsaturday;
	private String onsunday;
	private String onthursday;
	private String ontuesday;
	private String onwednesday;
	private Integer sResourcetypeId;
	private String timeslotend;
	private String timeslotstart;
	private String updated;
	private Integer updatedby;
	private String value;

	public SResourcetype() {
	}

	public SResourcetype(Integer sResourcetypeId) {
		this.sResourcetypeId = sResourcetypeId;
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
	@Column(nullable=false, length=1)
	public String getAllowuomfractions() {
		return allowuomfractions;
	}

	public void setAllowuomfractions(String allowuomfractions) {
		this.allowuomfractions = allowuomfractions;
	}

	@Basic
	@Column(name="C_TAXCATEGORY_ID", nullable=false)
	public Integer getCTaxcategoryId() {
		return cTaxcategoryId;
	}

	public void setCTaxcategoryId(Integer cTaxcategoryId) {
		this.cTaxcategoryId = cTaxcategoryId;
	}

	@Basic
	@Column(name="C_UOM_ID", nullable=false)
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	public BigDecimal getChargeableqty() {
		return chargeableqty;
	}

	public void setChargeableqty(BigDecimal chargeableqty) {
		this.chargeableqty = chargeableqty;
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
	public String getIsdateslot() {
		return isdateslot;
	}

	public void setIsdateslot(String isdateslot) {
		this.isdateslot = isdateslot;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssingleassignment() {
		return issingleassignment;
	}

	public void setIssingleassignment(String issingleassignment) {
		this.issingleassignment = issingleassignment;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIstimeslot() {
		return istimeslot;
	}

	public void setIstimeslot(String istimeslot) {
		this.istimeslot = istimeslot;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_ID", nullable=false)
	public Integer getMProductCategoryId() {
		return mProductCategoryId;
	}

	public void setMProductCategoryId(Integer mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
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
	@Column(nullable=false, length=1)
	public String getOnfriday() {
		return onfriday;
	}

	public void setOnfriday(String onfriday) {
		this.onfriday = onfriday;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOnmonday() {
		return onmonday;
	}

	public void setOnmonday(String onmonday) {
		this.onmonday = onmonday;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOnsaturday() {
		return onsaturday;
	}

	public void setOnsaturday(String onsaturday) {
		this.onsaturday = onsaturday;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOnsunday() {
		return onsunday;
	}

	public void setOnsunday(String onsunday) {
		this.onsunday = onsunday;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOnthursday() {
		return onthursday;
	}

	public void setOnthursday(String onthursday) {
		this.onthursday = onthursday;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOntuesday() {
		return ontuesday;
	}

	public void setOntuesday(String ontuesday) {
		this.ontuesday = ontuesday;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOnwednesday() {
		return onwednesday;
	}

	public void setOnwednesday(String onwednesday) {
		this.onwednesday = onwednesday;
	}

	@Id
	@Column(name="S_RESOURCETYPE_ID")
	public Integer getSResourcetypeId() {
		return sResourcetypeId;
	}

	public void setSResourcetypeId(Integer sResourcetypeId) {
		this.sResourcetypeId = sResourcetypeId;
	}

	@Basic
	public String getTimeslotend() {
		return timeslotend;
	}

	public void setTimeslotend(String timeslotend) {
		this.timeslotend = timeslotend;
	}

	@Basic
	public String getTimeslotstart() {
		return timeslotstart;
	}

	public void setTimeslotstart(String timeslotstart) {
		this.timeslotstart = timeslotstart;
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
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}