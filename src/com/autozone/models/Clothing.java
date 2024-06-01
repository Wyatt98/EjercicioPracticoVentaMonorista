package com.autozone.models;

import com.autozone.enums.Category;

public class Clothing extends AbstractProduct {

	private String size;
	private String material;
	
	public Clothing(String name, double price, Category category, String size, String material) {
		super(name, price, category);
		this.size = size;
		this.material = material;
	}
	
	public String getSize() {
		return size;
	}
	
	public String getMaterial() {
		return material;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Producto electrónico: " + getName());
		System.out.println("Tamaño: " + getSize());
		System.out.println("Price: $" + getPrice());
		System.out.println("Material: " + getMaterial());
		System.out.println("Categoría: " + getCategory());
	}
	
}
