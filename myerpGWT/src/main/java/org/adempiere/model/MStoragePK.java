package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MStorage
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MStoragePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MStorage"); }
		catch(Exception e) {}
	}

	public Integer mAttributesetinstanceId;
	public Integer mLocatorId;
	public Integer mProductId;

	public MStoragePK() {
	}

	public MStoragePK(String str) {
		fromString(str);
	}

	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	public String toString() {
		return String.valueOf(mAttributesetinstanceId)
			+ "::" + String.valueOf(mLocatorId)
			+ "::" + String.valueOf(mProductId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mAttributesetinstanceId == null) ? 0 : mAttributesetinstanceId.hashCode());
		rs = rs * 37 + ((mLocatorId == null) ? 0 : mLocatorId.hashCode());
		rs = rs * 37 + ((mProductId == null) ? 0 : mProductId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MStoragePK other = (MStoragePK) obj;
		return ((mAttributesetinstanceId == null && other.mAttributesetinstanceId == null)
			|| (mAttributesetinstanceId != null && mAttributesetinstanceId.equals(other.mAttributesetinstanceId)))
			&& ((mLocatorId == null && other.mLocatorId == null)
			|| (mLocatorId != null && mLocatorId.equals(other.mLocatorId)))
			&& ((mProductId == null && other.mProductId == null)
			|| (mProductId != null && mProductId.equals(other.mProductId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mAttributesetinstanceId = null;
		else
			mAttributesetinstanceId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mLocatorId = null;
		else
			mLocatorId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mProductId = null;
		else
			mProductId = new Integer(str);
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