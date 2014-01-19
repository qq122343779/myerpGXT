package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_transaction")
public class MTransaction extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cProjectissueId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Integer mAttributesetinstanceId;
	private Integer mInoutlineId;
	private Integer mInventorylineId;
	private Integer mLocatorId;
	private Integer mMovementlineId;
	private Integer mProductId;
	private Integer mProductionlineId;
	private Integer mTransactionId;
	private String movementdate;
	private BigDecimal movementqty;
	private String movementtype;
	private Integer ppCostCollectorId;
	private String updated;
	private Integer updatedby;

	public MTransaction() {
	}

	public MTransaction(Integer mTransactionId) {
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

	@Basic
	@Column(name="C_PROJECTISSUE_ID", columnDefinition="INT")
	public Integer getCProjectissueId() {
		return cProjectissueId;
	}

	public void setCProjectissueId(Integer cProjectissueId) {
		this.cProjectissueId = cProjectissueId;
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
	@Column(name="M_LOCATOR_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_MOVEMENTLINE_ID", columnDefinition="INT")
	public Integer getMMovementlineId() {
		return mMovementlineId;
	}

	public void setMMovementlineId(Integer mMovementlineId) {
		this.mMovementlineId = mMovementlineId;
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
	@Column(nullable=false)
	public String getMovementdate() {
		return movementdate;
	}

	public void setMovementdate(String movementdate) {
		this.movementdate = movementdate;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMovementqty() {
		return movementqty;
	}

	public void setMovementqty(BigDecimal movementqty) {
		this.movementqty = movementqty;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getMovementtype() {
		return movementtype;
	}

	public void setMovementtype(String movementtype) {
		this.movementtype = movementtype;
	}

	@Basic
	@Column(name="PP_COST_COLLECTOR_ID", columnDefinition="INT")
	public Integer getPpCostCollectorId() {
		return ppCostCollectorId;
	}

	public void setPpCostCollectorId(Integer ppCostCollectorId) {
		this.ppCostCollectorId = ppCostCollectorId;
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