package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_labelprinterfunction")
public class AdLabelprinterfunction extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adLabelprinterId;
	private Integer adLabelprinterfunctionId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private String functionprefix;
	private String functionsuffix;
	private Boolean isactive;
	private Boolean isxyposition;
	private String name;
	private String updated;
	private Integer updatedby;
	private String xyseparator;

	public AdLabelprinterfunction() {
	}

	public AdLabelprinterfunction(Integer adLabelprinterfunctionId) {
		this.adLabelprinterfunctionId = adLabelprinterfunctionId;
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
	@Column(name="AD_LABELPRINTER_ID", columnDefinition="INT", nullable=false)
	public Integer getAdLabelprinterId() {
		return adLabelprinterId;
	}

	public void setAdLabelprinterId(Integer adLabelprinterId) {
		this.adLabelprinterId = adLabelprinterId;
	}

	@Id
	@Column(name="AD_LABELPRINTERFUNCTION_ID", columnDefinition="INT")
	public Integer getAdLabelprinterfunctionId() {
		return adLabelprinterfunctionId;
	}

	public void setAdLabelprinterfunctionId(Integer adLabelprinterfunctionId) {
		this.adLabelprinterfunctionId = adLabelprinterfunctionId;
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
	@Column(length=40)
	public String getFunctionprefix() {
		return functionprefix;
	}

	public void setFunctionprefix(String functionprefix) {
		this.functionprefix = functionprefix;
	}

	@Basic
	@Column(length=40)
	public String getFunctionsuffix() {
		return functionsuffix;
	}

	public void setFunctionsuffix(String functionsuffix) {
		this.functionsuffix = functionsuffix;
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
	public Boolean isIsxyposition() {
		return isxyposition;
	}

	public void setIsxyposition(Boolean isxyposition) {
		this.isxyposition = isxyposition;
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
	@Column(length=20)
	public String getXyseparator() {
		return xyseparator;
	}

	public void setXyseparator(String xyseparator) {
		this.xyseparator = xyseparator;
	}
}