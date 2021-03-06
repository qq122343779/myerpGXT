package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_change")
public class AAssetChange extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAccumdepreciationAcct;
	private Integer aAssetAcct;
	private Integer aAssetAcctId;
	private Integer aAssetAdditionId;
	private Integer aAssetChangeId;
	private String aAssetCreatedate;
	private Integer aAssetId;
	private Integer aAssetRetirementId;
	private String aAssetRevaldate;
	private String aAssetSpreadType;
	private Integer aDepreciationAcct;
	private String aDepreciationCalcType;
	private BigDecimal aDepreciationManualAmount;
	private String aDepreciationManualPeriod;
	private Integer aDepreciationTableHeaderId;
	private BigDecimal aDepreciationVariablePerc;
	private String aDisposalLoss;
	private String aDisposalRevenue;
	private Integer aParentAssetId;
	private Integer aPeriodEnd;
	private Integer aPeriodStart;
	private BigDecimal aQtyCurrent;
	private BigDecimal aQtyOriginal;
	private Integer aRevalAccumdepOffsetCur;
	private Integer aRevalAccumdepOffsetPrior;
	private String aRevalCalMethod;
	private Integer aRevalCostOffset;
	private Integer aRevalCostOffsetPrior;
	private Integer aRevalDepexpOffset;
	private BigDecimal aSalvageValue;
	private BigDecimal aSplitPercent;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private BigDecimal assetaccumdepreciationamt;
	private BigDecimal assetbookvalueamt;
	private String assetdepreciationdate;
	private String assetdisposaldate;
	private BigDecimal assetmarketvalueamt;
	private String assetservicedate;
	private BigDecimal assetvalueamt;
	private Integer cAcctschemaId;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cLocationId;
	private Integer cValidcombinationId;
	private BigDecimal changeamt;
	private String changedate;
	private String changetype;
	private String conventiontype;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String depreciationtype;
	private Boolean isactive;
	private Boolean isdepreciated;
	private Boolean isdisposed;
	private Boolean isfullydepreciated;
	private Boolean isinposession;
	private Boolean isowned;
	private Integer lifeuseunits;
	private String lot;
	private String postingtype;
	private String serno;
	private String textdetails;
	private String updated;
	private Integer updatedby;
	private Integer uselifemonths;
	private Integer uselifeyears;
	private Integer useunits;
	private String versionno;

	public AAssetChange() {
	}

	public AAssetChange(Integer aAssetChangeId) {
		this.aAssetChangeId = aAssetChangeId;
	}

	@Basic
	@Column(name="A_ACCUMDEPRECIATION_ACCT", columnDefinition="INT")
	public Integer getAAccumdepreciationAcct() {
		return aAccumdepreciationAcct;
	}

	public void setAAccumdepreciationAcct(Integer aAccumdepreciationAcct) {
		this.aAccumdepreciationAcct = aAccumdepreciationAcct;
	}

	@Basic
	@Column(name="A_ASSET_ACCT", columnDefinition="INT")
	public Integer getAAssetAcct() {
		return aAssetAcct;
	}

	public void setAAssetAcct(Integer aAssetAcct) {
		this.aAssetAcct = aAssetAcct;
	}

	@Basic
	@Column(name="A_ASSET_ACCT_ID", columnDefinition="INT")
	public Integer getAAssetAcctId() {
		return aAssetAcctId;
	}

	public void setAAssetAcctId(Integer aAssetAcctId) {
		this.aAssetAcctId = aAssetAcctId;
	}

	@Basic
	@Column(name="A_ASSET_ADDITION_ID", columnDefinition="INT")
	public Integer getAAssetAdditionId() {
		return aAssetAdditionId;
	}

	public void setAAssetAdditionId(Integer aAssetAdditionId) {
		this.aAssetAdditionId = aAssetAdditionId;
	}

	@Id
	@Column(name="A_ASSET_CHANGE_ID", columnDefinition="INT")
	public Integer getAAssetChangeId() {
		return aAssetChangeId;
	}

	public void setAAssetChangeId(Integer aAssetChangeId) {
		this.aAssetChangeId = aAssetChangeId;
	}

	@Basic
	@Column(name="A_ASSET_CREATEDATE")
	public String getAAssetCreatedate() {
		return aAssetCreatedate;
	}

	public void setAAssetCreatedate(String aAssetCreatedate) {
		this.aAssetCreatedate = aAssetCreatedate;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_ASSET_RETIREMENT_ID", columnDefinition="INT")
	public Integer getAAssetRetirementId() {
		return aAssetRetirementId;
	}

	public void setAAssetRetirementId(Integer aAssetRetirementId) {
		this.aAssetRetirementId = aAssetRetirementId;
	}

	@Basic
	@Column(name="A_ASSET_REVALDATE")
	public String getAAssetRevaldate() {
		return aAssetRevaldate;
	}

	public void setAAssetRevaldate(String aAssetRevaldate) {
		this.aAssetRevaldate = aAssetRevaldate;
	}

	@Basic
	@Column(name="A_ASSET_SPREAD_TYPE", length=10)
	public String getAAssetSpreadType() {
		return aAssetSpreadType;
	}

	public void setAAssetSpreadType(String aAssetSpreadType) {
		this.aAssetSpreadType = aAssetSpreadType;
	}

	@Basic
	@Column(name="A_DEPRECIATION_ACCT", columnDefinition="INT")
	public Integer getADepreciationAcct() {
		return aDepreciationAcct;
	}

	public void setADepreciationAcct(Integer aDepreciationAcct) {
		this.aDepreciationAcct = aDepreciationAcct;
	}

	@Basic
	@Column(name="A_DEPRECIATION_CALC_TYPE", length=10)
	public String getADepreciationCalcType() {
		return aDepreciationCalcType;
	}

	public void setADepreciationCalcType(String aDepreciationCalcType) {
		this.aDepreciationCalcType = aDepreciationCalcType;
	}

	@Basic
	@Column(name="A_DEPRECIATION_MANUAL_AMOUNT")
	public BigDecimal getADepreciationManualAmount() {
		return aDepreciationManualAmount;
	}

	public void setADepreciationManualAmount(BigDecimal aDepreciationManualAmount) {
		this.aDepreciationManualAmount = aDepreciationManualAmount;
	}

	@Basic
	@Column(name="A_DEPRECIATION_MANUAL_PERIOD", length=2)
	public String getADepreciationManualPeriod() {
		return aDepreciationManualPeriod;
	}

	public void setADepreciationManualPeriod(String aDepreciationManualPeriod) {
		this.aDepreciationManualPeriod = aDepreciationManualPeriod;
	}

	@Basic
	@Column(name="A_DEPRECIATION_TABLE_HEADER_ID", columnDefinition="INT")
	public Integer getADepreciationTableHeaderId() {
		return aDepreciationTableHeaderId;
	}

	public void setADepreciationTableHeaderId(Integer aDepreciationTableHeaderId) {
		this.aDepreciationTableHeaderId = aDepreciationTableHeaderId;
	}

	@Basic
	@Column(name="A_DEPRECIATION_VARIABLE_PERC")
	public BigDecimal getADepreciationVariablePerc() {
		return aDepreciationVariablePerc;
	}

	public void setADepreciationVariablePerc(BigDecimal aDepreciationVariablePerc) {
		this.aDepreciationVariablePerc = aDepreciationVariablePerc;
	}

	@Basic
	@Column(name="A_DISPOSAL_LOSS", length=22)
	public String getADisposalLoss() {
		return aDisposalLoss;
	}

	public void setADisposalLoss(String aDisposalLoss) {
		this.aDisposalLoss = aDisposalLoss;
	}

	@Basic
	@Column(name="A_DISPOSAL_REVENUE", length=22)
	public String getADisposalRevenue() {
		return aDisposalRevenue;
	}

	public void setADisposalRevenue(String aDisposalRevenue) {
		this.aDisposalRevenue = aDisposalRevenue;
	}

	@Basic
	@Column(name="A_PARENT_ASSET_ID", columnDefinition="INT")
	public Integer getAParentAssetId() {
		return aParentAssetId;
	}

	public void setAParentAssetId(Integer aParentAssetId) {
		this.aParentAssetId = aParentAssetId;
	}

	@Basic
	@Column(name="A_PERIOD_END", columnDefinition="INT")
	public Integer getAPeriodEnd() {
		return aPeriodEnd;
	}

	public void setAPeriodEnd(Integer aPeriodEnd) {
		this.aPeriodEnd = aPeriodEnd;
	}

	@Basic
	@Column(name="A_PERIOD_START", columnDefinition="INT")
	public Integer getAPeriodStart() {
		return aPeriodStart;
	}

	public void setAPeriodStart(Integer aPeriodStart) {
		this.aPeriodStart = aPeriodStart;
	}

	@Basic
	@Column(name="A_QTY_CURRENT")
	public BigDecimal getAQtyCurrent() {
		return aQtyCurrent;
	}

	public void setAQtyCurrent(BigDecimal aQtyCurrent) {
		this.aQtyCurrent = aQtyCurrent;
	}

	@Basic
	@Column(name="A_QTY_ORIGINAL")
	public BigDecimal getAQtyOriginal() {
		return aQtyOriginal;
	}

	public void setAQtyOriginal(BigDecimal aQtyOriginal) {
		this.aQtyOriginal = aQtyOriginal;
	}

	@Basic
	@Column(name="A_REVAL_ACCUMDEP_OFFSET_CUR", columnDefinition="INT")
	public Integer getARevalAccumdepOffsetCur() {
		return aRevalAccumdepOffsetCur;
	}

	public void setARevalAccumdepOffsetCur(Integer aRevalAccumdepOffsetCur) {
		this.aRevalAccumdepOffsetCur = aRevalAccumdepOffsetCur;
	}

	@Basic
	@Column(name="A_REVAL_ACCUMDEP_OFFSET_PRIOR", columnDefinition="INT")
	public Integer getARevalAccumdepOffsetPrior() {
		return aRevalAccumdepOffsetPrior;
	}

	public void setARevalAccumdepOffsetPrior(Integer aRevalAccumdepOffsetPrior) {
		this.aRevalAccumdepOffsetPrior = aRevalAccumdepOffsetPrior;
	}

	@Basic
	@Column(name="A_REVAL_CAL_METHOD", length=3)
	public String getARevalCalMethod() {
		return aRevalCalMethod;
	}

	public void setARevalCalMethod(String aRevalCalMethod) {
		this.aRevalCalMethod = aRevalCalMethod;
	}

	@Basic
	@Column(name="A_REVAL_COST_OFFSET", columnDefinition="INT")
	public Integer getARevalCostOffset() {
		return aRevalCostOffset;
	}

	public void setARevalCostOffset(Integer aRevalCostOffset) {
		this.aRevalCostOffset = aRevalCostOffset;
	}

	@Basic
	@Column(name="A_REVAL_COST_OFFSET_PRIOR", columnDefinition="INT")
	public Integer getARevalCostOffsetPrior() {
		return aRevalCostOffsetPrior;
	}

	public void setARevalCostOffsetPrior(Integer aRevalCostOffsetPrior) {
		this.aRevalCostOffsetPrior = aRevalCostOffsetPrior;
	}

	@Basic
	@Column(name="A_REVAL_DEPEXP_OFFSET", columnDefinition="INT")
	public Integer getARevalDepexpOffset() {
		return aRevalDepexpOffset;
	}

	public void setARevalDepexpOffset(Integer aRevalDepexpOffset) {
		this.aRevalDepexpOffset = aRevalDepexpOffset;
	}

	@Basic
	@Column(name="A_SALVAGE_VALUE")
	public BigDecimal getASalvageValue() {
		return aSalvageValue;
	}

	public void setASalvageValue(BigDecimal aSalvageValue) {
		this.aSalvageValue = aSalvageValue;
	}

	@Basic
	@Column(name="A_SPLIT_PERCENT")
	public BigDecimal getASplitPercent() {
		return aSplitPercent;
	}

	public void setASplitPercent(BigDecimal aSplitPercent) {
		this.aSplitPercent = aSplitPercent;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Basic
	public BigDecimal getAssetaccumdepreciationamt() {
		return assetaccumdepreciationamt;
	}

	public void setAssetaccumdepreciationamt(BigDecimal assetaccumdepreciationamt) {
		this.assetaccumdepreciationamt = assetaccumdepreciationamt;
	}

	@Basic
	public BigDecimal getAssetbookvalueamt() {
		return assetbookvalueamt;
	}

	public void setAssetbookvalueamt(BigDecimal assetbookvalueamt) {
		this.assetbookvalueamt = assetbookvalueamt;
	}

	@Basic
	public String getAssetdepreciationdate() {
		return assetdepreciationdate;
	}

	public void setAssetdepreciationdate(String assetdepreciationdate) {
		this.assetdepreciationdate = assetdepreciationdate;
	}

	@Basic
	public String getAssetdisposaldate() {
		return assetdisposaldate;
	}

	public void setAssetdisposaldate(String assetdisposaldate) {
		this.assetdisposaldate = assetdisposaldate;
	}

	@Basic
	public BigDecimal getAssetmarketvalueamt() {
		return assetmarketvalueamt;
	}

	public void setAssetmarketvalueamt(BigDecimal assetmarketvalueamt) {
		this.assetmarketvalueamt = assetmarketvalueamt;
	}

	@Basic
	public String getAssetservicedate() {
		return assetservicedate;
	}

	public void setAssetservicedate(String assetservicedate) {
		this.assetservicedate = assetservicedate;
	}

	@Basic
	public BigDecimal getAssetvalueamt() {
		return assetvalueamt;
	}

	public void setAssetvalueamt(BigDecimal assetvalueamt) {
		this.assetvalueamt = assetvalueamt;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT")
	public Integer getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
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
	@Column(name="C_VALIDCOMBINATION_ID", columnDefinition="INT")
	public Integer getCValidcombinationId() {
		return cValidcombinationId;
	}

	public void setCValidcombinationId(Integer cValidcombinationId) {
		this.cValidcombinationId = cValidcombinationId;
	}

	@Basic
	public BigDecimal getChangeamt() {
		return changeamt;
	}

	public void setChangeamt(BigDecimal changeamt) {
		this.changeamt = changeamt;
	}

	@Basic
	public String getChangedate() {
		return changedate;
	}

	public void setChangedate(String changedate) {
		this.changedate = changedate;
	}

	@Basic
	@Column(nullable=false, length=3)
	public String getChangetype() {
		return changetype;
	}

	public void setChangetype(String changetype) {
		this.changetype = changetype;
	}

	@Basic
	@Column(length=10)
	public String getConventiontype() {
		return conventiontype;
	}

	public void setConventiontype(String conventiontype) {
		this.conventiontype = conventiontype;
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
	public String getDateacct() {
		return dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
	}

	@Basic
	@Column(length=10)
	public String getDepreciationtype() {
		return depreciationtype;
	}

	public void setDepreciationtype(String depreciationtype) {
		this.depreciationtype = depreciationtype;
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
	public Boolean isIsdepreciated() {
		return isdepreciated;
	}

	public void setIsdepreciated(Boolean isdepreciated) {
		this.isdepreciated = isdepreciated;
	}

	@Basic
	public Boolean isIsdisposed() {
		return isdisposed;
	}

	public void setIsdisposed(Boolean isdisposed) {
		this.isdisposed = isdisposed;
	}

	@Basic
	public Boolean isIsfullydepreciated() {
		return isfullydepreciated;
	}

	public void setIsfullydepreciated(Boolean isfullydepreciated) {
		this.isfullydepreciated = isfullydepreciated;
	}

	@Basic
	public Boolean isIsinposession() {
		return isinposession;
	}

	public void setIsinposession(Boolean isinposession) {
		this.isinposession = isinposession;
	}

	@Basic
	public Boolean isIsowned() {
		return isowned;
	}

	public void setIsowned(Boolean isowned) {
		this.isowned = isowned;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLifeuseunits() {
		return lifeuseunits;
	}

	public void setLifeuseunits(Integer lifeuseunits) {
		this.lifeuseunits = lifeuseunits;
	}

	@Basic
	@Column(length=40)
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(length=10)
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
	}

	@Basic
	@Column(length=40)
	public String getSerno() {
		return serno;
	}

	public void setSerno(String serno) {
		this.serno = serno;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getTextdetails() {
		return textdetails;
	}

	public void setTextdetails(String textdetails) {
		this.textdetails = textdetails;
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

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUselifemonths() {
		return uselifemonths;
	}

	public void setUselifemonths(Integer uselifemonths) {
		this.uselifemonths = uselifemonths;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUselifeyears() {
		return uselifeyears;
	}

	public void setUselifeyears(Integer uselifeyears) {
		this.uselifeyears = uselifeyears;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUseunits() {
		return useunits;
	}

	public void setUseunits(Integer useunits) {
		this.useunits = useunits;
	}

	@Basic
	@Column(length=40)
	public String getVersionno() {
		return versionno;
	}

	public void setVersionno(String versionno) {
		this.versionno = versionno;
	}
}