package vererbung;

/*
 * Signatur: Methodenname + Liste der Parametertypen
 * 
 * Überladen: in derselben Klasse mehrere Methoden mit denselben Namen definieren (Signaturen müssen sich unterscheiden)
 * 
 * Überschreiben: Die aus der Basisklasse geerbte Methode mit einer neuen Definition ersetzen
 * 
 * 
 * ********* Regeln beim Überschreiben/Implementieren abstrakter Methoden ************
 * 
 * 1. Die Sichtbarkeit darf nicht verschärft werden
 * 2. Rückgabetyp darf nicht geändert werden (Ausnahme: kovarianter Typ)
 * 3. Keine zusätztlichen checked-Exceptions dürfen in der throws-Klausel deklariert werden
 * 
 */

public class B11_Ueberschreiben {
	
	static class Auto {
		public void fahren() {}
		
		int bremsen() { return 3; }
		
		private void beschleunigen() { } // private Methoden werden nicht vererbt
	}
	
	static class PKW extends Auto {
		// private void fahren() {} 		// Compilerfehler: Sichtbarkeit verschärft
		// void fahren() {} 				// Compilerfehler: Sichtbarkeit verschärft
		// protected void fahren() {} 		// Compilerfehler: Sichtbarkeit verschärft
		public void fahren() {} 
		
		// public String bremsen() { return "Hallo"; } 		// Compilerfehler: Rückgabetyp geändert 
		// short bremsen() { return 33; } 					// Compilerfehler: Rückgabetyp geändert
		protected int bremsen() { return 33; }
		
		/*
		 * Achtung! Kein Überschreiben:
		 */
		private int fahren(int x) { 
			return x+2; 
		}
		
		/*
		 * Achtung! Private Methoden werden nicht vererbt
		 */
		int beschleunigen() { return 22; }
	}
	
	

}
