package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_pricelist")
public class IPricelist extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String bpartnerValue;
	private BigDecimal breakvalue;
	private Integer cBpartnerId;
	private Integer cCurrencyId;
	private Integer cUomId;
	private String created;
	private Integer createdby;
	private String description;
	private String enforcepricelimit;
	private String iErrormsg;
	private String iIsimported;
	private Integer iPricelistId;
	private Boolean isactive;
	private String isoCode;
	private Boolean issopricelist;
	private Boolean istaxincluded;
	private Integer mPricelistId;
	private Integer mPricelistVersionId;
	private Integer mProductId;
	private String name;
	private BigDecimal pricelimit;
	private BigDecimal pricelist;
	private BigDecimal priceprecision;
	private BigDecimal pricestd;
	private Boolean processed;
	private Boolean processing;
	private String productvalue;
	private String updated;
	private Integer updatedby;
	private String validfrom;
	private String x12de355;

	public IPricelist() {
	}

	public IPricelist(Integer iPricelistId) {
		this.iPricelistId = iPricelistId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="BPARTNER_VALUE", length=40)
	public String getBpartnerValue() {
		return bpartnerValue;
	}

	public void setBpartnerValue(String bpartnerValue) {
		this.bpartnerValue = bpartnerValue;
	}

	@Basic
	public BigDecimal getBreakvalue() {
		return breakvalue;
	}

	public void setBreakvalue(BigDecimal breakvalue) {
		this.breakvalue = breakvalue;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
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
	@Column(columnDefinition="INT")
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
	@Column(length=1)
	public String getEnforcepricelimit() {
		return enforcepricelimit;
	}

	public void setEnforcepricelimit(String enforcepricelimit) {
		this.enforcepricelimit = enforcepricelimit;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrormsg() {
		return iErrormsg;
	}

	public void setIErrormsg(String iErrormsg) {
		this.iErrormsg = iErrormsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED", nullable=false, length=1)
	public String getIIsimported() {
		return iIsimported;
	}

	public void setIIsimported(String iIsimported) {
		this.iIsimported = iIsimported;
	}

	@Id
	@Column(name="I_PRICELIST_ID", columnDefinition="INT")
	public Integer getIPricelistId() {
		return iPricelistId;
	}

	public void setIPricelistId(Integer iPricelistId) {
		this.iPricelistId = iPricelistId;
	}

	@Basic
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="ISO_CODE", length=3)
	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	@Basic
	public Boolean isIssopricelist() {
		return issopricelist;
	}

	public void setIssopricelist(Boolean issopricelist) {
		this.issopricelist = issopricelist;
	}

	@Basic
	public Boolean isIstaxincluded() {
		return istaxincluded;
	}

	public void setIstaxincluded(Boolean istaxincluded) {
		this.istaxincluded = istaxincluded;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT")
	public Integer getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(Integer mPricelistId) {
		this.mPricelistId = mPricelistId;
	}

	@Basic
	@Column(name="M_PRICELIST_VERSION_ID", columnDefinition="INT")
	public Integer getMPricelistVersionId() {
		return mPricelistVersionId;
	}

	public void setMPricelistVersionId(Integer mPricelistVersionId) {
		this.mPricelistVersionId = mPricelistVersionId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	public BigDecimal getPricelimit() {
		return pricelimit;
	}

	public void setPricelimit(BigDecimal pricelimit) {
		this.pricelimit = pricelimit;
	}

	@Basic
	public BigDecimal getPricelist() {
		return pricelist;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}

	@Basic
	public BigDecimal getPriceprecision() {
		return priceprecision;
	}

	public void setPriceprecision(BigDecimal priceprecision) {
		this.priceprecision = priceprecision;
	}

	@Basic
	public BigDecimal getPricestd() {
		return pricestd;
	}

	public void setPricestd(BigDecimal pricestd) {
		this.pricestd = pricestd;
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
	@Column(length=40)
	public String getProductvalue() {
		return productvalue;
	}

	public void setProductvalue(String productvalue) {
		this.productvalue = productvalue;
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
	@Column(columnDefinition="INT")
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
	@Column(length=4)
	public String getX12de355() {
		return x12de355;
	}

	public void setX12de355(String x12de355) {
		this.x12de355 = x12de355;
	}
}