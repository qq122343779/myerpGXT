package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_report")
@IdClass(org.adempiere.model.TReportPK.class)
public class TReport extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adPinstanceId;
	private BigDecimal col0;
	private BigDecimal col1;
	private BigDecimal col10;
	private BigDecimal col11;
	private BigDecimal col12;
	private BigDecimal col13;
	private BigDecimal col14;
	private BigDecimal col15;
	private BigDecimal col16;
	private BigDecimal col17;
	private BigDecimal col18;
	private BigDecimal col19;
	private BigDecimal col2;
	private BigDecimal col20;
	private BigDecimal col3;
	private BigDecimal col4;
	private BigDecimal col5;
	private BigDecimal col6;
	private BigDecimal col7;
	private BigDecimal col8;
	private BigDecimal col9;
	private String description;
	private Integer factAcctId;
	private Integer levelno;
	private String name;
	private Integer paReportlineId;
	private Integer recordId;
	private BigDecimal seqno;

	public TReport() {
	}

	public TReport(Integer adPinstanceId, Integer factAcctId, Integer paReportlineId, Integer recordId) {
		this.adPinstanceId = adPinstanceId;
		this.factAcctId = factAcctId;
		this.paReportlineId = paReportlineId;
		this.recordId = recordId;
	}

	@Id
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
	}

	@Basic
	@Column(name="COL_0")
	public BigDecimal getCol0() {
		return col0;
	}

	public void setCol0(BigDecimal col0) {
		this.col0 = col0;
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
	@Column(name="COL_10")
	public BigDecimal getCol10() {
		return col10;
	}

	public void setCol10(BigDecimal col10) {
		this.col10 = col10;
	}

	@Basic
	@Column(name="COL_11")
	public BigDecimal getCol11() {
		return col11;
	}

	public void setCol11(BigDecimal col11) {
		this.col11 = col11;
	}

	@Basic
	@Column(name="COL_12")
	public BigDecimal getCol12() {
		return col12;
	}

	public void setCol12(BigDecimal col12) {
		this.col12 = col12;
	}

	@Basic
	@Column(name="COL_13")
	public BigDecimal getCol13() {
		return col13;
	}

	public void setCol13(BigDecimal col13) {
		this.col13 = col13;
	}

	@Basic
	@Column(name="COL_14")
	public BigDecimal getCol14() {
		return col14;
	}

	public void setCol14(BigDecimal col14) {
		this.col14 = col14;
	}

	@Basic
	@Column(name="COL_15")
	public BigDecimal getCol15() {
		return col15;
	}

	public void setCol15(BigDecimal col15) {
		this.col15 = col15;
	}

	@Basic
	@Column(name="COL_16")
	public BigDecimal getCol16() {
		return col16;
	}

	public void setCol16(BigDecimal col16) {
		this.col16 = col16;
	}

	@Basic
	@Column(name="COL_17")
	public BigDecimal getCol17() {
		return col17;
	}

	public void setCol17(BigDecimal col17) {
		this.col17 = col17;
	}

	@Basic
	@Column(name="COL_18")
	public BigDecimal getCol18() {
		return col18;
	}

	public void setCol18(BigDecimal col18) {
		this.col18 = col18;
	}

	@Basic
	@Column(name="COL_19")
	public BigDecimal getCol19() {
		return col19;
	}

	public void setCol19(BigDecimal col19) {
		this.col19 = col19;
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
	@Column(name="COL_20")
	public BigDecimal getCol20() {
		return col20;
	}

	public void setCol20(BigDecimal col20) {
		this.col20 = col20;
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
	@Column(name="COL_9")
	public BigDecimal getCol9() {
		return col9;
	}

	public void setCol9(BigDecimal col9) {
		this.col9 = col9;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
	@Column(name="FACT_ACCT_ID", columnDefinition="INT")
	public Integer getFactAcctId() {
		return factAcctId;
	}

	public void setFactAcctId(Integer factAcctId) {
		this.factAcctId = factAcctId;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLevelno() {
		return levelno;
	}

	public void setLevelno(Integer levelno) {
		this.levelno = levelno;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name="PA_REPORTLINE_ID", columnDefinition="INT")
	public Integer getPaReportlineId() {
		return paReportlineId;
	}

	public void setPaReportlineId(Integer paReportlineId) {
		this.paReportlineId = paReportlineId;
	}

	@Id
	@Column(name="RECORD_ID", columnDefinition="INT")
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@Basic
	public BigDecimal getSeqno() {
		return seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}
}