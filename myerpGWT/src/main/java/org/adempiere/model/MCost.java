package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_cost")
@IdClass(org.adempiere.model.MCostPK.class)
public class MCost extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private String created;
	private Integer createdby;
	private BigDecimal cumulatedamt;
	private BigDecimal cumulatedqty;
	private BigDecimal currentcostprice;
	private BigDecimal currentcostpricell;
	private BigDecimal currentqty;
	private String description;
	private BigDecimal futurecostprice;
	private BigDecimal futurecostpricell;
	private Boolean isactive;
	private Boolean iscostfrozen;
	private Integer mAttributesetinstanceId;
	private Integer mCostelementId;
	private Integer mCosttypeId;
	private Integer mProductId;
	private Integer percent;
	private String updated;
	private Integer updatedby;

	public MCost() {
	}

	public MCost(Integer adClientId, Integer adOrgId, Integer cAcctschemaId, Integer mAttributesetinstanceId, Integer mCostelementId, Integer mCosttypeId, Integer mProductId) {
		this.adClientId = adClientId;
		this.adOrgId = adOrgId;
		this.cAcctschemaId = cAcctschemaId;
		this.mAttributesetinstanceId = mAttributesetinstanceId;
		this.mCostelementId = mCostelementId;
		this.mCosttypeId = mCosttypeId;
		this.mProductId = mProductId;
	}

	@Id
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Id
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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
	public BigDecimal getCumulatedamt() {
		return cumulatedamt;
	}

	public void setCumulatedamt(BigDecimal cumulatedamt) {
		this.cumulatedamt = cumulatedamt;
	}

	@Basic
	public BigDecimal getCumulatedqty() {
		return cumulatedqty;
	}

	public void setCumulatedqty(BigDecimal cumulatedqty) {
		this.cumulatedqty = cumulatedqty;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCurrentcostprice() {
		return currentcostprice;
	}

	public void setCurrentcostprice(BigDecimal currentcostprice) {
		this.currentcostprice = currentcostprice;
	}

	@Basic
	public BigDecimal getCurrentcostpricell() {
		return currentcostpricell;
	}

	public void setCurrentcostpricell(BigDecimal currentcostpricell) {
		this.currentcostpricell = currentcostpricell;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCurrentqty() {
		return currentqty;
	}

	public void setCurrentqty(BigDecimal currentqty) {
		this.currentqty = currentqty;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public BigDecimal getFuturecostprice() {
		return futurecostprice;
	}

	public void setFuturecostprice(BigDecimal futurecostprice) {
		this.futurecostprice = futurecostprice;
	}

	@Basic
	public BigDecimal getFuturecostpricell() {
		return futurecostpricell;
	}

	public void setFuturecostpricell(BigDecimal futurecostpricell) {
		this.futurecostpricell = futurecostpricell;
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
	public Boolean isIscostfrozen() {
		return iscostfrozen;
	}

	public void setIscostfrozen(Boolean iscostfrozen) {
		this.iscostfrozen = iscostfrozen;
	}

	@Id
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Id
	@Column(name="M_COSTELEMENT_ID", columnDefinition="INT")
	public Integer getMCostelementId() {
		return mCostelementId;
	}

	public void setMCostelementId(Integer mCostelementId) {
		this.mCostelementId = mCostelementId;
	}

	@Id
	@Column(name="M_COSTTYPE_ID", columnDefinition="INT")
	public Integer getMCosttypeId() {
		return mCosttypeId;
	}

	public void setMCosttypeId(Integer mCosttypeId) {
		this.mCosttypeId = mCosttypeId;
	}

	@Id
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getPercent() {
		return percent;
	}

	public void setPercent(Integer percent) {
		this.percent = percent;
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