package com.example.demo;

public class Address {
private int flatNo;
private String city;
private String tashshil;
private String dist;
private int pincode;
private String state;
private String country;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int flatNo, String city, String tashshil, String dist, int pincode, String state, String country) {
	super();
	this.flatNo = flatNo;
	this.city = city;
	this.tashshil = tashshil;
	this.dist = dist;
	this.pincode = pincode;
	this.state = state;
	this.country = country;
}

public int getFlatNo() {
	return flatNo;
}
public void setFlatNo(int flatNo) {
	this.flatNo = flatNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getTashshil() {
	return tashshil;
}
public void setTashshil(String tashshil) {
	this.tashshil = tashshil;
}
public String getDist() {
	return dist;
}
public void setDist(String dist) {
	this.dist = dist;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [flatNo=" + flatNo + ", city=" + city + ", tashshil=" + tashshil + ", dist=" + dist + ", pincode="
			+ pincode + ", state=" + state + ", country=" + country + "]";
}


}
