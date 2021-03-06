package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_window")
public class AdWindow extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColorId;
	private Integer adImageId;
	private Integer adOrgId;
	private Integer adWindowId;
	private String created;
	private Integer createdby;
	private String description;
	private String entitytype;
	private String help;
	private Boolean isactive;
	private Boolean isbetafunctionality;
	private Boolean isdefault;
	private Boolean issotrx;
	private String name;
	private Boolean processing;
	private String updated;
	private Integer updatedby;
	private String windowtype;
	private Integer winheight;
	private Integer winwidth;

	public AdWindow() {
	}

	public AdWindow(Integer adWindowId) {
		this.adWindowId = adWindowId;
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
	@Column(name="AD_COLOR_ID", columnDefinition="INT")
	public Integer getAdColorId() {
		return adColorId;
	}

	public void setAdColorId(Integer adColorId) {
		this.adColorId = adColorId;
	}

	@Basic
	@Column(name="AD_IMAGE_ID", columnDefinition="INT")
	public Integer getAdImageId() {
		return adImageId;
	}

	public void setAdImageId(Integer adImageId) {
		this.adImageId = adImageId;
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
	@Column(name="AD_WINDOW_ID", columnDefinition="INT")
	public Integer getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
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
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	public Boolean isIsbetafunctionality() {
		return isbetafunctionality;
	}

	public void setIsbetafunctionality(Boolean isbetafunctionality) {
		this.isbetafunctionality = isbetafunctionality;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssotrx() {
		return issotrx;
	}

	public void setIssotrx(Boolean issotrx) {
		this.issotrx = issotrx;
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
	@Column(length=1)
	public String getWindowtype() {
		return windowtype;
	}

	public void setWindowtype(String windowtype) {
		this.windowtype = windowtype;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getWinheight() {
		return winheight;
	}

	public void setWinheight(Integer winheight) {
		this.winheight = winheight;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getWinwidth() {
		return winwidth;
	}

	public void setWinwidth(Integer winwidth) {
		this.winwidth = winwidth;
	}
}