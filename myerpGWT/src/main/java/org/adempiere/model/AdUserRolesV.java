package org.adempiere.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.common.ADEntityBase;



/**
 * The persistent class for the ad_user_roles_v database table.
 * 
 */
@Entity
@Table(name="ad_user_roles_v")
public class AdUserRolesV extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String rolename;

	public AdUserRolesV() {
	}


	@Id
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}