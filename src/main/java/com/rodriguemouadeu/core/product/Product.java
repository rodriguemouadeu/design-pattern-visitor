package com.rodriguemouadeu.core.product;

import com.rodriguemouadeu.core.cart.ShoppingCart;

public interface Product {

	float accept(ShoppingCart cart);
	
}
