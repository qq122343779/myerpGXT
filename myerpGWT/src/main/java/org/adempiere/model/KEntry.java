package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="k_entry")
public class KEntry extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adSessionId;
	private String created;
	private Integer createdby;
	private String descriptionurl;
	private Boolean isactive;
	private Boolean ispublic;
	private Integer kEntryId;
	private Integer kSourceId;
	private Integer kTopicId;
	private String keywords;
	private String name;
	private Integer rating;
	private String textmsg;
	private String updated;
	private Integer updatedby;
	private String validto;

	public KEntry() {
	}

	public KEntry(Integer kEntryId) {
		this.kEntryId = kEntryId;
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
	@Column(name="AD_SESSION_ID", columnDefinition="INT")
	public Integer getAdSessionId() {
		return adSessionId;
	}

	public void setAdSessionId(Integer adSessionId) {
		this.adSessionId = adSessionId;
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
	@Column(length=120)
	public String getDescriptionurl() {
		return descriptionurl;
	}

	public void setDescriptionurl(String descriptionurl) {
		this.descriptionurl = descriptionurl;
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
	public Boolean isIspublic() {
		return ispublic;
	}

	public void setIspublic(Boolean ispublic) {
		this.ispublic = ispublic;
	}

	@Id
	@Column(name="K_ENTRY_ID", columnDefinition="INT")
	public Integer getKEntryId() {
		return kEntryId;
	}

	public void setKEntryId(Integer kEntryId) {
		this.kEntryId = kEntryId;
	}

	@Basic
	@Column(name="K_SOURCE_ID", columnDefinition="INT")
	public Integer getKSourceId() {
		return kSourceId;
	}

	public void setKSourceId(Integer kSourceId) {
		this.kSourceId = kSourceId;
	}

	@Basic
	@Column(name="K_TOPIC_ID", columnDefinition="INT", nullable=false)
	public Integer getKTopicId() {
		return kTopicId;
	}

	public void setKTopicId(Integer kTopicId) {
		this.kTopicId = kTopicId;
	}

	@Basic
	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getTextmsg() {
		return textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
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
	public String getValidto() {
		return validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}
}