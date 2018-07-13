package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="students")

public class Student {

	@Id
	@Column(name = "oid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "phone")
	private String phone;

	 
	public Student(){
		System.out.println("in Student model");
		
	}
	
	
	public Student(String name ,int age,String phone ) {
		
		
		this.name = name;
		this.phone = phone;
		this.age = age;
	
	}
	public Student(int id ,String name ,int age,String phone ) {
		
		this.oid =id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}
	
	
}
