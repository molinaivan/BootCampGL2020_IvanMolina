package com.globallogic.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurrencyTest {

	@Test
	void test() {
		assertEquals(Currency.getInstance(),Currency.getInstance());
	}
	
	@Test
	void singletonOrderTest() {
		
		Order order = new Order("order",1000, Currency.getInstance());
		
		Order order2 = new Order("order2",2000,Currency.getInstance());
		
		assertEquals(order.getCurrency(),order2.getCurrency());
		
	}
	
	@Test
	void singletonProducTest() {
		
		Order order = new Order("order",1000, Currency.getInstance());
		
		Order order2 = new Order("order2",2000,Currency.getInstance());
		
		assertEquals(order.getProduct(),order2.getProduct());
		
	}
}


