package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_payschedule")
public class CPayschedule extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cPaymenttermId;
	private Integer cPayscheduleId;
	private String created;
	private Integer createdby;
	private BigDecimal discount;
	private Integer discountdays;
	private Integer gracedays;
	private Boolean isactive;
	private Boolean isvalid;
	private String netday;
	private Integer netdays;
	private BigDecimal percentage;
	private String updated;
	private Integer updatedby;

	public CPayschedule() {
	}

	public CPayschedule(Integer cPayscheduleId) {
		this.cPayscheduleId = cPayscheduleId;
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
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT", nullable=false)
	public Integer getCPaymenttermId() {
		return cPaymenttermId;
	}

	public void setCPaymenttermId(Integer cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
	}

	@Id
	@Column(name="C_PAYSCHEDULE_ID", columnDefinition="INT")
	public Integer getCPayscheduleId() {
		return cPayscheduleId;
	}

	public void setCPayscheduleId(Integer cPayscheduleId) {
		this.cPayscheduleId = cPayscheduleId;
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
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getDiscountdays() {
		return discountdays;
	}

	public void setDiscountdays(Integer discountdays) {
		this.discountdays = discountdays;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getGracedays() {
		return gracedays;
	}

	public void setGracedays(Integer gracedays) {
		this.gracedays = gracedays;
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
	public Boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}

	@Basic
	@Column(length=1)
	public String getNetday() {
		return netday;
	}

	public void setNetday(String netday) {
		this.netday = netday;
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
	@Column(nullable=false)
	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
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