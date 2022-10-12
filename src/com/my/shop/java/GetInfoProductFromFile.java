package com.my.shop.java;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetInfoProductFromFile implements Serializable {

	private int id;
	private String brand;
	private String name;
	private String model;
	private String type;
	private float rating;
	private String color;
	private String isAvailable;
	private float price;

	static final String COMPANY_NAME = "TechMaster"; 
	static final String COMPANY_TELEPHONE = "+447712345678";
	static final String COMPANY_EMAIL = "TechMasterUK@IBM.com";
	
	public GetInfoProductFromFile() {
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String isAvailable() {
		return isAvailable;
	}


	public void setAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Item: [Id: " + id + ", Brand: " + brand + ", Name: " + name + ", Model: " + model
				+ ", Type: " + type + ", Rating: " + rating +"/10" + ", Color: " + color + ", Available: " + isAvailable + ", Price: "+ price +"$" + "]";
	}


	

	static void companyInfo() {
    	System.out.println("Company Name : " + COMPANY_NAME);
    	System.out.println("Company telephone number is : " + COMPANY_TELEPHONE);
    	System.out.println("Company Contact Email : " + COMPANY_EMAIL);
	}


	

	

	
}
