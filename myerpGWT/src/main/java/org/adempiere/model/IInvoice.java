package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_invoice")
public class IInvoice extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String activityvalue;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer adUserId;
	private String address1;
	private String address2;
	private String bpartnervalue;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cCampaignId;
	private Integer cChargeId;
	private Integer cCountryId;
	private Integer cCurrencyId;
	private Integer cDoctypeId;
	private Integer cInvoiceId;
	private Integer cInvoicelineId;
	private Integer cLocationId;
	private Integer cPaymenttermId;
	private Integer cProjectId;
	private Integer cRegionId;
	private Integer cTaxId;
	private String chargename;
	private String city;
	private String contactname;
	private String countrycode;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String dateinvoiced;
	private String description;
	private String doctypename;
	private String documentno;
	private String email;
	private String iErrormsg;
	private Integer iInvoiceId;
	private String iIsimported;
	private Boolean isactive;
	private Boolean issotrx;
	private String linedescription;
	private Integer mPricelistId;
	private Integer mProductId;
	private String name;
	private String paymenttermvalue;
	private String phone;
	private String postal;
	private BigDecimal priceactual;
	private Boolean processed;
	private Boolean processing;
	private String productvalue;
	private String projectvalue;
	private BigDecimal qtyordered;
	private String regionname;
	private Integer salesrepId;
	private String sku;
	private BigDecimal taxamt;
	private String taxindicator;
	private String upc;
	private String updated;
	private Integer updatedby;

	public IInvoice() {
	}

	public IInvoice(Integer iInvoiceId) {
		this.iInvoiceId = iInvoiceId;
	}

	@Basic
	@Column(length=40)
	public String getActivityvalue() {
		return activityvalue;
	}

	public void setActivityvalue(String activityvalue) {
		this.activityvalue = activityvalue;
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
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
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
	@Column(length=60)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Basic
	@Column(length=60)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT")
	public Integer getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
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
	@Column(name="C_CHARGE_ID", columnDefinition="INT")
	public Integer getCChargeId() {
		return cChargeId;
	}

	public void setCChargeId(Integer cChargeId) {
		this.cChargeId = cChargeId;
	}

	@Basic
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
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	@Basic
	@Column(name="C_INVOICE_ID", columnDefinition="INT")
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID", columnDefinition="INT")
	public Integer getCInvoicelineId() {
		return cInvoicelineId;
	}

	public void setCInvoicelineId(Integer cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
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
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT")
	public Integer getCPaymenttermId() {
		return cPaymenttermId;
	}

	public void setCPaymenttermId(Integer cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
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
	@Column(name="C_REGION_ID", columnDefinition="INT")
	public Integer getCRegionId() {
		return cRegionId;
	}

	public void setCRegionId(Integer cRegionId) {
		this.cRegionId = cRegionId;
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
	@Column(length=60)
	public String getChargename() {
		return chargename;
	}

	public void setChargename(String chargename) {
		this.chargename = chargename;
	}

	@Basic
	@Column(length=60)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Basic
	@Column(length=60)
	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	@Basic
	@Column(length=2)
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
	@Column(columnDefinition="INT")
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
	public String getDateinvoiced() {
		return dateinvoiced;
	}

	public void setDateinvoiced(String dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
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
	@Column(length=30)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Basic
	@Column(length=60)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	@Column(name="I_INVOICE_ID", columnDefinition="INT")
	public Integer getIInvoiceId() {
		return iInvoiceId;
	}

	public void setIInvoiceId(Integer iInvoiceId) {
		this.iInvoiceId = iInvoiceId;
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
	public Boolean isIssotrx() {
		return issotrx;
	}

	public void setIssotrx(Boolean issotrx) {
		this.issotrx = issotrx;
	}

	@Basic
	public String getLinedescription() {
		return linedescription;
	}

	public void setLinedescription(String linedescription) {
		this.linedescription = linedescription;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT")
	public Integer getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(Integer mPricelistId) {
		this.mPricelistId = mPricelistId;
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
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=40)
	public String getPaymenttermvalue() {
		return paymenttermvalue;
	}

	public void setPaymenttermvalue(String paymenttermvalue) {
		this.paymenttermvalue = paymenttermvalue;
	}

	@Basic
	@Column(length=40)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic
	@Column(length=10)
	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	@Basic
	public BigDecimal getPriceactual() {
		return priceactual;
	}

	public void setPriceactual(BigDecimal priceactual) {
		this.priceactual = priceactual;
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
	public BigDecimal getQtyordered() {
		return qtyordered;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
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
	@Column(name="SALESREP_ID", columnDefinition="INT")
	public Integer getSalesrepId() {
		return salesrepId;
	}

	public void setSalesrepId(Integer salesrepId) {
		this.salesrepId = salesrepId;
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
	public BigDecimal getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
	}

	@Basic
	@Column(length=10)
	public String getTaxindicator() {
		return taxindicator;
	}

	public void setTaxindicator(String taxindicator) {
		this.taxindicator = taxindicator;
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
}