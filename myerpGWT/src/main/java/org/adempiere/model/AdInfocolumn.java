package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_infocolumn")
public class AdInfocolumn extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adElementId;
	private Integer adInfocolumnId;
	private Integer adInfowindowId;
	private Integer adOrgId;
	private Integer adReferenceId;
	private String created;
	private Integer createdby;
	private String description;
	private String entitytype;
	private String help;
	private Boolean isactive;
	private Boolean isdisplayed;
	private Boolean isquerycriteria;
	private String name;
	private String selectclause;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public AdInfocolumn() {
	}

	public AdInfocolumn(Integer adInfocolumnId) {
		this.adInfocolumnId = adInfocolumnId;
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
	@Column(name="AD_ELEMENT_ID", columnDefinition="INT")
	public Integer getAdElementId() {
		return adElementId;
	}

	public void setAdElementId(Integer adElementId) {
		this.adElementId = adElementId;
	}

	@Id
	@Column(name="AD_INFOCOLUMN_ID", columnDefinition="INT")
	public Integer getAdInfocolumnId() {
		return adInfocolumnId;
	}

	public void setAdInfocolumnId(Integer adInfocolumnId) {
		this.adInfocolumnId = adInfocolumnId;
	}

	@Basic
	@Column(name="AD_INFOWINDOW_ID", columnDefinition="INT", nullable=false)
	public Integer getAdInfowindowId() {
		return adInfowindowId;
	}

	public void setAdInfowindowId(Integer adInfowindowId) {
		this.adInfowindowId = adInfowindowId;
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
	@Column(name="AD_REFERENCE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
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
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	public Boolean isIsdisplayed() {
		return isdisplayed;
	}

	public void setIsdisplayed(Boolean isdisplayed) {
		this.isdisplayed = isdisplayed;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsquerycriteria() {
		return isquerycriteria;
	}

	public void setIsquerycriteria(Boolean isquerycriteria) {
		this.isquerycriteria = isquerycriteria;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(nullable=false)
	public String getSelectclause() {
		return selectclause;
	}

	public void setSelectclause(String selectclause) {
		this.selectclause = selectclause;
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