package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="w_mailmsg")
public class WMailmsg extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private String mailmsgtype;
	private String message;
	private String message2;
	private String message3;
	private String name;
	private String subject;
	private String updated;
	private Integer updatedby;
	private Integer wMailmsgId;
	private Integer wStoreId;

	public WMailmsg() {
	}

	public WMailmsg(Integer wMailmsgId) {
		this.wMailmsgId = wMailmsgId;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getMailmsgtype() {
		return mailmsgtype;
	}

	public void setMailmsgtype(String mailmsgtype) {
		this.mailmsgtype = mailmsgtype;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Basic
	@Column(length=2000)
	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	@Basic
	@Column(length=2000)
	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Id
	@Column(name="W_MAILMSG_ID", columnDefinition="INT")
	public Integer getWMailmsgId() {
		return wMailmsgId;
	}

	public void setWMailmsgId(Integer wMailmsgId) {
		this.wMailmsgId = wMailmsgId;
	}

	@Basic
	@Column(name="W_STORE_ID", columnDefinition="INT", nullable=false)
	public Integer getWStoreId() {
		return wStoreId;
	}

	public void setWStoreId(Integer wStoreId) {
		this.wStoreId = wStoreId;
	}
}