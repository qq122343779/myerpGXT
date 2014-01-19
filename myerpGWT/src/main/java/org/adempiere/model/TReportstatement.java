package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_reportstatement")
@IdClass(org.adempiere.model.TReportstatementPK.class)
public class TReportstatement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adPinstanceId;
	private BigDecimal amtacctcr;
	private BigDecimal amtacctdr;
	private BigDecimal balance;
	private String dateacct;
	private String description;
	private Integer factAcctId;
	private Integer levelno;
	private String name;
	private BigDecimal qty;

	public TReportstatement() {
	}

	public TReportstatement(Integer adPinstanceId, Integer factAcctId) {
		this.adPinstanceId = adPinstanceId;
		this.factAcctId = factAcctId;
	}

	@Id
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
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
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLevelno() {
		return levelno;
	}

	public void setLevelno(Integer levelno) {
		this.levelno = levelno;
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
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}
}