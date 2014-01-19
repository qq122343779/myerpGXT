package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_measurecalc")
public class PaMeasurecalc extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adTableId;
	private String bpartnercolumn;
	private String created;
	private Integer createdby;
	private String datecolumn;
	private String description;
	private String entitytype;
	private Boolean isactive;
	private String keycolumn;
	private String name;
	private String orgcolumn;
	private Integer paMeasurecalcId;
	private String productcolumn;
	private String selectclause;
	private String updated;
	private Integer updatedby;
	private String whereclause;

	public PaMeasurecalc() {
	}

	public PaMeasurecalc(Integer paMeasurecalcId) {
		this.paMeasurecalcId = paMeasurecalcId;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(length=60)
	public String getBpartnercolumn() {
		return bpartnercolumn;
	}

	public void setBpartnercolumn(String bpartnercolumn) {
		this.bpartnercolumn = bpartnercolumn;
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
	public String getDatecolumn() {
		return datecolumn;
	}

	public void setDatecolumn(String datecolumn) {
		this.datecolumn = datecolumn;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getKeycolumn() {
		return keycolumn;
	}

	public void setKeycolumn(String keycolumn) {
		this.keycolumn = keycolumn;
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
	@Column(length=60)
	public String getOrgcolumn() {
		return orgcolumn;
	}

	public void setOrgcolumn(String orgcolumn) {
		this.orgcolumn = orgcolumn;
	}

	@Id
	@Column(name="PA_MEASURECALC_ID", columnDefinition="INT")
	public Integer getPaMeasurecalcId() {
		return paMeasurecalcId;
	}

	public void setPaMeasurecalcId(Integer paMeasurecalcId) {
		this.paMeasurecalcId = paMeasurecalcId;
	}

	@Basic
	@Column(length=60)
	public String getProductcolumn() {
		return productcolumn;
	}

	public void setProductcolumn(String productcolumn) {
		this.productcolumn = productcolumn;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getSelectclause() {
		return selectclause;
	}

	public void setSelectclause(String selectclause) {
		this.selectclause = selectclause;
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
	@Column(nullable=false, length=2000)
	public String getWhereclause() {
		return whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}
}