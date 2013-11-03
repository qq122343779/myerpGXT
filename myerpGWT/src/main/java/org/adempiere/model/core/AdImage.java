package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_image database table.
 * 
 */
@Entity
@Table(name="ad_image")
public class AdImage extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adImageId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private byte[] binarydata;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String imageurl;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdImage() {
	}


	@Id
	@Column(name="AD_IMAGE_ID")
	public long getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(long adImageId) {
		this.adImageId = adImageId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Lob
	public byte[] getBinarydata() {
		return this.binarydata;
	}

	public void setBinarydata(byte[] binarydata) {
		this.binarydata = binarydata;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}


	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}