package com.basic.list;

import java.util.Comparator;

//run on TreesetDemo
public class Employee implements Comparator<Employee>{
private int id;
private String name;
private String city;
private float salary; 
public Employee() {
	super();
}
public Employee(int id, String name, String city, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.salary = salary;
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
}
@Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	if(o1.getId()>o2.getId())
	return -1;
	else 
		return 1;
}


}
