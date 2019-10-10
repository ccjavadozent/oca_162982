package vererbung;
/*
 * - Von abstrakten Klassen können keine Objekte gebildet werden
 * - Abstrakte Klassen dürfen (nicht müssen) abstrakte Methode deklarieren
 * 
 * - Jede 'konkrete' Klasse muss alle abstrakten Methoden der abstrakten Basisklasse realisieren
 */
public class B12_abstrakte_Klassen {
	
	static abstract class Figur {
		int x, y;
		
		// double getFlaeche() { return -1; } // sinnlose Realisiereung (Schwäche im Design)

		abstract double getFlaeche();
		
		void bewegen(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	} // end of Figur
	
	
	static class Kreis extends Figur {
		int radius = 3;
		
		double getFlaeche() {
			return Math.PI * radius * radius;
		}
		
	} // end of Kreis
	
	static class Rechteck extends Figur {
		int breite=2, hoehe=3;
		
		double getFlaeche() {
			return breite * hoehe;
		}
		
	} // end of Rechteck
	
	
	// static class Dreieck extends Figur {} // Compilerfehler: die abstrakte Methode 'getFlaeche' nicht realisiert
	

	public static void main(String[] args) {

		Figur f = new Kreis();
		System.out.println( f.getFlaeche() );
		
		f = new Rechteck();
		System.out.println( f.getFlaeche() );
		
		// f = new Figur(); // Compilerfehler: keine Objekte von abstrakten Klassen (wäre sowieso sinnlos)
		
	} // end of main

}
