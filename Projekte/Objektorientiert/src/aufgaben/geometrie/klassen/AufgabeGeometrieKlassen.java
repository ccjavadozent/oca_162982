package aufgaben.geometrie.klassen;

import java.util.Random;

public class AufgabeGeometrieKlassen {

	/*
	 * - Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.
	 * - Es soll auch Kreise geben können. Jeder Kreis soll ein Radius haben. 
	 * 
	 * - Ein Rechteck soll es ermöglichen seine Maße auf der Konsole auszugeben.
	 * - Ein Kreis soll eine bequeme Möglichkeit anbieten sein Radius auf der Konsole auszugeben.
	 * 
	 * - Erzeugen Sie 100 Rechtecke mit zufälligen Breiten und Höhen...
	 *      1. Rechteck (3 X 5)
	 *      ...
	 * 
	 * - Erzeugen Sie einen Kreis und setzen Sie sein Radius auf 5. Erzeugen Sie die Ausgabe in folgender Form:
	 *		Kreis. R = 5
	 *
	 * - Definieren Sie eine statische Methode, mit der sich die beiden Dimensionen eines Rechteckes ändern lassen.
	 * - Definieren Sie eine NICHT-statische Methode, mit der sich die beiden Dimensionen eines Rechteckes ändern lassen.
	 * 
	 */
	
	public static void main(String[] args) {

//		new Rechteck();
		
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(r1); // Rechteck (2 X 3)

		System.out.println("*** 100 Rechtecke: ");
		
		Random random = new Random();

		for(int i=1; i<=100; i++) {
			int breite = random.nextInt(20) + 1;
			int hoehe = random.nextInt(20) + 1;
			
			Rechteck r = new Rechteck(breite, hoehe);
			System.out.println( i + ". " + r );
		}

		System.out.println("*** Kreis");
		
		Kreis k1 = new Kreis(5);
		System.out.println(k1);
		
		System.out.println("*** Rechteck ändern");
		
		Rechteck r2 = new Rechteck(4, 5);
		System.out.println("1. r2: " + r2);
		
		Rechteck.changeRechteck(r2, 7, 8);
		System.out.println("2. r2: " + r2);
		
		r2.setDimensionen(12, 13);
		System.out.println("3. r2: " + r2);
		
	}

}
