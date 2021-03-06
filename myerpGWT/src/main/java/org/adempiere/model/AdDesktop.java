package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_desktop")
public class AdDesktop extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColorId;
	private Integer adDesktopId;
	private Integer adImageId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private Boolean isactive;
	private String name;
	private String updated;
	private Integer updatedby;

	public AdDesktop() {
	}

	public AdDesktop(Integer adDesktopId) {
		this.adDesktopId = adDesktopId;
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

	@Id
	@Column(name="AD_DESKTOP_ID", columnDefinition="INT")
	public Integer getAdDesktopId() {
		return adDesktopId;
	}

	public void setAdDesktopId(Integer adDesktopId) {
		this.adDesktopId = adDesktopId;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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