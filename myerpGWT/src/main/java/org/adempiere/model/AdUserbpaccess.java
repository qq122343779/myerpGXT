package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_userbpaccess")
public class AdUserbpaccess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private Integer adUserbpaccessId;
	private String bpaccesstype;
	private String created;
	private Integer createdby;
	private String docbasetype;
	private Boolean isactive;
	private Integer rRequesttypeId;
	private String updated;
	private Integer updatedby;

	public AdUserbpaccess() {
	}

	public AdUserbpaccess(Integer adUserbpaccessId) {
		this.adUserbpaccessId = adUserbpaccessId;
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
	@Column(name="AD_USER_ID", columnDefinition="INT", nullable=false)
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Id
	@Column(name="AD_USERBPACCESS_ID", columnDefinition="INT")
	public Integer getAdUserbpaccessId() {
		return adUserbpaccessId;
	}

	public void setAdUserbpaccessId(Integer adUserbpaccessId) {
		this.adUserbpaccessId = adUserbpaccessId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getBpaccesstype() {
		return bpaccesstype;
	}

	public void setBpaccesstype(String bpaccesstype) {
		this.bpaccesstype = bpaccesstype;
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
	@Column(length=3)
	public String getDocbasetype() {
		return docbasetype;
	}

	public void setDocbasetype(String docbasetype) {
		this.docbasetype = docbasetype;
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
	@Column(name="R_REQUESTTYPE_ID", columnDefinition="INT")
	public Integer getRRequesttypeId() {
		return rRequesttypeId;
	}

	public void setRRequesttypeId(Integer rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
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