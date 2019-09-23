package klassen;

public class B02_PlanetenOhneKlassen {

	/*
	 * Aufgaben: 
	 *  - Planet hat den Namen und Koordinaten x und y
	 * 	- Planeten anlegen
	 *  - Informationen zu einem Planeten ausgeben
	 *  - Planeten bewegen
	 */
	public static void main(String[] args) {
		
		/*
		 * Planet 1. Name: Erde, Koordinaten x = 12, y = 13 
		 */
		String name1 = "Erde";
		int x1 = 12;
		int y1 = 13;
		
//		System.out.println("*****************");
//		System.out.println("Planet " + name1 + ", Koordinaten: " + x1 + ", " + y1);
		printPlanet(name1, x1, y1);
		
		// Erde bewegen
		x1 = 33;
		y1 = 40;
		
//		System.out.println("*****************");
//		System.out.println("Planet " + name1 + ", Koordinaten: " + x1 + ", " + y1);
		printPlanet(name1, x1, y1);
		
		
		String name2 = "Mars";
		int x2 = 70;
		int y2 = 90;
		
//		System.out.println("*****************");
//		System.out.println("Planet " + name2 + ", Koordinaten: " + x2 + ", " + y2);
		printPlanet(name2, x2, y1); // Bug hier!

		// Mars bewegen:
		x2 = 101;
		y2 = 66;
		
//		System.out.println("*****************");
//		System.out.println("Planet " + name2 + ", Koordinaten: " + x2 + ", " + y2);
		printPlanet(name2, x2, y2);
		
	} // end of main

	
	static void printPlanet(String name, int x, int y) {
		System.out.println("**********************************************");
		System.out.println("Planet " + name + ", Koordinaten: " + x + ", " + y);
	}
	
}
