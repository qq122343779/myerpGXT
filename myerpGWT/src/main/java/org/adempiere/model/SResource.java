package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_resource")
public class SResource extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private BigDecimal chargeableqty;
	private String created;
	private Integer createdby;
	private BigDecimal dailycapacity;
	private String description;
	private Boolean isactive;
	private Boolean isavailable;
	private Boolean ismanufacturingresource;
	private Integer mWarehouseId;
	private String manufacturingresourcetype;
	private String name;
	private BigDecimal percentutilization;
	private Integer planninghorizon;
	private BigDecimal queuingtime;
	private Integer sResourceId;
	private Integer sResourcetypeId;
	private String updated;
	private Integer updatedby;
	private String value;
	private BigDecimal waitingtime;

	public SResource() {
	}

	public SResource(Integer sResourceId) {
		this.sResourceId = sResourceId;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Basic
	public BigDecimal getChargeableqty() {
		return chargeableqty;
	}

	public void setChargeableqty(BigDecimal chargeableqty) {
		this.chargeableqty = chargeableqty;
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
	public BigDecimal getDailycapacity() {
		return dailycapacity;
	}

	public void setDailycapacity(BigDecimal dailycapacity) {
		this.dailycapacity = dailycapacity;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	public Boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(Boolean isavailable) {
		this.isavailable = isavailable;
	}

	@Basic
	public Boolean isIsmanufacturingresource() {
		return ismanufacturingresource;
	}

	public void setIsmanufacturingresource(Boolean ismanufacturingresource) {
		this.ismanufacturingresource = ismanufacturingresource;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(length=2)
	public String getManufacturingresourcetype() {
		return manufacturingresourcetype;
	}

	public void setManufacturingresourcetype(String manufacturingresourcetype) {
		this.manufacturingresourcetype = manufacturingresourcetype;
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
	public BigDecimal getPercentutilization() {
		return percentutilization;
	}

	public void setPercentutilization(BigDecimal percentutilization) {
		this.percentutilization = percentutilization;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getPlanninghorizon() {
		return planninghorizon;
	}

	public void setPlanninghorizon(Integer planninghorizon) {
		this.planninghorizon = planninghorizon;
	}

	@Basic
	public BigDecimal getQueuingtime() {
		return queuingtime;
	}

	public void setQueuingtime(BigDecimal queuingtime) {
		this.queuingtime = queuingtime;
	}

	@Id
	@Column(name="S_RESOURCE_ID", columnDefinition="INT")
	public Integer getSResourceId() {
		return sResourceId;
	}

	public void setSResourceId(Integer sResourceId) {
		this.sResourceId = sResourceId;
	}

	@Basic
	@Column(name="S_RESOURCETYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getSResourcetypeId() {
		return sResourcetypeId;
	}

	public void setSResourcetypeId(Integer sResourcetypeId) {
		this.sResourcetypeId = sResourcetypeId;
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
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	public BigDecimal getWaitingtime() {
		return waitingtime;
	}

	public void setWaitingtime(BigDecimal waitingtime) {
		this.waitingtime = waitingtime;
	}
}