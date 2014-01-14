package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_order")
public class PpOrder extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer adWorkflowId;
	private BigDecimal assay;
	private Integer cActivityId;
	private Integer cCampaignId;
	private Integer cDoctypeId;
	private Integer cDoctypetargetId;
	private Integer cOrderlineId;
	private Integer cProjectId;
	private Integer cUomId;
	private String copyfrom;
	private String created;
	private Integer createdby;
	private String dateconfirm;
	private String datedelivered;
	private String datefinish;
	private String datefinishschedule;
	private String dateordered;
	private String datepromised;
	private String datestart;
	private String datestartschedule;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private BigDecimal floatafter;
	private BigDecimal floatbefored;
	private String isactive;
	private String isapproved;
	private String isprinted;
	private String isqtypercentage;
	private String isselected;
	private String issotrx;
	private Integer line;
	private String lot;
	private Integer mAttributesetinstanceId;
	private Integer mProductId;
	private Integer mWarehouseId;
	private String ordertype;
	private Integer plannerId;
	private String posted;
	private Integer ppOrderId;
	private Integer ppProductBomId;
	private String priorityrule;
	private String processed;
	private Long processedon;
	private String processing;
	private BigDecimal qtybatchs;
	private BigDecimal qtybatchsize;
	private BigDecimal qtydelivered;
	private BigDecimal qtyentered;
	private BigDecimal qtyordered;
	private BigDecimal qtyreject;
	private BigDecimal qtyreserved;
	private BigDecimal qtyscrap;
	private Integer sResourceId;
	private String scheduletype;
	private String serno;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;
	private BigDecimal yield;

	public PpOrder() {
	}

	public PpOrder(Integer ppOrderId) {
		this.ppOrderId = ppOrderId;
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
	@Column(name="AD_ORGTRX_ID")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID", nullable=false)
	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	@Basic
	public BigDecimal getAssay() {
		return assay;
	}

	public void setAssay(BigDecimal assay) {
		this.assay = assay;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID")
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	@Basic
	@Column(name="C_DOCTYPETARGET_ID", nullable=false)
	public Integer getCDoctypetargetId() {
		return cDoctypetargetId;
	}

	public void setCDoctypetargetId(Integer cDoctypetargetId) {
		this.cDoctypetargetId = cDoctypetargetId;
	}

	@Basic
	@Column(name="C_ORDERLINE_ID")
	public Integer getCOrderlineId() {
		return cOrderlineId;
	}

	public void setCOrderlineId(Integer cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
	}

	@Basic
	@Column(name="C_PROJECT_ID")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_UOM_ID", nullable=false)
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDateconfirm() {
		return dateconfirm;
	}

	public void setDateconfirm(String dateconfirm) {
		this.dateconfirm = dateconfirm;
	}

	@Basic
	public String getDatedelivered() {
		return datedelivered;
	}

	public void setDatedelivered(String datedelivered) {
		this.datedelivered = datedelivered;
	}

	@Basic
	public String getDatefinish() {
		return datefinish;
	}

	public void setDatefinish(String datefinish) {
		this.datefinish = datefinish;
	}

	@Basic
	public String getDatefinishschedule() {
		return datefinishschedule;
	}

	public void setDatefinishschedule(String datefinishschedule) {
		this.datefinishschedule = datefinishschedule;
	}

	@Basic
	@Column(nullable=false)
	public String getDateordered() {
		return dateordered;
	}

	public void setDateordered(String dateordered) {
		this.dateordered = dateordered;
	}

	@Basic
	@Column(nullable=false)
	public String getDatepromised() {
		return datepromised;
	}

	public void setDatepromised(String datepromised) {
		this.datepromised = datepromised;
	}

	@Basic
	public String getDatestart() {
		return datestart;
	}

	public void setDatestart(String datestart) {
		this.datestart = datestart;
	}

	@Basic
	@Column(nullable=false)
	public String getDatestartschedule() {
		return datestartschedule;
	}

	public void setDatestartschedule(String datestartschedule) {
		this.datestartschedule = datestartschedule;
	}

	@Basic
	@Column(length=510)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocaction() {
		return docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocstatus() {
		return docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Basic
	public BigDecimal getFloatafter() {
		return floatafter;
	}

	public void setFloatafter(BigDecimal floatafter) {
		this.floatafter = floatafter;
	}

	@Basic
	public BigDecimal getFloatbefored() {
		return floatbefored;
	}

	public void setFloatbefored(BigDecimal floatbefored) {
		this.floatbefored = floatbefored;
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
	@Column(nullable=false, length=1)
	public String getIsapproved() {
		return isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsprinted() {
		return isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
	}

	@Basic
	@Column(length=1)
	public String getIsqtypercentage() {
		return isqtypercentage;
	}

	public void setIsqtypercentage(String isqtypercentage) {
		this.isqtypercentage = isqtypercentage;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsselected() {
		return isselected;
	}

	public void setIsselected(String isselected) {
		this.isselected = isselected;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssotrx() {
		return issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}

	@Basic
	@Column(nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(length=20)
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", nullable=false)
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(length=1)
	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	@Basic
	@Column(name="PLANNER_ID")
	public Integer getPlannerId() {
		return plannerId;
	}

	public void setPlannerId(Integer plannerId) {
		this.plannerId = plannerId;
	}

	@Basic
	@Column(length=1)
	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	@Id
	@Column(name="PP_ORDER_ID")
	public Integer getPpOrderId() {
		return ppOrderId;
	}

	public void setPpOrderId(Integer ppOrderId) {
		this.ppOrderId = ppOrderId;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOM_ID", nullable=false)
	public Integer getPpProductBomId() {
		return ppProductBomId;
	}

	public void setPpProductBomId(Integer ppProductBomId) {
		this.ppProductBomId = ppProductBomId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPriorityrule() {
		return priorityrule;
	}

	public void setPriorityrule(String priorityrule) {
		this.priorityrule = priorityrule;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	public Long getProcessedon() {
		return processedon;
	}

	public void setProcessedon(Long processedon) {
		this.processedon = processedon;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	public BigDecimal getQtybatchs() {
		return qtybatchs;
	}

	public void setQtybatchs(BigDecimal qtybatchs) {
		this.qtybatchs = qtybatchs;
	}

	@Basic
	public BigDecimal getQtybatchsize() {
		return qtybatchsize;
	}

	public void setQtybatchsize(BigDecimal qtybatchsize) {
		this.qtybatchsize = qtybatchsize;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtydelivered() {
		return qtydelivered;
	}

	public void setQtydelivered(BigDecimal qtydelivered) {
		this.qtydelivered = qtydelivered;
	}

	@Basic
	public BigDecimal getQtyentered() {
		return qtyentered;
	}

	public void setQtyentered(BigDecimal qtyentered) {
		this.qtyentered = qtyentered;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyordered() {
		return qtyordered;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyreject() {
		return qtyreject;
	}

	public void setQtyreject(BigDecimal qtyreject) {
		this.qtyreject = qtyreject;
	}

	@Basic
	public BigDecimal getQtyreserved() {
		return qtyreserved;
	}

	public void setQtyreserved(BigDecimal qtyreserved) {
		this.qtyreserved = qtyreserved;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyscrap() {
		return qtyscrap;
	}

	public void setQtyscrap(BigDecimal qtyscrap) {
		this.qtyscrap = qtyscrap;
	}

	@Basic
	@Column(name="S_RESOURCE_ID", nullable=false)
	public Integer getSResourceId() {
		return sResourceId;
	}

	public void setSResourceId(Integer sResourceId) {
		this.sResourceId = sResourceId;
	}

	@Basic
	@Column(length=1)
	public String getScheduletype() {
		return scheduletype;
	}

	public void setScheduletype(String scheduletype) {
		this.scheduletype = scheduletype;
	}

	@Basic
	@Column(length=20)
	public String getSerno() {
		return serno;
	}

	public void setSerno(String serno) {
		this.serno = serno;
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

	@Basic
	@Column(name="USER1_ID")
	public Integer getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Integer user1Id) {
		this.user1Id = user1Id;
	}

	@Basic
	@Column(name="USER2_ID")
	public Integer getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Integer user2Id) {
		this.user2Id = user2Id;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getYield() {
		return yield;
	}

	public void setYield(BigDecimal yield) {
		this.yield = yield;
	}
}