package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_movementlinema")
@IdClass(org.adempiere.model.MMovementlinemaPK.class)
public class MMovementlinema extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Integer mAttributesetinstanceId;
	private Integer mMovementlineId;
	private BigDecimal movementqty;
	private String updated;
	private Integer updatedby;

	public MMovementlinema() {
	}

	public MMovementlinema(Integer mAttributesetinstanceId, Integer mMovementlineId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
		this.mMovementlineId = mMovementlineId;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Id
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Id
	@Column(name="M_MOVEMENTLINE_ID", columnDefinition="INT")
	public Integer getMMovementlineId() {
		return mMovementlineId;
	}

	public void setMMovementlineId(Integer mMovementlineId) {
		this.mMovementlineId = mMovementlineId;
	}

	@Basic
	public BigDecimal getMovementqty() {
		return movementqty;
	}

	public void setMovementqty(BigDecimal movementqty) {
		this.movementqty = movementqty;
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