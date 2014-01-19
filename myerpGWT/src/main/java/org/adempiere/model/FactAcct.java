package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="fact_acct")
public class FactAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer accountId;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer adTableId;
	private BigDecimal amtacctcr;
	private BigDecimal amtacctdr;
	private BigDecimal amtsourcecr;
	private BigDecimal amtsourcedr;
	private Integer cAcctschemaId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cCampaignId;
	private Integer cCurrencyId;
	private Integer cLocfromId;
	private Integer cLoctoId;
	private Integer cPeriodId;
	private Integer cProjectId;
	private Integer cProjectphaseId;
	private Integer cProjecttaskId;
	private Integer cSalesregionId;
	private Integer cSubacctId;
	private Integer cTaxId;
	private Integer cUomId;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String datetrx;
	private String description;
	private Integer factAcctId;
	private Integer glBudgetId;
	private Integer glCategoryId;
	private Boolean isactive;
	private Integer lineId;
	private Integer mLocatorId;
	private Integer mProductId;
	private String postingtype;
	private BigDecimal qty;
	private Integer recordId;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;
	private Integer userelement1Id;
	private Integer userelement2Id;

	public FactAcct() {
	}

	public FactAcct(Integer factAcctId) {
		this.factAcctId = factAcctId;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT")
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="ACCOUNT_ID", columnDefinition="INT", nullable=false)
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAmtacctcr() {
		return amtacctcr;
	}

	public void setAmtacctcr(BigDecimal amtacctcr) {
		this.amtacctcr = amtacctcr;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAmtacctdr() {
		return amtacctdr;
	}

	public void setAmtacctdr(BigDecimal amtacctdr) {
		this.amtacctdr = amtacctdr;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAmtsourcecr() {
		return amtsourcecr;
	}

	public void setAmtsourcecr(BigDecimal amtsourcecr) {
		this.amtsourcecr = amtsourcecr;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAmtsourcedr() {
		return amtsourcedr;
	}

	public void setAmtsourcedr(BigDecimal amtsourcedr) {
		this.amtsourcedr = amtsourcedr;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
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
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_LOCFROM_ID", columnDefinition="INT")
	public Integer getCLocfromId() {
		return cLocfromId;
	}

	public void setCLocfromId(Integer cLocfromId) {
		this.cLocfromId = cLocfromId;
	}

	@Basic
	@Column(name="C_LOCTO_ID", columnDefinition="INT")
	public Integer getCLoctoId() {
		return cLoctoId;
	}

	public void setCLoctoId(Integer cLoctoId) {
		this.cLoctoId = cLoctoId;
	}

	@Basic
	@Column(name="C_PERIOD_ID", columnDefinition="INT")
	public Integer getCPeriodId() {
		return cPeriodId;
	}

	public void setCPeriodId(Integer cPeriodId) {
		this.cPeriodId = cPeriodId;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_PROJECTPHASE_ID", columnDefinition="INT")
	public Integer getCProjectphaseId() {
		return cProjectphaseId;
	}

	public void setCProjectphaseId(Integer cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}

	@Basic
	@Column(name="C_PROJECTTASK_ID", columnDefinition="INT")
	public Integer getCProjecttaskId() {
		return cProjecttaskId;
	}

	public void setCProjecttaskId(Integer cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
	}

	@Basic
	@Column(name="C_SALESREGION_ID", columnDefinition="INT")
	public Integer getCSalesregionId() {
		return cSalesregionId;
	}

	public void setCSalesregionId(Integer cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
	}

	@Basic
	@Column(name="C_SUBACCT_ID", columnDefinition="INT")
	public Integer getCSubacctId() {
		return cSubacctId;
	}

	public void setCSubacctId(Integer cSubacctId) {
		this.cSubacctId = cSubacctId;
	}

	@Basic
	@Column(name="C_TAX_ID", columnDefinition="INT")
	public Integer getCTaxId() {
		return cTaxId;
	}

	public void setCTaxId(Integer cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
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
	public String getDateacct() {
		return dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
	}

	@Basic
	@Column(nullable=false)
	public String getDatetrx() {
		return datetrx;
	}

	public void setDatetrx(String datetrx) {
		this.datetrx = datetrx;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
	@Column(name="FACT_ACCT_ID", columnDefinition="INT")
	public Integer getFactAcctId() {
		return factAcctId;
	}

	public void setFactAcctId(Integer factAcctId) {
		this.factAcctId = factAcctId;
	}

	@Basic
	@Column(name="GL_BUDGET_ID", columnDefinition="INT")
	public Integer getGlBudgetId() {
		return glBudgetId;
	}

	public void setGlBudgetId(Integer glBudgetId) {
		this.glBudgetId = glBudgetId;
	}

	@Basic
	@Column(name="GL_CATEGORY_ID", columnDefinition="INT")
	public Integer getGlCategoryId() {
		return glCategoryId;
	}

	public void setGlCategoryId(Integer glCategoryId) {
		this.glCategoryId = glCategoryId;
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
	@Column(name="LINE_ID", columnDefinition="INT")
	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT")
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
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
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(name="RECORD_ID", columnDefinition="INT", nullable=false)
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Integer user1Id) {
		this.user1Id = user1Id;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Integer user2Id) {
		this.user2Id = user2Id;
	}

	@Basic
	@Column(name="USERELEMENT1_ID", columnDefinition="INT")
	public Integer getUserelement1Id() {
		return userelement1Id;
	}

	public void setUserelement1Id(Integer userelement1Id) {
		this.userelement1Id = userelement1Id;
	}

	@Basic
	@Column(name="USERELEMENT2_ID", columnDefinition="INT")
	public Integer getUserelement2Id() {
		return userelement2Id;
	}

	public void setUserelement2Id(Integer userelement2Id) {
		this.userelement2Id = userelement2Id;
	}
}