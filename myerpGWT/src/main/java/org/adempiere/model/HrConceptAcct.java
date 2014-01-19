package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_concept_acct")
public class HrConceptAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cBpGroupId;
	private String created;
	private Integer createdby;
	private Integer hrConceptAcctId;
	private Integer hrConceptId;
	private Integer hrExpenseAcct;
	private Integer hrRevenueAcct;
	private Boolean isactive;
	private Boolean isbalancing;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;

	public HrConceptAcct() {
	}

	public HrConceptAcct(Integer hrConceptAcctId) {
		this.hrConceptAcctId = hrConceptAcctId;
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
	@Column(name="C_BP_GROUP_ID", columnDefinition="INT")
	public Integer getCBpGroupId() {
		return cBpGroupId;
	}

	public void setCBpGroupId(Integer cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
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

	@Id
	@Column(name="HR_CONCEPT_ACCT_ID", columnDefinition="INT")
	public Integer getHrConceptAcctId() {
		return hrConceptAcctId;
	}

	public void setHrConceptAcctId(Integer hrConceptAcctId) {
		this.hrConceptAcctId = hrConceptAcctId;
	}

	@Basic
	@Column(name="HR_CONCEPT_ID", columnDefinition="INT", nullable=false)
	public Integer getHrConceptId() {
		return hrConceptId;
	}

	public void setHrConceptId(Integer hrConceptId) {
		this.hrConceptId = hrConceptId;
	}

	@Basic
	@Column(name="HR_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getHrExpenseAcct() {
		return hrExpenseAcct;
	}

	public void setHrExpenseAcct(Integer hrExpenseAcct) {
		this.hrExpenseAcct = hrExpenseAcct;
	}

	@Basic
	@Column(name="HR_REVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getHrRevenueAcct() {
		return hrRevenueAcct;
	}

	public void setHrRevenueAcct(Integer hrRevenueAcct) {
		this.hrRevenueAcct = hrRevenueAcct;
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
	public Boolean isIsbalancing() {
		return isbalancing;
	}

	public void setIsbalancing(Boolean isbalancing) {
		this.isbalancing = isbalancing;
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
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Integer user1Id) {
		this.user1Id = user1Id;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Integer user2Id) {
		this.user2Id = user2Id;
	}
}