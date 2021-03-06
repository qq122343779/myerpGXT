package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_sequence_no")
@IdClass(org.adempiere.model.AdSequenceNoPK.class)
public class AdSequenceNo extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adSequenceId;
	private String calendaryear;
	private String created;
	private Integer createdby;
	private Integer currentnext;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AdSequenceNo() {
	}

	public AdSequenceNo(Integer adSequenceId, String calendaryear) {
		this.adSequenceId = adSequenceId;
		this.calendaryear = calendaryear;
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
	@Column(name="AD_SEQUENCE_ID", columnDefinition="INT")
	public Integer getAdSequenceId() {
		return adSequenceId;
	}

	public void setAdSequenceId(Integer adSequenceId) {
		this.adSequenceId = adSequenceId;
	}

	@Id
	@Column(length=4)
	public String getCalendaryear() {
		return calendaryear;
	}

	public void setCalendaryear(String calendaryear) {
		this.calendaryear = calendaryear;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCurrentnext() {
		return currentnext;
	}

	public void setCurrentnext(Integer currentnext) {
		this.currentnext = currentnext;
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