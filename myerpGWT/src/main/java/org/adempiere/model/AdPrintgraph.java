package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_printgraph")
public class AdPrintgraph extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPrintformatId;
	private Integer adPrintgraphId;
	private String created;
	private Integer createdby;
	private Integer data1PrintformatitemId;
	private Integer data2PrintformatitemId;
	private Integer data3PrintformatitemId;
	private Integer data4PrintformatitemId;
	private Integer dataPrintformatitemId;
	private String description;
	private Integer descriptionPrintformatitemId;
	private String graphtype;
	private String isactive;
	private String name;
	private String updated;
	private Integer updatedby;

	public AdPrintgraph() {
	}

	public AdPrintgraph(Integer adPrintgraphId) {
		this.adPrintgraphId = adPrintgraphId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_PRINTFORMAT_ID", nullable=false)
	public Integer getAdPrintformatId() {
		return adPrintformatId;
	}

	public void setAdPrintformatId(Integer adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	@Id
	@Column(name="AD_PRINTGRAPH_ID")
	public Integer getAdPrintgraphId() {
		return adPrintgraphId;
	}

	public void setAdPrintgraphId(Integer adPrintgraphId) {
		this.adPrintgraphId = adPrintgraphId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(name="DATA1_PRINTFORMATITEM_ID")
	public Integer getData1PrintformatitemId() {
		return data1PrintformatitemId;
	}

	public void setData1PrintformatitemId(Integer data1PrintformatitemId) {
		this.data1PrintformatitemId = data1PrintformatitemId;
	}

	@Basic
	@Column(name="DATA2_PRINTFORMATITEM_ID")
	public Integer getData2PrintformatitemId() {
		return data2PrintformatitemId;
	}

	public void setData2PrintformatitemId(Integer data2PrintformatitemId) {
		this.data2PrintformatitemId = data2PrintformatitemId;
	}

	@Basic
	@Column(name="DATA3_PRINTFORMATITEM_ID")
	public Integer getData3PrintformatitemId() {
		return data3PrintformatitemId;
	}

	public void setData3PrintformatitemId(Integer data3PrintformatitemId) {
		this.data3PrintformatitemId = data3PrintformatitemId;
	}

	@Basic
	@Column(name="DATA4_PRINTFORMATITEM_ID")
	public Integer getData4PrintformatitemId() {
		return data4PrintformatitemId;
	}

	public void setData4PrintformatitemId(Integer data4PrintformatitemId) {
		this.data4PrintformatitemId = data4PrintformatitemId;
	}

	@Basic
	@Column(name="DATA_PRINTFORMATITEM_ID", nullable=false)
	public Integer getDataPrintformatitemId() {
		return dataPrintformatitemId;
	}

	public void setDataPrintformatitemId(Integer dataPrintformatitemId) {
		this.dataPrintformatitemId = dataPrintformatitemId;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="DESCRIPTION_PRINTFORMATITEM_ID", nullable=false)
	public Integer getDescriptionPrintformatitemId() {
		return descriptionPrintformatitemId;
	}

	public void setDescriptionPrintformatitemId(Integer descriptionPrintformatitemId) {
		this.descriptionPrintformatitemId = descriptionPrintformatitemId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getGraphtype() {
		return graphtype;
	}

	public void setGraphtype(String graphtype) {
		this.graphtype = graphtype;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}