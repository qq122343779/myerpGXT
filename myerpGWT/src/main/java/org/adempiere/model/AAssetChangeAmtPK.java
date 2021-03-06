package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AAssetChangeAmt
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AAssetChangeAmtPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AAssetChangeAmt"); }
		catch(Exception e) {}
	}

	public Integer aAssetChangeId;
	public Integer cAcctschemaId;

	public AAssetChangeAmtPK() {
	}

	public AAssetChangeAmtPK(String str) {
		fromString(str);
	}

	public Integer getAAssetChangeId() {
		return aAssetChangeId;
	}

	public void setAAssetChangeId(Integer aAssetChangeId) {
		this.aAssetChangeId = aAssetChangeId;
	}

	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	public String toString() {
		return String.valueOf(aAssetChangeId)
			+ "::" + String.valueOf(cAcctschemaId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aAssetChangeId == null) ? 0 : aAssetChangeId.hashCode());
		rs = rs * 37 + ((cAcctschemaId == null) ? 0 : cAcctschemaId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AAssetChangeAmtPK other = (AAssetChangeAmtPK) obj;
		return ((aAssetChangeId == null && other.aAssetChangeId == null)
			|| (aAssetChangeId != null && aAssetChangeId.equals(other.aAssetChangeId)))
			&& ((cAcctschemaId == null && other.cAcctschemaId == null)
			|| (cAcctschemaId != null && cAcctschemaId.equals(other.cAcctschemaId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aAssetChangeId = null;
		else
			aAssetChangeId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctschemaId = null;
		else
			cAcctschemaId = new Integer(str);
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