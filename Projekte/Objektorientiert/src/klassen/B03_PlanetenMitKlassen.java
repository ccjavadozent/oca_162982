package klassen;

/*
 * Klasse: Schablone zum Bilden von Planeten. Wie ine Bauplan!!!
 */
class Planet {
	String name; // Attribut bzw. Feld bzw. Instanz-Variable bzw. Objekt-Variable bzw...
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
		Planet p1 = new Planet(); // Objekt mit 'new' bilden und seine Referenz in der Referenz p1 kopieren
		p1.name = "Erde"; // Objekt finden (seine Adresse steht in p1) und sein attribut überschreiben
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
		
		movePlanet(p2, 103, 7000);
		
		printPlanet(p2); // Planet: Mars, Koordinaten: x: 103, y: 7000
		
		springen(p2);
		
		printPlanet(p2); // // Planet: Mars, Koordinaten: x: 103, y: 7000
		
	} // end of main

	/*
	 * test
	 */
	static void springen(Planet p) {
		p = new Planet(); // Parameter p wird (sinnlos) überschrieben
		p.x = 121314;
	}
	
	
//	static void printPlanet(String name, int x, int y) {
//		System.out.println("*************************************************");
//		System.out.println( "Planet: " + name + ", Koordinaten: " + x + ", " + y );
//	}
	
	static void printPlanet(Planet planet) {
		System.out.println("*************************************************");
		System.out.println("Planet: " + planet.name + ", Koordinaten: x: " + planet.x + ", y: " + planet.y);
	}
	
	/*
	 * Kleine Aufgabe:
	 * Erzeugen Sie eine Klasse 'Planet' mit den Attributen 'String name', 'int x', 'int y'.
	 * 
	 * Definieren Sie eine statische Methode 'movePlanet', die die Koordinaten eines Planeten ändert.
	 * Die gewünschten neuen Koordinaten bekommt 'movePlanet' als Argumente
	 */
	static void movePlanet(Planet planet, int newX, int newY) {
		planet.x = newX;
		planet.y = newY;
	}
	
	
}











