package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_conversion_rate")
public class CConversionRate extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cConversionRateId;
	private Integer cConversiontypeId;
	private Integer cCurrencyId;
	private Integer cCurrencyIdTo;
	private String created;
	private Integer createdby;
	private BigDecimal dividerate;
	private Boolean isactive;
	private BigDecimal multiplyrate;
	private String updated;
	private Integer updatedby;
	private String validfrom;
	private String validto;

	public CConversionRate() {
	}

	public CConversionRate(Integer cConversionRateId) {
		this.cConversionRateId = cConversionRateId;
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

	@Id
	@Column(name="C_CONVERSION_RATE_ID", columnDefinition="INT")
	public Integer getCConversionRateId() {
		return cConversionRateId;
	}

	public void setCConversionRateId(Integer cConversionRateId) {
		this.cConversionRateId = cConversionRateId;
	}

	@Basic
	@Column(name="C_CONVERSIONTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCConversiontypeId() {
		return cConversiontypeId;
	}

	public void setCConversiontypeId(Integer cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID_TO", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyIdTo() {
		return cCurrencyIdTo;
	}

	public void setCCurrencyIdTo(Integer cCurrencyIdTo) {
		this.cCurrencyIdTo = cCurrencyIdTo;
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
	public BigDecimal getDividerate() {
		return dividerate;
	}

	public void setDividerate(BigDecimal dividerate) {
		this.dividerate = dividerate;
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
	public BigDecimal getMultiplyrate() {
		return multiplyrate;
	}

	public void setMultiplyrate(BigDecimal multiplyrate) {
		this.multiplyrate = multiplyrate;
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
	@Column(nullable=false)
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
}