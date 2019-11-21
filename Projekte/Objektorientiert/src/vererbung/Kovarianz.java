package vererbung;

/**
 * https://de.wikipedia.org/wiki/Kovarianz_und_Kontravarianz
 *
 */

public class Kovarianz {
	
	static class Auto {}
	static class PKW extends Auto {}
	

	static class AutoFabrik {
		public Auto getAuto() throws java.io.IOException {
			return new Auto();
		}
	}
	
	
	static class PKWFabrik extends AutoFabrik {
		/*
		 * Beim Überschreiben:
		 * 
		 * 1. Sichtbarkeit nicht verschärfen
		 * 2. Rückgabetyp nicht ändern, bei Referenz-Typ als Rückgabe kovariante Typen möglich
		 * 3. Nur invariante oder kovariante checked Exceptions erlaubt
		 */
		
		public PKW getAuto() throws java.io.FileNotFoundException { return null; }
	}
	

	public static void main(String[] args) {
	}
	
	

}
