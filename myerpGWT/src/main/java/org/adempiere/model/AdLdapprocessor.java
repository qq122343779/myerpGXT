package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_ldapprocessor")
public class AdLdapprocessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adLdapprocessorId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String datelastrun;
	private String datenextrun;
	private String description;
	private Boolean isactive;
	private Integer keeplogdays;
	private Integer ldapport;
	private String name;
	private Boolean processing;
	private Integer supervisorId;
	private String updated;
	private Integer updatedby;

	public AdLdapprocessor() {
	}

	public AdLdapprocessor(Integer adLdapprocessorId) {
		this.adLdapprocessorId = adLdapprocessorId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Id
	@Column(name="AD_LDAPPROCESSOR_ID", columnDefinition="INT")
	public Integer getAdLdapprocessorId() {
		return adLdapprocessorId;
	}

	public void setAdLdapprocessorId(Integer adLdapprocessorId) {
		this.adLdapprocessorId = adLdapprocessorId;
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
	public String getDatelastrun() {
		return datelastrun;
	}

	public void setDatelastrun(String datelastrun) {
		this.datelastrun = datelastrun;
	}

	@Basic
	public String getDatenextrun() {
		return datenextrun;
	}

	public void setDatenextrun(String datenextrun) {
		this.datenextrun = datenextrun;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getKeeplogdays() {
		return keeplogdays;
	}

	public void setKeeplogdays(Integer keeplogdays) {
		this.keeplogdays = keeplogdays;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLdapport() {
		return ldapport;
	}

	public void setLdapport(Integer ldapport) {
		this.ldapport = ldapport;
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
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="SUPERVISOR_ID", columnDefinition="INT", nullable=false)
	public Integer getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Integer supervisorId) {
		this.supervisorId = supervisorId;
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