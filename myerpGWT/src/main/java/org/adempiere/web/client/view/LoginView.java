package org.adempiere.web.client.view;

import org.adempiere.common.LookupValue;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.presenter.interfaces.ILoginView;
import org.adempiere.web.client.presenter.interfaces.ILoginView.ILoginPresenter;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.util.CommonUtil;
import org.adempiere.web.client.widget.ConfirmToolBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;

@Singleton
public class LoginView extends BaseReverseView<ILoginPresenter> implements ILoginView, ConfirmToolListener {

	private static LoginViewUiBinder	uiBinder	= GWT.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField(provided = true)
	ComboBox<LookupValue>	roleCombo, orgCombo, clientCombo;
	@UiField(provided = true)
	ComboBox<LookupValue>	warehouseCombo, printerCombo, langCombo;
	@UiField(provided = true)
	Images					images	= ResourcesFactory.createImages();
	@UiField
	ConfirmToolBar			toolBar;
	@UiField
	TextField				userId;

	public LoginView() {
		initWidgets();
	}

	private void initWidgets() {
		LabelProvider<LookupValue> labelProvider = CommonUtil.createLabelProvider();
		ListStore<LookupValue> roleStore = CommonUtil.createDataSource();
		roleCombo = createComboBox(roleStore, labelProvider);

		ListStore<LookupValue> orgStore = CommonUtil.createDataSource();
		orgCombo = createComboBox(orgStore, labelProvider);

		ListStore<LookupValue> langStore = CommonUtil.createDataSource();
		langCombo = createComboBox(langStore, labelProvider);

		ListStore<LookupValue> clientStore = CommonUtil.createDataSource();
		clientCombo = createComboBox(clientStore, labelProvider);

		ListStore<LookupValue> warehouseStore = CommonUtil.createDataSource();
		warehouseCombo = createComboBox(warehouseStore, labelProvider);

		ListStore<LookupValue> printerStore = CommonUtil.createDataSource();
		printerCombo = createComboBox(printerStore, labelProvider);
	}

	<T> ComboBox<T> createComboBox(ListStore<T> listStore, LabelProvider<T> labelProvider) {
		return new ComboBox<T>(listStore, labelProvider);
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			toolBar.setToolbarListener(this);
		}
		return widget;
	}

	@Override
	public void onHelp() {
		
	}

	@Override
	public void onOK() {
		BasePresenter<ILoginView, MyerpEventBus> presenter = getBasePresenter();
		presenter.getEventBus().goApplication();
	}

	@Override
	public void onCancel() {
		
	}

}
