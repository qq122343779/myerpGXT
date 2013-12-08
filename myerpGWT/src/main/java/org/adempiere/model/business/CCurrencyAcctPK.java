package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_currency_acct database table.
 * 
 */
@Embeddable
public class CCurrencyAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private long cCurrencyId;

	public CCurrencyAcctPK() {
	}

	@Column(name="C_ACCTSCHEMA_ID", insertable=false, updatable=false)
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}
	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Column(name="C_CURRENCY_ID", insertable=false, updatable=false)
	public long getCCurrencyId() {
		return this.cCurrencyId;
	}
	public void setCCurrencyId(long cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CCurrencyAcctPK)) {
			return false;
		}
		CCurrencyAcctPK castOther = (CCurrencyAcctPK)other;
		return 
			(this.cAcctschemaId == castOther.cAcctschemaId)
			&& (this.cCurrencyId == castOther.cCurrencyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		hash = hash * prime + ((int) (this.cCurrencyId ^ (this.cCurrencyId >>> 32)));
		
		return hash;
	}
}