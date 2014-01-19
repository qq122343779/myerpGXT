package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bp_bankaccount")
public class CBpBankaccount extends org.adempiere.common.ADEntityBase {
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
	private Integer adUserId;
	private String bankaccounttype;
	private String bpbankacctuse;
	private Integer cBankId;
	private Integer cBpBankaccountId;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private Integer creditcardexpmm;
	private Integer creditcardexpyy;
	private String creditcardnumber;
	private String creditcardtype;
	private String creditcardvv;
	private Boolean isach;
	private Boolean isactive;
	private String rAvsaddr;
	private String rAvszip;
	private String routingno;
	private String updated;
	private Integer updatedby;

	public CBpBankaccount() {
	}

	public CBpBankaccount(Integer cBpBankaccountId) {
		this.cBpBankaccountId = cBpBankaccountId;
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
	@Column(length=1)
	public String getBankaccounttype() {
		return bankaccounttype;
	}

	public void setBankaccounttype(String bankaccounttype) {
		this.bankaccounttype = bankaccounttype;
	}

	@Basic
	@Column(length=1)
	public String getBpbankacctuse() {
		return bpbankacctuse;
	}

	public void setBpbankacctuse(String bpbankacctuse) {
		this.bpbankacctuse = bpbankacctuse;
	}

	@Basic
	@Column(name="C_BANK_ID", columnDefinition="INT")
	public Integer getCBankId() {
		return cBankId;
	}

	public void setCBankId(Integer cBankId) {
		this.cBankId = cBankId;
	}

	@Id
	@Column(name="C_BP_BANKACCOUNT_ID", columnDefinition="INT")
	public Integer getCBpBankaccountId() {
		return cBpBankaccountId;
	}

	public void setCBpBankaccountId(Integer cBpBankaccountId) {
		this.cBpBankaccountId = cBpBankaccountId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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
	@Column(columnDefinition="INT")
	public Integer getCreditcardexpmm() {
		return creditcardexpmm;
	}

	public void setCreditcardexpmm(Integer creditcardexpmm) {
		this.creditcardexpmm = creditcardexpmm;
	}

	@Basic
	@Column(columnDefinition="INT")
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
	@Column(nullable=false)
	public Boolean isIsach() {
		return isach;
	}

	public void setIsach(Boolean isach) {
		this.isach = isach;
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
	@Column(name="R_AVSADDR", length=1)
	public String getRAvsaddr() {
		return rAvsaddr;
	}

	public void setRAvsaddr(String rAvsaddr) {
		this.rAvsaddr = rAvsaddr;
	}

	@Basic
	@Column(name="R_AVSZIP", length=1)
	public String getRAvszip() {
		return rAvszip;
	}

	public void setRAvszip(String rAvszip) {
		this.rAvszip = rAvszip;
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