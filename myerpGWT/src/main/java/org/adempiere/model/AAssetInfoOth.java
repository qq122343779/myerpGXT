package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_info_oth")
public class AAssetInfoOth extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer aAssetInfoOthId;
	private String aUser1;
	private String aUser10;
	private String aUser11;
	private String aUser12;
	private String aUser13;
	private String aUser14;
	private String aUser15;
	private String aUser2;
	private String aUser3;
	private String aUser4;
	private String aUser5;
	private String aUser6;
	private String aUser7;
	private String aUser8;
	private String aUser9;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String text;
	private String updated;
	private Integer updatedby;

	public AAssetInfoOth() {
	}

	public AAssetInfoOth(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_ASSET_INFO_OTH_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetInfoOthId() {
		return aAssetInfoOthId;
	}

	public void setAAssetInfoOthId(Integer aAssetInfoOthId) {
		this.aAssetInfoOthId = aAssetInfoOthId;
	}

	@Basic
	@Column(name="A_USER1", length=3)
	public String getAUser1() {
		return aUser1;
	}

	public void setAUser1(String aUser1) {
		this.aUser1 = aUser1;
	}

	@Basic
	@Column(name="A_USER10", length=3)
	public String getAUser10() {
		return aUser10;
	}

	public void setAUser10(String aUser10) {
		this.aUser10 = aUser10;
	}

	@Basic
	@Column(name="A_USER11", length=10)
	public String getAUser11() {
		return aUser11;
	}

	public void setAUser11(String aUser11) {
		this.aUser11 = aUser11;
	}

	@Basic
	@Column(name="A_USER12", length=10)
	public String getAUser12() {
		return aUser12;
	}

	public void setAUser12(String aUser12) {
		this.aUser12 = aUser12;
	}

	@Basic
	@Column(name="A_USER13", length=10)
	public String getAUser13() {
		return aUser13;
	}

	public void setAUser13(String aUser13) {
		this.aUser13 = aUser13;
	}

	@Basic
	@Column(name="A_USER14", length=10)
	public String getAUser14() {
		return aUser14;
	}

	public void setAUser14(String aUser14) {
		this.aUser14 = aUser14;
	}

	@Basic
	@Column(name="A_USER15", length=10)
	public String getAUser15() {
		return aUser15;
	}

	public void setAUser15(String aUser15) {
		this.aUser15 = aUser15;
	}

	@Basic
	@Column(name="A_USER2", length=3)
	public String getAUser2() {
		return aUser2;
	}

	public void setAUser2(String aUser2) {
		this.aUser2 = aUser2;
	}

	@Basic
	@Column(name="A_USER3", length=3)
	public String getAUser3() {
		return aUser3;
	}

	public void setAUser3(String aUser3) {
		this.aUser3 = aUser3;
	}

	@Basic
	@Column(name="A_USER4", length=3)
	public String getAUser4() {
		return aUser4;
	}

	public void setAUser4(String aUser4) {
		this.aUser4 = aUser4;
	}

	@Basic
	@Column(name="A_USER5", length=3)
	public String getAUser5() {
		return aUser5;
	}

	public void setAUser5(String aUser5) {
		this.aUser5 = aUser5;
	}

	@Basic
	@Column(name="A_USER6", length=3)
	public String getAUser6() {
		return aUser6;
	}

	public void setAUser6(String aUser6) {
		this.aUser6 = aUser6;
	}

	@Basic
	@Column(name="A_USER7", length=3)
	public String getAUser7() {
		return aUser7;
	}

	public void setAUser7(String aUser7) {
		this.aUser7 = aUser7;
	}

	@Basic
	@Column(name="A_USER8", length=3)
	public String getAUser8() {
		return aUser8;
	}

	public void setAUser8(String aUser8) {
		this.aUser8 = aUser8;
	}

	@Basic
	@Column(name="A_USER9", length=3)
	public String getAUser9() {
		return aUser9;
	}

	public void setAUser9(String aUser9) {
		this.aUser9 = aUser9;
	}

	@Id
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
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

	@Basic
	@Column(length=510)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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