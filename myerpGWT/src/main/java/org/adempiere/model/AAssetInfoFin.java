package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_info_fin")
public class AAssetInfoFin extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer aAssetInfoFinId;
	private String aContractDate;
	private String aDueOn;
	private String aExpiredDate;
	private String aFinanceMeth;
	private BigDecimal aMonthlyPayment;
	private String aPurchaseOption;
	private Integer aPurchaseOptionCredit;
	private BigDecimal aPurchaseOptionCreditPer;
	private BigDecimal aPurchasePrice;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String textmsg;
	private String updated;
	private Integer updatedby;

	public AAssetInfoFin() {
	}

	public AAssetInfoFin(Integer aAssetInfoFinId) {
		this.aAssetInfoFinId = aAssetInfoFinId;
	}

	@Basic
	@Column(name="A_ASSET_ID", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Id
	@Column(name="A_ASSET_INFO_FIN_ID")
	public Integer getAAssetInfoFinId() {
		return aAssetInfoFinId;
	}

	public void setAAssetInfoFinId(Integer aAssetInfoFinId) {
		this.aAssetInfoFinId = aAssetInfoFinId;
	}

	@Basic
	@Column(name="A_CONTRACT_DATE")
	public String getAContractDate() {
		return aContractDate;
	}

	public void setAContractDate(String aContractDate) {
		this.aContractDate = aContractDate;
	}

	@Basic
	@Column(name="A_DUE_ON", length=22)
	public String getADueOn() {
		return aDueOn;
	}

	public void setADueOn(String aDueOn) {
		this.aDueOn = aDueOn;
	}

	@Basic
	@Column(name="A_EXPIRED_DATE")
	public String getAExpiredDate() {
		return aExpiredDate;
	}

	public void setAExpiredDate(String aExpiredDate) {
		this.aExpiredDate = aExpiredDate;
	}

	@Basic
	@Column(name="A_FINANCE_METH", length=2)
	public String getAFinanceMeth() {
		return aFinanceMeth;
	}

	public void setAFinanceMeth(String aFinanceMeth) {
		this.aFinanceMeth = aFinanceMeth;
	}

	@Basic
	@Column(name="A_MONTHLY_PAYMENT")
	public BigDecimal getAMonthlyPayment() {
		return aMonthlyPayment;
	}

	public void setAMonthlyPayment(BigDecimal aMonthlyPayment) {
		this.aMonthlyPayment = aMonthlyPayment;
	}

	@Basic
	@Column(name="A_PURCHASE_OPTION", length=1)
	public String getAPurchaseOption() {
		return aPurchaseOption;
	}

	public void setAPurchaseOption(String aPurchaseOption) {
		this.aPurchaseOption = aPurchaseOption;
	}

	@Basic
	@Column(name="A_PURCHASE_OPTION_CREDIT")
	public Integer getAPurchaseOptionCredit() {
		return aPurchaseOptionCredit;
	}

	public void setAPurchaseOptionCredit(Integer aPurchaseOptionCredit) {
		this.aPurchaseOptionCredit = aPurchaseOptionCredit;
	}

	@Basic
	@Column(name="A_PURCHASE_OPTION_CREDIT_PER")
	public BigDecimal getAPurchaseOptionCreditPer() {
		return aPurchaseOptionCreditPer;
	}

	public void setAPurchaseOptionCreditPer(BigDecimal aPurchaseOptionCreditPer) {
		this.aPurchaseOptionCreditPer = aPurchaseOptionCreditPer;
	}

	@Basic
	@Column(name="A_PURCHASE_PRICE")
	public BigDecimal getAPurchasePrice() {
		return aPurchasePrice;
	}

	public void setAPurchasePrice(BigDecimal aPurchasePrice) {
		this.aPurchasePrice = aPurchasePrice;
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
	@Column(name="C_BPARTNER_ID")
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(length=510)
	public String getTextmsg() {
		return textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
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
}