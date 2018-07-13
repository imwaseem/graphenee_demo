//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.vaadin.viritin.fields.MCheckBox;
//import org.vaadin.viritin.fields.MTextField;
//
//import com.vaadin.data.fieldgroup.PropertyId;
//import com.vaadin.data.util.BeanItemContainer;
//import com.vaadin.data.util.converter.Converter;
//import com.vaadin.spring.annotation.SpringComponent;
//import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
//import com.vaadin.ui.FormLayout;
//import com.vaadin.ui.TwinColSelect;
//
//import io.graphenee.core.model.api.GxDataService;
//import io.graphenee.core.model.bean.GxCityBean;
//import io.graphenee.core.model.bean.GxCountryBean;
//import io.graphenee.core.model.bean.GxStateBean;
//import io.graphenee.vaadin.TRAbstractForm;
//import io.graphenee.vaadin.converter.SetToCollectionConverter;
//
//@SuppressWarnings("serial")
//@SpringComponent
//@Scope("prototype")
//public class StudentForm extends TRAbstractForm<Student> {
//
//	@Autowired
//	//GxDataService gxDataService;
//
//	//@PropertyId("oid")
//	MTextField oid;
//	//@PropertyId("name")
//	MTextField name;
//
//	//@PropertyId("age")
//	MTextField age;
//	//@PropertyId("phone")
//	MTextField phone;
//
//
//	//@PropertyId("isActive")
//	MCheckBox isActive;
//
//
//	@Override
//	protected void addFieldsToForm(FormLayout form) {
//		oid = new MTextField("Student Id").withRequired(true);
//		name = new MTextField("Name");
//		age = new MTextField("age").withRequired(true);
//		phone = new MTextField("Phone").withRequired(true);
//		isActive = new MCheckBox("Is Active?");
//
////		citiesTwinCol = new TwinColSelect("Cities");
////		BeanItemContainer<GxCityBean> cityBeanFaultContainer = new BeanItemContainer<>(GxCityBean.class);
////		cityBeanFaultContainer.addAll(gxDataService.findCity());
////		citiesTwinCol.setContainerDataSource(cityBeanFaultContainer);
////		citiesTwinCol.setItemCaptionMode(ItemCaptionMQ?A/Aode.PROPERTY);
////		citiesTwinCol.setItemCaptionPropertyId("cityName");
////		citiesTwinCol.setConverter((Converter) new SetToCollectionConverter());
////		citiesTwinCol.setWidth("100%");
////
////		statesTwinCol = new TwinColSelect("States");
////		BeanItemContainer<GxStateBean> stateBeanFaultContainer = new BeanItemContainer<>(GxStateBean.class);
////		stateBeanFaultContainer.addAll(gxDataService.findState());
////		statesTwinCol.setContainerDataSource(stateBeanFaultContainer);
////		statesTwinCol.setItemCaptionMode(ItemCaptionMode.PROPERTY);
////		statesTwinCol.setItemCaptionPropertyId("stateName");
////		statesTwinCol.setConverter((Converter) new SetToCollectionConverter());
////		statesTwinCol.setWidth("100%");
//
//		form.addComponents(oid, name, age, phone, isActive);
//	}
//
//	@Override
//	protected boolean eagerValidationEnabled() {
//		return true;
//	}
//
//	@Override
//	protected String formTitle() {
//		return "Student";
//	}
//
//	@Override
//	protected String popupHeight() {
//		return "600px";
//	}
//
//	@Override
//	protected String popupWidth() {
//		return "600px";
//	}
//
//}