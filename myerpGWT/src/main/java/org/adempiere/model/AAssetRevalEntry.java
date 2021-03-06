package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_reval_entry")
public class AAssetRevalEntry extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetRevalEntryId;
	private String aEffectiveDate;
	private String aRevCode;
	private String aRevalCalMethod;
	private String aRevalEffectiveDate;
	private String aRevalMultiplier;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cCurrencyId;
	private Integer cDoctypeId;
	private Integer cPeriodId;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String datedoc;
	private String description;
	private String documentno;
	private Integer glCategoryId;
	private Boolean isactive;
	private String postingtype;
	private Boolean processed;
	private Boolean processing;
	private String updated;
	private Integer updatedby;

	public AAssetRevalEntry() {
	}

	public AAssetRevalEntry(Integer aAssetRevalEntryId) {
		this.aAssetRevalEntryId = aAssetRevalEntryId;
	}

	@Id
	@Column(name="A_ASSET_REVAL_ENTRY_ID", columnDefinition="INT")
	public Integer getAAssetRevalEntryId() {
		return aAssetRevalEntryId;
	}

	public void setAAssetRevalEntryId(Integer aAssetRevalEntryId) {
		this.aAssetRevalEntryId = aAssetRevalEntryId;
	}

	@Basic
	@Column(name="A_EFFECTIVE_DATE", nullable=false)
	public String getAEffectiveDate() {
		return aEffectiveDate;
	}

	public void setAEffectiveDate(String aEffectiveDate) {
		this.aEffectiveDate = aEffectiveDate;
	}

	@Basic
	@Column(name="A_REV_CODE", nullable=false, length=3)
	public String getARevCode() {
		return aRevCode;
	}

	public void setARevCode(String aRevCode) {
		this.aRevCode = aRevCode;
	}

	@Basic
	@Column(name="A_REVAL_CAL_METHOD", nullable=false, length=3)
	public String getARevalCalMethod() {
		return aRevalCalMethod;
	}

	public void setARevalCalMethod(String aRevalCalMethod) {
		this.aRevalCalMethod = aRevalCalMethod;
	}

	@Basic
	@Column(name="A_REVAL_EFFECTIVE_DATE", nullable=false, length=2)
	public String getARevalEffectiveDate() {
		return aRevalEffectiveDate;
	}

	public void setARevalEffectiveDate(String aRevalEffectiveDate) {
		this.aRevalEffectiveDate = aRevalEffectiveDate;
	}

	@Basic
	@Column(name="A_REVAL_MULTIPLIER", nullable=false, length=3)
	public String getARevalMultiplier() {
		return aRevalMultiplier;
	}

	public void setARevalMultiplier(String aRevalMultiplier) {
		this.aRevalMultiplier = aRevalMultiplier;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
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
	public String getDatedoc() {
		return datedoc;
	}

	public void setDatedoc(String datedoc) {
		this.datedoc = datedoc;
	}

	@Basic
	@Column(nullable=false, length=510)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
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
	@Column(nullable=false, length=1)
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}