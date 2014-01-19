package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_package_exp_common")
public class AdPackageExpCommon extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adFormId;
	private Integer adImpformatId;
	private Integer adMenuId;
	private Integer adOrgId;
	private Integer adPackageExpCommonId;
	private Integer adProcessId;
	private Integer adReportviewId;
	private Integer adRoleId;
	private Integer adTableId;
	private Integer adWindowId;
	private Integer adWorkbenchId;
	private Integer adWorkflowId;
	private String created;
	private Integer createdby;
	private String dbtype;
	private String description;
	private String destinationDirectory;
	private String fileDirectory;
	private String filename;
	private Boolean isactive;
	private BigDecimal line;
	private String name;
	private String name2;
	private Boolean processed;
	private Boolean processing;
	private String sqlstatement;
	private String targetDirectory;
	private String type;
	private String updated;
	private Integer updatedby;

	public AdPackageExpCommon() {
	}

	public AdPackageExpCommon(Integer adPackageExpCommonId) {
		this.adPackageExpCommonId = adPackageExpCommonId;
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
	@Column(name="AD_FORM_ID", columnDefinition="INT")
	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
	}

	@Basic
	@Column(name="AD_IMPFORMAT_ID", columnDefinition="INT")
	public Integer getAdImpformatId() {
		return adImpformatId;
	}

	public void setAdImpformatId(Integer adImpformatId) {
		this.adImpformatId = adImpformatId;
	}

	@Basic
	@Column(name="AD_MENU_ID", columnDefinition="INT")
	public Integer getAdMenuId() {
		return adMenuId;
	}

	public void setAdMenuId(Integer adMenuId) {
		this.adMenuId = adMenuId;
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
	@Column(name="AD_PACKAGE_EXP_COMMON_ID", columnDefinition="INT")
	public Integer getAdPackageExpCommonId() {
		return adPackageExpCommonId;
	}

	public void setAdPackageExpCommonId(Integer adPackageExpCommonId) {
		this.adPackageExpCommonId = adPackageExpCommonId;
	}

	@Basic
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Basic
	@Column(name="AD_REPORTVIEW_ID", columnDefinition="INT")
	public Integer getAdReportviewId() {
		return adReportviewId;
	}

	public void setAdReportviewId(Integer adReportviewId) {
		this.adReportviewId = adReportviewId;
	}

	@Basic
	@Column(name="AD_ROLE_ID", columnDefinition="INT")
	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT")
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", columnDefinition="INT")
	public Integer getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}

	@Basic
	@Column(name="AD_WORKBENCH_ID", columnDefinition="INT")
	public Integer getAdWorkbenchId() {
		return adWorkbenchId;
	}

	public void setAdWorkbenchId(Integer adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID", columnDefinition="INT")
	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
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
	@Column(length=22)
	public String getDbtype() {
		return dbtype;
	}

	public void setDbtype(String dbtype) {
		this.dbtype = dbtype;
	}

	@Basic
	@Column(length=1000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="DESTINATION_DIRECTORY")
	public String getDestinationDirectory() {
		return destinationDirectory;
	}

	public void setDestinationDirectory(String destinationDirectory) {
		this.destinationDirectory = destinationDirectory;
	}

	@Basic
	@Column(name="FILE_DIRECTORY")
	public String getFileDirectory() {
		return fileDirectory;
	}

	public void setFileDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}

	@Basic
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
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
	public BigDecimal getLine() {
		return line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=60)
	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	public String getSqlstatement() {
		return sqlstatement;
	}

	public void setSqlstatement(String sqlstatement) {
		this.sqlstatement = sqlstatement;
	}

	@Basic
	@Column(name="TARGET_DIRECTORY")
	public String getTargetDirectory() {
		return targetDirectory;
	}

	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}

	@Basic
	@Column(length=10)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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