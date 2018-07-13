package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

import io.graphenee.core.model.api.GxDataService;
import io.graphenee.core.vaadin.GxCountryListPanel;
import io.graphenee.vaadin.AbstractDashboardPanel;
import io.graphenee.vaadin.TRView;

//@SpringView(name = "Login")
@SpringView(name = HomeView.VIEW_NAME)
public class HomeView extends AbstractDashboardPanel implements TRView {

	public static final String VIEW_NAME = "Login";

	@Autowired
	GxCountryListPanel panel;

	@Override
	public void enter(ViewChangeEvent event) {
		panel.refresh();
	}

	@Override
	protected String panelTitle() {
		return "StudentsList";
	}

	@Override
	protected void postInitialize() {
		panel.build();
		addComponent(panel);
	}

	@Override
	protected boolean shouldShowHeader() {
		return true;
	}

}
