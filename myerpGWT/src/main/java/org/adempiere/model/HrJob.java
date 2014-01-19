package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_job")
public class HrJob extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private Integer hrDepartmentId;
	private Integer hrJobId;
	private Boolean isactive;
	private Boolean isparent;
	private Integer jobcant;
	private String name;
	private Integer nextJobId;
	private Integer supervisorId;
	private String updated;
	private Integer updatedby;
	private String value;

	public HrJob() {
	}

	public HrJob(Integer hrJobId) {
		this.hrJobId = hrJobId;
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
	@Column(name="HR_DEPARTMENT_ID", columnDefinition="INT")
	public Integer getHrDepartmentId() {
		return hrDepartmentId;
	}

	public void setHrDepartmentId(Integer hrDepartmentId) {
		this.hrDepartmentId = hrDepartmentId;
	}

	@Id
	@Column(name="HR_JOB_ID", columnDefinition="INT")
	public Integer getHrJobId() {
		return hrJobId;
	}

	public void setHrJobId(Integer hrJobId) {
		this.hrJobId = hrJobId;
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
	public Boolean isIsparent() {
		return isparent;
	}

	public void setIsparent(Boolean isparent) {
		this.isparent = isparent;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getJobcant() {
		return jobcant;
	}

	public void setJobcant(Integer jobcant) {
		this.jobcant = jobcant;
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
	@Column(name="NEXT_JOB_ID", columnDefinition="INT")
	public Integer getNextJobId() {
		return nextJobId;
	}

	public void setNextJobId(Integer nextJobId) {
		this.nextJobId = nextJobId;
	}

	@Basic
	@Column(name="SUPERVISOR_ID", columnDefinition="INT")
	public Integer getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Integer supervisorId) {
		this.supervisorId = supervisorId;
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
	@Column(length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}