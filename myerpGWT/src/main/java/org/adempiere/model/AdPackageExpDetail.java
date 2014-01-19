package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_package_exp_detail")
public class AdPackageExpDetail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adEntitytypeId;
	private Integer adFormId;
	private Integer adImpformatId;
	private Integer adMenuId;
	private Integer adMessageId;
	private Integer adModelvalidatorId;
	private Integer adOrgId;
	private String adPackageCodeNew;
	private String adPackageCodeOld;
	private Integer adPackageExpDetailId;
	private Integer adPackageExpId;
	private Integer adPrintformatId;
	private Integer adProcessId;
	private Integer adReferenceId;
	private Integer adReportviewId;
	private Integer adRoleId;
	private Integer adTableId;
	private Integer adValRuleId;
	private Integer adWindowId;
	private Integer adWorkbenchId;
	private Integer adWorkflowId;
	private String created;
	private Integer createdby;
	private String dbtype;
	private String description;
	private String destinationDirectory;
	private String destinationFilename;
	private String fileDirectory;
	private String filename;
	private Boolean isactive;
	private BigDecimal line;
	private String name2;
	private Boolean processed;
	private Boolean processing;
	private String releaseno;
	private String sqlstatement;
	private String targetDirectory;
	private String type;
	private String updated;
	private Integer updatedby;

	public AdPackageExpDetail() {
	}

	public AdPackageExpDetail(Integer adPackageExpDetailId) {
		this.adPackageExpDetailId = adPackageExpDetailId;
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
	@Column(name="AD_ENTITYTYPE_ID", columnDefinition="INT")
	public Integer getAdEntitytypeId() {
		return adEntitytypeId;
	}

	public void setAdEntitytypeId(Integer adEntitytypeId) {
		this.adEntitytypeId = adEntitytypeId;
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
	@Column(name="AD_MESSAGE_ID", columnDefinition="INT")
	public Integer getAdMessageId() {
		return adMessageId;
	}

	public void setAdMessageId(Integer adMessageId) {
		this.adMessageId = adMessageId;
	}

	@Basic
	@Column(name="AD_MODELVALIDATOR_ID", columnDefinition="INT")
	public Integer getAdModelvalidatorId() {
		return adModelvalidatorId;
	}

	public void setAdModelvalidatorId(Integer adModelvalidatorId) {
		this.adModelvalidatorId = adModelvalidatorId;
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
	@Column(name="AD_PACKAGE_CODE_NEW", length=2000)
	public String getAdPackageCodeNew() {
		return adPackageCodeNew;
	}

	public void setAdPackageCodeNew(String adPackageCodeNew) {
		this.adPackageCodeNew = adPackageCodeNew;
	}

	@Basic
	@Column(name="AD_PACKAGE_CODE_OLD", length=2000)
	public String getAdPackageCodeOld() {
		return adPackageCodeOld;
	}

	public void setAdPackageCodeOld(String adPackageCodeOld) {
		this.adPackageCodeOld = adPackageCodeOld;
	}

	@Id
	@Column(name="AD_PACKAGE_EXP_DETAIL_ID", columnDefinition="INT")
	public Integer getAdPackageExpDetailId() {
		return adPackageExpDetailId;
	}

	public void setAdPackageExpDetailId(Integer adPackageExpDetailId) {
		this.adPackageExpDetailId = adPackageExpDetailId;
	}

	@Basic
	@Column(name="AD_PACKAGE_EXP_ID", columnDefinition="INT", nullable=false)
	public Integer getAdPackageExpId() {
		return adPackageExpId;
	}

	public void setAdPackageExpId(Integer adPackageExpId) {
		this.adPackageExpId = adPackageExpId;
	}

	@Basic
	@Column(name="AD_PRINTFORMAT_ID", columnDefinition="INT")
	public Integer getAdPrintformatId() {
		return adPrintformatId;
	}

	public void setAdPrintformatId(Integer adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
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
	@Column(name="AD_REFERENCE_ID", columnDefinition="INT")
	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
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
	@Column(name="AD_VAL_RULE_ID", columnDefinition="INT")
	public Integer getAdValRuleId() {
		return adValRuleId;
	}

	public void setAdValRuleId(Integer adValRuleId) {
		this.adValRuleId = adValRuleId;
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
	@Column(nullable=false)
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
	@Column(nullable=false, length=1000)
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
	@Column(name="DESTINATION_FILENAME")
	public String getDestinationFilename() {
		return destinationFilename;
	}

	public void setDestinationFilename(String destinationFilename) {
		this.destinationFilename = destinationFilename;
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
	@Column(nullable=false)
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=20)
	public String getReleaseno() {
		return releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}

	@Basic
	@Column(length=2000)
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
	@Column(nullable=false, length=10)
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}