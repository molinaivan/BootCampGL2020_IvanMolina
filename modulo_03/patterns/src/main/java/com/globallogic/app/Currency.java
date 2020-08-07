package com.globallogic.app;

public class Currency {
	private String name;
	private static final Currency INSTANCE = new Currency();
	
	private Currency() {
		this.name = "ARS";		
	}
	
	public static Currency getInstance() {
		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
