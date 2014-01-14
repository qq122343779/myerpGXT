package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MRelatedproduct
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MRelatedproductPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MRelatedproduct"); }
		catch(Exception e) {}
	}

	public Integer mProductId;
	public Integer relatedproductId;
	public String relatedproducttype;

	public MRelatedproductPK() {
	}

	public MRelatedproductPK(String str) {
		fromString(str);
	}

	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	public Integer getRelatedproductId() {
		return relatedproductId;
	}

	public void setRelatedproductId(Integer relatedproductId) {
		this.relatedproductId = relatedproductId;
	}

	public String getRelatedproducttype() {
		return relatedproducttype;
	}

	public void setRelatedproducttype(String relatedproducttype) {
		this.relatedproducttype = relatedproducttype;
	}

	public String toString() {
		return String.valueOf(mProductId)
			+ "::" + String.valueOf(relatedproductId)
			+ "::" + relatedproducttype;
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mProductId == null) ? 0 : mProductId.hashCode());
		rs = rs * 37 + ((relatedproductId == null) ? 0 : relatedproductId.hashCode());
		rs = rs * 37 + ((relatedproducttype == null) ? 0 : relatedproducttype.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MRelatedproductPK other = (MRelatedproductPK) obj;
		return ((mProductId == null && other.mProductId == null)
			|| (mProductId != null && mProductId.equals(other.mProductId)))
			&& ((relatedproductId == null && other.relatedproductId == null)
			|| (relatedproductId != null && relatedproductId.equals(other.relatedproductId)))
			&& ((relatedproducttype == null && other.relatedproducttype == null)
			|| (relatedproducttype != null && relatedproducttype.equals(other.relatedproducttype)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mProductId = null;
		else
			mProductId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			relatedproductId = null;
		else
			relatedproductId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			relatedproducttype = null;
		else
			relatedproducttype = str;
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