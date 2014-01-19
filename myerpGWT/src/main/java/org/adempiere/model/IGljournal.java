package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_gljournal")
public class IGljournal extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer accountId;
	private String accountvalue;
	private String acctschemaname;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgdocId;
	private Integer adOrgtrxId;
	private BigDecimal amtacctcr;
	private BigDecimal amtacctdr;
	private BigDecimal amtsourcecr;
	private BigDecimal amtsourcedr;
	private String batchdescription;
	private String batchdocumentno;
	private String bpartnervalue;
	private Integer cAcctschemaId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cCampaignId;
	private Integer cConversiontypeId;
	private Integer cCurrencyId;
	private Integer cDoctypeId;
	private Integer cLocfromId;
	private Integer cLoctoId;
	private Integer cPeriodId;
	private Integer cProjectId;
	private Integer cSalesregionId;
	private Integer cUomId;
	private Integer cValidcombinationId;
	private String categoryname;
	private String clientvalue;
	private String conversiontypevalue;
	private String created;
	private Integer createdby;
	private BigDecimal currencyrate;
	private String dateacct;
	private String description;
	private String doctypename;
	private Integer glBudgetId;
	private Integer glCategoryId;
	private Integer glJournalId;
	private Integer glJournalbatchId;
	private Integer glJournallineId;
	private String iErrormsg;
	private Integer iGljournalId;
	private String iIsimported;
	private Boolean isactive;
	private Boolean iscreatenewbatch;
	private Boolean iscreatenewjournal;
	private String isoCode;
	private String journaldocumentno;
	private Integer line;
	private Integer mProductId;
	private String orgtrxvalue;
	private String orgvalue;
	private String postingtype;
	private Boolean processed;
	private Boolean processing;
	private String productvalue;
	private String projectvalue;
	private BigDecimal qty;
	private String sku;
	private String upc;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;

	public IGljournal() {
	}

	public IGljournal(Integer iGljournalId) {
		this.iGljournalId = iGljournalId;
	}

	@Basic
	@Column(name="ACCOUNT_ID", columnDefinition="INT")
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Basic
	@Column(length=40)
	public String getAccountvalue() {
		return accountvalue;
	}

	public void setAccountvalue(String accountvalue) {
		this.accountvalue = accountvalue;
	}

	@Basic
	@Column(length=60)
	public String getAcctschemaname() {
		return acctschemaname;
	}

	public void setAcctschemaname(String acctschemaname) {
		this.acctschemaname = acctschemaname;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_ORGDOC_ID", columnDefinition="INT")
	public Integer getAdOrgdocId() {
		return adOrgdocId;
	}

	public void setAdOrgdocId(Integer adOrgdocId) {
		this.adOrgdocId = adOrgdocId;
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
	public BigDecimal getAmtacctcr() {
		return amtacctcr;
	}

	public void setAmtacctcr(BigDecimal amtacctcr) {
		this.amtacctcr = amtacctcr;
	}

	@Basic
	public BigDecimal getAmtacctdr() {
		return amtacctdr;
	}

	public void setAmtacctdr(BigDecimal amtacctdr) {
		this.amtacctdr = amtacctdr;
	}

	@Basic
	public BigDecimal getAmtsourcecr() {
		return amtsourcecr;
	}

	public void setAmtsourcecr(BigDecimal amtsourcecr) {
		this.amtsourcecr = amtsourcecr;
	}

	@Basic
	public BigDecimal getAmtsourcedr() {
		return amtsourcedr;
	}

	public void setAmtsourcedr(BigDecimal amtsourcedr) {
		this.amtsourcedr = amtsourcedr;
	}

	@Basic
	public String getBatchdescription() {
		return batchdescription;
	}

	public void setBatchdescription(String batchdescription) {
		this.batchdescription = batchdescription;
	}

	@Basic
	@Column(length=30)
	public String getBatchdocumentno() {
		return batchdocumentno;
	}

	public void setBatchdocumentno(String batchdocumentno) {
		this.batchdocumentno = batchdocumentno;
	}

	@Basic
	@Column(length=40)
	public String getBpartnervalue() {
		return bpartnervalue;
	}

	public void setBpartnervalue(String bpartnervalue) {
		this.bpartnervalue = bpartnervalue;
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
	@Column(name="C_CONVERSIONTYPE_ID", columnDefinition="INT")
	public Integer getCConversiontypeId() {
		return cConversiontypeId;
	}

	public void setCConversiontypeId(Integer cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
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
	@Column(name="C_SALESREGION_ID", columnDefinition="INT")
	public Integer getCSalesregionId() {
		return cSalesregionId;
	}

	public void setCSalesregionId(Integer cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
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
	@Column(name="C_VALIDCOMBINATION_ID", columnDefinition="INT")
	public Integer getCValidcombinationId() {
		return cValidcombinationId;
	}

	public void setCValidcombinationId(Integer cValidcombinationId) {
		this.cValidcombinationId = cValidcombinationId;
	}

	@Basic
	@Column(length=60)
	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Basic
	@Column(length=40)
	public String getClientvalue() {
		return clientvalue;
	}

	public void setClientvalue(String clientvalue) {
		this.clientvalue = clientvalue;
	}

	@Basic
	@Column(length=40)
	public String getConversiontypevalue() {
		return conversiontypevalue;
	}

	public void setConversiontypevalue(String conversiontypevalue) {
		this.conversiontypevalue = conversiontypevalue;
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
	@Column(columnDefinition="INT")
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public BigDecimal getCurrencyrate() {
		return currencyrate;
	}

	public void setCurrencyrate(BigDecimal currencyrate) {
		this.currencyrate = currencyrate;
	}

	@Basic
	public String getDateacct() {
		return dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=60)
	public String getDoctypename() {
		return doctypename;
	}

	public void setDoctypename(String doctypename) {
		this.doctypename = doctypename;
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
	@Column(name="GL_JOURNAL_ID", columnDefinition="INT")
	public Integer getGlJournalId() {
		return glJournalId;
	}

	public void setGlJournalId(Integer glJournalId) {
		this.glJournalId = glJournalId;
	}

	@Basic
	@Column(name="GL_JOURNALBATCH_ID", columnDefinition="INT")
	public Integer getGlJournalbatchId() {
		return glJournalbatchId;
	}

	public void setGlJournalbatchId(Integer glJournalbatchId) {
		this.glJournalbatchId = glJournalbatchId;
	}

	@Basic
	@Column(name="GL_JOURNALLINE_ID", columnDefinition="INT")
	public Integer getGlJournallineId() {
		return glJournallineId;
	}

	public void setGlJournallineId(Integer glJournallineId) {
		this.glJournallineId = glJournallineId;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrormsg() {
		return iErrormsg;
	}

	public void setIErrormsg(String iErrormsg) {
		this.iErrormsg = iErrormsg;
	}

	@Id
	@Column(name="I_GLJOURNAL_ID", columnDefinition="INT")
	public Integer getIGljournalId() {
		return iGljournalId;
	}

	public void setIGljournalId(Integer iGljournalId) {
		this.iGljournalId = iGljournalId;
	}

	@Basic
	@Column(name="I_ISIMPORTED", nullable=false, length=1)
	public String getIIsimported() {
		return iIsimported;
	}

	public void setIIsimported(String iIsimported) {
		this.iIsimported = iIsimported;
	}

	@Basic
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIscreatenewbatch() {
		return iscreatenewbatch;
	}

	public void setIscreatenewbatch(Boolean iscreatenewbatch) {
		this.iscreatenewbatch = iscreatenewbatch;
	}

	@Basic
	public Boolean isIscreatenewjournal() {
		return iscreatenewjournal;
	}

	public void setIscreatenewjournal(Boolean iscreatenewjournal) {
		this.iscreatenewjournal = iscreatenewjournal;
	}

	@Basic
	@Column(name="ISO_CODE", length=3)
	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	@Basic
	@Column(length=30)
	public String getJournaldocumentno() {
		return journaldocumentno;
	}

	public void setJournaldocumentno(String journaldocumentno) {
		this.journaldocumentno = journaldocumentno;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
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
	@Column(length=40)
	public String getOrgtrxvalue() {
		return orgtrxvalue;
	}

	public void setOrgtrxvalue(String orgtrxvalue) {
		this.orgtrxvalue = orgtrxvalue;
	}

	@Basic
	@Column(length=40)
	public String getOrgvalue() {
		return orgvalue;
	}

	public void setOrgvalue(String orgvalue) {
		this.orgvalue = orgvalue;
	}

	@Basic
	@Column(length=1)
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=40)
	public String getProductvalue() {
		return productvalue;
	}

	public void setProductvalue(String productvalue) {
		this.productvalue = productvalue;
	}

	@Basic
	@Column(length=40)
	public String getProjectvalue() {
		return projectvalue;
	}

	public void setProjectvalue(String projectvalue) {
		this.projectvalue = projectvalue;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(length=30)
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@Basic
	@Column(length=30)
	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
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
	@Column(columnDefinition="INT")
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
}