package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requestupdate")
public class RRequestupdate extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String confidentialtypeentry;
	private String created;
	private Integer createdby;
	private String endtime;
	private Boolean isactive;
	private Integer mProductspentId;
	private BigDecimal qtyinvoiced;
	private BigDecimal qtyspent;
	private Integer rRequestId;
	private Integer rRequestupdateId;
	private String result;
	private String starttime;
	private String updated;
	private Integer updatedby;

	public RRequestupdate() {
	}

	public RRequestupdate(Integer rRequestupdateId) {
		this.rRequestupdateId = rRequestupdateId;
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
	@Column(nullable=false, length=1)
	public String getConfidentialtypeentry() {
		return confidentialtypeentry;
	}

	public void setConfidentialtypeentry(String confidentialtypeentry) {
		this.confidentialtypeentry = confidentialtypeentry;
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
	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
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
	@Column(name="M_PRODUCTSPENT_ID", columnDefinition="INT")
	public Integer getMProductspentId() {
		return mProductspentId;
	}

	public void setMProductspentId(Integer mProductspentId) {
		this.mProductspentId = mProductspentId;
	}

	@Basic
	public BigDecimal getQtyinvoiced() {
		return qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}

	@Basic
	public BigDecimal getQtyspent() {
		return qtyspent;
	}

	public void setQtyspent(BigDecimal qtyspent) {
		this.qtyspent = qtyspent;
	}

	@Basic
	@Column(name="R_REQUEST_ID", columnDefinition="INT", nullable=false)
	public Integer getRRequestId() {
		return rRequestId;
	}

	public void setRRequestId(Integer rRequestId) {
		this.rRequestId = rRequestId;
	}

	@Id
	@Column(name="R_REQUESTUPDATE_ID", columnDefinition="INT")
	public Integer getRRequestupdateId() {
		return rRequestupdateId;
	}

	public void setRRequestupdateId(Integer rRequestupdateId) {
		this.rRequestupdateId = rRequestupdateId;
	}

	@Basic
	@Column(length=2000)
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Basic
	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
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