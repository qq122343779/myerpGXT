package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_paymentallocate")
public class CPaymentallocate extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal amount;
	private Integer cAllocationlineId;
	private Integer cInvoiceId;
	private Integer cPaymentId;
	private Integer cPaymentallocateId;
	private String created;
	private Integer createdby;
	private BigDecimal discountamt;
	private BigDecimal invoiceamt;
	private String isactive;
	private BigDecimal overunderamt;
	private String updated;
	private Integer updatedby;
	private BigDecimal writeoffamt;

	public CPaymentallocate() {
	}

	public CPaymentallocate(Integer cPaymentallocateId) {
		this.cPaymentallocateId = cPaymentallocateId;
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
	@Column(nullable=false)
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Basic
	@Column(name="C_ALLOCATIONLINE_ID")
	public Integer getCAllocationlineId() {
		return cAllocationlineId;
	}

	public void setCAllocationlineId(Integer cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
	}

	@Basic
	@Column(name="C_INVOICE_ID", nullable=false)
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_PAYMENT_ID", nullable=false)
	public Integer getCPaymentId() {
		return cPaymentId;
	}

	public void setCPaymentId(Integer cPaymentId) {
		this.cPaymentId = cPaymentId;
	}

	@Id
	@Column(name="C_PAYMENTALLOCATE_ID")
	public Integer getCPaymentallocateId() {
		return cPaymentallocateId;
	}

	public void setCPaymentallocateId(Integer cPaymentallocateId) {
		this.cPaymentallocateId = cPaymentallocateId;
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
	@Column(nullable=false)
	public BigDecimal getDiscountamt() {
		return discountamt;
	}

	public void setDiscountamt(BigDecimal discountamt) {
		this.discountamt = discountamt;
	}

	@Basic
	public BigDecimal getInvoiceamt() {
		return invoiceamt;
	}

	public void setInvoiceamt(BigDecimal invoiceamt) {
		this.invoiceamt = invoiceamt;
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
	@Column(nullable=false)
	public BigDecimal getOverunderamt() {
		return overunderamt;
	}

	public void setOverunderamt(BigDecimal overunderamt) {
		this.overunderamt = overunderamt;
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

	@Basic
	@Column(nullable=false)
	public BigDecimal getWriteoffamt() {
		return writeoffamt;
	}

	public void setWriteoffamt(BigDecimal writeoffamt) {
		this.writeoffamt = writeoffamt;
	}
}