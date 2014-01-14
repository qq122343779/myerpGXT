package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_rfq_topicsubscriber")
public class CRfqTopicsubscriber extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cRfqTopicId;
	private Integer cRfqTopicsubscriberId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String optoutdate;
	private String subscribedate;
	private String updated;
	private Integer updatedby;

	public CRfqTopicsubscriber() {
	}

	public CRfqTopicsubscriber(Integer cRfqTopicsubscriberId) {
		this.cRfqTopicsubscriberId = cRfqTopicsubscriberId;
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
	@Column(name="AD_USER_ID")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", nullable=false)
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_BPARTNER_LOCATION_ID", nullable=false)
	public Integer getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	@Basic
	@Column(name="C_RFQ_TOPIC_ID", nullable=false)
	public Integer getCRfqTopicId() {
		return cRfqTopicId;
	}

	public void setCRfqTopicId(Integer cRfqTopicId) {
		this.cRfqTopicId = cRfqTopicId;
	}

	@Id
	@Column(name="C_RFQ_TOPICSUBSCRIBER_ID")
	public Integer getCRfqTopicsubscriberId() {
		return cRfqTopicsubscriberId;
	}

	public void setCRfqTopicsubscriberId(Integer cRfqTopicsubscriberId) {
		this.cRfqTopicsubscriberId = cRfqTopicsubscriberId;
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
	public String getOptoutdate() {
		return optoutdate;
	}

	public void setOptoutdate(String optoutdate) {
		this.optoutdate = optoutdate;
	}

	@Basic
	public String getSubscribedate() {
		return subscribedate;
	}

	public void setSubscribedate(String subscribedate) {
		this.subscribedate = subscribedate;
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