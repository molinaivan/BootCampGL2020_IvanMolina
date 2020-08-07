package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;

class PlanetTest {
	Planet planet = new Planet();

	@Test
	void testToString() {
		
		planet.setName("Juan");
		
		assertEquals(planet.toString(),"Planet [name=" + planet.getName() + "]");
	}

	

}
