package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bankstatement")
public class CBankstatement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal beginningbalance;
	private Integer cBankaccountId;
	private Integer cBankstatementId;
	private String created;
	private Integer createdby;
	private String createfrom;
	private String description;
	private String docaction;
	private String docstatus;
	private String eftstatementdate;
	private String eftstatementreference;
	private BigDecimal endingbalance;
	private Boolean isactive;
	private Boolean isapproved;
	private Boolean ismanual;
	private String matchstatement;
	private String name;
	private String posted;
	private Boolean processed;
	private Long processedon;
	private Boolean processing;
	private String statementdate;
	private BigDecimal statementdifference;
	private String updated;
	private Integer updatedby;

	public CBankstatement() {
	}

	public CBankstatement(Integer cBankstatementId) {
		this.cBankstatementId = cBankstatementId;
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
	public BigDecimal getBeginningbalance() {
		return beginningbalance;
	}

	public void setBeginningbalance(BigDecimal beginningbalance) {
		this.beginningbalance = beginningbalance;
	}

	@Basic
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT", nullable=false)
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}

	@Id
	@Column(name="C_BANKSTATEMENT_ID", columnDefinition="INT")
	public Integer getCBankstatementId() {
		return cBankstatementId;
	}

	public void setCBankstatementId(Integer cBankstatementId) {
		this.cBankstatementId = cBankstatementId;
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
	@Column(length=1)
	public String getCreatefrom() {
		return createfrom;
	}

	public void setCreatefrom(String createfrom) {
		this.createfrom = createfrom;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocaction() {
		return docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocstatus() {
		return docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	@Basic
	public String getEftstatementdate() {
		return eftstatementdate;
	}

	public void setEftstatementdate(String eftstatementdate) {
		this.eftstatementdate = eftstatementdate;
	}

	@Basic
	@Column(length=60)
	public String getEftstatementreference() {
		return eftstatementreference;
	}

	public void setEftstatementreference(String eftstatementreference) {
		this.eftstatementreference = eftstatementreference;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getEndingbalance() {
		return endingbalance;
	}

	public void setEndingbalance(BigDecimal endingbalance) {
		this.endingbalance = endingbalance;
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
	public Boolean isIsapproved() {
		return isapproved;
	}

	public void setIsapproved(Boolean isapproved) {
		this.isapproved = isapproved;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmanual() {
		return ismanual;
	}

	public void setIsmanual(Boolean ismanual) {
		this.ismanual = ismanual;
	}

	@Basic
	@Column(length=1)
	public String getMatchstatement() {
		return matchstatement;
	}

	public void setMatchstatement(String matchstatement) {
		this.matchstatement = matchstatement;
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
	@Column(nullable=false, length=1)
	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
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
	public Long getProcessedon() {
		return processedon;
	}

	public void setProcessedon(Long processedon) {
		this.processedon = processedon;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(nullable=false)
	public String getStatementdate() {
		return statementdate;
	}

	public void setStatementdate(String statementdate) {
		this.statementdate = statementdate;
	}

	@Basic
	public BigDecimal getStatementdifference() {
		return statementdifference;
	}

	public void setStatementdifference(BigDecimal statementdifference) {
		this.statementdifference = statementdifference;
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