package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_asset")
public class IAsset extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAccumdepreciationAcct;
	private BigDecimal aAccumulatedDepr;
	private Integer aAssetAcct;
	private BigDecimal aAssetCost;
	private Integer aAssetGroupId;
	private Integer aAssetId;
	private Integer aAssetLifeCurrentYear;
	private Integer aAssetLifeYears;
	private String aAssetSpreadType;
	private BigDecimal aBaseAmount;
	private BigDecimal aCalcAccumulatedDepr;
	private BigDecimal aCurrDepExp;
	private Integer aCurrentPeriod;
	private Integer aDepreciationAcct;
	private String aDepreciationCalcType;
	private BigDecimal aDepreciationManualAmount;
	private String aDepreciationManualPeriod;
	private Integer aDepreciationTableHeaderId;
	private BigDecimal aDepreciationVariablePerc;
	private String aDisposalLoss;
	private String aDisposalRevenue;
	private Integer aLifePeriod;
	private Integer aParentAssetId;
	private Integer aPeriodEnd;
	private Integer aPeriodPosted;
	private Integer aPeriodStart;
	private BigDecimal aPriorYearAccumulatedDepr;
	private Integer aQtyCurrent;
	private Integer aQtyOriginal;
	private String aRevalAccumdepOffsetCur;
	private String aRevalAccumdepOffsetPrior;
	private String aRevalCalMethod;
	private String aRevalCostOffset;
	private String aRevalCostOffsetPrior;
	private String aRevalDepexpOffset;
	private BigDecimal aSalvageValue;
	private BigDecimal aSplitPercent;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private String assetdepreciationdate;
	private String assetdisposaldate;
	private BigDecimal assetmarketvalueamt;
	private String assetservicedate;
	private Integer cAcctschemaId;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cLocationId;
	private String conventiontype;
	private String created;
	private Integer createdby;
	private String depreciationtype;
	private String description;
	private String guaranteedate;
	private String help;
	private Integer iAssetId;
	private String iErrormsg;
	private String iIsimported;
	private String isactive;
	private String isdepreciated;
	private String isdisposed;
	private String isfullydepreciated;
	private String isinposession;
	private String isowned;
	private Integer lifeuseunits;
	private String locationcomment;
	private String lot;
	private Integer mAttributesetinstanceId;
	private Integer mLocatorId;
	private Integer mProductId;
	private String name;
	private String postingtype;
	private String processed;
	private String processing;
	private String serno;
	private String updated;
	private Integer updatedby;
	private Integer uselifemonths;
	private Integer uselifeyears;
	private Integer useunits;
	private String value;
	private String versionno;

	public IAsset() {
	}

	public IAsset(Integer iAssetId) {
		this.iAssetId = iAssetId;
	}

	@Basic
	@Column(name="A_ACCUMDEPRECIATION_ACCT")
	public Integer getAAccumdepreciationAcct() {
		return aAccumdepreciationAcct;
	}

	public void setAAccumdepreciationAcct(Integer aAccumdepreciationAcct) {
		this.aAccumdepreciationAcct = aAccumdepreciationAcct;
	}

	@Basic
	@Column(name="A_ACCUMULATED_DEPR")
	public BigDecimal getAAccumulatedDepr() {
		return aAccumulatedDepr;
	}

	public void setAAccumulatedDepr(BigDecimal aAccumulatedDepr) {
		this.aAccumulatedDepr = aAccumulatedDepr;
	}

	@Basic
	@Column(name="A_ASSET_ACCT")
	public Integer getAAssetAcct() {
		return aAssetAcct;
	}

	public void setAAssetAcct(Integer aAssetAcct) {
		this.aAssetAcct = aAssetAcct;
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
	@Column(name="A_ASSET_GROUP_ID")
	public Integer getAAssetGroupId() {
		return aAssetGroupId;
	}

	public void setAAssetGroupId(Integer aAssetGroupId) {
		this.aAssetGroupId = aAssetGroupId;
	}

	@Basic
	@Column(name="A_ASSET_ID")
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_ASSET_LIFE_CURRENT_YEAR")
	public Integer getAAssetLifeCurrentYear() {
		return aAssetLifeCurrentYear;
	}

	public void setAAssetLifeCurrentYear(Integer aAssetLifeCurrentYear) {
		this.aAssetLifeCurrentYear = aAssetLifeCurrentYear;
	}

	@Basic
	@Column(name="A_ASSET_LIFE_YEARS")
	public Integer getAAssetLifeYears() {
		return aAssetLifeYears;
	}

	public void setAAssetLifeYears(Integer aAssetLifeYears) {
		this.aAssetLifeYears = aAssetLifeYears;
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
	@Column(name="A_BASE_AMOUNT")
	public BigDecimal getABaseAmount() {
		return aBaseAmount;
	}

	public void setABaseAmount(BigDecimal aBaseAmount) {
		this.aBaseAmount = aBaseAmount;
	}

	@Basic
	@Column(name="A_CALC_ACCUMULATED_DEPR")
	public BigDecimal getACalcAccumulatedDepr() {
		return aCalcAccumulatedDepr;
	}

	public void setACalcAccumulatedDepr(BigDecimal aCalcAccumulatedDepr) {
		this.aCalcAccumulatedDepr = aCalcAccumulatedDepr;
	}

	@Basic
	@Column(name="A_CURR_DEP_EXP")
	public BigDecimal getACurrDepExp() {
		return aCurrDepExp;
	}

	public void setACurrDepExp(BigDecimal aCurrDepExp) {
		this.aCurrDepExp = aCurrDepExp;
	}

	@Basic
	@Column(name="A_CURRENT_PERIOD")
	public Integer getACurrentPeriod() {
		return aCurrentPeriod;
	}

	public void setACurrentPeriod(Integer aCurrentPeriod) {
		this.aCurrentPeriod = aCurrentPeriod;
	}

	@Basic
	@Column(name="A_DEPRECIATION_ACCT")
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
	@Column(name="A_DEPRECIATION_TABLE_HEADER_ID")
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
	@Column(name="A_LIFE_PERIOD")
	public Integer getALifePeriod() {
		return aLifePeriod;
	}

	public void setALifePeriod(Integer aLifePeriod) {
		this.aLifePeriod = aLifePeriod;
	}

	@Basic
	@Column(name="A_PARENT_ASSET_ID")
	public Integer getAParentAssetId() {
		return aParentAssetId;
	}

	public void setAParentAssetId(Integer aParentAssetId) {
		this.aParentAssetId = aParentAssetId;
	}

	@Basic
	@Column(name="A_PERIOD_END")
	public Integer getAPeriodEnd() {
		return aPeriodEnd;
	}

	public void setAPeriodEnd(Integer aPeriodEnd) {
		this.aPeriodEnd = aPeriodEnd;
	}

	@Basic
	@Column(name="A_PERIOD_POSTED")
	public Integer getAPeriodPosted() {
		return aPeriodPosted;
	}

	public void setAPeriodPosted(Integer aPeriodPosted) {
		this.aPeriodPosted = aPeriodPosted;
	}

	@Basic
	@Column(name="A_PERIOD_START")
	public Integer getAPeriodStart() {
		return aPeriodStart;
	}

	public void setAPeriodStart(Integer aPeriodStart) {
		this.aPeriodStart = aPeriodStart;
	}

	@Basic
	@Column(name="A_PRIOR_YEAR_ACCUMULATED_DEPR")
	public BigDecimal getAPriorYearAccumulatedDepr() {
		return aPriorYearAccumulatedDepr;
	}

	public void setAPriorYearAccumulatedDepr(BigDecimal aPriorYearAccumulatedDepr) {
		this.aPriorYearAccumulatedDepr = aPriorYearAccumulatedDepr;
	}

	@Basic
	@Column(name="A_QTY_CURRENT")
	public Integer getAQtyCurrent() {
		return aQtyCurrent;
	}

	public void setAQtyCurrent(Integer aQtyCurrent) {
		this.aQtyCurrent = aQtyCurrent;
	}

	@Basic
	@Column(name="A_QTY_ORIGINAL")
	public Integer getAQtyOriginal() {
		return aQtyOriginal;
	}

	public void setAQtyOriginal(Integer aQtyOriginal) {
		this.aQtyOriginal = aQtyOriginal;
	}

	@Basic
	@Column(name="A_REVAL_ACCUMDEP_OFFSET_CUR", length=22)
	public String getARevalAccumdepOffsetCur() {
		return aRevalAccumdepOffsetCur;
	}

	public void setARevalAccumdepOffsetCur(String aRevalAccumdepOffsetCur) {
		this.aRevalAccumdepOffsetCur = aRevalAccumdepOffsetCur;
	}

	@Basic
	@Column(name="A_REVAL_ACCUMDEP_OFFSET_PRIOR", length=22)
	public String getARevalAccumdepOffsetPrior() {
		return aRevalAccumdepOffsetPrior;
	}

	public void setARevalAccumdepOffsetPrior(String aRevalAccumdepOffsetPrior) {
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
	@Column(name="A_REVAL_COST_OFFSET", length=22)
	public String getARevalCostOffset() {
		return aRevalCostOffset;
	}

	public void setARevalCostOffset(String aRevalCostOffset) {
		this.aRevalCostOffset = aRevalCostOffset;
	}

	@Basic
	@Column(name="A_REVAL_COST_OFFSET_PRIOR", length=22)
	public String getARevalCostOffsetPrior() {
		return aRevalCostOffsetPrior;
	}

	public void setARevalCostOffsetPrior(String aRevalCostOffsetPrior) {
		this.aRevalCostOffsetPrior = aRevalCostOffsetPrior;
	}

	@Basic
	@Column(name="A_REVAL_DEPEXP_OFFSET", length=22)
	public String getARevalDepexpOffset() {
		return aRevalDepexpOffset;
	}

	public void setARevalDepexpOffset(String aRevalDepexpOffset) {
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
	@Column(name="AD_USER_ID")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
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
	@Column(name="C_ACCTSCHEMA_ID")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
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
	@Column(length=510)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public String getGuaranteedate() {
		return guaranteedate;
	}

	public void setGuaranteedate(String guaranteedate) {
		this.guaranteedate = guaranteedate;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Id
	@Column(name="I_ASSET_ID")
	public Integer getIAssetId() {
		return iAssetId;
	}

	public void setIAssetId(Integer iAssetId) {
		this.iAssetId = iAssetId;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrormsg() {
		return iErrormsg;
	}

	public void setIErrormsg(String iErrormsg) {
		this.iErrormsg = iErrormsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED", length=1)
	public String getIIsimported() {
		return iIsimported;
	}

	public void setIIsimported(String iIsimported) {
		this.iIsimported = iIsimported;
	}

	@Basic
	@Column(length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(length=1)
	public String getIsdepreciated() {
		return isdepreciated;
	}

	public void setIsdepreciated(String isdepreciated) {
		this.isdepreciated = isdepreciated;
	}

	@Basic
	@Column(length=1)
	public String getIsdisposed() {
		return isdisposed;
	}

	public void setIsdisposed(String isdisposed) {
		this.isdisposed = isdisposed;
	}

	@Basic
	@Column(length=1)
	public String getIsfullydepreciated() {
		return isfullydepreciated;
	}

	public void setIsfullydepreciated(String isfullydepreciated) {
		this.isfullydepreciated = isfullydepreciated;
	}

	@Basic
	@Column(length=1)
	public String getIsinposession() {
		return isinposession;
	}

	public void setIsinposession(String isinposession) {
		this.isinposession = isinposession;
	}

	@Basic
	@Column(length=1)
	public String getIsowned() {
		return isowned;
	}

	public void setIsowned(String isowned) {
		this.isowned = isowned;
	}

	@Basic
	public Integer getLifeuseunits() {
		return lifeuseunits;
	}

	public void setLifeuseunits(Integer lifeuseunits) {
		this.lifeuseunits = lifeuseunits;
	}

	@Basic
	public String getLocationcomment() {
		return locationcomment;
	}

	public void setLocationcomment(String locationcomment) {
		this.locationcomment = locationcomment;
	}

	@Basic
	@Column(length=20)
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_LOCATOR_ID")
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	@Column(length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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
	@Column(length=20)
	public String getSerno() {
		return serno;
	}

	public void setSerno(String serno) {
		this.serno = serno;
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
	public Integer getUselifemonths() {
		return uselifemonths;
	}

	public void setUselifemonths(Integer uselifemonths) {
		this.uselifemonths = uselifemonths;
	}

	@Basic
	public Integer getUselifeyears() {
		return uselifeyears;
	}

	public void setUselifeyears(Integer uselifeyears) {
		this.uselifeyears = uselifeyears;
	}

	@Basic
	public Integer getUseunits() {
		return useunits;
	}

	public void setUseunits(Integer useunits) {
		this.useunits = useunits;
	}

	@Basic
	@Column(length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(length=20)
	public String getVersionno() {
		return versionno;
	}

	public void setVersionno(String versionno) {
		this.versionno = versionno;
	}
}