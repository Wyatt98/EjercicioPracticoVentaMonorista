package com.autozone.models;

import java.util.Date;

import com.autozone.enums.Category;

public class Grocery extends AbstractProduct {

	private double weight;
	private Date expirationDate;
	
	public Grocery(String name, double price, Category category, double weight, Date expirationDate) {
		super(name, price, category);
		this.weight = weight;
		this.expirationDate = expirationDate;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Producto electrónico: " + getName());
		System.out.println("Peso: " + getWeight());
		System.out.println("Price: $" + getPrice());
		System.out.println("Fecha de expiración: " + getExpirationDate());
		System.out.println("Categoría: " + getCategory());
		
	}
	
}
