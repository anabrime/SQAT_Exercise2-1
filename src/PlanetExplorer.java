
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 120
// Finish time: 16:36

public class PlanetExplorer {

	private int x; 
	private int y;

	private int explorerLands1 = 0;
	private int explorerLands2 = 0;
	private char explorerLands3 = 'N';

	public PlanetExplorer(int x, int y){

		this.x = x;
		this.y = y;

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

	/*
	public String turning(String command){
		
		if(command.equals("r")){

			setExplorerLands3('E');

		}else if(command.equals("l")){
			
			setExplorerLands3('W');
			
		}
		return "(" + getExplorerLands1() + "," + getExplorerLands2() + "," + getExplorerLands3() + ")";
	}
	
	public String moving(String command){
		
		if(command.equals("f")){
			setExplorerLands2(explorerLands2 + 1);
		}else if(command.equals("b")){
			setExplorerLands1(explorerLands1 - 1);
		}
		return  "(" + getExplorerLands1() + "," + getExplorerLands2() + "," + getExplorerLands3() + ")";
	}
*/
	public String executeCommand(String command){

		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.

		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		int i = 0;
  		while(i < command.length()){
			//(explorerLands1-y, explorerLands2-x, explorerLands3)
			//ffrff
			// (0,0,N) (0,1,N) (0,2,N) (0,2,E) (1,2,E) (2,2,E)
			
			if(command.charAt(i) == 'r'){

				setExplorerLands3('E');
				i++;

			}else if(command.charAt(i) == 'l'){
				
				setExplorerLands3('W');
				i++;
				
			}else if(command.charAt(i) == 'f' && explorerLands3 == 'E'){
				
				setExplorerLands1(explorerLands1 + 1); 
				i++;
			
			}else if(command.charAt(i) == 'f' && explorerLands3 == 'W'){
				
				setExplorerLands1(explorerLands1 - 1);
				i++;
				
			}else if(command.charAt(i) == 'f' && explorerLands3 == 'N'){
				
				setExplorerLands2(explorerLands2 + 1); 
				i++;
			
			}else if(command.charAt(i) == 'f' && explorerLands3 == 'S'){
				
				setExplorerLands2(explorerLands2 - 1);
				i++;
			
			}else if(command.charAt(i) == 'b' && explorerLands3 == 'E'){
				
				setExplorerLands1(explorerLands1 - 1);
				i++;
			}else if(command.charAt(i) == 'b' && explorerLands3 == 'W'){
				
				setExplorerLands1(explorerLands1 + 1);
				i++;
			}else if(command.charAt(i) == 'b' && explorerLands3 == 'N'){
				
				setExplorerLands2(explorerLands2 - 1);
				i++;
			
			}else if(command.charAt(i) == 'b' && explorerLands3 == 'S'){
				
				setExplorerLands2(explorerLands2 + 1);
				i++;
			}
			
			
		}

		return "(" + getExplorerLands1() + "," + getExplorerLands2() + "," + getExplorerLands3() + ")";
		
	}
	
	
	public String wrapping(String command){
		
		
		//Command b && E && 1 = 100 --> 0
		// Command b && N && 2 = 100 --> 0
	
		
		return null;
	}
}
