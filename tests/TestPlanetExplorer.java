import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	
	@Test
	public void test_createPlanet(){
		PlanetExplorer planetE = new PlanetExplorer(100,100, 0, 0, 'N');
		
		String planet = planetE.getPlanet();
		
		assertEquals(planet, "100x100");
	
	}
	

	@Test
	public void test_createPlanet2(){
		PlanetExplorer planetE2 = new PlanetExplorer(200,200, 0, 0, 'N');
		
		String planet2 = planetE2.getPlanet();
		
		assertEquals(planet2, "200x200");
	}
	
	@Test
	public void test_getLandsOnThePlanet(){
		PlanetExplorer planetE = new PlanetExplorer(0, 0, 0, 0, 'N');
		
		String planet2 = planetE.getLandsOnThePlanet();
		
		assertEquals(planet2, "(0, 0, 'N')");
	}
	
	@Test
	public void test_executeCommand() {
		
		
	}
}
