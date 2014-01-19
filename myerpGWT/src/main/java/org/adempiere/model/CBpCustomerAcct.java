package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bp_customer_acct")
@IdClass(org.adempiere.model.CBpCustomerAcctPK.class)
public class CBpCustomerAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cBpartnerId;
	private Integer cPrepaymentAcct;
	private Integer cReceivableAcct;
	private Integer cReceivableServicesAcct;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public CBpCustomerAcct() {
	}

	public CBpCustomerAcct(Integer cAcctschemaId, Integer cBpartnerId) {
		this.cAcctschemaId = cAcctschemaId;
		this.cBpartnerId = cBpartnerId;
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

	@Id
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Id
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_PREPAYMENT_ACCT", columnDefinition="INT")
	public Integer getCPrepaymentAcct() {
		return cPrepaymentAcct;
	}

	public void setCPrepaymentAcct(Integer cPrepaymentAcct) {
		this.cPrepaymentAcct = cPrepaymentAcct;
	}

	@Basic
	@Column(name="C_RECEIVABLE_ACCT", columnDefinition="INT")
	public Integer getCReceivableAcct() {
		return cReceivableAcct;
	}

	public void setCReceivableAcct(Integer cReceivableAcct) {
		this.cReceivableAcct = cReceivableAcct;
	}

	@Basic
	@Column(name="C_RECEIVABLE_SERVICES_ACCT", columnDefinition="INT")
	public Integer getCReceivableServicesAcct() {
		return cReceivableServicesAcct;
	}

	public void setCReceivableServicesAcct(Integer cReceivableServicesAcct) {
		this.cReceivableServicesAcct = cReceivableServicesAcct;
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
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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