package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_attribute")
public class AdAttribute extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adAttributeId;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adReferenceId;
	private Integer adReferenceValueId;
	private Integer adTableId;
	private Integer adValRuleId;
	private String callout;
	private String created;
	private Integer createdby;
	private String defaultvalue;
	private String description;
	private Integer displaylength;
	private String displaylogic;
	private Integer fieldlength;
	private String help;
	private Boolean isactive;
	private Boolean isencrypted;
	private Boolean isfieldonly;
	private Boolean isheading;
	private Boolean ismandatory;
	private Boolean isreadonly;
	private Boolean issameline;
	private Boolean isupdateable;
	private String name;
	private Integer seqno;
	private String updated;
	private Integer updatedby;
	private String valuemax;
	private String valuemin;
	private String vformat;

	public AdAttribute() {
	}

	public AdAttribute(Integer adAttributeId) {
		this.adAttributeId = adAttributeId;
	}

	@Id
	@Column(name="AD_ATTRIBUTE_ID", columnDefinition="INT")
	public Integer getAdAttributeId() {
		return adAttributeId;
	}

	public void setAdAttributeId(Integer adAttributeId) {
		this.adAttributeId = adAttributeId;
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
	@Column(name="AD_REFERENCE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	@Basic
	@Column(name="AD_REFERENCE_VALUE_ID", columnDefinition="INT")
	public Integer getAdReferenceValueId() {
		return adReferenceValueId;
	}

	public void setAdReferenceValueId(Integer adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(name="AD_VAL_RULE_ID", columnDefinition="INT")
	public Integer getAdValRuleId() {
		return adValRuleId;
	}

	public void setAdValRuleId(Integer adValRuleId) {
		this.adValRuleId = adValRuleId;
	}

	@Basic
	@Column(length=60)
	public String getCallout() {
		return callout;
	}

	public void setCallout(String callout) {
		this.callout = callout;
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
	@Column(length=2000)
	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getDisplaylength() {
		return displaylength;
	}

	public void setDisplaylength(Integer displaylength) {
		this.displaylength = displaylength;
	}

	@Basic
	@Column(length=2000)
	public String getDisplaylogic() {
		return displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getFieldlength() {
		return fieldlength;
	}

	public void setFieldlength(Integer fieldlength) {
		this.fieldlength = fieldlength;
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
	public Boolean isIsencrypted() {
		return isencrypted;
	}

	public void setIsencrypted(Boolean isencrypted) {
		this.isencrypted = isencrypted;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsfieldonly() {
		return isfieldonly;
	}

	public void setIsfieldonly(Boolean isfieldonly) {
		this.isfieldonly = isfieldonly;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsheading() {
		return isheading;
	}

	public void setIsheading(Boolean isheading) {
		this.isheading = isheading;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmandatory() {
		return ismandatory;
	}

	public void setIsmandatory(Boolean ismandatory) {
		this.ismandatory = ismandatory;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssameline() {
		return issameline;
	}

	public void setIssameline(Boolean issameline) {
		this.issameline = issameline;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsupdateable() {
		return isupdateable;
	}

	public void setIsupdateable(Boolean isupdateable) {
		this.isupdateable = isupdateable;
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
	@Column(columnDefinition="INT")
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
	@Column(length=20)
	public String getValuemax() {
		return valuemax;
	}

	public void setValuemax(String valuemax) {
		this.valuemax = valuemax;
	}

	@Basic
	@Column(length=20)
	public String getValuemin() {
		return valuemin;
	}

	public void setValuemin(String valuemin) {
		this.valuemin = valuemin;
	}

	@Basic
	@Column(length=60)
	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}
}