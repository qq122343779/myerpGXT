package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_process_para")
public class AdProcessPara extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adElementId;
	private Integer adOrgId;
	private Integer adProcessId;
	private Integer adProcessParaId;
	private Integer adReferenceId;
	private Integer adReferenceValueId;
	private Integer adValRuleId;
	private String columnname;
	private String created;
	private Integer createdby;
	private String defaultvalue;
	private String defaultvalue2;
	private String description;
	private String displaylogic;
	private String entitytype;
	private Integer fieldlength;
	private String help;
	private Boolean isactive;
	private Boolean iscentrallymaintained;
	private Boolean ismandatory;
	private Boolean isrange;
	private String name;
	private String readonlylogic;
	private Integer seqno;
	private String updated;
	private Integer updatedby;
	private String valuemax;
	private String valuemin;
	private String vformat;
	private AdProcess adProcess;

	public AdProcessPara() {
	}

	public AdProcessPara(Integer adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
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

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_PROCESS_ID", columnDefinition="INT", nullable=false)
	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Id
	@Column(name="AD_PROCESS_PARA_ID", columnDefinition="INT")
	public Integer getAdProcessParaId() {
		return adProcessParaId;
	}

	public void setAdProcessParaId(Integer adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
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
	@Column(name="AD_VAL_RULE_ID", columnDefinition="INT")
	public Integer getAdValRuleId() {
		return adValRuleId;
	}

	public void setAdValRuleId(Integer adValRuleId) {
		this.adValRuleId = adValRuleId;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getColumnname() {
		return columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
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
	@Column(length=2000)
	public String getDefaultvalue2() {
		return defaultvalue2;
	}

	public void setDefaultvalue2(String defaultvalue2) {
		this.defaultvalue2 = defaultvalue2;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
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
	public Boolean isIscentrallymaintained() {
		return iscentrallymaintained;
	}

	public void setIscentrallymaintained(Boolean iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
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
	public Boolean isIsrange() {
		return isrange;
	}

	public void setIsrange(Boolean isrange) {
		this.isrange = isrange;
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
	@Column(length=2000)
	public String getReadonlylogic() {
		return readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
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
	@Column(length=20)
	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}
	
	// bi-directional many-to-one association to AdProcess
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "AD_PROCESS_ID")
		public AdProcess getAdProcess() {
			return this.adProcess;
		}

		public void setAdProcess(AdProcess adProcess) {
			this.adProcess = adProcess;
		}
}