package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_sla_goal")
public class PaSlaGoal extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private String datelastrun;
	private String description;
	private String help;
	private String isactive;
	private BigDecimal measureactual;
	private BigDecimal measuretarget;
	private String name;
	private Integer paSlaCriteriaId;
	private Integer paSlaGoalId;
	private String processed;
	private String processing;
	private String updated;
	private Integer updatedby;
	private String validfrom;
	private String validto;

	public PaSlaGoal() {
	}

	public PaSlaGoal(Integer paSlaGoalId) {
		this.paSlaGoalId = paSlaGoalId;
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
	@Column(name="C_BPARTNER_ID", nullable=false)
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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
	public String getDatelastrun() {
		return datelastrun;
	}

	public void setDatelastrun(String datelastrun) {
		this.datelastrun = datelastrun;
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
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	@Column(nullable=false)
	public BigDecimal getMeasureactual() {
		return measureactual;
	}

	public void setMeasureactual(BigDecimal measureactual) {
		this.measureactual = measureactual;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMeasuretarget() {
		return measuretarget;
	}

	public void setMeasuretarget(BigDecimal measuretarget) {
		this.measuretarget = measuretarget;
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
	@Column(name="PA_SLA_CRITERIA_ID", nullable=false)
	public Integer getPaSlaCriteriaId() {
		return paSlaCriteriaId;
	}

	public void setPaSlaCriteriaId(Integer paSlaCriteriaId) {
		this.paSlaCriteriaId = paSlaCriteriaId;
	}

	@Id
	@Column(name="PA_SLA_GOAL_ID")
	public Integer getPaSlaGoalId() {
		return paSlaGoalId;
	}

	public void setPaSlaGoalId(Integer paSlaGoalId) {
		this.paSlaGoalId = paSlaGoalId;
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
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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
}