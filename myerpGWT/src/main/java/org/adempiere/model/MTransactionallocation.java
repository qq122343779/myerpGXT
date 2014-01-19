package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_transactionallocation")
@IdClass(org.adempiere.model.MTransactionallocationPK.class)
public class MTransactionallocation extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String allocationstrategytype;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Boolean isallocated;
	private Boolean ismanual;
	private Integer mAttributesetinstanceId;
	private Integer mInoutlineId;
	private Integer mInventorylineId;
	private Integer mProductId;
	private Integer mProductionlineId;
	private Integer mTransactionId;
	private Integer outMInoutlineId;
	private Integer outMInventorylineId;
	private Integer outMProductionlineId;
	private Integer outMTransactionId;
	private BigDecimal qty;
	private String updated;
	private Integer updatedby;

	public MTransactionallocation() {
	}

	public MTransactionallocation(String allocationstrategytype, Integer mTransactionId) {
		this.allocationstrategytype = allocationstrategytype;
		this.mTransactionId = mTransactionId;
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

	@Id
	@Column(length=1)
	public String getAllocationstrategytype() {
		return allocationstrategytype;
	}

	public void setAllocationstrategytype(String allocationstrategytype) {
		this.allocationstrategytype = allocationstrategytype;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsallocated() {
		return isallocated;
	}

	public void setIsallocated(Boolean isallocated) {
		this.isallocated = isallocated;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmanual() {
		return ismanual;
	}

	public void setIsmanual(Boolean ismanual) {
		this.ismanual = ismanual;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT", nullable=false)
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getMInoutlineId() {
		return mInoutlineId;
	}

	public void setMInoutlineId(Integer mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}

	@Basic
	@Column(name="M_INVENTORYLINE_ID", columnDefinition="INT")
	public Integer getMInventorylineId() {
		return mInventorylineId;
	}

	public void setMInventorylineId(Integer mInventorylineId) {
		this.mInventorylineId = mInventorylineId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="M_PRODUCTIONLINE_ID", columnDefinition="INT")
	public Integer getMProductionlineId() {
		return mProductionlineId;
	}

	public void setMProductionlineId(Integer mProductionlineId) {
		this.mProductionlineId = mProductionlineId;
	}

	@Id
	@Column(name="M_TRANSACTION_ID", columnDefinition="INT")
	public Integer getMTransactionId() {
		return mTransactionId;
	}

	public void setMTransactionId(Integer mTransactionId) {
		this.mTransactionId = mTransactionId;
	}

	@Basic
	@Column(name="OUT_M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getOutMInoutlineId() {
		return outMInoutlineId;
	}

	public void setOutMInoutlineId(Integer outMInoutlineId) {
		this.outMInoutlineId = outMInoutlineId;
	}

	@Basic
	@Column(name="OUT_M_INVENTORYLINE_ID", columnDefinition="INT")
	public Integer getOutMInventorylineId() {
		return outMInventorylineId;
	}

	public void setOutMInventorylineId(Integer outMInventorylineId) {
		this.outMInventorylineId = outMInventorylineId;
	}

	@Basic
	@Column(name="OUT_M_PRODUCTIONLINE_ID", columnDefinition="INT")
	public Integer getOutMProductionlineId() {
		return outMProductionlineId;
	}

	public void setOutMProductionlineId(Integer outMProductionlineId) {
		this.outMProductionlineId = outMProductionlineId;
	}

	@Basic
	@Column(name="OUT_M_TRANSACTION_ID", columnDefinition="INT")
	public Integer getOutMTransactionId() {
		return outMTransactionId;
	}

	public void setOutMTransactionId(Integer outMTransactionId) {
		this.outMTransactionId = outMTransactionId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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