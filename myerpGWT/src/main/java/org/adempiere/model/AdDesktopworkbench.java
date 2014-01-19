package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_desktopworkbench")
public class AdDesktopworkbench extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adDesktopId;
	private Integer adDesktopworkbenchId;
	private Integer adOrgId;
	private Integer adWorkbenchId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public AdDesktopworkbench() {
	}

	public AdDesktopworkbench(Integer adDesktopworkbenchId) {
		this.adDesktopworkbenchId = adDesktopworkbenchId;
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
	@Column(name="AD_DESKTOP_ID", columnDefinition="INT", nullable=false)
	public Integer getAdDesktopId() {
		return adDesktopId;
	}

	public void setAdDesktopId(Integer adDesktopId) {
		this.adDesktopId = adDesktopId;
	}

	@Id
	@Column(name="AD_DESKTOPWORKBENCH_ID", columnDefinition="INT")
	public Integer getAdDesktopworkbenchId() {
		return adDesktopworkbenchId;
	}

	public void setAdDesktopworkbenchId(Integer adDesktopworkbenchId) {
		this.adDesktopworkbenchId = adDesktopworkbenchId;
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
	@Column(name="AD_WORKBENCH_ID", columnDefinition="INT", nullable=false)
	public Integer getAdWorkbenchId() {
		return adWorkbenchId;
	}

	public void setAdWorkbenchId(Integer adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
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
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
}