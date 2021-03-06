package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_reportview_col")
public class AdReportviewCol extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColumnId;
	private Integer adOrgId;
	private Integer adReportviewColId;
	private Integer adReportviewId;
	private String created;
	private Integer createdby;
	private String functioncolumn;
	private Boolean isactive;
	private Boolean isgroupfunction;
	private String updated;
	private Integer updatedby;

	public AdReportviewCol() {
	}

	public AdReportviewCol(Integer adReportviewColId) {
		this.adReportviewColId = adReportviewColId;
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
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getAdColumnId() {
		return adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
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
	@Column(name="AD_REPORTVIEW_COL_ID", columnDefinition="INT")
	public Integer getAdReportviewColId() {
		return adReportviewColId;
	}

	public void setAdReportviewColId(Integer adReportviewColId) {
		this.adReportviewColId = adReportviewColId;
	}

	@Basic
	@Column(name="AD_REPORTVIEW_ID", columnDefinition="INT", nullable=false)
	public Integer getAdReportviewId() {
		return adReportviewId;
	}

	public void setAdReportviewId(Integer adReportviewId) {
		this.adReportviewId = adReportviewId;
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
	@Column(nullable=false, length=60)
	public String getFunctioncolumn() {
		return functioncolumn;
	}

	public void setFunctioncolumn(String functioncolumn) {
		this.functioncolumn = functioncolumn;
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
	public Boolean isIsgroupfunction() {
		return isgroupfunction;
	}

	public void setIsgroupfunction(Boolean isgroupfunction) {
		this.isgroupfunction = isgroupfunction;
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