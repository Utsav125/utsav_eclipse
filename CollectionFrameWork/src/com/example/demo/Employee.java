package com.example.demo;

public class Employee {
private int id;
private String name;
private String dept;
private float salary;
private Address address;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String dept, float salary, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
	this.address = address;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", address=" + address
			+ "]";
	 
}
 
}
