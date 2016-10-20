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
		
		assertEquals(planet2, "200x200");
	}
	
	@Test
	public void test_getLandsOnThePlanet(){
		PlanetExplorer planetE = new PlanetExplorer(100, 100);
		
		String planet2 = planetE.getLandsOnThePlanet();
		
		assertEquals(planet2, "(0,0,N)");
	}
	
	@Test
	public void test_turning(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.turning("r");
		
		assertEquals(planet,"(0,0,E)");
		
	}
	
	
	@Test
	public void test_turning2(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.turning("l");
		
		assertEquals(planet,"(0,0,W)");
		
	}
	
	@Test
	public void test_moving(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.turning("f");
		
		assertEquals(planet,"(0,1,N)");
		
	}
	
	@Test
	public void test_executeCommand() {
		
		
	}
}
