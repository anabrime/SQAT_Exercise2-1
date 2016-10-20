
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	
	private int x; 
	private int y;

	private int explorerLands1;
	private int explorerLands2;
	private char explorerLands3;
	
	public PlanetExplorer(int x, int y, int explorerLands1, int explorerLands2, char explorerLands3){
		
		this.x = x;
		this.y = y;
		this.explorerLands1 = 0;
		this.explorerLands2 = 0;
		this.explorerLands3 = 'N';
	/*	x and y represent the size of the grid.
	 *
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}

	public String getPlanet(){
		
		String planet;
		planet = getX() + "x" + getY();
		return planet;
		
	}

	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	public String getLandsOnThePlanet(){
		
		String journey;
		journey  ="(" + getExplorerLands1() + "," + getExplorerLands2() + "," + getExplorerLands3() + ")";
		return journey;
	}
	public int getExplorerLands1() {
		return explorerLands1;
	}



	public void setExplorerLands1(int explorerLands1) {
		this.explorerLands1 = explorerLands1;
	}



	public int getExplorerLands2() {
		return explorerLands2;
	}



	public void setExplorerLands2(int explorerLands2) {
		this.explorerLands2 = explorerLands2;
	}



	public char getExplorerLands3() {
		return explorerLands3;
	}



	public void setExplorerLands3(char explorerLands3) {
		this.explorerLands3 = explorerLands3;
	}



	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
}
