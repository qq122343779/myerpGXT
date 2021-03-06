package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_table_scriptvalidator")
public class AdTableScriptvalidator extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adRuleId;
	private Integer adTableId;
	private Integer adTableScriptvalidatorId;
	private String created;
	private Integer createdby;
	private String eventmodelvalidator;
	private Boolean isactive;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public AdTableScriptvalidator() {
	}

	public AdTableScriptvalidator(Integer adTableScriptvalidatorId) {
		this.adTableScriptvalidatorId = adTableScriptvalidatorId;
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
	@Column(name="AD_RULE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdRuleId() {
		return adRuleId;
	}

	public void setAdRuleId(Integer adRuleId) {
		this.adRuleId = adRuleId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Id
	@Column(name="AD_TABLE_SCRIPTVALIDATOR_ID", columnDefinition="INT")
	public Integer getAdTableScriptvalidatorId() {
		return adTableScriptvalidatorId;
	}

	public void setAdTableScriptvalidatorId(Integer adTableScriptvalidatorId) {
		this.adTableScriptvalidatorId = adTableScriptvalidatorId;
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
	@Column(nullable=false, length=4)
	public String getEventmodelvalidator() {
		return eventmodelvalidator;
	}

	public void setEventmodelvalidator(String eventmodelvalidator) {
		this.eventmodelvalidator = eventmodelvalidator;
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