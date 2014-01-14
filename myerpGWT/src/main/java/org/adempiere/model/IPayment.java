package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_payment")
public class IPayment extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String aCity;
	private String aCountry;
	private String aEmail;
	private String aIdentDl;
	private String aIdentSsn;
	private String aName;
	private String aState;
	private String aStreet;
	private String aZip;
	private String accountno;
	private Integer adClientId;
	private Integer adOrgId;
	private String bankaccountno;
	private String bpartnervalue;
	private Integer cBankaccountId;
	private Integer cBpartnerId;
	private Integer cChargeId;
	private Integer cCurrencyId;
	private Integer cDoctypeId;
	private Integer cInvoiceId;
	private Integer cPaymentId;
	private BigDecimal chargeamt;
	private String chargename;
	private String checkno;
	private String created;
	private Integer createdby;
	private Integer creditcardexpmm;
	private Integer creditcardexpyy;
	private String creditcardnumber;
	private String creditcardtype;
	private String creditcardvv;
	private String dateacct;
	private String datetrx;
	private BigDecimal discountamt;
	private String doctypename;
	private String documentno;
	private String iErrormsg;
	private String iIsimported;
	private Integer iPaymentId;
	private String invoicedocumentno;
	private String isactive;
	private String isapproved;
	private String isdelayedcapture;
	private String isoCode;
	private String isoverunderpayment;
	private String isreceipt;
	private String isselfservice;
	private String micr;
	private String origTrxid;
	private BigDecimal overunderamt;
	private BigDecimal payamt;
	private String ponum;
	private String processed;
	private String processing;
	private String rAuthcode;
	private String rInfo;
	private String rPnref;
	private String rRespmsg;
	private String rResult;
	private String routingno;
	private String swipe;
	private BigDecimal taxamt;
	private String tendertype;
	private String trxtype;
	private String updated;
	private Integer updatedby;
	private String voiceauthcode;
	private BigDecimal writeoffamt;

	public IPayment() {
	}

	public IPayment(Integer iPaymentId) {
		this.iPaymentId = iPaymentId;
	}

	@Basic
	@Column(name="A_CITY", length=60)
	public String getACity() {
		return aCity;
	}

	public void setACity(String aCity) {
		this.aCity = aCity;
	}

	@Basic
	@Column(name="A_COUNTRY", length=40)
	public String getACountry() {
		return aCountry;
	}

	public void setACountry(String aCountry) {
		this.aCountry = aCountry;
	}

	@Basic
	@Column(name="A_EMAIL", length=60)
	public String getAEmail() {
		return aEmail;
	}

	public void setAEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	@Basic
	@Column(name="A_IDENT_DL", length=20)
	public String getAIdentDl() {
		return aIdentDl;
	}

	public void setAIdentDl(String aIdentDl) {
		this.aIdentDl = aIdentDl;
	}

	@Basic
	@Column(name="A_IDENT_SSN", length=20)
	public String getAIdentSsn() {
		return aIdentSsn;
	}

	public void setAIdentSsn(String aIdentSsn) {
		this.aIdentSsn = aIdentSsn;
	}

	@Basic
	@Column(name="A_NAME", length=60)
	public String getAName() {
		return aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}

	@Basic
	@Column(name="A_STATE", length=40)
	public String getAState() {
		return aState;
	}

	public void setAState(String aState) {
		this.aState = aState;
	}

	@Basic
	@Column(name="A_STREET", length=60)
	public String getAStreet() {
		return aStreet;
	}

	public void setAStreet(String aStreet) {
		this.aStreet = aStreet;
	}

	@Basic
	@Column(name="A_ZIP", length=20)
	public String getAZip() {
		return aZip;
	}

	public void setAZip(String aZip) {
		this.aZip = aZip;
	}

	@Basic
	@Column(length=20)
	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	@Basic
	@Column(name="AD_CLIENT_ID")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(length=20)
	public String getBankaccountno() {
		return bankaccountno;
	}

	public void setBankaccountno(String bankaccountno) {
		this.bankaccountno = bankaccountno;
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
	@Column(name="C_BANKACCOUNT_ID")
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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
	@Column(name="C_CHARGE_ID")
	public Integer getCChargeId() {
		return cChargeId;
	}

	public void setCChargeId(Integer cChargeId) {
		this.cChargeId = cChargeId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID")
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	@Basic
	@Column(name="C_INVOICE_ID")
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_PAYMENT_ID")
	public Integer getCPaymentId() {
		return cPaymentId;
	}

	public void setCPaymentId(Integer cPaymentId) {
		this.cPaymentId = cPaymentId;
	}

	@Basic
	public BigDecimal getChargeamt() {
		return chargeamt;
	}

	public void setChargeamt(BigDecimal chargeamt) {
		this.chargeamt = chargeamt;
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
	@Column(length=20)
	public String getCheckno() {
		return checkno;
	}

	public void setCheckno(String checkno) {
		this.checkno = checkno;
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
	public Integer getCreditcardexpmm() {
		return creditcardexpmm;
	}

	public void setCreditcardexpmm(Integer creditcardexpmm) {
		this.creditcardexpmm = creditcardexpmm;
	}

	@Basic
	public Integer getCreditcardexpyy() {
		return creditcardexpyy;
	}

	public void setCreditcardexpyy(Integer creditcardexpyy) {
		this.creditcardexpyy = creditcardexpyy;
	}

	@Basic
	@Column(length=20)
	public String getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	@Basic
	@Column(length=1)
	public String getCreditcardtype() {
		return creditcardtype;
	}

	public void setCreditcardtype(String creditcardtype) {
		this.creditcardtype = creditcardtype;
	}

	@Basic
	@Column(length=4)
	public String getCreditcardvv() {
		return creditcardvv;
	}

	public void setCreditcardvv(String creditcardvv) {
		this.creditcardvv = creditcardvv;
	}

	@Basic
	public String getDateacct() {
		return dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
	}

	@Basic
	public String getDatetrx() {
		return datetrx;
	}

	public void setDatetrx(String datetrx) {
		this.datetrx = datetrx;
	}

	@Basic
	public BigDecimal getDiscountamt() {
		return discountamt;
	}

	public void setDiscountamt(BigDecimal discountamt) {
		this.discountamt = discountamt;
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
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrormsg() {
		return iErrormsg;
	}

	public void setIErrormsg(String iErrormsg) {
		this.iErrormsg = iErrormsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED", nullable=false, length=1)
	public String getIIsimported() {
		return iIsimported;
	}

	public void setIIsimported(String iIsimported) {
		this.iIsimported = iIsimported;
	}

	@Id
	@Column(name="I_PAYMENT_ID")
	public Integer getIPaymentId() {
		return iPaymentId;
	}

	public void setIPaymentId(Integer iPaymentId) {
		this.iPaymentId = iPaymentId;
	}

	@Basic
	@Column(length=30)
	public String getInvoicedocumentno() {
		return invoicedocumentno;
	}

	public void setInvoicedocumentno(String invoicedocumentno) {
		this.invoicedocumentno = invoicedocumentno;
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
	public String getIsapproved() {
		return isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}

	@Basic
	@Column(length=1)
	public String getIsdelayedcapture() {
		return isdelayedcapture;
	}

	public void setIsdelayedcapture(String isdelayedcapture) {
		this.isdelayedcapture = isdelayedcapture;
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
	@Column(length=1)
	public String getIsoverunderpayment() {
		return isoverunderpayment;
	}

	public void setIsoverunderpayment(String isoverunderpayment) {
		this.isoverunderpayment = isoverunderpayment;
	}

	@Basic
	@Column(length=1)
	public String getIsreceipt() {
		return isreceipt;
	}

	public void setIsreceipt(String isreceipt) {
		this.isreceipt = isreceipt;
	}

	@Basic
	@Column(length=1)
	public String getIsselfservice() {
		return isselfservice;
	}

	public void setIsselfservice(String isselfservice) {
		this.isselfservice = isselfservice;
	}

	@Basic
	@Column(length=20)
	public String getMicr() {
		return micr;
	}

	public void setMicr(String micr) {
		this.micr = micr;
	}

	@Basic
	@Column(name="ORIG_TRXID", length=20)
	public String getOrigTrxid() {
		return origTrxid;
	}

	public void setOrigTrxid(String origTrxid) {
		this.origTrxid = origTrxid;
	}

	@Basic
	public BigDecimal getOverunderamt() {
		return overunderamt;
	}

	public void setOverunderamt(BigDecimal overunderamt) {
		this.overunderamt = overunderamt;
	}

	@Basic
	public BigDecimal getPayamt() {
		return payamt;
	}

	public void setPayamt(BigDecimal payamt) {
		this.payamt = payamt;
	}

	@Basic
	@Column(length=60)
	public String getPonum() {
		return ponum;
	}

	public void setPonum(String ponum) {
		this.ponum = ponum;
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
	@Column(name="R_AUTHCODE", length=20)
	public String getRAuthcode() {
		return rAuthcode;
	}

	public void setRAuthcode(String rAuthcode) {
		this.rAuthcode = rAuthcode;
	}

	@Basic
	@Column(name="R_INFO", length=2000)
	public String getRInfo() {
		return rInfo;
	}

	public void setRInfo(String rInfo) {
		this.rInfo = rInfo;
	}

	@Basic
	@Column(name="R_PNREF", length=20)
	public String getRPnref() {
		return rPnref;
	}

	public void setRPnref(String rPnref) {
		this.rPnref = rPnref;
	}

	@Basic
	@Column(name="R_RESPMSG", length=60)
	public String getRRespmsg() {
		return rRespmsg;
	}

	public void setRRespmsg(String rRespmsg) {
		this.rRespmsg = rRespmsg;
	}

	@Basic
	@Column(name="R_RESULT", length=20)
	public String getRResult() {
		return rResult;
	}

	public void setRResult(String rResult) {
		this.rResult = rResult;
	}

	@Basic
	@Column(length=20)
	public String getRoutingno() {
		return routingno;
	}

	public void setRoutingno(String routingno) {
		this.routingno = routingno;
	}

	@Basic
	@Column(length=80)
	public String getSwipe() {
		return swipe;
	}

	public void setSwipe(String swipe) {
		this.swipe = swipe;
	}

	@Basic
	public BigDecimal getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
	}

	@Basic
	@Column(length=1)
	public String getTendertype() {
		return tendertype;
	}

	public void setTendertype(String tendertype) {
		this.tendertype = tendertype;
	}

	@Basic
	@Column(length=1)
	public String getTrxtype() {
		return trxtype;
	}

	public void setTrxtype(String trxtype) {
		this.trxtype = trxtype;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=20)
	public String getVoiceauthcode() {
		return voiceauthcode;
	}

	public void setVoiceauthcode(String voiceauthcode) {
		this.voiceauthcode = voiceauthcode;
	}

	@Basic
	public BigDecimal getWriteoffamt() {
		return writeoffamt;
	}

	public void setWriteoffamt(BigDecimal writeoffamt) {
		this.writeoffamt = writeoffamt;
	}
}