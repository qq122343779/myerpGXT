package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;

public class ADProcessArgModel implements IsADRPCModel, ADFormField {
	private Integer				adProcessParaId;
	private Integer				adReferenceId;
	private Integer				adReferenceValueId;
	private Integer				adValRuleId;
	private String				columnname;
	private String				defaultvalue;
	private String				displaylogic;
	private Integer				fieldlength;
	private Boolean				isactive;
	private Boolean				iscentrallymaintained;
	private Boolean				ismandatory;
	private String				name;
	private String				readonlylogic;
	private Integer				seqno;
	private String				valuemax;
	private String				valuemin;
	private String				vformat;

	public Integer getAdProcessParaId() {
		return adProcessParaId;
	}

	public void setAdProcessParaId(Integer adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
	}

	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	public Integer getAdReferenceValueId() {
		return adReferenceValueId;
	}

	public void setAdReferenceValueId(Integer adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}

	public Integer getAdValRuleId() {
		return adValRuleId;
	}

	public void setAdValRuleId(Integer adValRuleId) {
		this.adValRuleId = adValRuleId;
	}

	public String getColumnname() {
		return columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getDisplaylogic() {
		return displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	public Integer getFieldlength() {
		return fieldlength;
	}

	public void setFieldlength(Integer fieldlength) {
		this.fieldlength = fieldlength;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Boolean getIscentrallymaintained() {
		return iscentrallymaintained;
	}

	public void setIscentrallymaintained(Boolean iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}

	public Boolean getIsmandatory() {
		return ismandatory;
	}

	public void setIsmandatory(Boolean ismandatory) {
		this.ismandatory = ismandatory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReadonlylogic() {
		return readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getValuemax() {
		return valuemax;
	}

	public void setValuemax(String valuemax) {
		this.valuemax = valuemax;
	}

	public String getValuemin() {
		return valuemin;
	}

	public void setValuemin(String valuemin) {
		this.valuemin = valuemin;
	}

	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

	@Override
	public String getFieldgroup() {
		return null;
	}

	@Override
	public Boolean getIsdisplayed() {
		return true;
	}

	@Override
	public DisplayType getFieldType() {
		return DisplayType.fromInteger(adReferenceId);
	}

	@Override
	public Boolean getIsencryptedfield() {
		return false;
	}

	@Override
	public Boolean getIskey() {
		return false;
	}

	@Override
	public Boolean getIssameline() {
		return false;
	}

}
