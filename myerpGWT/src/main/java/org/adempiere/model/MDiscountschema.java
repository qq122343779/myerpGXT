package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_discountschema")
public class MDiscountschema extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String cumulativelevel;
	private String description;
	private String discounttype;
	private BigDecimal flatdiscount;
	private String isactive;
	private String isbpartnerflatdiscount;
	private String isquantitybased;
	private Integer mDiscountschemaId;
	private String name;
	private String processing;
	private String script;
	private String updated;
	private Integer updatedby;
	private String validfrom;

	public MDiscountschema() {
	}

	public MDiscountschema(Integer mDiscountschemaId) {
		this.mDiscountschemaId = mDiscountschemaId;
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
	@Column(length=1)
	public String getCumulativelevel() {
		return cumulativelevel;
	}

	public void setCumulativelevel(String cumulativelevel) {
		this.cumulativelevel = cumulativelevel;
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
	public String getDiscounttype() {
		return discounttype;
	}

	public void setDiscounttype(String discounttype) {
		this.discounttype = discounttype;
	}

	@Basic
	public BigDecimal getFlatdiscount() {
		return flatdiscount;
	}

	public void setFlatdiscount(BigDecimal flatdiscount) {
		this.flatdiscount = flatdiscount;
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
	public String getIsbpartnerflatdiscount() {
		return isbpartnerflatdiscount;
	}

	public void setIsbpartnerflatdiscount(String isbpartnerflatdiscount) {
		this.isbpartnerflatdiscount = isbpartnerflatdiscount;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsquantitybased() {
		return isquantitybased;
	}

	public void setIsquantitybased(String isquantitybased) {
		this.isquantitybased = isquantitybased;
	}

	@Id
	@Column(name="M_DISCOUNTSCHEMA_ID")
	public Integer getMDiscountschemaId() {
		return mDiscountschemaId;
	}

	public void setMDiscountschemaId(Integer mDiscountschemaId) {
		this.mDiscountschemaId = mDiscountschemaId;
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
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=2000)
	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
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