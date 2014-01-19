package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_taxdeclarationacct")
public class CTaxdeclarationacct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cTaxdeclarationId;
	private Integer cTaxdeclarationacctId;
	private String created;
	private Integer createdby;
	private String description;
	private Integer factAcctId;
	private Boolean isactive;
	private Integer line;
	private String updated;
	private Integer updatedby;

	public CTaxdeclarationacct() {
	}

	public CTaxdeclarationacct(Integer cTaxdeclarationacctId) {
		this.cTaxdeclarationacctId = cTaxdeclarationacctId;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_TAXDECLARATION_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxdeclarationId() {
		return cTaxdeclarationId;
	}

	public void setCTaxdeclarationId(Integer cTaxdeclarationId) {
		this.cTaxdeclarationId = cTaxdeclarationId;
	}

	@Id
	@Column(name="C_TAXDECLARATIONACCT_ID", columnDefinition="INT")
	public Integer getCTaxdeclarationacctId() {
		return cTaxdeclarationacctId;
	}

	public void setCTaxdeclarationacctId(Integer cTaxdeclarationacctId) {
		this.cTaxdeclarationacctId = cTaxdeclarationacctId;
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
	@Column(name="FACT_ACCT_ID", columnDefinition="INT", nullable=false)
	public Integer getFactAcctId() {
		return factAcctId;
	}

	public void setFactAcctId(Integer factAcctId) {
		this.factAcctId = factAcctId;
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
	@Column(columnDefinition="INT")
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
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