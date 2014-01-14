package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by: org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name = "ad_ref_list")
public class AdRefList extends org.adempiere.common.ADEntityBase {
	private static final long	serialVersionUID	= 1L;
	private Integer				adClientId;
	private Integer				adOrgId;
	private Integer				adRefListId;
	private Integer				adReferenceId;
	private String				created;
	private Integer				createdby;
	private String				description;
	private String				entitytype;
	private String				isactive;
	private String				name;
	private String				updated;
	private Integer				updatedby;
	private String				validfrom;
	private String				validto;
	private String				value;
	private AdReference			adReference;

	public AdRefList() {
	}

	public AdRefList(Integer adRefListId) {
		this.adRefListId = adRefListId;
	}

	@Basic
	@Column(name = "AD_CLIENT_ID", nullable = false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name = "AD_ORG_ID", nullable = false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name = "AD_REF_LIST_ID")
	public Integer getAdRefListId() {
		return adRefListId;
	}

	public void setAdRefListId(Integer adRefListId) {
		this.adRefListId = adRefListId;
	}

	@Basic
	@Column(name = "AD_REFERENCE_ID", nullable = false)
	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	@Basic
	@Column(columnDefinition = "TIMESTAMP", nullable = false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(nullable = false)
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
	@Column(nullable = false, length = 40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Basic
	@Column(nullable = false, length = 1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable = false, length = 60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(columnDefinition = "TIMESTAMP", nullable = false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(nullable = false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}

	@Basic
	public String getValidto() {
		return validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}

	@Basic
	@Column(nullable = false, length = 60)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	// bi-directional many-to-one association to AdReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_REFERENCE_ID")
	public AdReference getAdReference() {
		return this.adReference;
	}

	public void setAdReference(AdReference adReference) {
		this.adReference = adReference;
	}
}