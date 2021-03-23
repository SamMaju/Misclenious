package com.factory;

public abstract class Product {

	public int price;
	public abstract int getPrice();
	 
	
	public int calculatePrice(int quantity, int price ) {
		  return price*quantity;
	  }
} 
