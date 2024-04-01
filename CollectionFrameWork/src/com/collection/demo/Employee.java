package com.collection.demo;

public class Employee {
  private int id;
  private String name;
  private String city;
  private String dept;
  private float salaray;
  
  

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setCity(String city) {
	this.city = city;
}
public void setDept(String dept) {
	this.dept = dept;
}
public void setSalaray(float salaray) {
	this.salaray = salaray;
}
@Override
public String toString() {
	return "id=" + id + "\nname=" + name + "\ncity=" + city + "\ndept=" + dept + "\nsalaray=" + salaray;
}

}