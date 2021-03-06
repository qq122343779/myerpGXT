package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="u_webmenu")
public class UWebmenu extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String category;
	private String created;
	private Integer createdby;
	private String description;
	private String hassubmenu;
	private String help;
	private String imagelink;
	private Boolean isactive;
	private String menulink;
	private String module;
	private String name;
	private Integer parentmenuId;
	private String position;
	private Integer sequence;
	private Integer uWebmenuId;
	private String updated;
	private Integer updatedby;

	public UWebmenu() {
	}

	public UWebmenu(Integer uWebmenuId) {
		this.uWebmenuId = uWebmenuId;
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
	@Column(length=120)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
	@Column(length=200)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getHassubmenu() {
		return hassubmenu;
	}

	public void setHassubmenu(String hassubmenu) {
		this.hassubmenu = hassubmenu;
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
	@Column(length=510)
	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
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
	@Column(nullable=false, length=510)
	public String getMenulink() {
		return menulink;
	}

	public void setMenulink(String menulink) {
		this.menulink = menulink;
	}

	@Basic
	@Column(nullable=false, length=120)
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Basic
	@Column(nullable=false, length=120)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="PARENTMENU_ID", columnDefinition="INT")
	public Integer getParentmenuId() {
		return parentmenuId;
	}

	public void setParentmenuId(Integer parentmenuId) {
		this.parentmenuId = parentmenuId;
	}

	@Basic
	@Column(length=10)
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@Id
	@Column(name="U_WEBMENU_ID", columnDefinition="INT")
	public Integer getUWebmenuId() {
		return uWebmenuId;
	}

	public void setUWebmenuId(Integer uWebmenuId) {
		this.uWebmenuId = uWebmenuId;
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