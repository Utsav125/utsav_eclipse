package com.example.demo;
public class Student {
private int id;
private String name;
private String city;
private String dept;
private String state;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int id, String name, String city, String dept, String state) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.dept = dept;
	this.state = state;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", dept=" + dept + ", state=" + state + "]";
}
 
}