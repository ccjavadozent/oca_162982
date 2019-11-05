package enums;

import java.util.Arrays;

enum Size {
	SMALL, BIG
}

class Groesse  implements Comparable<Groesse> {
	
	static final Groesse KLEIN = new Groesse("KLEIN", 0);
	static final Groesse GROSS = new Groesse("GROSS", 1);
	
	static Groesse[] values() {
		return new Groesse[] { KLEIN, GROSS };
	}
	
	private final String name;
	private final int ordinal;
	
	private Groesse(String name, int ordinal) {
		this.name = name;
		this.ordinal = ordinal;
	}
	
	public final int ordinal() {
		return ordinal;
	}
	
	public final String name() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Groesse g2) {
		return ordinal - g2.ordinal;
	}
}

public class B04_WasEineEnumKlasseImmerHat {

	public static void main(String[] args) {

		/*
		 * Referenzen anlegen
		 */
		Size s1 = null;
		Groesse g1 = null;
		
		/*
		 * Objekte bilden
		 */
		// s1 = new Size(); 		// Compilerfehler: keine neue Objekte von enum-Typ
		// g1 = new Groesse();		// Compilerfehler: Konstruktor ist private
		
		/*
		 * Zugriff auf statische Konstanten
		 */
		s1 = Size.BIG;
		g1 = Groesse.GROSS;
		
		/*
		 * toString:
		 */
		System.out.println(s1); // BIG
		
		// Aufgabe: folgende Zeilen müssen die Ausgaben GROSS und KLEIN erzeugen
		System.out.println(g1); // GROSS
		System.out.println(Groesse.KLEIN); // KLEIN
		
		/*
		 * statische Methode values()
		 */
		Size[] allSizes = Size.values();
		System.out.println( "Size.values(): " + Arrays.toString(allSizes) );
		
		Groesse[] alleGroessen = Groesse.values();
		System.out.println("Groesse.values(): " + Arrays.toString(alleGroessen));
		
		/*
		 * ordinal()
		 */
		int ordinal = s1.ordinal();
		System.out.println("Size.BIG.ordinal(): " + ordinal);
		System.out.println("Groesse.GROSS.ordinal(): " + Groesse.GROSS.ordinal());
		
		/*
		 * name();
		 */
		System.out.println("Size.SMALL.name(): " + Size.SMALL.name());
		System.out.println("Groesse.GROSS.name(): " + Groesse.GROSS.name());
		
		/*
		 * Comparable 
		 */
		Arrays.sort( Size.values() ); // OK
		Arrays.sort( Groesse.values() ); // OK (Comparable)
		
	} // end of main

}
