package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_servicelevel")
public class CServicelevel extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cRevenuerecognitionPlanId;
	private Integer cServicelevelId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private Integer mProductId;
	private Boolean processed;
	private Boolean processing;
	private BigDecimal servicelevelinvoiced;
	private BigDecimal servicelevelprovided;
	private String updated;
	private Integer updatedby;

	public CServicelevel() {
	}

	public CServicelevel(Integer cServicelevelId) {
		this.cServicelevelId = cServicelevelId;
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
	@Column(name="C_REVENUERECOGNITION_PLAN_ID", columnDefinition="INT", nullable=false)
	public Integer getCRevenuerecognitionPlanId() {
		return cRevenuerecognitionPlanId;
	}

	public void setCRevenuerecognitionPlanId(Integer cRevenuerecognitionPlanId) {
		this.cRevenuerecognitionPlanId = cRevenuerecognitionPlanId;
	}

	@Id
	@Column(name="C_SERVICELEVEL_ID", columnDefinition="INT")
	public Integer getCServicelevelId() {
		return cServicelevelId;
	}

	public void setCServicelevelId(Integer cServicelevelId) {
		this.cServicelevelId = cServicelevelId;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getServicelevelinvoiced() {
		return servicelevelinvoiced;
	}

	public void setServicelevelinvoiced(BigDecimal servicelevelinvoiced) {
		this.servicelevelinvoiced = servicelevelinvoiced;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getServicelevelprovided() {
		return servicelevelprovided;
	}

	public void setServicelevelprovided(BigDecimal servicelevelprovided) {
		this.servicelevelprovided = servicelevelprovided;
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