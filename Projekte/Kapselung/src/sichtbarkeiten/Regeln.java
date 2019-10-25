package sichtbarkeiten;

/*
 * - Die Sichtbarkeiten:
 * 
 * 		- private:
 * 			sichtbar nur in der eigenen Klasse
 * 	
 *		- 'default' oder 'package private'
 *			sichtbar im ganzen Package
 *
 *		- protected
 *			sichtbar: 
 *				- im ganzen Package
 *				- und in allen abgeleiteten Klassen (auch wenn sie in anderen Packages liegen), 
 *				  ABER NUR mit Referenzen vom abgeleiteten Typ
 * 
 * 		- public
 * 			sichtbar überall
 * 
 * 
 * - Topleveltypen in einem Package können entweder public oder 'package private' sein
 * 
 * - Die Elemente eines Interfaces sind immer public (Java 8)
 * 
 * - Die Elemente einer Klasse (statische und nichtstatische Methoden, Konstruktoren, statische/nichtstatische Attribute, innere Typen)
 *    können einer der 4 Sichtbarkeiten bekommen.
 *    
 *    Ausnahme: beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.
 * 
 */

// public class X {} // Compilerfehler: public class X muss in der Datei X.java definiert werden 


public class Regeln {
	
	public class X {} // OK: innere Klasse darf beliebige Sichtbarkeit haben

	public static void main(String[] args) {

	}

}
