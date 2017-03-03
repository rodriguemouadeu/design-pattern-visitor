package com.rodriguemouadeu.core.product;

import com.rodriguemouadeu.core.cart.ShoppingCart;

public class Fruit implements Product {

	private String name;
	private float price = 9.99f;
	private float weigth = 4.5f;
	
	public Fruit(){
	}

	public Fruit(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	public Fruit(String name, float price, float weigth){
		this.name = name;
		this.price = price;
		this.weigth = weigth;
	}

	public String getName(){
		return name;
	}
	
	public float getPrice() {
		return price;
	}

	public float accept(ShoppingCart cart) {
		return cart.visit(this);
	}

	public float getWeigth() {
		return weigth;
	}

}
