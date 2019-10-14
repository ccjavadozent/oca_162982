package vererbung;

/*
 * - Eine Klasse darf NUR von EINER Basisklasse erben
 * - Eine Art 'mehrfacher' Vererbung gibt es mit Interfaces
 */

class BaseClassA extends Object {}
class BaseClassB /* extends Object */ {}

class DerivedClassA extends BaseClassA {}
//class DerivedClassB extends BaseClassA, BaseClassB {}			// Compilerfehler
//class DerivedClassC extends BaseClassA extends BaseClassB {}	// Compilerfehler




public class B14_MehrfacheVererbung {
	
	/*
	 * Basistyp A
	 */
	static abstract class Figur {
		abstract double getFlaeche();
	}
	
	
	/*
	 * Universelle Komponente A
	 */
	static double berechneGesamtflaeche(Figur[] figuren) {
		
		double gesamt = 0;
		
		for (Figur figur : figuren) {
			gesamt += figur.getFlaeche();
		}
		
		return gesamt;
	}
	
	
	/*
	 * Basistyp B
	 */
	static class Werkstueck {
		private int masse;
		
		public int getMasse() {
			return masse;
		}
	}
	
	/*
	 * Universelle Komponente B 
	 */
	static Werkstueck findeDasSchwerste(Werkstueck[] werkstueckArray) {
		Werkstueck max = werkstueckArray[0];
		
		for (Werkstueck werkstueck : werkstueckArray) {
			if(max.getMasse() < werkstueck.getMasse()) {
				max = werkstueck;
			}
		}
		
		return max;
	}
	
	/*
	 * Aufgabe und gleichzeitig ein Problem: Rechteck soll sowohl Figur als auch Werkstueck sein
	 * 
	 */
//	static class Rechteck extends Figur, Werkstueck {
//		public double getFlaeche() {
//			return 10;
//		}
//	}
	
}
