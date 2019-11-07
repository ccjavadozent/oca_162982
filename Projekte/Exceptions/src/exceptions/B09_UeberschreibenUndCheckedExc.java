package exceptions;

import java.text.ParseException;

/*
 * Regeln beim Überschreiben:
 * 
 * 1. Sichtbarkeit nicht verschärfen
 * 2. Rückgabetyp nicht ändern
 * 3. Keine zusätzlichen (breiteren, Geschwister) checked Exceptions deklarieren
 */


class AutoException extends Exception {} // checked

class MotorSchadenException extends AutoException {}




class Auto {
	void fahren() throws AutoException {} // Kontrakt
}

class VW extends Auto {
	void fahren() throws MotorSchadenException { // OK:  MotorSchadenException IS-A AutoException
		throw new MotorSchadenException();  
	}
}

class Opel extends Auto {
//	void fahren() throws ParseException { } // Compilerfehler: Geschwistertyp-Exception zu AutoException
}

class Audi extends Auto {
	void fahren() throws RuntimeException {} // OK: RuntimeException ist unchecked
}

class Fiat extends Auto {
	void fahren() {}
}

class Mazda extends Auto {
//	void fahren() throws Exception {} // zu breit (Exception ist Basistyp für Autoexception)
}

public class B09_UeberschreibenUndCheckedExc {

	public static void main(String[] args) {

		Auto a1 = new Opel();
		
		try {
			a1.fahren(); // dem Kontrakt aus Auto vertrauen
			
		} catch (AutoException e) {
			// hier AutoException behandeln
			e.printStackTrace();
		}
		
	} // 

}
