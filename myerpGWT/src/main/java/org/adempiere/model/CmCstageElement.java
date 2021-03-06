package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_cstage_element")
public class CmCstageElement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cmCstageElementId;
	private Integer cmCstageId;
	private String contenthtml;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private Boolean isactive;
	private Boolean isvalid;
	private String name;
	private String updated;
	private Integer updatedby;

	public CmCstageElement() {
	}

	public CmCstageElement(Integer cmCstageElementId) {
		this.cmCstageElementId = cmCstageElementId;
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

	@Id
	@Column(name="CM_CSTAGE_ELEMENT_ID", columnDefinition="INT")
	public Integer getCmCstageElementId() {
		return cmCstageElementId;
	}

	public void setCmCstageElementId(Integer cmCstageElementId) {
		this.cmCstageElementId = cmCstageElementId;
	}

	@Basic
	@Column(name="CM_CSTAGE_ID", columnDefinition="INT", nullable=false)
	public Integer getCmCstageId() {
		return cmCstageId;
	}

	public void setCmCstageId(Integer cmCstageId) {
		this.cmCstageId = cmCstageId;
	}

	@Basic
	@Column(columnDefinition="LONGTEXT")
	public String getContenthtml() {
		return contenthtml;
	}

	public void setContenthtml(String contenthtml) {
		this.contenthtml = contenthtml;
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
	@Column(nullable=false)
	public Boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
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