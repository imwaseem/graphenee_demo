
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Image;

import io.graphenee.core.exception.AuthenticationFailedException;
import io.graphenee.vaadin.AbstractDashboardSetup;
import io.graphenee.vaadin.AbstractDashboardUI;
import io.graphenee.vaadin.TRMenuItem;
import io.graphenee.vaadin.TRSimpleMenuItem;
import io.graphenee.vaadin.domain.DashboardUser;
import io.graphenee.vaadin.domain.MockUser;
import io.graphenee.vaadin.event.DashboardEvent.UserLoginRequestedEvent;

@SpringUI
@Theme("graphenee")
@Push(PushMode.MANUAL)
public class MainUI extends AbstractDashboardUI {

	@Autowired
	SpringViewProvider viewProvider;

	@Override
	protected AbstractDashboardSetup dashboardSetup() {
		return new AbstractDashboardSetup() {

			@Override
			public void registerViewProviders(Navigator navigator) {
				navigator.addProvider(viewProvider);
			}

			@Override
			protected List<TRMenuItem> profileMenuItems() {
				return new ArrayList<>();
			}

			@Override
			protected List<TRMenuItem> menuItems() {
				List<TRMenuItem> menus = new ArrayList<>();
				menus.add(TRSimpleMenuItem.createMenuItemForView(HomeView.VIEW_NAME, "Home", FontAwesome.HOME));
				TRSimpleMenuItem dmMenuItem = TRSimpleMenuItem.createMenuItem("Data Maintenance", FontAwesome.WRENCH);
				dmMenuItem.addChild(TRSimpleMenuItem.createMenuItemForView(StudentListView.VIEW_NAME, "StudentsList", FontAwesome.SERVER));
				dmMenuItem.addChild(TRSimpleMenuItem.createMenuItemForView(HomeView.VIEW_NAME, "Localization", FontAwesome.GLOBE));
				dmMenuItem.addChild(TRSimpleMenuItem.createMenuItemForView(HomeView.VIEW_NAME, "Security", FontAwesome.USER_SECRET));
				menus.add(dmMenuItem);

				return menus;
			}

			@Override
			public String dashboardViewName() {
				return "Login";
			}

			@Override
			public DashboardUser authenticate(UserLoginRequestedEvent event) throws AuthenticationFailedException {
				return new MockUser();
			}

			@Override
			public String applicationTitle() {
				return "Fleet Management System";
			}

			@Override
			public Image applicationLogo() {
				return null;
			}
		};
	}

}
