package com.autozone.models;

import com.autozone.enums.Category;
import com.autozone.interfaces.IProduct;

public abstract class AbstractProduct implements IProduct {

	private String name;
	private double price;
	private Category category;
	
	public AbstractProduct(String name, double price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract void displayDetails();
	
}
