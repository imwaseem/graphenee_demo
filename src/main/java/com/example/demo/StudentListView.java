package com.example.demo;

import java.awt.MenuItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.MenuBar;

import io.graphenee.vaadin.AbstractDashboardPanel;
import io.graphenee.vaadin.TRView;

@SpringView(name = StudentListView.VIEW_NAME)
@Scope("prototype")
public class StudentListView extends AbstractDashboardPanel implements TRView {

	public static final String VIEW_NAME = "StudentsList";

	@Autowired
	StudentListPanel studentPanel;


	@Override
	protected String panelTitle() {
		return "Students";
	}

	@Override
	protected void postInitialize() {

		 studentPanel.build();
		addComponent( studentPanel);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		 studentPanel.refresh();
	}

	@Override
	protected boolean shouldShowHeader() {
		return true;
	}


}
