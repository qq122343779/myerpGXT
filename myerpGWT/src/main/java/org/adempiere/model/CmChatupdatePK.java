package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CmChatupdate
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CmChatupdatePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CmChatupdate"); }
		catch(Exception e) {}
	}

	public Integer adUserId;
	public Integer cmChatId;

	public CmChatupdatePK() {
	}

	public CmChatupdatePK(String str) {
		fromString(str);
	}

	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	public Integer getCmChatId() {
		return cmChatId;
	}

	public void setCmChatId(Integer cmChatId) {
		this.cmChatId = cmChatId;
	}

	public String toString() {
		return String.valueOf(adUserId)
			+ "::" + String.valueOf(cmChatId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((adUserId == null) ? 0 : adUserId.hashCode());
		rs = rs * 37 + ((cmChatId == null) ? 0 : cmChatId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CmChatupdatePK other = (CmChatupdatePK) obj;
		return ((adUserId == null && other.adUserId == null)
			|| (adUserId != null && adUserId.equals(other.adUserId)))
			&& ((cmChatId == null && other.cmChatId == null)
			|| (cmChatId != null && cmChatId.equals(other.cmChatId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adUserId = null;
		else
			adUserId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cmChatId = null;
		else
			cmChatId = new Integer(str);
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