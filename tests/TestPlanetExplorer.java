import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	
	@Test
	public void test_createPlanet(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.getPlanet();
		
		assertTrue(planet, true);
	}
	

	@Test
	public void test_createPlanet2(){
		PlanetExplorer planetE2 = new PlanetExplorer(200,200);
		
		String planet2 = planetE2.getPlanet();
		
		assertTrue("100x100", true);
	}
	
	@Test
	public void test_executeCommand() {
		
		
	}
}
