package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_order_node_asset")
public class PpOrderNodeAsset extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String isactive;
	private Integer ppOrderId;
	private Integer ppOrderNodeAssetId;
	private Integer ppOrderNodeId;
	private Integer ppOrderWorkflowId;
	private String updated;
	private Integer updatedby;

	public PpOrderNodeAsset() {
	}

	public PpOrderNodeAsset(Integer ppOrderNodeAssetId) {
		this.ppOrderNodeAssetId = ppOrderNodeAssetId;
	}

	@Basic
	@Column(name="A_ASSET_ID", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="PP_ORDER_ID", nullable=false)
	public Integer getPpOrderId() {
		return ppOrderId;
	}

	public void setPpOrderId(Integer ppOrderId) {
		this.ppOrderId = ppOrderId;
	}

	@Id
	@Column(name="PP_ORDER_NODE_ASSET_ID")
	public Integer getPpOrderNodeAssetId() {
		return ppOrderNodeAssetId;
	}

	public void setPpOrderNodeAssetId(Integer ppOrderNodeAssetId) {
		this.ppOrderNodeAssetId = ppOrderNodeAssetId;
	}

	@Basic
	@Column(name="PP_ORDER_NODE_ID", nullable=false)
	public Integer getPpOrderNodeId() {
		return ppOrderNodeId;
	}

	public void setPpOrderNodeId(Integer ppOrderNodeId) {
		this.ppOrderNodeId = ppOrderNodeId;
	}

	@Basic
	@Column(name="PP_ORDER_WORKFLOW_ID", nullable=false)
	public Integer getPpOrderWorkflowId() {
		return ppOrderWorkflowId;
	}

	public void setPpOrderWorkflowId(Integer ppOrderWorkflowId) {
		this.ppOrderWorkflowId = ppOrderWorkflowId;
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