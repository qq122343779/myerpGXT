package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CWithholdingAcct
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CWithholdingAcctPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CWithholdingAcct"); }
		catch(Exception e) {}
	}

	public Integer cAcctschemaId;
	public Integer cWithholdingId;

	public CWithholdingAcctPK() {
	}

	public CWithholdingAcctPK(String str) {
		fromString(str);
	}

	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	public Integer getCWithholdingId() {
		return cWithholdingId;
	}

	public void setCWithholdingId(Integer cWithholdingId) {
		this.cWithholdingId = cWithholdingId;
	}

	public String toString() {
		return String.valueOf(cAcctschemaId)
			+ "::" + String.valueOf(cWithholdingId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctschemaId == null) ? 0 : cAcctschemaId.hashCode());
		rs = rs * 37 + ((cWithholdingId == null) ? 0 : cWithholdingId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CWithholdingAcctPK other = (CWithholdingAcctPK) obj;
		return ((cAcctschemaId == null && other.cAcctschemaId == null)
			|| (cAcctschemaId != null && cAcctschemaId.equals(other.cAcctschemaId)))
			&& ((cWithholdingId == null && other.cWithholdingId == null)
			|| (cWithholdingId != null && cWithholdingId.equals(other.cWithholdingId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctschemaId = null;
		else
			cAcctschemaId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cWithholdingId = null;
		else
			cWithholdingId = new Integer(str);
	}

	protected static class Tokenizer {
		private final String str;
		private int last;

		public Tokenizer (String str) {
			this.str = str;
		}

		public String nextToken () {
			int next = str.indexOf("::", last);
			String part;
			if(next == -1) {
				part = str.substring(last);
				last = str.length();
			} else {
				part = str.substring(last, next);
				last = next + 2;
			}
			return part;
		}
	}
}