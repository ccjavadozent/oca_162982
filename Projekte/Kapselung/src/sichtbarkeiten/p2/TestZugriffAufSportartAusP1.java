package sichtbarkeiten.p2;

import sichtbarkeiten.p1.Sportart;

class Arena {
	static void testZugriff() {
		Sportart sa = new Ringen();
		System.out.println(sa.olympisch); // protected. Arena erbt nicht von Sportart
		System.out.println(((Ringen)sa).olympisch); // protected. Arena erbt nicht von Sportart
	}
}

class Ringen extends Sportart {
	public Ringen() {
		this.olympisch = true; // protected. Zugriff mit Referenz vom abgeleiteten Typ
	}
	
	static void testZugriff() {
		Sportart sa = new Ringen();
		System.out.println(sa.olympisch); // protected. Zugriff mit Basistypreferenz
		System.out.println(((Ringen)sa).olympisch); // protected. Zugriff mit Referenz vom abgeleiteten Typ
	}
}

public class TestZugriffAufSportartAusP1 {

	public static void main(String[] args) {

		Sportart sa = new Sportart(); // Klasse ist public, Constructor ist public
		
		System.out.println( Sportart.MAX_ALTER ); // Attribut ist public

		System.out.println( Sportart.getMaxAlter() ); // Methode ist 'default'

		System.out.println( sa.name ); // private
	}

}
