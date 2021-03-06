package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_element")
public class CElement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adTreeId;
	private Integer cElementId;
	private String created;
	private Integer createdby;
	private String description;
	private String elementtype;
	private Boolean isactive;
	private Boolean isbalancing;
	private Boolean isnaturalaccount;
	private String name;
	private String updated;
	private Integer updatedby;
	private String vformat;

	public CElement() {
	}

	public CElement(Integer cElementId) {
		this.cElementId = cElementId;
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
	@Column(name="AD_TREE_ID", columnDefinition="INT")
	public Integer getAdTreeId() {
		return adTreeId;
	}

	public void setAdTreeId(Integer adTreeId) {
		this.adTreeId = adTreeId;
	}

	@Id
	@Column(name="C_ELEMENT_ID", columnDefinition="INT")
	public Integer getCElementId() {
		return cElementId;
	}

	public void setCElementId(Integer cElementId) {
		this.cElementId = cElementId;
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
	@Column(nullable=false, length=1)
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
	public Boolean isIsbalancing() {
		return isbalancing;
	}

	public void setIsbalancing(Boolean isbalancing) {
		this.isbalancing = isbalancing;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsnaturalaccount() {
		return isnaturalaccount;
	}

	public void setIsnaturalaccount(Boolean isnaturalaccount) {
		this.isnaturalaccount = isnaturalaccount;
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

	@Basic
	@Column(length=40)
	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}
}