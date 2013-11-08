package org.adempiere.model.util;

import javax.persistence.EntityManager;

import org.adempiere.model.common.AdEntityBase;
import org.adempiere.model.core.AdAttachment;

public class POUtil {

	public static <T extends AdEntityBase> T find(Class<T> clazz, int id) {
		EntityManager em = getEntityManager();
		return em.find(clazz, id);
	}

	public static <T extends AdEntityBase> T find(Class<T> clazz, long id) {
		EntityManager em = getEntityManager();
		return em.find(clazz, id);
	}

	private static EntityManager getEntityManager() {
		return null;
	}

	public static AdAttachment getAttachment(int formatTableId, long aD_PrintFormatItem_ID) {
		// TODO Auto-generated method stub
		return null;
	}
}