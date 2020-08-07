package com.globallogic.app;

public class Order {
	
	private String description;
	private int count;
	private Currency currency;
	private Product product;
	
	
	public Order(String description, int count, Currency currency) {
		super();
		this.description = description;
		this.count = count;
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
