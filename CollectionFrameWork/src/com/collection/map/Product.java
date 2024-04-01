package com.collection.map;

public class Product {
private int id;
private String name;
private String desc;
private float price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, String desc, float price) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
	this.price = price;
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
}


}
