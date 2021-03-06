package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_retirement")
public class AAssetRetirement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer aAssetRetirementId;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal assetmarketvalueamt;
	private BigDecimal assetvalueamt;
	private Integer cInvoicelineId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AAssetRetirement() {
	}

	public AAssetRetirement(Integer aAssetRetirementId) {
		this.aAssetRetirementId = aAssetRetirementId;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Id
	@Column(name="A_ASSET_RETIREMENT_ID", columnDefinition="INT")
	public Integer getAAssetRetirementId() {
		return aAssetRetirementId;
	}

	public void setAAssetRetirementId(Integer aAssetRetirementId) {
		this.aAssetRetirementId = aAssetRetirementId;
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
	@Column(nullable=false)
	public BigDecimal getAssetmarketvalueamt() {
		return assetmarketvalueamt;
	}

	public void setAssetmarketvalueamt(BigDecimal assetmarketvalueamt) {
		this.assetmarketvalueamt = assetmarketvalueamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAssetvalueamt() {
		return assetvalueamt;
	}

	public void setAssetvalueamt(BigDecimal assetvalueamt) {
		this.assetvalueamt = assetvalueamt;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID", columnDefinition="INT")
	public Integer getCInvoicelineId() {
		return cInvoicelineId;
	}

	public void setCInvoicelineId(Integer cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
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