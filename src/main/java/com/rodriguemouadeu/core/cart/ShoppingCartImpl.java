package com.rodriguemouadeu.core.cart;

import com.rodriguemouadeu.core.product.Book;
import com.rodriguemouadeu.core.product.Fruit;

public class ShoppingCartImpl implements ShoppingCart {

	public float visit(Book book) {
		return book.getPrice();
	}
	
	public float visit(Fruit fruit) {
		return fruit.getPrice()*fruit.getWeigth();
	}

}
