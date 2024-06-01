package com.autozone.models;

import com.autozone.enums.Category;

public class Electronic extends AbstractProduct {

	private String brand;
	private int warranty;
	
	public Electronic(String name, double price, Category category, String brand, int warranty) {
		super(name, price, category);
		this.brand = brand;
		this.warranty = warranty;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getWarranty() {
		return warranty;
	}

	@Override
	public void displayDetails() {
		System.out.println("Producto electrónico: " + getName());
		System.out.println("Marca: " + getBrand());
		System.out.println("Price: $" + getPrice());
		System.out.println("Garantía: " + getWarranty() + " meses");
		System.out.println("Categoría: " + getCategory());
	}

}
