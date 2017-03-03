package com.rodriguemouadeu.core.product;

import com.rodriguemouadeu.core.cart.ShoppingCart;

public class Book implements Product {

	private String title;
	private float price = 18.9F;
	
	public Book(){
	}

	public Book(String title, float price){
		this.title = title;
		this.price = price;
	}
	
	public String getTitle(){
		return title;
	}
	
	public float getPrice() {
		return price;
	}

	public float accept(ShoppingCart cart) {
		return cart.visit(this);
	}

}
