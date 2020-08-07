package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


import coverage.example.model.Planet;
import coverage.example.model.Star;

class StarTest {
	
	Star star = new Star();
    List<Planet> planetList = new ArrayList<Planet>();
    Planet planet = new Planet();
    Planet planet2= new Planet();

	@Test
	void test() {
		star.setName("star1");
		
		planet.setName("Tierra");
		
		
		planetList.add(planet);
		
		star.setPlanets(planetList);
		
		assertEquals(star.toString(),"Star [name=" + 
		
		star.getName() + ", planets=" + planetList + "]");
		
			
		
	}
	
	@Test
	void testColor() {
		String color = "Amarillo";
		star.setColor(color);
		
		assertEquals(color,star.getColor());
	}
	
	@Test 
	void getPlanetsTest(){
		planet.setName("Urano");
		planet2.setName("Marte");
		
		planetList.add(planet);
		planetList.add(planet2);
		
		star.setPlanets(planetList);
		
		
		assertNotNull(star.getPlanets());
		
		
	}
}
