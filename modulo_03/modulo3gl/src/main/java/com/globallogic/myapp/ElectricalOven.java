package com.globallogic.myapp;

public class ElectricalOven extends ElectricalAppliance{
	
	LedAppliance ledAppliance;
	
	public ElectricalOven() {
		super();ledAppliance= new LedAppliance();
	}
		
		
	@Override
	public void turnOn() {
		this.setPower(this.getPower()-75);
	}
	
	
	public void turnLed() {
		this.setPower(ledAppliance.turnOn(this.getPower()));
	}
}
