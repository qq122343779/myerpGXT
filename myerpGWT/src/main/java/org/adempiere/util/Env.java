package org.adempiere.util;

public final class Env {

	public static String getAdempiereHome() {
		// TODO Auto-generated method stub
		return "d:/adempiere_home/";
	}

	public static String getReportPath(String path) {
		return getAdempiereHome() + "reports/" + path;
	}

}