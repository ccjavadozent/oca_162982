package klassen;

/*
 * Klasse: Schablone zum Bilden von Planeten. Wie ine Bauplan!!!
 */
class Planet {
	String name;
	int x, y;
}


public class B03_PlanetenMitKlassen {

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
		Planet p1 = new Planet();
		p1.name = "Erde";
		p1.x = 12;
		p1.y = 13;

		printPlanet(p1);
		
		/*
		 * Planet 2. Mars, x=70, y=90
		 */
		Planet p2 = new Planet();
		p2.name = "Mars";
		p2.x = 70;
		p2.y = 90;
		
		printPlanet(p2);
		
	} // end of main

	
//	static void printPlanet(String name, int x, int y) {
//		System.out.println("*************************************************");
//		System.out.println( "Planet: " + name + ", Koordinaten: " + x + ", " + y );
//	}
	
	static void printPlanet(Planet planet) {
		System.out.println("*************************************************");
		System.out.println("Planet: " + planet.name + ", Koordinaten: " + planet.x + ", " + planet.y);
	}
	
	/*
	 * Kleine Aufgabe:
	 * Erzeugen Sie eine Klasse 'Planet' mit den Attributen 'String name', 'int x', 'int y'.
	 * 
	 * Definieren Sie eine statische Methode 'movePlanet', die die Koordinaten eines Planeten ändert.
	 * Die gewünschten neuen Koordinaten bekommt 'movePlanet' als Argumente
	 */
	
}



