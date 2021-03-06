package org.adempiere.web.client;

import org.adempiere.web.client.apps.ADTabPanel;
import org.adempiere.web.client.model.ADWindowModel;

import com.google.gwt.inject.client.AbstractGinModule;

public class MyerpModule extends AbstractGinModule {
	
	@Override
	protected void configure() {
		bind(ADWindowModel.class);
		bind(ADTabPanel.class);
	}
}
