package aufgaben;


class Buch {
	int titel;
	int anzahlSeiten;
}

public class KleineAufgabeKlassen {

	public static void main(String[] args) {

		a1();
		
	} // end of main
	
	
	/*
	 * - Es soll Bücher geben können.
	 * - Jedes Buch hat zwei Eigenschaften: Titel, Anzahl Seiten.
	 * - Bitte erzeugen Sie 2 Bücher.
	 * - Geben Sie zu jedem Buch die Anzahl seine Seiten.
	 */
	static void a1() {
		System.out.println("*** A1");
		
		Buch b1 = new Buch();
		
		System.out.println( b1.titel );
		System.out.println( b1.anzahlSeiten );
		
	}

}
