package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_product_bom")
public class PpProductBom extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String bomtype;
	private String bomuse;
	private Integer cUomId;
	private String copyfrom;
	private String created;
	private Integer createdby;
	private String description;
	private String documentno;
	private String help;
	private Boolean isactive;
	private Integer mAttributesetinstanceId;
	private Integer mChangenoticeId;
	private Integer mProductId;
	private String name;
	private Integer ppProductBomId;
	private Boolean processing;
	private String revision;
	private String updated;
	private Integer updatedby;
	private String validfrom;
	private String validto;
	private String value;

	public PpProductBom() {
	}

	public PpProductBom(Integer ppProductBomId) {
		this.ppProductBomId = ppProductBomId;
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
	@Column(length=1)
	public String getBomtype() {
		return bomtype;
	}

	public void setBomtype(String bomtype) {
		this.bomtype = bomtype;
	}

	@Basic
	@Column(length=1)
	public String getBomuse() {
		return bomuse;
	}

	public void setBomuse(String bomuse) {
		this.bomuse = bomuse;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	@Column(length=1)
	public String getCopyfrom() {
		return copyfrom;
	}

	public void setCopyfrom(String copyfrom) {
		this.copyfrom = copyfrom;
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
	@Column(length=22)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
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
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_CHANGENOTICE_ID", columnDefinition="INT")
	public Integer getMChangenoticeId() {
		return mChangenoticeId;
	}

	public void setMChangenoticeId(Integer mChangenoticeId) {
		this.mChangenoticeId = mChangenoticeId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name="PP_PRODUCT_BOM_ID", columnDefinition="INT")
	public Integer getPpProductBomId() {
		return ppProductBomId;
	}

	public void setPpProductBomId(Integer ppProductBomId) {
		this.ppProductBomId = ppProductBomId;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=10)
	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
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
	@Column(nullable=false)
	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}

	@Basic
	public String getValidto() {
		return validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}

	@Basic
	@Column(nullable=false, length=80)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}