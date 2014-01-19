package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_client")
public class AdClient extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private String adLanguage;
	private Integer adOrgId;
	private Integer adReplicationstrategyId;
	private String autoarchive;
	private String created;
	private Integer createdby;
	private String description;
	private String documentdir;
	private String emailtest;
	private Boolean isactive;
	private Boolean iscostimmediate;
	private Boolean ismultilingualdocument;
	private Boolean ispostimmediate;
	private Boolean isserveremail;
	private Boolean issmtpauthorization;
	private Boolean isuseasp;
	private Boolean isusebetafunctions;
	private String ldapquery;
	private String mmpolicy;
	private String modelvalidationclasses;
	private String name;
	private String requestemail;
	private String requestfolder;
	private String requestuser;
	private String requestuserpw;
	private String smtphost;
	private String storearchiveonfilesystem;
	private String storeattachmentsonfilesystem;
	private String unixarchivepath;
	private String unixattachmentpath;
	private String updated;
	private Integer updatedby;
	private String value;
	private String windowsarchivepath;
	private String windowsattachmentpath;

	public AdClient() {
	}

	public AdClient(Integer adClientId) {
		this.adClientId = adClientId;
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
	@Column(name="AD_LANGUAGE", length=6)
	public String getAdLanguage() {
		return adLanguage;
	}

	public void setAdLanguage(String adLanguage) {
		this.adLanguage = adLanguage;
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
	@Column(name="AD_REPLICATIONSTRATEGY_ID", columnDefinition="INT")
	public Integer getAdReplicationstrategyId() {
		return adReplicationstrategyId;
	}

	public void setAdReplicationstrategyId(Integer adReplicationstrategyId) {
		this.adReplicationstrategyId = adReplicationstrategyId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getAutoarchive() {
		return autoarchive;
	}

	public void setAutoarchive(String autoarchive) {
		this.autoarchive = autoarchive;
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
	@Column(length=60)
	public String getDocumentdir() {
		return documentdir;
	}

	public void setDocumentdir(String documentdir) {
		this.documentdir = documentdir;
	}

	@Basic
	@Column(length=1)
	public String getEmailtest() {
		return emailtest;
	}

	public void setEmailtest(String emailtest) {
		this.emailtest = emailtest;
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
	public Boolean isIscostimmediate() {
		return iscostimmediate;
	}

	public void setIscostimmediate(Boolean iscostimmediate) {
		this.iscostimmediate = iscostimmediate;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmultilingualdocument() {
		return ismultilingualdocument;
	}

	public void setIsmultilingualdocument(Boolean ismultilingualdocument) {
		this.ismultilingualdocument = ismultilingualdocument;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIspostimmediate() {
		return ispostimmediate;
	}

	public void setIspostimmediate(Boolean ispostimmediate) {
		this.ispostimmediate = ispostimmediate;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsserveremail() {
		return isserveremail;
	}

	public void setIsserveremail(Boolean isserveremail) {
		this.isserveremail = isserveremail;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssmtpauthorization() {
		return issmtpauthorization;
	}

	public void setIssmtpauthorization(Boolean issmtpauthorization) {
		this.issmtpauthorization = issmtpauthorization;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsuseasp() {
		return isuseasp;
	}

	public void setIsuseasp(Boolean isuseasp) {
		this.isuseasp = isuseasp;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsusebetafunctions() {
		return isusebetafunctions;
	}

	public void setIsusebetafunctions(Boolean isusebetafunctions) {
		this.isusebetafunctions = isusebetafunctions;
	}

	@Basic
	public String getLdapquery() {
		return ldapquery;
	}

	public void setLdapquery(String ldapquery) {
		this.ldapquery = ldapquery;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getMmpolicy() {
		return mmpolicy;
	}

	public void setMmpolicy(String mmpolicy) {
		this.mmpolicy = mmpolicy;
	}

	@Basic
	public String getModelvalidationclasses() {
		return modelvalidationclasses;
	}

	public void setModelvalidationclasses(String modelvalidationclasses) {
		this.modelvalidationclasses = modelvalidationclasses;
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
	@Column(length=60)
	public String getRequestemail() {
		return requestemail;
	}

	public void setRequestemail(String requestemail) {
		this.requestemail = requestemail;
	}

	@Basic
	@Column(length=20)
	public String getRequestfolder() {
		return requestfolder;
	}

	public void setRequestfolder(String requestfolder) {
		this.requestfolder = requestfolder;
	}

	@Basic
	@Column(length=60)
	public String getRequestuser() {
		return requestuser;
	}

	public void setRequestuser(String requestuser) {
		this.requestuser = requestuser;
	}

	@Basic
	@Column(length=20)
	public String getRequestuserpw() {
		return requestuserpw;
	}

	public void setRequestuserpw(String requestuserpw) {
		this.requestuserpw = requestuserpw;
	}

	@Basic
	@Column(length=60)
	public String getSmtphost() {
		return smtphost;
	}

	public void setSmtphost(String smtphost) {
		this.smtphost = smtphost;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getStorearchiveonfilesystem() {
		return storearchiveonfilesystem;
	}

	public void setStorearchiveonfilesystem(String storearchiveonfilesystem) {
		this.storearchiveonfilesystem = storearchiveonfilesystem;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getStoreattachmentsonfilesystem() {
		return storeattachmentsonfilesystem;
	}

	public void setStoreattachmentsonfilesystem(String storeattachmentsonfilesystem) {
		this.storeattachmentsonfilesystem = storeattachmentsonfilesystem;
	}

	@Basic
	public String getUnixarchivepath() {
		return unixarchivepath;
	}

	public void setUnixarchivepath(String unixarchivepath) {
		this.unixarchivepath = unixarchivepath;
	}

	@Basic
	public String getUnixattachmentpath() {
		return unixattachmentpath;
	}

	public void setUnixattachmentpath(String unixattachmentpath) {
		this.unixattachmentpath = unixattachmentpath;
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
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	public String getWindowsarchivepath() {
		return windowsarchivepath;
	}

	public void setWindowsarchivepath(String windowsarchivepath) {
		this.windowsarchivepath = windowsarchivepath;
	}

	@Basic
	public String getWindowsattachmentpath() {
		return windowsattachmentpath;
	}

	public void setWindowsattachmentpath(String windowsattachmentpath) {
		this.windowsattachmentpath = windowsattachmentpath;
	}
}