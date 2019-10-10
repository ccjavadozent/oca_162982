package aufgaben;

public class KleineAufgabePolymorphie {

	public static void main(String[] args) {

		/*
		 * A1.
		 */
		IntOperation op1 = new AddOne(); // Eine Einz addieren
		IntOperation op2 = new Negate(); // Vorzeichen umkehren
		
		int x = 5;
		
		x = op1.execute(x);
		System.out.println("x = " + x); // 6
		
		x = op2.execute(x);
		System.out.println("x = " + x); // -6
		
		/*
		 * A2.
		 * 
		 * Erzeugen Sie ein Array mit mindestens 4 (vier) unterschiedlichen IntOperation-Arten.
		 * 
		 * Jagen Sie einen int-Wert durch das Array so, dass alle Operationen sequentiell ausgeführt werden
		 * und jede nächste Operation als Eingangswert (input) das Ergebnis der vorherigen Operation erhält
		 */
	}

}
