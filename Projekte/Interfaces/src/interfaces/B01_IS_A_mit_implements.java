package interfaces;

/*
 * - Interface kann als Basistyp eingesetzt werden und trennt/verbindet Komponenten (s. Bsp. 02)
 * 
 * - Eine Klasse kann mehrere Interfaces realisieren (mehrfache Vererbung)
 * 
 */


class Elefant implements Runnable, Comparable<Elefant> {
	public int compareTo(Elefant e2) {
		return 0;
	}
	
	public void run() {
	}
}


public class B01_IS_A_mit_implements {

	public static void main(String[] args) {

		// Elefant IS-A Runnable
		Runnable r1 = new Elefant();
		
		// Elefant IS-A Comparable
		Comparable<Elefant> c1 = new Elefant();
		
	}

}
