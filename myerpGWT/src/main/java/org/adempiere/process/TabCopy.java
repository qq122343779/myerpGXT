package org.adempiere.process;

import java.util.List;

import org.adempiere.common.AdempiereUserError;
import org.adempiere.model.AdField;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;

public class TabCopy extends ServerProcess {
	private Integer	srcTabId;
	private Integer	desTabId;

	@Override
	protected void preProcess(ProcessContext ctx) {
		desTabId = (Integer) ctx.getRowMap().get("adTabId");
		srcTabId = (Integer) ctx.getParamMap().get("adTabId");
	}

	@Override
	protected String doIt() throws Exception {
		if (null == srcTabId)
			throw new AdempiereUserError("@NotFound@ (from->) @AD_Tab_ID@");
		if (null == desTabId)
			throw new AdempiereUserError("@NotFound@ (to<-) @AD_Tab_ID@");
		int count = 0;
		List<AdField> srcFields = POUtil.queryFieldsByTabId(context, srcTabId);
		for (AdField srcField : srcFields) {
			AdField descField = DTOUtil.copyField(srcField, desTabId);
			descField.setAdFieldId(null);
			if (POUtil.persist(context, descField)) {
				count++;
			} else {
				throw new AdempiereUserError("@Error@ @AD_Field_ID@");
			}
		}
		return "@Copied@ #" + count;
	}

}
