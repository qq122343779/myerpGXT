package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_reportsource")
public class PaReportsource extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cCampaignId;
	private Integer cElementvalueId;
	private Integer cLocationId;
	private Integer cProjectId;
	private Integer cSalesregionId;
	private String created;
	private Integer createdby;
	private String description;
	private String elementtype;
	private Boolean isactive;
	private Boolean isincludenullsactivity;
	private Boolean isincludenullsbpartner;
	private Boolean isincludenullscampaign;
	private Boolean isincludenullselementvalue;
	private Boolean isincludenullslocation;
	private Boolean isincludenullsorg;
	private Boolean isincludenullsorgtrx;
	private Boolean isincludenullsproduct;
	private Boolean isincludenullsproject;
	private Boolean isincludenullssalesregion;
	private Boolean isincludenullsuserelement1;
	private Boolean isincludenullsuserelement2;
	private Integer mProductId;
	private Integer orgId;
	private Integer paReportlineId;
	private Integer paReportsourceId;
	private String updated;
	private Integer updatedby;
	private Integer userelement1Id;
	private Integer userelement2Id;

	public PaReportsource() {
	}

	public PaReportsource(Integer paReportsourceId) {
		this.paReportsourceId = paReportsourceId;
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
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_ELEMENTVALUE_ID", columnDefinition="INT")
	public Integer getCElementvalueId() {
		return cElementvalueId;
	}

	public void setCElementvalueId(Integer cElementvalueId) {
		this.cElementvalueId = cElementvalueId;
	}

	@Basic
	@Column(name="C_LOCATION_ID", columnDefinition="INT")
	public Integer getCLocationId() {
		return cLocationId;
	}

	public void setCLocationId(Integer cLocationId) {
		this.cLocationId = cLocationId;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_SALESREGION_ID", columnDefinition="INT")
	public Integer getCSalesregionId() {
		return cSalesregionId;
	}

	public void setCSalesregionId(Integer cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
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
	@Column(nullable=false, length=2)
	public String getElementtype() {
		return elementtype;
	}

	public void setElementtype(String elementtype) {
		this.elementtype = elementtype;
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
	public Boolean isIsincludenullsactivity() {
		return isincludenullsactivity;
	}

	public void setIsincludenullsactivity(Boolean isincludenullsactivity) {
		this.isincludenullsactivity = isincludenullsactivity;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsbpartner() {
		return isincludenullsbpartner;
	}

	public void setIsincludenullsbpartner(Boolean isincludenullsbpartner) {
		this.isincludenullsbpartner = isincludenullsbpartner;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullscampaign() {
		return isincludenullscampaign;
	}

	public void setIsincludenullscampaign(Boolean isincludenullscampaign) {
		this.isincludenullscampaign = isincludenullscampaign;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullselementvalue() {
		return isincludenullselementvalue;
	}

	public void setIsincludenullselementvalue(Boolean isincludenullselementvalue) {
		this.isincludenullselementvalue = isincludenullselementvalue;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullslocation() {
		return isincludenullslocation;
	}

	public void setIsincludenullslocation(Boolean isincludenullslocation) {
		this.isincludenullslocation = isincludenullslocation;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsorg() {
		return isincludenullsorg;
	}

	public void setIsincludenullsorg(Boolean isincludenullsorg) {
		this.isincludenullsorg = isincludenullsorg;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsorgtrx() {
		return isincludenullsorgtrx;
	}

	public void setIsincludenullsorgtrx(Boolean isincludenullsorgtrx) {
		this.isincludenullsorgtrx = isincludenullsorgtrx;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsproduct() {
		return isincludenullsproduct;
	}

	public void setIsincludenullsproduct(Boolean isincludenullsproduct) {
		this.isincludenullsproduct = isincludenullsproduct;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsproject() {
		return isincludenullsproject;
	}

	public void setIsincludenullsproject(Boolean isincludenullsproject) {
		this.isincludenullsproject = isincludenullsproject;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullssalesregion() {
		return isincludenullssalesregion;
	}

	public void setIsincludenullssalesregion(Boolean isincludenullssalesregion) {
		this.isincludenullssalesregion = isincludenullssalesregion;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsuserelement1() {
		return isincludenullsuserelement1;
	}

	public void setIsincludenullsuserelement1(Boolean isincludenullsuserelement1) {
		this.isincludenullsuserelement1 = isincludenullsuserelement1;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsincludenullsuserelement2() {
		return isincludenullsuserelement2;
	}

	public void setIsincludenullsuserelement2(Boolean isincludenullsuserelement2) {
		this.isincludenullsuserelement2 = isincludenullsuserelement2;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="ORG_ID", columnDefinition="INT")
	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	@Basic
	@Column(name="PA_REPORTLINE_ID", columnDefinition="INT", nullable=false)
	public Integer getPaReportlineId() {
		return paReportlineId;
	}

	public void setPaReportlineId(Integer paReportlineId) {
		this.paReportlineId = paReportlineId;
	}

	@Id
	@Column(name="PA_REPORTSOURCE_ID", columnDefinition="INT")
	public Integer getPaReportsourceId() {
		return paReportsourceId;
	}

	public void setPaReportsourceId(Integer paReportsourceId) {
		this.paReportsourceId = paReportsourceId;
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
	@Column(name="USERELEMENT1_ID", columnDefinition="INT")
	public Integer getUserelement1Id() {
		return userelement1Id;
	}

	public void setUserelement1Id(Integer userelement1Id) {
		this.userelement1Id = userelement1Id;
	}

	@Basic
	@Column(name="USERELEMENT2_ID", columnDefinition="INT")
	public Integer getUserelement2Id() {
		return userelement2Id;
	}

	public void setUserelement2Id(Integer userelement2Id) {
		this.userelement2Id = userelement2Id;
	}
}