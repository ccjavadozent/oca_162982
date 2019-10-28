package functional;

/*
 * Innere (nested) Klassen sind nicht in der Prüfung
 */


class Buch {
	
	/*
	 * statische innere Klasse
	 */
	public static class Seite {
		public void print() {
//			System.out.println(titel); // Compilerfehler: wo ist das Buch?
			
			Buch buch = new Buch("Harry Potter");
			System.out.println("Buch.Seite hat extra ein Buch erstellt: " + buch.titel); // private, aber sichtbar in der Klasse Buch
		}
		
	} // end of Seite
		
	
	private String titel;

	public Buch(String titel) {
		this.titel = titel;
	}
	
} // end of Buch



class Heft {
	/*
	 * Nichtstatische innere Klasse
	 */
	public class Seite {
		public void print() {
			System.out.println("Heft.Seite selbst: " + this);
			System.out.println("Heft.Seite kennt das Heft-Objekt: " + Heft.this);
			System.out.println("Heft.Seite kennt den Heft-Preis: " + preis);
			System.out.println("Heft.Seite kennt den Heft-Preis: " + Heft.this.preis);
		}
		
	} // end of Seite
	
	private int preis;

	public Heft(int preis) {
		this.preis = preis;
	}
}


public class B03_InnereKlassen {

	public static void main(String[] args) {

		
		Buch.Seite buchSeite = new Buch.Seite();
		buchSeite.print();
		
//		Heft.Seite heftSeite = new Heft.Seite(); // Compilerfehler: keine Heft.Seite ohne Heft!
		Heft heft = new Heft(22);
		
		Heft.Seite heftSeite = heft.new Seite();
		heftSeite.print();
		
	}

}
