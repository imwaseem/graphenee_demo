package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;


import com.vaadin.spring.annotation.SpringComponent;

import io.graphenee.core.vaadin.GxCountryForm;
import io.graphenee.vaadin.AbstractEntityListPanel;
import io.graphenee.vaadin.TRAbstractForm;
@SuppressWarnings("serial")
@SpringComponent
@Scope("prototype")
public class StudentListPanel  extends AbstractEntityListPanel<Student> {

	@Autowired
	StudentRepository dataService;

	@Autowired
	GxCountryForm editorForm;

	public StudentListPanel() {
		super(Student.class);
	}

	@Override
	protected boolean onSaveEntity(Student entity) {
		dataService.save(entity);
		return true;
	}

	@Override
	protected boolean onDeleteEntity(Student entity) {
		dataService.delete(entity);
		return true;
	}

	@Override
	protected String panelCaption() {
		return "Countries";
	}

	@Override
	protected List<Student> fetchEntities() {
		return dataService.findAll();
	}

	@Override
	protected String[] visibleProperties() {
		return new String[] { "oid", "name", "age","phone" };
	}

	@Override
	protected TRAbstractForm<Student> editorForm() {
		return null;
	}

}
