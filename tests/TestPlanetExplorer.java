import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	
	@Test
	public void test_createPlanet(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.getPlanet();
		
		assertEquals("100x100", planet);
	
	}
	

	@Test
	public void test_createPlanet2(){
		PlanetExplorer planetE2 = new PlanetExplorer(200,200);
		
		String planet2 = planetE2.getPlanet();
		
		assertEquals("200x200", planet2);
	}
	
	@Test
	public void test_getLandsOnThePlanet(){
		PlanetExplorer planetE = new PlanetExplorer(100, 100);
		
		String planet2 = planetE.getLandsOnThePlanet();
		
		assertEquals("(0,0,N)", planet2);
	}
	/*
	@Test
	public void test_turning(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.turning("r");
		
		assertEquals("(0,0,E)", planet);
		
	}
	
	
	@Test
	public void test_turning2(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.turning("l");
		
		assertEquals("(0,0,W)", planet);
		
	}
	
	@Test
	public void test_moving(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.moving("f");
		
		assertEquals("(0,1,N)", planet);
		
	}
	
	@Test
	public void test_moving2(){
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.moving("b");
		
		assertEquals("(-1,0,N)", planet);
		
	}
	*/
	
	@Test
	public void test_executeCommand() {
		
		PlanetExplorer planetE = new PlanetExplorer(100,100);
		
		String planet = planetE.executeCommand("ff");
		
		assertEquals("(0,1,N)", planet);
		
		
	}
}
