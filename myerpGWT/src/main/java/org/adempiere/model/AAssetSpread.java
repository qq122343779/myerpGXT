package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_spread")
public class AAssetSpread extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetSpreadId;
	private String aAssetSpreadType;
	private BigDecimal aPeriod1;
	private BigDecimal aPeriod10;
	private BigDecimal aPeriod11;
	private BigDecimal aPeriod12;
	private BigDecimal aPeriod13;
	private BigDecimal aPeriod14;
	private BigDecimal aPeriod2;
	private BigDecimal aPeriod3;
	private BigDecimal aPeriod4;
	private BigDecimal aPeriod5;
	private BigDecimal aPeriod6;
	private BigDecimal aPeriod7;
	private BigDecimal aPeriod8;
	private BigDecimal aPeriod9;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AAssetSpread() {
	}

	public AAssetSpread(Integer aAssetSpreadId) {
		this.aAssetSpreadId = aAssetSpreadId;
	}

	@Id
	@Column(name="A_ASSET_SPREAD_ID", columnDefinition="INT")
	public Integer getAAssetSpreadId() {
		return aAssetSpreadId;
	}

	public void setAAssetSpreadId(Integer aAssetSpreadId) {
		this.aAssetSpreadId = aAssetSpreadId;
	}

	@Basic
	@Column(name="A_ASSET_SPREAD_TYPE", length=20)
	public String getAAssetSpreadType() {
		return aAssetSpreadType;
	}

	public void setAAssetSpreadType(String aAssetSpreadType) {
		this.aAssetSpreadType = aAssetSpreadType;
	}

	@Basic
	@Column(name="A_PERIOD_1", nullable=false)
	public BigDecimal getAPeriod1() {
		return aPeriod1;
	}

	public void setAPeriod1(BigDecimal aPeriod1) {
		this.aPeriod1 = aPeriod1;
	}

	@Basic
	@Column(name="A_PERIOD_10", nullable=false)
	public BigDecimal getAPeriod10() {
		return aPeriod10;
	}

	public void setAPeriod10(BigDecimal aPeriod10) {
		this.aPeriod10 = aPeriod10;
	}

	@Basic
	@Column(name="A_PERIOD_11", nullable=false)
	public BigDecimal getAPeriod11() {
		return aPeriod11;
	}

	public void setAPeriod11(BigDecimal aPeriod11) {
		this.aPeriod11 = aPeriod11;
	}

	@Basic
	@Column(name="A_PERIOD_12", nullable=false)
	public BigDecimal getAPeriod12() {
		return aPeriod12;
	}

	public void setAPeriod12(BigDecimal aPeriod12) {
		this.aPeriod12 = aPeriod12;
	}

	@Basic
	@Column(name="A_PERIOD_13", nullable=false)
	public BigDecimal getAPeriod13() {
		return aPeriod13;
	}

	public void setAPeriod13(BigDecimal aPeriod13) {
		this.aPeriod13 = aPeriod13;
	}

	@Basic
	@Column(name="A_PERIOD_14", nullable=false)
	public BigDecimal getAPeriod14() {
		return aPeriod14;
	}

	public void setAPeriod14(BigDecimal aPeriod14) {
		this.aPeriod14 = aPeriod14;
	}

	@Basic
	@Column(name="A_PERIOD_2", nullable=false)
	public BigDecimal getAPeriod2() {
		return aPeriod2;
	}

	public void setAPeriod2(BigDecimal aPeriod2) {
		this.aPeriod2 = aPeriod2;
	}

	@Basic
	@Column(name="A_PERIOD_3", nullable=false)
	public BigDecimal getAPeriod3() {
		return aPeriod3;
	}

	public void setAPeriod3(BigDecimal aPeriod3) {
		this.aPeriod3 = aPeriod3;
	}

	@Basic
	@Column(name="A_PERIOD_4", nullable=false)
	public BigDecimal getAPeriod4() {
		return aPeriod4;
	}

	public void setAPeriod4(BigDecimal aPeriod4) {
		this.aPeriod4 = aPeriod4;
	}

	@Basic
	@Column(name="A_PERIOD_5", nullable=false)
	public BigDecimal getAPeriod5() {
		return aPeriod5;
	}

	public void setAPeriod5(BigDecimal aPeriod5) {
		this.aPeriod5 = aPeriod5;
	}

	@Basic
	@Column(name="A_PERIOD_6", nullable=false)
	public BigDecimal getAPeriod6() {
		return aPeriod6;
	}

	public void setAPeriod6(BigDecimal aPeriod6) {
		this.aPeriod6 = aPeriod6;
	}

	@Basic
	@Column(name="A_PERIOD_7", nullable=false)
	public BigDecimal getAPeriod7() {
		return aPeriod7;
	}

	public void setAPeriod7(BigDecimal aPeriod7) {
		this.aPeriod7 = aPeriod7;
	}

	@Basic
	@Column(name="A_PERIOD_8", nullable=false)
	public BigDecimal getAPeriod8() {
		return aPeriod8;
	}

	public void setAPeriod8(BigDecimal aPeriod8) {
		this.aPeriod8 = aPeriod8;
	}

	@Basic
	@Column(name="A_PERIOD_9", nullable=false)
	public BigDecimal getAPeriod9() {
		return aPeriod9;
	}

	public void setAPeriod9(BigDecimal aPeriod9) {
		this.aPeriod9 = aPeriod9;
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