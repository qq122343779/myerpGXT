package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_system")
@IdClass(org.adempiere.model.AdSystemPK.class)
public class AdSystem extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adSystemId;
	private String created;
	private Integer createdby;
	private String customprefix;
	private String dbaddress;
	private String dbinstance;
	private String description;
	private String encryptionkey;
	private BigDecimal idrangeend;
	private BigDecimal idrangestart;
	private String info;
	private Boolean isactive;
	private Boolean isallowstatistics;
	private Boolean isautoerrorreport;
	private Boolean isfailonbuilddiffer;
	private Boolean isfailonmissingmodelvalidator;
	private Boolean isjustmigrated;
	private String lastbuildinfo;
	private String ldapdomain;
	private String ldaphost;
	private String name;
	private Integer noprocessors;
	private String oldname;
	private String password;
	private Boolean processing;
	private String profileinfo;
	private Integer recordId;
	private String releaseno;
	private String replicationtype;
	private String statisticsinfo;
	private String summary;
	private String supportemail;
	private String supportexpdate;
	private Integer supportunits;
	private String systemstatus;
	private String updated;
	private Integer updatedby;
	private String username;
	private String version;

	public AdSystem() {
	}

	public AdSystem(Integer adClientId, Integer adSystemId) {
		this.adClientId = adClientId;
		this.adSystemId = adSystemId;
	}

	@Id
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
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

	@Id
	@Column(name="AD_SYSTEM_ID", columnDefinition="INT")
	public Integer getAdSystemId() {
		return adSystemId;
	}

	public void setAdSystemId(Integer adSystemId) {
		this.adSystemId = adSystemId;
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
	@Column(length=60)
	public String getCustomprefix() {
		return customprefix;
	}

	public void setCustomprefix(String customprefix) {
		this.customprefix = customprefix;
	}

	@Basic
	public String getDbaddress() {
		return dbaddress;
	}

	public void setDbaddress(String dbaddress) {
		this.dbaddress = dbaddress;
	}

	@Basic
	@Column(length=60)
	public String getDbinstance() {
		return dbinstance;
	}

	public void setDbinstance(String dbinstance) {
		this.dbinstance = dbinstance;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public String getEncryptionkey() {
		return encryptionkey;
	}

	public void setEncryptionkey(String encryptionkey) {
		this.encryptionkey = encryptionkey;
	}

	@Basic
	public BigDecimal getIdrangeend() {
		return idrangeend;
	}

	public void setIdrangeend(BigDecimal idrangeend) {
		this.idrangeend = idrangeend;
	}

	@Basic
	public BigDecimal getIdrangestart() {
		return idrangestart;
	}

	public void setIdrangestart(BigDecimal idrangestart) {
		this.idrangestart = idrangestart;
	}

	@Basic
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
	@Column(nullable=false)
	public Boolean isIsallowstatistics() {
		return isallowstatistics;
	}

	public void setIsallowstatistics(Boolean isallowstatistics) {
		this.isallowstatistics = isallowstatistics;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsautoerrorreport() {
		return isautoerrorreport;
	}

	public void setIsautoerrorreport(Boolean isautoerrorreport) {
		this.isautoerrorreport = isautoerrorreport;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsfailonbuilddiffer() {
		return isfailonbuilddiffer;
	}

	public void setIsfailonbuilddiffer(Boolean isfailonbuilddiffer) {
		this.isfailonbuilddiffer = isfailonbuilddiffer;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsfailonmissingmodelvalidator() {
		return isfailonmissingmodelvalidator;
	}

	public void setIsfailonmissingmodelvalidator(Boolean isfailonmissingmodelvalidator) {
		this.isfailonmissingmodelvalidator = isfailonmissingmodelvalidator;
	}

	@Basic
	public Boolean isIsjustmigrated() {
		return isjustmigrated;
	}

	public void setIsjustmigrated(Boolean isjustmigrated) {
		this.isjustmigrated = isjustmigrated;
	}

	@Basic
	public String getLastbuildinfo() {
		return lastbuildinfo;
	}

	public void setLastbuildinfo(String lastbuildinfo) {
		this.lastbuildinfo = lastbuildinfo;
	}

	@Basic
	public String getLdapdomain() {
		return ldapdomain;
	}

	public void setLdapdomain(String ldapdomain) {
		this.ldapdomain = ldapdomain;
	}

	@Basic
	@Column(length=60)
	public String getLdaphost() {
		return ldaphost;
	}

	public void setLdaphost(String ldaphost) {
		this.ldaphost = ldaphost;
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
	@Column(columnDefinition="INT")
	public Integer getNoprocessors() {
		return noprocessors;
	}

	public void setNoprocessors(Integer noprocessors) {
		this.noprocessors = noprocessors;
	}

	@Basic
	@Column(length=60)
	public String getOldname() {
		return oldname;
	}

	public void setOldname(String oldname) {
		this.oldname = oldname;
	}

	@Basic
	@Column(length=20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=60)
	public String getProfileinfo() {
		return profileinfo;
	}

	public void setProfileinfo(String profileinfo) {
		this.profileinfo = profileinfo;
	}

	@Basic
	@Column(name="RECORD_ID", columnDefinition="INT")
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@Basic
	@Column(length=10)
	public String getReleaseno() {
		return releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getReplicationtype() {
		return replicationtype;
	}

	public void setReplicationtype(String replicationtype) {
		this.replicationtype = replicationtype;
	}

	@Basic
	@Column(length=60)
	public String getStatisticsinfo() {
		return statisticsinfo;
	}

	public void setStatisticsinfo(String statisticsinfo) {
		this.statisticsinfo = statisticsinfo;
	}

	@Basic
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Basic
	@Column(length=60)
	public String getSupportemail() {
		return supportemail;
	}

	public void setSupportemail(String supportemail) {
		this.supportemail = supportemail;
	}

	@Basic
	public String getSupportexpdate() {
		return supportexpdate;
	}

	public void setSupportexpdate(String supportexpdate) {
		this.supportexpdate = supportexpdate;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSupportunits() {
		return supportunits;
	}

	public void setSupportunits(Integer supportunits) {
		this.supportunits = supportunits;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getSystemstatus() {
		return systemstatus;
	}

	public void setSystemstatus(String systemstatus) {
		this.systemstatus = systemstatus;
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
	@Column(nullable=false, length=60)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Basic
	@Column(length=20)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}