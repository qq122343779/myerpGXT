package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_country")
public class CCountry extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private String adLanguage;
	private Integer adOrgId;
	private String allowcitiesoutoflist;
	private Integer cCountryId;
	private Integer cCurrencyId;
	private String capturesequence;
	private String countrycode;
	private String created;
	private Integer createdby;
	private String description;
	private String displaysequence;
	private String displaysequencelocal;
	private String expressionbankaccountno;
	private String expressionbankroutingno;
	private String expressionphone;
	private String expressionpostal;
	private String expressionpostalAdd;
	private String haspostalAdd;
	private String hasregion;
	private Boolean isactive;
	private Boolean isaddresslineslocalreverse;
	private Boolean isaddresslinesreverse;
	private Boolean ispostcodelookup;
	private String lookupclassname;
	private String lookupclientid;
	private String lookuppassword;
	private String lookupurl;
	private String mediasize;
	private String name;
	private String regionname;
	private String updated;
	private Integer updatedby;

	public CCountry() {
	}

	public CCountry(Integer cCountryId) {
		this.cCountryId = cCountryId;
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
	@Column(name="AD_LANGUAGE", length=6)
	public String getAdLanguage() {
		return adLanguage;
	}

	public void setAdLanguage(String adLanguage) {
		this.adLanguage = adLanguage;
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
	@Column(length=1)
	public String getAllowcitiesoutoflist() {
		return allowcitiesoutoflist;
	}

	public void setAllowcitiesoutoflist(String allowcitiesoutoflist) {
		this.allowcitiesoutoflist = allowcitiesoutoflist;
	}

	@Id
	@Column(name="C_COUNTRY_ID", columnDefinition="INT")
	public Integer getCCountryId() {
		return cCountryId;
	}

	public void setCCountryId(Integer cCountryId) {
		this.cCountryId = cCountryId;
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
	@Column(length=60)
	public String getCapturesequence() {
		return capturesequence;
	}

	public void setCapturesequence(String capturesequence) {
		this.capturesequence = capturesequence;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getDisplaysequence() {
		return displaysequence;
	}

	public void setDisplaysequence(String displaysequence) {
		this.displaysequence = displaysequence;
	}

	@Basic
	@Column(length=20)
	public String getDisplaysequencelocal() {
		return displaysequencelocal;
	}

	public void setDisplaysequencelocal(String displaysequencelocal) {
		this.displaysequencelocal = displaysequencelocal;
	}

	@Basic
	@Column(length=20)
	public String getExpressionbankaccountno() {
		return expressionbankaccountno;
	}

	public void setExpressionbankaccountno(String expressionbankaccountno) {
		this.expressionbankaccountno = expressionbankaccountno;
	}

	@Basic
	@Column(length=20)
	public String getExpressionbankroutingno() {
		return expressionbankroutingno;
	}

	public void setExpressionbankroutingno(String expressionbankroutingno) {
		this.expressionbankroutingno = expressionbankroutingno;
	}

	@Basic
	@Column(length=20)
	public String getExpressionphone() {
		return expressionphone;
	}

	public void setExpressionphone(String expressionphone) {
		this.expressionphone = expressionphone;
	}

	@Basic
	@Column(length=20)
	public String getExpressionpostal() {
		return expressionpostal;
	}

	public void setExpressionpostal(String expressionpostal) {
		this.expressionpostal = expressionpostal;
	}

	@Basic
	@Column(name="EXPRESSIONPOSTAL_ADD", length=20)
	public String getExpressionpostalAdd() {
		return expressionpostalAdd;
	}

	public void setExpressionpostalAdd(String expressionpostalAdd) {
		this.expressionpostalAdd = expressionpostalAdd;
	}

	@Basic
	@Column(name="HASPOSTAL_ADD", nullable=false, length=1)
	public String getHaspostalAdd() {
		return haspostalAdd;
	}

	public void setHaspostalAdd(String haspostalAdd) {
		this.haspostalAdd = haspostalAdd;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getHasregion() {
		return hasregion;
	}

	public void setHasregion(String hasregion) {
		this.hasregion = hasregion;
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
	public Boolean isIsaddresslineslocalreverse() {
		return isaddresslineslocalreverse;
	}

	public void setIsaddresslineslocalreverse(Boolean isaddresslineslocalreverse) {
		this.isaddresslineslocalreverse = isaddresslineslocalreverse;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsaddresslinesreverse() {
		return isaddresslinesreverse;
	}

	public void setIsaddresslinesreverse(Boolean isaddresslinesreverse) {
		this.isaddresslinesreverse = isaddresslinesreverse;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIspostcodelookup() {
		return ispostcodelookup;
	}

	public void setIspostcodelookup(Boolean ispostcodelookup) {
		this.ispostcodelookup = ispostcodelookup;
	}

	@Basic
	public String getLookupclassname() {
		return lookupclassname;
	}

	public void setLookupclassname(String lookupclassname) {
		this.lookupclassname = lookupclassname;
	}

	@Basic
	@Column(length=50)
	public String getLookupclientid() {
		return lookupclientid;
	}

	public void setLookupclientid(String lookupclientid) {
		this.lookupclientid = lookupclientid;
	}

	@Basic
	@Column(length=50)
	public String getLookuppassword() {
		return lookuppassword;
	}

	public void setLookuppassword(String lookuppassword) {
		this.lookuppassword = lookuppassword;
	}

	@Basic
	@Column(length=100)
	public String getLookupurl() {
		return lookupurl;
	}

	public void setLookupurl(String lookupurl) {
		this.lookupurl = lookupurl;
	}

	@Basic
	@Column(length=40)
	public String getMediasize() {
		return mediasize;
	}

	public void setMediasize(String mediasize) {
		this.mediasize = mediasize;
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
	@Column(length=60)
	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
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