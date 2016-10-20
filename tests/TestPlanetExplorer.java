import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	
	@Test
	public void test_createPlanet(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.getPlanet();
		
		assertEquals(planet, "100x100");
	
	}
	

	@Test
	public void test_createPlanet2(){
		PlanetExplorer planetE2 = new PlanetExplorer(200,200);
		
		String planet2 = planetE2.getPlanet();
		
		assertEquals(planet2, "100x100");
	}
	
	@Test
	public void test_executeCommand() {
		
		
	}
}
