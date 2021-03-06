package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_listline")
public class HrListline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal col1;
	private BigDecimal col2;
	private BigDecimal col3;
	private BigDecimal col4;
	private BigDecimal col5;
	private BigDecimal col6;
	private BigDecimal col7;
	private BigDecimal col8;
	private String created;
	private Integer createdby;
	private Integer hrListlineId;
	private Integer hrListversionId;
	private Boolean isactive;
	private BigDecimal maxvalue;
	private BigDecimal minvalue;
	private String name;
	private String updated;
	private Integer updatedby;

	public HrListline() {
	}

	public HrListline(Integer hrListlineId) {
		this.hrListlineId = hrListlineId;
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
	@Column(name="COL_1")
	public BigDecimal getCol1() {
		return col1;
	}

	public void setCol1(BigDecimal col1) {
		this.col1 = col1;
	}

	@Basic
	@Column(name="COL_2")
	public BigDecimal getCol2() {
		return col2;
	}

	public void setCol2(BigDecimal col2) {
		this.col2 = col2;
	}

	@Basic
	@Column(name="COL_3")
	public BigDecimal getCol3() {
		return col3;
	}

	public void setCol3(BigDecimal col3) {
		this.col3 = col3;
	}

	@Basic
	@Column(name="COL_4")
	public BigDecimal getCol4() {
		return col4;
	}

	public void setCol4(BigDecimal col4) {
		this.col4 = col4;
	}

	@Basic
	@Column(name="COL_5")
	public BigDecimal getCol5() {
		return col5;
	}

	public void setCol5(BigDecimal col5) {
		this.col5 = col5;
	}

	@Basic
	@Column(name="COL_6")
	public BigDecimal getCol6() {
		return col6;
	}

	public void setCol6(BigDecimal col6) {
		this.col6 = col6;
	}

	@Basic
	@Column(name="COL_7")
	public BigDecimal getCol7() {
		return col7;
	}

	public void setCol7(BigDecimal col7) {
		this.col7 = col7;
	}

	@Basic
	@Column(name="COL_8")
	public BigDecimal getCol8() {
		return col8;
	}

	public void setCol8(BigDecimal col8) {
		this.col8 = col8;
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

	@Id
	@Column(name="HR_LISTLINE_ID", columnDefinition="INT")
	public Integer getHrListlineId() {
		return hrListlineId;
	}

	public void setHrListlineId(Integer hrListlineId) {
		this.hrListlineId = hrListlineId;
	}

	@Basic
	@Column(name="HR_LISTVERSION_ID", columnDefinition="INT")
	public Integer getHrListversionId() {
		return hrListversionId;
	}

	public void setHrListversionId(Integer hrListversionId) {
		this.hrListversionId = hrListversionId;
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
	public BigDecimal getMaxvalue() {
		return maxvalue;
	}

	public void setMaxvalue(BigDecimal maxvalue) {
		this.maxvalue = maxvalue;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMinvalue() {
		return minvalue;
	}

	public void setMinvalue(BigDecimal minvalue) {
		this.minvalue = minvalue;
	}

	@Basic
	@Column(length=60)
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}