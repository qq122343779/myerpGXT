package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_sequence")
public class AdSequence extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adSequenceId;
	private String created;
	private Integer createdby;
	private Integer currentnext;
	private Integer currentnextsys;
	private String datecolumn;
	private String decimalpattern;
	private String description;
	private Integer incrementno;
	private Boolean isactive;
	private Boolean isaudited;
	private Boolean isautosequence;
	private Boolean istableid;
	private String name;
	private String prefix;
	private String startnewyear;
	private Integer startno;
	private String suffix;
	private String updated;
	private Integer updatedby;
	private String vformat;

	public AdSequence() {
	}

	public AdSequence(Integer adSequenceId) {
		this.adSequenceId = adSequenceId;
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

	@Id
	@Column(name="AD_SEQUENCE_ID", columnDefinition="INT")
	public Integer getAdSequenceId() {
		return adSequenceId;
	}

	public void setAdSequenceId(Integer adSequenceId) {
		this.adSequenceId = adSequenceId;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCurrentnext() {
		return currentnext;
	}

	public void setCurrentnext(Integer currentnext) {
		this.currentnext = currentnext;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCurrentnextsys() {
		return currentnextsys;
	}

	public void setCurrentnextsys(Integer currentnextsys) {
		this.currentnextsys = currentnextsys;
	}

	@Basic
	@Column(length=60)
	public String getDatecolumn() {
		return datecolumn;
	}

	public void setDatecolumn(String datecolumn) {
		this.datecolumn = datecolumn;
	}

	@Basic
	@Column(length=40)
	public String getDecimalpattern() {
		return decimalpattern;
	}

	public void setDecimalpattern(String decimalpattern) {
		this.decimalpattern = decimalpattern;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getIncrementno() {
		return incrementno;
	}

	public void setIncrementno(Integer incrementno) {
		this.incrementno = incrementno;
	}

	@Basic
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIsaudited() {
		return isaudited;
	}

	public void setIsaudited(Boolean isaudited) {
		this.isaudited = isaudited;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsautosequence() {
		return isautosequence;
	}

	public void setIsautosequence(Boolean isautosequence) {
		this.isautosequence = isautosequence;
	}

	@Basic
	public Boolean isIstableid() {
		return istableid;
	}

	public void setIstableid(Boolean istableid) {
		this.istableid = istableid;
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
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	@Basic
	@Column(length=1)
	public String getStartnewyear() {
		return startnewyear;
	}

	public void setStartnewyear(String startnewyear) {
		this.startnewyear = startnewyear;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getStartno() {
		return startno;
	}

	public void setStartno(Integer startno) {
		this.startno = startno;
	}

	@Basic
	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
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
	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}
}