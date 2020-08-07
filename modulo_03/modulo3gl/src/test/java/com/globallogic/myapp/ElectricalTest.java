package com.globallogic.myapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectricalTest {
	ElectricalOven electricalOven;
	ElectricalAppliance electricalAppliance;
	
	@BeforeEach
	void beforeEach() {
		electricalOven = new ElectricalOven();
	}
	
	@Test
	void turnOn() {
		int power= 500;
		electricalOven.setPower(power);
		electricalOven.turnOn();
		
		assertEquals(power-75,electricalOven.getPower());
	}
	
	@Test
	void powerledTest() {
		
		int power = 1000;
		
		electricalOven.setPower(power);
		
		electricalOven.turnLed();
		
		assertEquals(power -100, electricalOven.getPower());
		
	}
	
	@Test
	void testTurnOn() {
		electricalAppliance= new ElectricalAppliance();
		electricalAppliance.turnOn();
		assertNotNull(electricalAppliance.getPower());
	}
}
