package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_projecttask")
public class CProjecttask extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cProjectphaseId;
	private Integer cProjecttaskId;
	private Integer cTaskId;
	private BigDecimal committedamt;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private Boolean isactive;
	private Integer mProductId;
	private String name;
	private BigDecimal plannedamt;
	private String projinvoicerule;
	private BigDecimal qty;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public CProjecttask() {
	}

	public CProjecttask(Integer cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
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
	@Column(name="C_PROJECTPHASE_ID", columnDefinition="INT", nullable=false)
	public Integer getCProjectphaseId() {
		return cProjectphaseId;
	}

	public void setCProjectphaseId(Integer cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}

	@Id
	@Column(name="C_PROJECTTASK_ID", columnDefinition="INT")
	public Integer getCProjecttaskId() {
		return cProjecttaskId;
	}

	public void setCProjecttaskId(Integer cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
	}

	@Basic
	@Column(name="C_TASK_ID", columnDefinition="INT")
	public Integer getCTaskId() {
		return cTaskId;
	}

	public void setCTaskId(Integer cTaskId) {
		this.cTaskId = cTaskId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCommittedamt() {
		return committedamt;
	}

	public void setCommittedamt(BigDecimal committedamt) {
		this.committedamt = committedamt;
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
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
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
	@Column(nullable=false)
	public BigDecimal getPlannedamt() {
		return plannedamt;
	}

	public void setPlannedamt(BigDecimal plannedamt) {
		this.plannedamt = plannedamt;
	}

	@Basic
	@Column(length=1)
	public String getProjinvoicerule() {
		return projinvoicerule;
	}

	public void setProjinvoicerule(String projinvoicerule) {
		this.projinvoicerule = projinvoicerule;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
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