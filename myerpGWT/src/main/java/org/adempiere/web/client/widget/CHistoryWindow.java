package org.adempiere.web.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

public class CHistoryWindow implements IsWidget {

	private static HWindowUiBinder	uiBinder	= GWT.create(HWindowUiBinder.class);

	interface HWindowUiBinder extends UiBinder<Widget, CHistoryWindow> {
	}

	public static enum History {
		Day(0), Week(1), Month(2), Year(3), All(4);

		@SuppressWarnings("unused")
		private int	value;

		History(int value) {
			this.value = value;
		}

		public static History fromInteger(int value) {
			switch (value) {
			case 0:
				return Day;
			case 1:
				return Week;
			case 2:
				return Month;
			case 3:
				return Year;
			case 4:
				return All;
			default:
				return All;
			}
		}
	}

	@UiField
	Window			window;
	@UiField
	TextButton		dayButton;
	@UiField
	TextButton		weekButton;
	@UiField
	TextButton		monthButton;
	@UiField
	TextButton		yearButton;
	@UiField
	TextButton		allButton;
	private History	history;
	private Widget	widget;
	
	public CHistoryWindow() {
		asWidget();
	}

	public void showDialog() {
		this.window.show();
	}

	public HandlerRegistration addHideHandler(HideHandler handler) {
		return window.addHandler(handler, HideEvent.getType());
	}

	@UiHandler({ "dayButton", "weekButton", "monthButton", "yearButton", "allButton" })
	public void onButtonSelected(SelectEvent event) {
		TextButton sourceButton = (TextButton) event.getSource();
		int index = window.getButtonBar().getWidgetIndex(sourceButton);
		history = History.fromInteger(index);
		window.hide();
	}

	public History getHistory() {
		return history;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

}
