package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_usermail")
public class AdUsermail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private Integer adUsermailId;
	private String created;
	private Integer createdby;
	private String deliveryconfirmation;
	private String isactive;
	private String isdelivered;
	private String mailtext;
	private String messageid;
	private Integer rMailtextId;
	private String subject;
	private String updated;
	private Integer updatedby;
	private Integer wMailmsgId;

	public AdUsermail() {
	}

	public AdUsermail(Integer adUsermailId) {
		this.adUsermailId = adUsermailId;
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
	@Column(name="AD_USER_ID", nullable=false)
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Id
	@Column(name="AD_USERMAIL_ID")
	public Integer getAdUsermailId() {
		return adUsermailId;
	}

	public void setAdUsermailId(Integer adUsermailId) {
		this.adUsermailId = adUsermailId;
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
	@Column(length=120)
	public String getDeliveryconfirmation() {
		return deliveryconfirmation;
	}

	public void setDeliveryconfirmation(String deliveryconfirmation) {
		this.deliveryconfirmation = deliveryconfirmation;
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
	public String getIsdelivered() {
		return isdelivered;
	}

	public void setIsdelivered(String isdelivered) {
		this.isdelivered = isdelivered;
	}

	@Basic
	@Column(length=2000)
	public String getMailtext() {
		return mailtext;
	}

	public void setMailtext(String mailtext) {
		this.mailtext = mailtext;
	}

	@Basic
	@Column(length=120)
	public String getMessageid() {
		return messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	@Basic
	@Column(name="R_MAILTEXT_ID")
	public Integer getRMailtextId() {
		return rMailtextId;
	}

	public void setRMailtextId(Integer rMailtextId) {
		this.rMailtextId = rMailtextId;
	}

	@Basic
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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
	@Column(name="W_MAILMSG_ID")
	public Integer getWMailmsgId() {
		return wMailmsgId;
	}

	public void setWMailmsgId(Integer wMailmsgId) {
		this.wMailmsgId = wMailmsgId;
	}
}