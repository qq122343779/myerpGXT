package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_wf_nextcondition")
public class AdWfNextcondition extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColumnId;
	private Integer adOrgId;
	private Integer adWfNextconditionId;
	private Integer adWfNodenextId;
	private String andor;
	private String created;
	private Integer createdby;
	private String entitytype;
	private Boolean isactive;
	private String operation;
	private Integer seqno;
	private String updated;
	private Integer updatedby;
	private String value;
	private String value2;

	public AdWfNextcondition() {
	}

	public AdWfNextcondition(Integer adWfNextconditionId) {
		this.adWfNextconditionId = adWfNextconditionId;
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
	@Column(name="AD_COLUMN_ID", columnDefinition="INT", nullable=false)
	public Integer getAdColumnId() {
		return adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
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
	@Column(name="AD_WF_NEXTCONDITION_ID", columnDefinition="INT")
	public Integer getAdWfNextconditionId() {
		return adWfNextconditionId;
	}

	public void setAdWfNextconditionId(Integer adWfNextconditionId) {
		this.adWfNextconditionId = adWfNextconditionId;
	}

	@Basic
	@Column(name="AD_WF_NODENEXT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdWfNodenextId() {
		return adWfNodenextId;
	}

	public void setAdWfNodenextId(Integer adWfNodenextId) {
		this.adWfNodenextId = adWfNodenextId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getAndor() {
		return andor;
	}

	public void setAndor(String andor) {
		this.andor = andor;
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
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
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
	@Column(nullable=false, length=2)
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
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
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(length=40)
	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
}