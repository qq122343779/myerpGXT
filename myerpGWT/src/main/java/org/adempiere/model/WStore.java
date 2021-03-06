package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="w_store")
public class WStore extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cPaymenttermId;
	private String created;
	private Integer createdby;
	private String description;
	private String emailfooter;
	private String emailheader;
	private String help;
	private Boolean isactive;
	private Boolean isdefault;
	private Boolean ismenuassets;
	private Boolean ismenucontact;
	private Boolean ismenuinterests;
	private Boolean ismenuinvoices;
	private Boolean ismenuorders;
	private Boolean ismenupayments;
	private Boolean ismenuregistrations;
	private Boolean ismenurequests;
	private Boolean ismenurfqs;
	private Boolean ismenushipments;
	private Integer mPricelistId;
	private Integer mWarehouseId;
	private String name;
	private Integer salesrepId;
	private String stylesheet;
	private String updated;
	private Integer updatedby;
	private String url;
	private Integer wStoreId;
	private String webcontext;
	private String webinfo;
	private String weborderemail;
	private String webparam1;
	private String webparam2;
	private String webparam3;
	private String webparam4;
	private String webparam5;
	private String webparam6;
	private String wstoreemail;
	private String wstoreuser;
	private String wstoreuserpw;

	public WStore() {
	}

	public WStore(Integer wStoreId) {
		this.wStoreId = wStoreId;
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
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT")
	public Integer getCPaymenttermId() {
		return cPaymenttermId;
	}

	public void setCPaymenttermId(Integer cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
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
	@Column(length=2000)
	public String getEmailfooter() {
		return emailfooter;
	}

	public void setEmailfooter(String emailfooter) {
		this.emailfooter = emailfooter;
	}

	@Basic
	@Column(length=2000)
	public String getEmailheader() {
		return emailheader;
	}

	public void setEmailheader(String emailheader) {
		this.emailheader = emailheader;
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
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenuassets() {
		return ismenuassets;
	}

	public void setIsmenuassets(Boolean ismenuassets) {
		this.ismenuassets = ismenuassets;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenucontact() {
		return ismenucontact;
	}

	public void setIsmenucontact(Boolean ismenucontact) {
		this.ismenucontact = ismenucontact;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenuinterests() {
		return ismenuinterests;
	}

	public void setIsmenuinterests(Boolean ismenuinterests) {
		this.ismenuinterests = ismenuinterests;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenuinvoices() {
		return ismenuinvoices;
	}

	public void setIsmenuinvoices(Boolean ismenuinvoices) {
		this.ismenuinvoices = ismenuinvoices;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenuorders() {
		return ismenuorders;
	}

	public void setIsmenuorders(Boolean ismenuorders) {
		this.ismenuorders = ismenuorders;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenupayments() {
		return ismenupayments;
	}

	public void setIsmenupayments(Boolean ismenupayments) {
		this.ismenupayments = ismenupayments;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenuregistrations() {
		return ismenuregistrations;
	}

	public void setIsmenuregistrations(Boolean ismenuregistrations) {
		this.ismenuregistrations = ismenuregistrations;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenurequests() {
		return ismenurequests;
	}

	public void setIsmenurequests(Boolean ismenurequests) {
		this.ismenurequests = ismenurequests;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenurfqs() {
		return ismenurfqs;
	}

	public void setIsmenurfqs(Boolean ismenurfqs) {
		this.ismenurfqs = ismenurfqs;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsmenushipments() {
		return ismenushipments;
	}

	public void setIsmenushipments(Boolean ismenushipments) {
		this.ismenushipments = ismenushipments;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT", nullable=false)
	public Integer getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(Integer mPricelistId) {
		this.mPricelistId = mPricelistId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
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
	@Column(name="SALESREP_ID", columnDefinition="INT", nullable=false)
	public Integer getSalesrepId() {
		return salesrepId;
	}

	public void setSalesrepId(Integer salesrepId) {
		this.salesrepId = salesrepId;
	}

	@Basic
	@Column(length=60)
	public String getStylesheet() {
		return stylesheet;
	}

	public void setStylesheet(String stylesheet) {
		this.stylesheet = stylesheet;
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
	@Column(nullable=false, length=120)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Id
	@Column(name="W_STORE_ID", columnDefinition="INT")
	public Integer getWStoreId() {
		return wStoreId;
	}

	public void setWStoreId(Integer wStoreId) {
		this.wStoreId = wStoreId;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getWebcontext() {
		return webcontext;
	}

	public void setWebcontext(String webcontext) {
		this.webcontext = webcontext;
	}

	@Basic
	@Column(length=2000)
	public String getWebinfo() {
		return webinfo;
	}

	public void setWebinfo(String webinfo) {
		this.webinfo = webinfo;
	}

	@Basic
	@Column(length=60)
	public String getWeborderemail() {
		return weborderemail;
	}

	public void setWeborderemail(String weborderemail) {
		this.weborderemail = weborderemail;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam1() {
		return webparam1;
	}

	public void setWebparam1(String webparam1) {
		this.webparam1 = webparam1;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam2() {
		return webparam2;
	}

	public void setWebparam2(String webparam2) {
		this.webparam2 = webparam2;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam3() {
		return webparam3;
	}

	public void setWebparam3(String webparam3) {
		this.webparam3 = webparam3;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam4() {
		return webparam4;
	}

	public void setWebparam4(String webparam4) {
		this.webparam4 = webparam4;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam5() {
		return webparam5;
	}

	public void setWebparam5(String webparam5) {
		this.webparam5 = webparam5;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam6() {
		return webparam6;
	}

	public void setWebparam6(String webparam6) {
		this.webparam6 = webparam6;
	}

	@Basic
	@Column(length=60)
	public String getWstoreemail() {
		return wstoreemail;
	}

	public void setWstoreemail(String wstoreemail) {
		this.wstoreemail = wstoreemail;
	}

	@Basic
	@Column(length=60)
	public String getWstoreuser() {
		return wstoreuser;
	}

	public void setWstoreuser(String wstoreuser) {
		this.wstoreuser = wstoreuser;
	}

	@Basic
	@Column(length=20)
	public String getWstoreuserpw() {
		return wstoreuserpw;
	}

	public void setWstoreuserpw(String wstoreuserpw) {
		this.wstoreuserpw = wstoreuserpw;
	}
}