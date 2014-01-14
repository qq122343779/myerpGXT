package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_uom")
public class CUom extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cUomId;
	private Integer costingprecision;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String isdefault;
	private String name;
	private Integer stdprecision;
	private String uomsymbol;
	private String uomtype;
	private String updated;
	private Integer updatedby;
	private String x12de355;

	public CUom() {
	}

	public CUom(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="C_UOM_ID")
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	@Column(nullable=false)
	public Integer getCostingprecision() {
		return costingprecision;
	}

	public void setCostingprecision(Integer costingprecision) {
		this.costingprecision = costingprecision;
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
	@Column(nullable=false)
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
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
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
	@Column(nullable=false)
	public Integer getStdprecision() {
		return stdprecision;
	}

	public void setStdprecision(Integer stdprecision) {
		this.stdprecision = stdprecision;
	}

	@Basic
	@Column(length=10)
	public String getUomsymbol() {
		return uomsymbol;
	}

	public void setUomsymbol(String uomsymbol) {
		this.uomsymbol = uomsymbol;
	}

	@Basic
	@Column(length=2)
	public String getUomtype() {
		return uomtype;
	}

	public void setUomtype(String uomtype) {
		this.uomtype = uomtype;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(nullable=false, length=4)
	public String getX12de355() {
		return x12de355;
	}

	public void setX12de355(String x12de355) {
		this.x12de355 = x12de355;
	}
}