package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bankaccount")
public class CBankaccount extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String accountno;
	private Integer adClientId;
	private Integer adOrgId;
	private String bankaccounttype;
	private String bban;
	private Integer cBankId;
	private Integer cBankaccountId;
	private Integer cCurrencyId;
	private String created;
	private Integer createdby;
	private BigDecimal creditlimit;
	private BigDecimal currentbalance;
	private String description;
	private String iban;
	private Boolean isactive;
	private Boolean isdefault;
	private String updated;
	private Integer updatedby;

	public CBankaccount() {
	}

	public CBankaccount(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}

	@Basic
	@Column(nullable=false, length=20)
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
	@Column(nullable=false, length=1)
	public String getBankaccounttype() {
		return bankaccounttype;
	}

	public void setBankaccounttype(String bankaccounttype) {
		this.bankaccounttype = bankaccounttype;
	}

	@Basic
	@Column(length=40)
	public String getBban() {
		return bban;
	}

	public void setBban(String bban) {
		this.bban = bban;
	}

	@Basic
	@Column(name="C_BANK_ID", columnDefinition="INT", nullable=false)
	public Integer getCBankId() {
		return cBankId;
	}

	public void setCBankId(Integer cBankId) {
		this.cBankId = cBankId;
	}

	@Id
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT")
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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
	public BigDecimal getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(BigDecimal creditlimit) {
		this.creditlimit = creditlimit;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCurrentbalance() {
		return currentbalance;
	}

	public void setCurrentbalance(BigDecimal currentbalance) {
		this.currentbalance = currentbalance;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=40)
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
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
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
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