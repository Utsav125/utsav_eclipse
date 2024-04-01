package com.basic.linkedlist;

public class Address {
private  int flatno;
private  String area;
private  String city;
private  String state;


public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int flatno, String area, String city, String state) {
	super();
	this.flatno = flatno;
	this.area = area;
	this.city = city;
	this.state = state;
}
public int getFlatno() {
	return flatno;
}
public void setFlatno(int flatno) {
	this.flatno = flatno;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [flatno=" + flatno + ", area=" + area + ", city=" + city + ", state=" + state + "]";
}

}
