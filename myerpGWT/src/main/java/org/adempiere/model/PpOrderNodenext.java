package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_order_nodenext")
public class PpOrderNodenext extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adWfNextId;
	private Integer adWfNodeId;
	private String created;
	private Integer createdby;
	private String description;
	private String entitytype;
	private String isactive;
	private String isstduserworkflow;
	private Integer ppOrderId;
	private Integer ppOrderNextId;
	private Integer ppOrderNodeId;
	private Integer ppOrderNodenextId;
	private Integer seqno;
	private String transitioncode;
	private String updated;
	private Integer updatedby;

	public PpOrderNodenext() {
	}

	public PpOrderNodenext(Integer ppOrderNodenextId) {
		this.ppOrderNodenextId = ppOrderNodenextId;
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
	@Column(name="AD_WF_NEXT_ID")
	public Integer getAdWfNextId() {
		return adWfNextId;
	}

	public void setAdWfNextId(Integer adWfNextId) {
		this.adWfNextId = adWfNextId;
	}

	@Basic
	@Column(name="AD_WF_NODE_ID", nullable=false)
	public Integer getAdWfNodeId() {
		return adWfNodeId;
	}

	public void setAdWfNodeId(Integer adWfNodeId) {
		this.adWfNodeId = adWfNodeId;
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
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
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
	@Column(length=1)
	public String getIsstduserworkflow() {
		return isstduserworkflow;
	}

	public void setIsstduserworkflow(String isstduserworkflow) {
		this.isstduserworkflow = isstduserworkflow;
	}

	@Basic
	@Column(name="PP_ORDER_ID", nullable=false)
	public Integer getPpOrderId() {
		return ppOrderId;
	}

	public void setPpOrderId(Integer ppOrderId) {
		this.ppOrderId = ppOrderId;
	}

	@Basic
	@Column(name="PP_ORDER_NEXT_ID")
	public Integer getPpOrderNextId() {
		return ppOrderNextId;
	}

	public void setPpOrderNextId(Integer ppOrderNextId) {
		this.ppOrderNextId = ppOrderNextId;
	}

	@Basic
	@Column(name="PP_ORDER_NODE_ID", nullable=false)
	public Integer getPpOrderNodeId() {
		return ppOrderNodeId;
	}

	public void setPpOrderNodeId(Integer ppOrderNodeId) {
		this.ppOrderNodeId = ppOrderNodeId;
	}

	@Id
	@Column(name="PP_ORDER_NODENEXT_ID")
	public Integer getPpOrderNodenextId() {
		return ppOrderNodenextId;
	}

	public void setPpOrderNodenextId(Integer ppOrderNodenextId) {
		this.ppOrderNodenextId = ppOrderNodenextId;
	}

	@Basic
	@Column(nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Basic
	@Column(length=2000)
	public String getTransitioncode() {
		return transitioncode;
	}

	public void setTransitioncode(String transitioncode) {
		this.transitioncode = transitioncode;
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
}