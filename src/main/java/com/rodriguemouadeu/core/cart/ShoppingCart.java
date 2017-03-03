package com.rodriguemouadeu.core.cart;

import com.rodriguemouadeu.core.product.Book;
import com.rodriguemouadeu.core.product.Fruit;

public interface ShoppingCart {
	
	float visit(Book book);
	
	float visit(Fruit fruit);
}
