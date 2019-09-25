package aufgaben;

class Hund {
	private String name;
	private int alter;
	private String besitzer;
	
	public Hund(String name, int alter, String besitzer) {
		this.name = name;
		this.alter = alter;
		this.besitzer = besitzer;
	}
	
	public Hund(String name, int alter) {
		this(name, alter, "-");
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Hund that = (Hund) obj;
		
		return this.name.equals(that.name) 
				&& alter == that.alter 
				&& besitzer.equals(that.besitzer); 
	}
}


public class AufgabeTiere {

	public static void main(String[] args) {
		/*
		 * A1. 
		 * 
		 * Bitte eine neue Klasse 'Hund' erzeugen.
		 * 
		 * 
		 * A2.
		 * 
		 * Jeder Hund soll folgende Attribute besitzen:
		 * 	
		 * Name, Alter, Besitzer.
		 * 
		 * 
		 * A3.
		 * 
		 * Definieren Sie bitte 2 Konstruktoren für die Klasse 'Hund'.
		 * Name und Allter muss man an jeden Konstruktor übergeben können.
		 * 
		 * A4.
		 * 
		 * Überschreiben Sie bitte die toString sinnvoll
		 * 
		 * A5.
		 * 
		 * Bitte bilden Sie zwei nach Inhalt gleiche Hund-Objekte.
		 * Vergleichen Sie die mit der equals. Sorgen Sie dafür, dass die equals korrekt arbeitet.
		 * 
		 * Bitte bilden Sie zwei nach Inhalt UNgleiche Hund-Objekte.
		 * Vergleichen Sie die mit der equals. Sorgen Sie dafür, dass die equals korrekt arbeitet.
		 * 
		 */
		
		Hund h1 = new Hund("Rex", 3, "Max");
		Hund h2 = new Hund("Rex", 3, "Max");
		
		System.out.println( h1 == h2 );
		System.out.println( h1.equals(h2) );
		
		Hund h3 = new Hund("Lassie", 3, "Max");
		
		System.out.println(h1.equals(h3));
	}

}
