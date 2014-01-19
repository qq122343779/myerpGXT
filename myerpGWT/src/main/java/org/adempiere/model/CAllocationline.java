package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_allocationline")
public class CAllocationline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer allocationno;
	private BigDecimal amount;
	private Integer cAllocationhdrId;
	private Integer cAllocationlineId;
	private Integer cBpartnerId;
	private Integer cCashlineId;
	private Integer cInvoiceId;
	private Integer cOrderId;
	private Integer cPaymentId;
	private String created;
	private Integer createdby;
	private String datetrx;
	private BigDecimal discountamt;
	private Boolean isactive;
	private Boolean ismanual;
	private BigDecimal overunderamt;
	private String posted;
	private String updated;
	private Integer updatedby;
	private BigDecimal writeoffamt;

	public CAllocationline() {
	}

	public CAllocationline(Integer cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
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
	@Column(columnDefinition="INT")
	public Integer getAllocationno() {
		return allocationno;
	}

	public void setAllocationno(Integer allocationno) {
		this.allocationno = allocationno;
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
	@Column(name="C_ALLOCATIONHDR_ID", columnDefinition="INT", nullable=false)
	public Integer getCAllocationhdrId() {
		return cAllocationhdrId;
	}

	public void setCAllocationhdrId(Integer cAllocationhdrId) {
		this.cAllocationhdrId = cAllocationhdrId;
	}

	@Id
	@Column(name="C_ALLOCATIONLINE_ID", columnDefinition="INT")
	public Integer getCAllocationlineId() {
		return cAllocationlineId;
	}

	public void setCAllocationlineId(Integer cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CASHLINE_ID", columnDefinition="INT")
	public Integer getCCashlineId() {
		return cCashlineId;
	}

	public void setCCashlineId(Integer cCashlineId) {
		this.cCashlineId = cCashlineId;
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
	@Column(name="C_ORDER_ID", columnDefinition="INT")
	public Integer getCOrderId() {
		return cOrderId;
	}

	public void setCOrderId(Integer cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Basic
	@Column(name="C_PAYMENT_ID", columnDefinition="INT")
	public Integer getCPaymentId() {
		return cPaymentId;
	}

	public void setCPaymentId(Integer cPaymentId) {
		this.cPaymentId = cPaymentId;
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
	public String getDatetrx() {
		return datetrx;
	}

	public void setDatetrx(String datetrx) {
		this.datetrx = datetrx;
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
	public Boolean isIsmanual() {
		return ismanual;
	}

	public void setIsmanual(Boolean ismanual) {
		this.ismanual = ismanual;
	}

	@Basic
	public BigDecimal getOverunderamt() {
		return overunderamt;
	}

	public void setOverunderamt(BigDecimal overunderamt) {
		this.overunderamt = overunderamt;
	}

	@Basic
	@Column(length=1)
	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
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

	@Basic
	@Column(nullable=false)
	public BigDecimal getWriteoffamt() {
		return writeoffamt;
	}

	public void setWriteoffamt(BigDecimal writeoffamt) {
		this.writeoffamt = writeoffamt;
	}
}