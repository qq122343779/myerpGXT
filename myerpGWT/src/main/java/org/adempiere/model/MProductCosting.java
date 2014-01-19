package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_product_costing")
@IdClass(org.adempiere.model.MProductCostingPK.class)
public class MProductCosting extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private BigDecimal costaverage;
	private BigDecimal costaveragecumamt;
	private BigDecimal costaveragecumqty;
	private BigDecimal coststandard;
	private BigDecimal coststandardcumamt;
	private BigDecimal coststandardcumqty;
	private BigDecimal coststandardpoamt;
	private BigDecimal coststandardpoqty;
	private String created;
	private Integer createdby;
	private BigDecimal currentcostprice;
	private BigDecimal futurecostprice;
	private Boolean isactive;
	private Integer mProductId;
	private BigDecimal pricelastinv;
	private BigDecimal pricelastpo;
	private BigDecimal totalinvamt;
	private BigDecimal totalinvqty;
	private String updated;
	private Integer updatedby;

	public MProductCosting() {
	}

	public MProductCosting(Integer cAcctschemaId, Integer mProductId) {
		this.cAcctschemaId = cAcctschemaId;
		this.mProductId = mProductId;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCostaverage() {
		return costaverage;
	}

	public void setCostaverage(BigDecimal costaverage) {
		this.costaverage = costaverage;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCostaveragecumamt() {
		return costaveragecumamt;
	}

	public void setCostaveragecumamt(BigDecimal costaveragecumamt) {
		this.costaveragecumamt = costaveragecumamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCostaveragecumqty() {
		return costaveragecumqty;
	}

	public void setCostaveragecumqty(BigDecimal costaveragecumqty) {
		this.costaveragecumqty = costaveragecumqty;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCoststandard() {
		return coststandard;
	}

	public void setCoststandard(BigDecimal coststandard) {
		this.coststandard = coststandard;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCoststandardcumamt() {
		return coststandardcumamt;
	}

	public void setCoststandardcumamt(BigDecimal coststandardcumamt) {
		this.coststandardcumamt = coststandardcumamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCoststandardcumqty() {
		return coststandardcumqty;
	}

	public void setCoststandardcumqty(BigDecimal coststandardcumqty) {
		this.coststandardcumqty = coststandardcumqty;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCoststandardpoamt() {
		return coststandardpoamt;
	}

	public void setCoststandardpoamt(BigDecimal coststandardpoamt) {
		this.coststandardpoamt = coststandardpoamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCoststandardpoqty() {
		return coststandardpoqty;
	}

	public void setCoststandardpoqty(BigDecimal coststandardpoqty) {
		this.coststandardpoqty = coststandardpoqty;
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
	public BigDecimal getCurrentcostprice() {
		return currentcostprice;
	}

	public void setCurrentcostprice(BigDecimal currentcostprice) {
		this.currentcostprice = currentcostprice;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getFuturecostprice() {
		return futurecostprice;
	}

	public void setFuturecostprice(BigDecimal futurecostprice) {
		this.futurecostprice = futurecostprice;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
	@Column(nullable=false)
	public BigDecimal getPricelastinv() {
		return pricelastinv;
	}

	public void setPricelastinv(BigDecimal pricelastinv) {
		this.pricelastinv = pricelastinv;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPricelastpo() {
		return pricelastpo;
	}

	public void setPricelastpo(BigDecimal pricelastpo) {
		this.pricelastpo = pricelastpo;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTotalinvamt() {
		return totalinvamt;
	}

	public void setTotalinvamt(BigDecimal totalinvamt) {
		this.totalinvamt = totalinvamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTotalinvqty() {
		return totalinvqty;
	}

	public void setTotalinvqty(BigDecimal totalinvqty) {
		this.totalinvqty = totalinvqty;
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