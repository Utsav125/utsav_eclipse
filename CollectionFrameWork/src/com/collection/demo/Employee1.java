package com.collection.demo;

public class Employee1{
	  private int id;
	  private String name;
	  private String city;
	  private String dept;
	  private float salary;
	   Employee1(){
	  super();
	}
	   public Employee1(int id, String name, String city, String dept, float salary) {
		// TODO Auto-generated constructor stub

		   this.id=id;
		   this.name=name;
		   this.city=city;
		   this.dept=dept;
		   this.salary=salary;
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
		this.city =city;
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
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", city=" + city + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	}