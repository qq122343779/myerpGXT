package org.adempiere.model;

import javax.persistence.*;

import org.adempiere.persist.AdMenuListener;

/**
 * Auto-generated by: org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name = "ad_menu")
@EntityListeners(AdMenuListener.class)
public class AdMenu extends org.adempiere.common.ADEntityBase {
	private static final long	serialVersionUID	= 1L;
	private String				action;
	private Integer				adClientId;
	private Integer				adFormId;
	private Integer				adMenuId;
	private Integer				adOrgId;
	private Integer				adProcessId;
	private Integer				adTaskId;
	private Integer				adWindowId;
	private Integer				adWorkbenchId;
	private Integer				adWorkflowId;
	private String				created;
	private Integer				createdby;
	private String				description;
	private String				entitytype;
	private Boolean				isactive;
	private Boolean				iscentrallymaintained;
	private Boolean				isreadonly;
	private Boolean				issotrx;
	private Boolean				issummary;
	private String				name;
	private String				updated;
	private Integer				updatedby;

	public AdMenu() {
	}

	public AdMenu(Integer adMenuId) {
		this.adMenuId = adMenuId;
	}

	@Basic
	@Column(length = 1)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Basic
	@Column(name = "AD_CLIENT_ID", columnDefinition = "INT", nullable = false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name = "AD_FORM_ID", columnDefinition = "INT")
	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AD_MENU_ID", columnDefinition = "INT")
	public Integer getAdMenuId() {
		return adMenuId;
	}

	public void setAdMenuId(Integer adMenuId) {
		this.adMenuId = adMenuId;
	}

	@Basic
	@Column(name = "AD_ORG_ID", columnDefinition = "INT", nullable = false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name = "AD_PROCESS_ID", columnDefinition = "INT")
	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Basic
	@Column(name = "AD_TASK_ID", columnDefinition = "INT")
	public Integer getAdTaskId() {
		return adTaskId;
	}

	public void setAdTaskId(Integer adTaskId) {
		this.adTaskId = adTaskId;
	}

	@Basic
	@Column(name = "AD_WINDOW_ID", columnDefinition = "INT")
	public Integer getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}

	@Basic
	@Column(name = "AD_WORKBENCH_ID", columnDefinition = "INT")
	public Integer getAdWorkbenchId() {
		return adWorkbenchId;
	}

	public void setAdWorkbenchId(Integer adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
	}

	@Basic
	@Column(name = "AD_WORKFLOW_ID", columnDefinition = "INT")
	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	@Basic
	@Column(columnDefinition = "TIMESTAMP", nullable = false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition = "INT", nullable = false)
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
	@Column(nullable = false, length = 40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Basic
	@Column(nullable = false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIscentrallymaintained() {
		return iscentrallymaintained;
	}

	public void setIscentrallymaintained(Boolean iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}

	@Basic
	@Column(nullable = false)
	public Boolean isIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}

	@Basic
	@Column(nullable = false)
	public Boolean isIssotrx() {
		return issotrx;
	}

	public void setIssotrx(Boolean issotrx) {
		this.issotrx = issotrx;
	}

	@Basic
	@Column(nullable = false)
	public Boolean isIssummary() {
		return issummary;
	}

	public void setIssummary(Boolean issummary) {
		this.issummary = issummary;
	}

	@Basic
	@Column(nullable = false, length = 60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(columnDefinition = "TIMESTAMP", nullable = false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition = "INT", nullable = false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

}