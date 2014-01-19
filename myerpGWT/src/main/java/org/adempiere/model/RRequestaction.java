package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requestaction")
public class RRequestaction extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adRoleId;
	private Integer adUserId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cInvoiceId;
	private Integer cOrderId;
	private Integer cPaymentId;
	private Integer cProjectId;
	private String confidentialtype;
	private String created;
	private Integer createdby;
	private String datecompleteplan;
	private String datenextaction;
	private String datestartplan;
	private String enddate;
	private Boolean isactive;
	private Boolean isescalated;
	private Boolean isinvoiced;
	private Boolean isselfservice;
	private Integer mInoutId;
	private Integer mProductId;
	private Integer mProductspentId;
	private Integer mRmaId;
	private String nullcolumns;
	private String priority;
	private String priorityuser;
	private BigDecimal qtyinvoiced;
	private BigDecimal qtyplan;
	private BigDecimal qtyspent;
	private Integer rCategoryId;
	private Integer rGroupId;
	private Integer rRequestId;
	private Integer rRequestactionId;
	private Integer rRequesttypeId;
	private Integer rResolutionId;
	private Integer rStatusId;
	private Integer salesrepId;
	private String startdate;
	private String summary;
	private String taskstatus;
	private String updated;
	private Integer updatedby;

	public RRequestaction() {
	}

	public RRequestaction(Integer rRequestactionId) {
		this.rRequestactionId = rRequestactionId;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT")
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
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
	@Column(name="AD_ROLE_ID", columnDefinition="INT")
	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	@Basic
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_INVOICE_ID", columnDefinition="INT")
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_ORDER_ID", columnDefinition="INT")
	public Integer getCOrderId() {
		return cOrderId;
	}

	public void setCOrderId(Integer cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Basic
	@Column(name="C_PAYMENT_ID", columnDefinition="INT")
	public Integer getCPaymentId() {
		return cPaymentId;
	}

	public void setCPaymentId(Integer cPaymentId) {
		this.cPaymentId = cPaymentId;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(length=1)
	public String getConfidentialtype() {
		return confidentialtype;
	}

	public void setConfidentialtype(String confidentialtype) {
		this.confidentialtype = confidentialtype;
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
	public String getDatecompleteplan() {
		return datecompleteplan;
	}

	public void setDatecompleteplan(String datecompleteplan) {
		this.datecompleteplan = datecompleteplan;
	}

	@Basic
	public String getDatenextaction() {
		return datenextaction;
	}

	public void setDatenextaction(String datenextaction) {
		this.datenextaction = datenextaction;
	}

	@Basic
	public String getDatestartplan() {
		return datestartplan;
	}

	public void setDatestartplan(String datestartplan) {
		this.datestartplan = datestartplan;
	}

	@Basic
	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
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
	public Boolean isIsescalated() {
		return isescalated;
	}

	public void setIsescalated(Boolean isescalated) {
		this.isescalated = isescalated;
	}

	@Basic
	public Boolean isIsinvoiced() {
		return isinvoiced;
	}

	public void setIsinvoiced(Boolean isinvoiced) {
		this.isinvoiced = isinvoiced;
	}

	@Basic
	public Boolean isIsselfservice() {
		return isselfservice;
	}

	public void setIsselfservice(Boolean isselfservice) {
		this.isselfservice = isselfservice;
	}

	@Basic
	@Column(name="M_INOUT_ID", columnDefinition="INT")
	public Integer getMInoutId() {
		return mInoutId;
	}

	public void setMInoutId(Integer mInoutId) {
		this.mInoutId = mInoutId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="M_PRODUCTSPENT_ID", columnDefinition="INT")
	public Integer getMProductspentId() {
		return mProductspentId;
	}

	public void setMProductspentId(Integer mProductspentId) {
		this.mProductspentId = mProductspentId;
	}

	@Basic
	@Column(name="M_RMA_ID", columnDefinition="INT")
	public Integer getMRmaId() {
		return mRmaId;
	}

	public void setMRmaId(Integer mRmaId) {
		this.mRmaId = mRmaId;
	}

	@Basic
	public String getNullcolumns() {
		return nullcolumns;
	}

	public void setNullcolumns(String nullcolumns) {
		this.nullcolumns = nullcolumns;
	}

	@Basic
	@Column(length=1)
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Basic
	@Column(length=1)
	public String getPriorityuser() {
		return priorityuser;
	}

	public void setPriorityuser(String priorityuser) {
		this.priorityuser = priorityuser;
	}

	@Basic
	public BigDecimal getQtyinvoiced() {
		return qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}

	@Basic
	public BigDecimal getQtyplan() {
		return qtyplan;
	}

	public void setQtyplan(BigDecimal qtyplan) {
		this.qtyplan = qtyplan;
	}

	@Basic
	public BigDecimal getQtyspent() {
		return qtyspent;
	}

	public void setQtyspent(BigDecimal qtyspent) {
		this.qtyspent = qtyspent;
	}

	@Basic
	@Column(name="R_CATEGORY_ID", columnDefinition="INT")
	public Integer getRCategoryId() {
		return rCategoryId;
	}

	public void setRCategoryId(Integer rCategoryId) {
		this.rCategoryId = rCategoryId;
	}

	@Basic
	@Column(name="R_GROUP_ID", columnDefinition="INT")
	public Integer getRGroupId() {
		return rGroupId;
	}

	public void setRGroupId(Integer rGroupId) {
		this.rGroupId = rGroupId;
	}

	@Basic
	@Column(name="R_REQUEST_ID", columnDefinition="INT", nullable=false)
	public Integer getRRequestId() {
		return rRequestId;
	}

	public void setRRequestId(Integer rRequestId) {
		this.rRequestId = rRequestId;
	}

	@Id
	@Column(name="R_REQUESTACTION_ID", columnDefinition="INT")
	public Integer getRRequestactionId() {
		return rRequestactionId;
	}

	public void setRRequestactionId(Integer rRequestactionId) {
		this.rRequestactionId = rRequestactionId;
	}

	@Basic
	@Column(name="R_REQUESTTYPE_ID", columnDefinition="INT")
	public Integer getRRequesttypeId() {
		return rRequesttypeId;
	}

	public void setRRequesttypeId(Integer rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
	}

	@Basic
	@Column(name="R_RESOLUTION_ID", columnDefinition="INT")
	public Integer getRResolutionId() {
		return rResolutionId;
	}

	public void setRResolutionId(Integer rResolutionId) {
		this.rResolutionId = rResolutionId;
	}

	@Basic
	@Column(name="R_STATUS_ID", columnDefinition="INT")
	public Integer getRStatusId() {
		return rStatusId;
	}

	public void setRStatusId(Integer rStatusId) {
		this.rStatusId = rStatusId;
	}

	@Basic
	@Column(name="SALESREP_ID", columnDefinition="INT")
	public Integer getSalesrepId() {
		return salesrepId;
	}

	public void setSalesrepId(Integer salesrepId) {
		this.salesrepId = salesrepId;
	}

	@Basic
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	@Basic
	@Column(length=2000)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Basic
	@Column(length=1)
	public String getTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
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