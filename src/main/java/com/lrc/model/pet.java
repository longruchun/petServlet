package com.lrc.model;

public class pet {
   int id;
   String name;
   int  price;
   String photo;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public pet(int id, String name, int price, String photo) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.photo = photo;
}
public pet() {
	super();
	// TODO Auto-generated constructor stub
}
   


}
