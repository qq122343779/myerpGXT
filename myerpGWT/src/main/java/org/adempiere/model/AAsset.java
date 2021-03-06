package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset")
public class AAsset extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String aAssetCreatedate;
	private Integer aAssetGroupId;
	private Integer aAssetId;
	private String aAssetRevaldate;
	private Integer aParentAssetId;
	private BigDecimal aQtyCurrent;
	private BigDecimal aQtyOriginal;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private String assetdepreciationdate;
	private String assetdisposaldate;
	private String assetservicedate;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cBpartnersrId;
	private Integer cLocationId;
	private Integer cProjectId;
	private String created;
	private Integer createdby;
	private String description;
	private String guaranteedate;
	private String help;
	private Boolean isactive;
	private Boolean isdepreciated;
	private Boolean isdisposed;
	private Boolean isfullydepreciated;
	private Boolean isinposession;
	private Boolean isowned;
	private String lastmaintenancedate;
	private String lastmaintenancenote;
	private Integer lastmaintenanceunit;
	private Integer lastmaintenanceuseunit;
	private String lastmaintenencedate;
	private Integer leaseBpartnerId;
	private String leaseterminationdate;
	private BigDecimal lifeuseunits;
	private String locationcomment;
	private String lot;
	private Integer mAttributesetinstanceId;
	private Integer mInoutlineId;
	private Integer mLocatorId;
	private Integer mProductId;
	private String name;
	private Integer nextmaintenanceuseunit;
	private String nextmaintenencedate;
	private Integer nextmaintenenceunit;
	private Boolean processing;
	private BigDecimal qty;
	private String serno;
	private String updated;
	private Integer updatedby;
	private Integer uselifemonths;
	private Integer uselifeyears;
	private BigDecimal useunits;
	private String value;
	private String versionno;

	public AAsset() {
	}

	public AAsset(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_ASSET_CREATEDATE")
	public String getAAssetCreatedate() {
		return aAssetCreatedate;
	}

	public void setAAssetCreatedate(String aAssetCreatedate) {
		this.aAssetCreatedate = aAssetCreatedate;
	}

	@Basic
	@Column(name="A_ASSET_GROUP_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetGroupId() {
		return aAssetGroupId;
	}

	public void setAAssetGroupId(Integer aAssetGroupId) {
		this.aAssetGroupId = aAssetGroupId;
	}

	@Id
	@Column(name="A_ASSET_ID", columnDefinition="INT")
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_ASSET_REVALDATE")
	public String getAAssetRevaldate() {
		return aAssetRevaldate;
	}

	public void setAAssetRevaldate(String aAssetRevaldate) {
		this.aAssetRevaldate = aAssetRevaldate;
	}

	@Basic
	@Column(name="A_PARENT_ASSET_ID", columnDefinition="INT")
	public Integer getAParentAssetId() {
		return aParentAssetId;
	}

	public void setAParentAssetId(Integer aParentAssetId) {
		this.aParentAssetId = aParentAssetId;
	}

	@Basic
	@Column(name="A_QTY_CURRENT")
	public BigDecimal getAQtyCurrent() {
		return aQtyCurrent;
	}

	public void setAQtyCurrent(BigDecimal aQtyCurrent) {
		this.aQtyCurrent = aQtyCurrent;
	}

	@Basic
	@Column(name="A_QTY_ORIGINAL")
	public BigDecimal getAQtyOriginal() {
		return aQtyOriginal;
	}

	public void setAQtyOriginal(BigDecimal aQtyOriginal) {
		this.aQtyOriginal = aQtyOriginal;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Basic
	public String getAssetdepreciationdate() {
		return assetdepreciationdate;
	}

	public void setAssetdepreciationdate(String assetdepreciationdate) {
		this.assetdepreciationdate = assetdepreciationdate;
	}

	@Basic
	public String getAssetdisposaldate() {
		return assetdisposaldate;
	}

	public void setAssetdisposaldate(String assetdisposaldate) {
		this.assetdisposaldate = assetdisposaldate;
	}

	@Basic
	public String getAssetservicedate() {
		return assetservicedate;
	}

	public void setAssetservicedate(String assetservicedate) {
		this.assetservicedate = assetservicedate;
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
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT")
	public Integer getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	@Basic
	@Column(name="C_BPARTNERSR_ID", columnDefinition="INT")
	public Integer getCBpartnersrId() {
		return cBpartnersrId;
	}

	public void setCBpartnersrId(Integer cBpartnersrId) {
		this.cBpartnersrId = cBpartnersrId;
	}

	@Basic
	@Column(name="C_LOCATION_ID", columnDefinition="INT")
	public Integer getCLocationId() {
		return cLocationId;
	}

	public void setCLocationId(Integer cLocationId) {
		this.cLocationId = cLocationId;
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
	public String getGuaranteedate() {
		return guaranteedate;
	}

	public void setGuaranteedate(String guaranteedate) {
		this.guaranteedate = guaranteedate;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsdepreciated() {
		return isdepreciated;
	}

	public void setIsdepreciated(Boolean isdepreciated) {
		this.isdepreciated = isdepreciated;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsdisposed() {
		return isdisposed;
	}

	public void setIsdisposed(Boolean isdisposed) {
		this.isdisposed = isdisposed;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsfullydepreciated() {
		return isfullydepreciated;
	}

	public void setIsfullydepreciated(Boolean isfullydepreciated) {
		this.isfullydepreciated = isfullydepreciated;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsinposession() {
		return isinposession;
	}

	public void setIsinposession(Boolean isinposession) {
		this.isinposession = isinposession;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsowned() {
		return isowned;
	}

	public void setIsowned(Boolean isowned) {
		this.isowned = isowned;
	}

	@Basic
	public String getLastmaintenancedate() {
		return lastmaintenancedate;
	}

	public void setLastmaintenancedate(String lastmaintenancedate) {
		this.lastmaintenancedate = lastmaintenancedate;
	}

	@Basic
	@Column(length=60)
	public String getLastmaintenancenote() {
		return lastmaintenancenote;
	}

	public void setLastmaintenancenote(String lastmaintenancenote) {
		this.lastmaintenancenote = lastmaintenancenote;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLastmaintenanceunit() {
		return lastmaintenanceunit;
	}

	public void setLastmaintenanceunit(Integer lastmaintenanceunit) {
		this.lastmaintenanceunit = lastmaintenanceunit;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLastmaintenanceuseunit() {
		return lastmaintenanceuseunit;
	}

	public void setLastmaintenanceuseunit(Integer lastmaintenanceuseunit) {
		this.lastmaintenanceuseunit = lastmaintenanceuseunit;
	}

	@Basic
	public String getLastmaintenencedate() {
		return lastmaintenencedate;
	}

	public void setLastmaintenencedate(String lastmaintenencedate) {
		this.lastmaintenencedate = lastmaintenencedate;
	}

	@Basic
	@Column(name="LEASE_BPARTNER_ID", columnDefinition="INT")
	public Integer getLeaseBpartnerId() {
		return leaseBpartnerId;
	}

	public void setLeaseBpartnerId(Integer leaseBpartnerId) {
		this.leaseBpartnerId = leaseBpartnerId;
	}

	@Basic
	public String getLeaseterminationdate() {
		return leaseterminationdate;
	}

	public void setLeaseterminationdate(String leaseterminationdate) {
		this.leaseterminationdate = leaseterminationdate;
	}

	@Basic
	public BigDecimal getLifeuseunits() {
		return lifeuseunits;
	}

	public void setLifeuseunits(BigDecimal lifeuseunits) {
		this.lifeuseunits = lifeuseunits;
	}

	@Basic
	public String getLocationcomment() {
		return locationcomment;
	}

	public void setLocationcomment(String locationcomment) {
		this.locationcomment = locationcomment;
	}

	@Basic
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getMInoutlineId() {
		return mInoutlineId;
	}

	public void setMInoutlineId(Integer mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT")
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getNextmaintenanceuseunit() {
		return nextmaintenanceuseunit;
	}

	public void setNextmaintenanceuseunit(Integer nextmaintenanceuseunit) {
		this.nextmaintenanceuseunit = nextmaintenanceuseunit;
	}

	@Basic
	public String getNextmaintenencedate() {
		return nextmaintenencedate;
	}

	public void setNextmaintenencedate(String nextmaintenencedate) {
		this.nextmaintenencedate = nextmaintenencedate;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getNextmaintenenceunit() {
		return nextmaintenenceunit;
	}

	public void setNextmaintenenceunit(Integer nextmaintenenceunit) {
		this.nextmaintenenceunit = nextmaintenenceunit;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUselifemonths() {
		return uselifemonths;
	}

	public void setUselifemonths(Integer uselifemonths) {
		this.uselifemonths = uselifemonths;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUselifeyears() {
		return uselifeyears;
	}

	public void setUselifeyears(Integer uselifeyears) {
		this.uselifeyears = uselifeyears;
	}

	@Basic
	public BigDecimal getUseunits() {
		return useunits;
	}

	public void setUseunits(BigDecimal useunits) {
		this.useunits = useunits;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(length=20)
	public String getVersionno() {
		return versionno;
	}

	public void setVersionno(String versionno) {
		this.versionno = versionno;
	}
}