package com.globallogic.myapp;

public class ElectricalAppliance {
	private int power = 500;
	
	public void turnOn() {
		this.setPower(this.getPower()-50);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}
