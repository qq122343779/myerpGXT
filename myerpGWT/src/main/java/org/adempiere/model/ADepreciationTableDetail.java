package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_depreciation_table_detail")
public class ADepreciationTableDetail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private BigDecimal aDepreciationRate;
	private String aDepreciationTableCode;
	private Integer aDepreciationTableDetailId;
	private Integer aPeriod;
	private String aTableRateType;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Boolean processed;
	private String updated;
	private Integer updatedby;

	public ADepreciationTableDetail() {
	}

	public ADepreciationTableDetail(Integer aDepreciationTableDetailId) {
		this.aDepreciationTableDetailId = aDepreciationTableDetailId;
	}

	@Basic
	@Column(name="A_DEPRECIATION_RATE", nullable=false)
	public BigDecimal getADepreciationRate() {
		return aDepreciationRate;
	}

	public void setADepreciationRate(BigDecimal aDepreciationRate) {
		this.aDepreciationRate = aDepreciationRate;
	}

	@Basic
	@Column(name="A_DEPRECIATION_TABLE_CODE", nullable=false, length=20)
	public String getADepreciationTableCode() {
		return aDepreciationTableCode;
	}

	public void setADepreciationTableCode(String aDepreciationTableCode) {
		this.aDepreciationTableCode = aDepreciationTableCode;
	}

	@Id
	@Column(name="A_DEPRECIATION_TABLE_DETAIL_ID", columnDefinition="INT")
	public Integer getADepreciationTableDetailId() {
		return aDepreciationTableDetailId;
	}

	public void setADepreciationTableDetailId(Integer aDepreciationTableDetailId) {
		this.aDepreciationTableDetailId = aDepreciationTableDetailId;
	}

	@Basic
	@Column(name="A_PERIOD", columnDefinition="INT", nullable=false)
	public Integer getAPeriod() {
		return aPeriod;
	}

	public void setAPeriod(Integer aPeriod) {
		this.aPeriod = aPeriod;
	}

	@Basic
	@Column(name="A_TABLE_RATE_TYPE", length=2)
	public String getATableRateType() {
		return aTableRateType;
	}

	public void setATableRateType(String aTableRateType) {
		this.aTableRateType = aTableRateType;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
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