package com.arraylist.vijaybhai;

public class Studentstu {
private int id;
private String name;
private int cgp;

public Studentstu() {
	super();
	// TODO Auto-generated constructor stub
}

public Studentstu(int id, String name, int cgp) {
	super();
	this.id = id;
	this.name = name;
	this.cgp = cgp;
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

public int getCgp() {
	return cgp;
}

public void setCgp(int cgp) {
	this.cgp = cgp;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", cgp=" + cgp + "]";
}

}
