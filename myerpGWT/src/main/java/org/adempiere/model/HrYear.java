package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_year")
public class HrYear extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cYearId;
	private String created;
	private Integer createdby;
	private Integer hrPayrollId;
	private Integer hrYearId;
	private Boolean isactive;
	private Integer netdays;
	private Boolean processed;
	private Boolean processing;
	private Integer qty;
	private String startdate;
	private String updated;
	private Integer updatedby;

	public HrYear() {
	}

	public HrYear(Integer hrYearId) {
		this.hrYearId = hrYearId;
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
	@Column(name="C_YEAR_ID", columnDefinition="INT", nullable=false)
	public Integer getCYearId() {
		return cYearId;
	}

	public void setCYearId(Integer cYearId) {
		this.cYearId = cYearId;
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
	@Column(name="HR_PAYROLL_ID", columnDefinition="INT", nullable=false)
	public Integer getHrPayrollId() {
		return hrPayrollId;
	}

	public void setHrPayrollId(Integer hrPayrollId) {
		this.hrPayrollId = hrPayrollId;
	}

	@Id
	@Column(name="HR_YEAR_ID", columnDefinition="INT")
	public Integer getHrYearId() {
		return hrYearId;
	}

	public void setHrYearId(Integer hrYearId) {
		this.hrYearId = hrYearId;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getNetdays() {
		return netdays;
	}

	public void setNetdays(Integer netdays) {
		this.netdays = netdays;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Basic
	@Column(nullable=false)
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
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