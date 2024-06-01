package com.autozone.interfaces;

import com.autozone.enums.Category;

public interface IProduct {

	double getPrice();
	String getName();
	Category getCategory();
	void displayDetails();
	
}
