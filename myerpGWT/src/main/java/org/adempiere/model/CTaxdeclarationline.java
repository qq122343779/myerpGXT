package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_taxdeclarationline")
public class CTaxdeclarationline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAllocationlineId;
	private Integer cBpartnerId;
	private Integer cCurrencyId;
	private Integer cInvoiceId;
	private Integer cInvoicelineId;
	private Integer cTaxId;
	private Integer cTaxdeclarationId;
	private Integer cTaxdeclarationlineId;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String description;
	private Boolean isactive;
	private Boolean ismanual;
	private Integer line;
	private BigDecimal taxamt;
	private BigDecimal taxbaseamt;
	private String updated;
	private Integer updatedby;

	public CTaxdeclarationline() {
	}

	public CTaxdeclarationline(Integer cTaxdeclarationlineId) {
		this.cTaxdeclarationlineId = cTaxdeclarationlineId;
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
	@Column(name="C_ALLOCATIONLINE_ID", columnDefinition="INT")
	public Integer getCAllocationlineId() {
		return cAllocationlineId;
	}

	public void setCAllocationlineId(Integer cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
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
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
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
	@Column(name="C_TAX_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxId() {
		return cTaxId;
	}

	public void setCTaxId(Integer cTaxId) {
		this.cTaxId = cTaxId;
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
	@Column(name="C_TAXDECLARATIONLINE_ID", columnDefinition="INT")
	public Integer getCTaxdeclarationlineId() {
		return cTaxdeclarationlineId;
	}

	public void setCTaxdeclarationlineId(Integer cTaxdeclarationlineId) {
		this.cTaxdeclarationlineId = cTaxdeclarationlineId;
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
	public Boolean isIsmanual() {
		return ismanual;
	}

	public void setIsmanual(Boolean ismanual) {
		this.ismanual = ismanual;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTaxbaseamt() {
		return taxbaseamt;
	}

	public void setTaxbaseamt(BigDecimal taxbaseamt) {
		this.taxbaseamt = taxbaseamt;
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