package aufgaben.geometrie.polymorphie;

import java.util.Random;

public class AufgabeGeometriePolymorphie {

	/*

		- Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.
		- Es soll auch Kreise geben können. Jeder Kreis soll ein Radius haben. 
		- Sowohl ein Rechteck als auch ein Kreis hat die x und y Koordinaten.
		- Sowohl ein Rechteck als auch ein Kreis hat eine Methode "bewegen", mit der sich die Koordinaten ändern lassen.

		- Mit einer Instanz-Methode "getFlaeche" soll die Fläche eines Rechteckes ermittelt werden können.
		- Mit einer Instanz-Methode "getFlaeche" soll die Fläche eines Kreises ermittelt werden können.
		
		- Erzeugen Sie 100 zufällige Figuren (Kreise oder Rechtecke zufällig) und speichern Sie alle in einem Array.
		
		- Erzeugen Sie eine statische Methode, an die das Array aus der vorherigen Aufgabe übergeben werden kann. 
		   Die Methode soll die Flächen aller Figuren aus dem Array berechnen und ausgeben.
	 */
	
	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println("r1: " + r1);
		
		double flaecheRechteck = r1.getFlaeche();
		System.out.println("Fläche von r1: " + flaecheRechteck);
		
		Kreis k1 = new Kreis(3);
		System.out.println("k1: " + k1);
		
		double flaecheKreis = k1.getFlaeche();
		System.out.println("Fläche von k1: " + flaecheKreis);
		
		Figur[] array = new Figur[10];
		
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			if( random.nextBoolean() ) {
				int breite = random.nextInt(20)+1;
				int hoehe = random.nextInt(20)+1;
				array[i] = new Rechteck(breite, hoehe);
			} else {
				int radius = random.nextInt(20)+1;
				array[i] = new Kreis(radius);
			}
		}
		
//		print(array);
		
		printFlaechen(array);
		
		// new Figur();
		
	} // end of main
	
	static void printFlaechen(Figur[] figuren) {
		System.out.println("*** Flächen für Figuren");
		for (int i = 0; i < figuren.length; i++) {
			Figur figur = figuren[i];
			
			double flaeche = figur.getFlaeche(); // polymorphischer Aufruf
			
			System.out.println(i+1 + ". " + figur);
			System.out.println(" - Fläche: " + flaeche);
		}
	}
	
	static void print(Figur[] figuren) {
		System.out.println("*** Figuren aus dem Array: ");
		for (int i = 0; i < figuren.length; i++) {
			System.out.println( i+1 + ". " + figuren[i] );
		}
	}

}











