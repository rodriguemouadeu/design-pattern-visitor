package com.rodriguemouadeu;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rodriguemouadeu.core.cart.ShoppingCartImpl;
import com.rodriguemouadeu.core.product.Book;
import com.rodriguemouadeu.core.product.Fruit;
import com.rodriguemouadeu.core.product.Product;

public class ShoppingCartVisitorImplTest {

	private com.rodriguemouadeu.core.cart.ShoppingCartImpl shoppingCart;
	
	@Before
	public void setUp() throws Exception {
		shoppingCart = new ShoppingCartImpl();
	}

	@After
	public void tearDown() throws Exception {
		shoppingCart = null;
	}

	@Test
	public void givenABookWhenCheckingOutThenOK(){
		Product product = new Book("maid of the mist", 100);
		
		float total = 0.0f;
		total += product.accept(shoppingCart);
		
		assertThat(total).isEqualTo(100f);
	}
	
	@Test
	public void givenABananaWhenCheckingOutThenOK(){
		Product product = new Fruit("Banana", 0.99f, 3f);
		
		float total = 0.0f;
		total += product.accept(shoppingCart);
		
		assertThat(total).isEqualTo(2.97f);
	}
	
	@Test
	public void givenACartWithABookAnd3FruitsWhenSummingThenOK() {
		List<Product> items = new ArrayList<Product>();
		items.add(new Book("maid of the mist", 100));
		items.add(new Fruit("Tomato", 2.99f, 1f));
		items.add(new Fruit("Apple", 9.99f, 1f));
		items.add(new Fruit("Orange", 3.99f, 1f));
		
		float total = 0.0f;
		for(Product product : items){
			total += product.accept(shoppingCart);
		}
		
		assertThat(total).isEqualTo(116.96999f);
	}

}
