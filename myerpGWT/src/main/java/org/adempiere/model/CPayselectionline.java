package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_payselectionline")
public class CPayselectionline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cInvoiceId;
	private Integer cPayselectionId;
	private Integer cPayselectioncheckId;
	private Integer cPayselectionlineId;
	private String created;
	private Integer createdby;
	private String description;
	private BigDecimal differenceamt;
	private BigDecimal discountamt;
	private Boolean isactive;
	private Boolean ismanual;
	private Boolean issotrx;
	private Integer line;
	private BigDecimal openamt;
	private BigDecimal payamt;
	private String paymentrule;
	private Boolean processed;
	private String updated;
	private Integer updatedby;

	public CPayselectionline() {
	}

	public CPayselectionline(Integer cPayselectionlineId) {
		this.cPayselectionlineId = cPayselectionlineId;
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
	@Column(name="C_INVOICE_ID", columnDefinition="INT", nullable=false)
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_PAYSELECTION_ID", columnDefinition="INT", nullable=false)
	public Integer getCPayselectionId() {
		return cPayselectionId;
	}

	public void setCPayselectionId(Integer cPayselectionId) {
		this.cPayselectionId = cPayselectionId;
	}

	@Basic
	@Column(name="C_PAYSELECTIONCHECK_ID", columnDefinition="INT")
	public Integer getCPayselectioncheckId() {
		return cPayselectioncheckId;
	}

	public void setCPayselectioncheckId(Integer cPayselectioncheckId) {
		this.cPayselectioncheckId = cPayselectioncheckId;
	}

	@Id
	@Column(name="C_PAYSELECTIONLINE_ID", columnDefinition="INT")
	public Integer getCPayselectionlineId() {
		return cPayselectionlineId;
	}

	public void setCPayselectionlineId(Integer cPayselectionlineId) {
		this.cPayselectionlineId = cPayselectionlineId;
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
	@Column(nullable=false)
	public BigDecimal getDifferenceamt() {
		return differenceamt;
	}

	public void setDifferenceamt(BigDecimal differenceamt) {
		this.differenceamt = differenceamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getDiscountamt() {
		return discountamt;
	}

	public void setDiscountamt(BigDecimal discountamt) {
		this.discountamt = discountamt;
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
	@Column(nullable=false)
	public Boolean isIssotrx() {
		return issotrx;
	}

	public void setIssotrx(Boolean issotrx) {
		this.issotrx = issotrx;
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
	public BigDecimal getOpenamt() {
		return openamt;
	}

	public void setOpenamt(BigDecimal openamt) {
		this.openamt = openamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPayamt() {
		return payamt;
	}

	public void setPayamt(BigDecimal payamt) {
		this.payamt = payamt;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPaymentrule() {
		return paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
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