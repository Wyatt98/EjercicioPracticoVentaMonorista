package com.autozone.models;

import java.util.ArrayList;
import java.util.List;

import com.autozone.interfaces.IProduct;

public class RetailStore {

	private List<IProduct> productList = new ArrayList<IProduct>();
	
	public void addProduct(IProduct product) {
		productList.add(product);
	}
	
	public void displayAllProducts() {
		if(productList.isEmpty()) {
			System.out.println("No hay productos");
		} else {
			for (IProduct product : productList) {
				product.displayDetails();
				System.out.println("------------------------");
			}
		}
	}
	
	public void searchProduct(String name) {
		boolean found = false;
		
		for (IProduct product : productList) {
			if(product.getName().equalsIgnoreCase(name)) {
				product.displayDetails();
				found = true;
				continue;
			}
		}
		
		if(!found) {
			System.out.println("Producto no encontrado");
		}
	}
	
	public void removeProduct(String name) {
		IProduct productToRemove = null;
		
		for (IProduct product : productList) {
			if(product.getName().equalsIgnoreCase(name)) {
				productToRemove = product;
				break;
			}
		}
		
		if(productToRemove != null) {
			productList.remove(productToRemove);
			System.out.println("Producto eliminado");
		} else {
			System.out.println("Producto no encontrado");
		}
	}
	
}
