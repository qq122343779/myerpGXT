package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_split")
public class AAssetSplit extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private BigDecimal aAmountSplit;
	private Integer aAssetAcctId;
	private BigDecimal aAssetCost;
	private Integer aAssetId;
	private String aAssetIdTo;
	private Integer aAssetSplitId;
	private Integer aDepreciationWorkfileId;
	private BigDecimal aPercentOriginal;
	private BigDecimal aPercentSplit;
	private BigDecimal aQtyCurrent;
	private BigDecimal aQtySplit;
	private String aSplitType;
	private String aTransferBalanceIs;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cPeriodId;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String isactive;
	private String postingtype;
	private String processed;
	private String processing;
	private String updated;
	private Integer updatedby;

	public AAssetSplit() {
	}

	public AAssetSplit(Integer aAssetSplitId) {
		this.aAssetSplitId = aAssetSplitId;
	}

	@Basic
	@Column(name="A_AMOUNT_SPLIT")
	public BigDecimal getAAmountSplit() {
		return aAmountSplit;
	}

	public void setAAmountSplit(BigDecimal aAmountSplit) {
		this.aAmountSplit = aAmountSplit;
	}

	@Basic
	@Column(name="A_ASSET_ACCT_ID", nullable=false)
	public Integer getAAssetAcctId() {
		return aAssetAcctId;
	}

	public void setAAssetAcctId(Integer aAssetAcctId) {
		this.aAssetAcctId = aAssetAcctId;
	}

	@Basic
	@Column(name="A_ASSET_COST")
	public BigDecimal getAAssetCost() {
		return aAssetCost;
	}

	public void setAAssetCost(BigDecimal aAssetCost) {
		this.aAssetCost = aAssetCost;
	}

	@Basic
	@Column(name="A_ASSET_ID", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_ASSET_ID_TO", length=22)
	public String getAAssetIdTo() {
		return aAssetIdTo;
	}

	public void setAAssetIdTo(String aAssetIdTo) {
		this.aAssetIdTo = aAssetIdTo;
	}

	@Id
	@Column(name="A_ASSET_SPLIT_ID")
	public Integer getAAssetSplitId() {
		return aAssetSplitId;
	}

	public void setAAssetSplitId(Integer aAssetSplitId) {
		this.aAssetSplitId = aAssetSplitId;
	}

	@Basic
	@Column(name="A_DEPRECIATION_WORKFILE_ID", nullable=false)
	public Integer getADepreciationWorkfileId() {
		return aDepreciationWorkfileId;
	}

	public void setADepreciationWorkfileId(Integer aDepreciationWorkfileId) {
		this.aDepreciationWorkfileId = aDepreciationWorkfileId;
	}

	@Basic
	@Column(name="A_PERCENT_ORIGINAL")
	public BigDecimal getAPercentOriginal() {
		return aPercentOriginal;
	}

	public void setAPercentOriginal(BigDecimal aPercentOriginal) {
		this.aPercentOriginal = aPercentOriginal;
	}

	@Basic
	@Column(name="A_PERCENT_SPLIT")
	public BigDecimal getAPercentSplit() {
		return aPercentSplit;
	}

	public void setAPercentSplit(BigDecimal aPercentSplit) {
		this.aPercentSplit = aPercentSplit;
	}

	@Basic
	@Column(name="A_QTY_CURRENT", nullable=false)
	public BigDecimal getAQtyCurrent() {
		return aQtyCurrent;
	}

	public void setAQtyCurrent(BigDecimal aQtyCurrent) {
		this.aQtyCurrent = aQtyCurrent;
	}

	@Basic
	@Column(name="A_QTY_SPLIT")
	public BigDecimal getAQtySplit() {
		return aQtySplit;
	}

	public void setAQtySplit(BigDecimal aQtySplit) {
		this.aQtySplit = aQtySplit;
	}

	@Basic
	@Column(name="A_SPLIT_TYPE", nullable=false, length=3)
	public String getASplitType() {
		return aSplitType;
	}

	public void setASplitType(String aSplitType) {
		this.aSplitType = aSplitType;
	}

	@Basic
	@Column(name="A_TRANSFER_BALANCE_IS", nullable=false, length=1)
	public String getATransferBalanceIs() {
		return aTransferBalanceIs;
	}

	public void setATransferBalanceIs(String aTransferBalanceIs) {
		this.aTransferBalanceIs = aTransferBalanceIs;
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
	@Column(name="C_PERIOD_ID", nullable=false)
	public Integer getCPeriodId() {
		return cPeriodId;
	}

	public void setCPeriodId(Integer cPeriodId) {
		this.cPeriodId = cPeriodId;
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
	@Column(nullable=false)
	public String getDateacct() {
		return dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
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
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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