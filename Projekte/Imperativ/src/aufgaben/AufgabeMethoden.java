package aufgaben;

public class AufgabeMethoden {

	public static void main(String[] args) {

		System.out.println("*** A1");
		printFromTo(5, 10);

		System.out.println("*** A2");
		int sum = sum(2, 3);
		System.out.println("sum: " + sum);

		System.out.println("*** A3");
//		sum = sumFromTo(1, 3); // int <= double
		double summeVonBis = sumFromTo(1, 3);
		System.out.println("summeVonBis: " + summeVonBis);

		System.out.println("--- A4");
		zeichneRechteck(5, 4);

		System.out.println("--- A5");
		zeichneRechteck(5, 4, true);
		System.out.println("---");
		zeichneRechteck(5, 4, false);
		
		
		System.out.println("*** A6");
		
		printRandom(5, 5, 10); // gibt 5 int-Zufallswerte aus dem Bereich [10 ... 20] aus.
		
		/*
		 * min = 2, max = 5
		 * 
		 * Mögliche gewünschte Werte:				2, 3, 4, 5
		 * 
		 * random.nextInt(4);						0, 1, 2, 3
		 * random.nextInt(4) + 2;					0+2, 1+2, 2+2, 3+2 (wie gewünscht!)
		 * 
		 * random.nextInt(max-min+1) + min
		 */
		

	} // end of main

	static void printRandom(int anzahlZahlen, int min, int max) {
		
		java.util.Random random = new java.util.Random();
		
		for (int i = 0; i < anzahlZahlen; i++) {
			
			int zahl = random.nextInt(max-min+1) + min;
			System.out.print(zahl + " ");
		}
		System.out.println();
	}
	
	
	/**
	 * Die Methode zeichnet ein Rechteck auf der Konsole. Wenn der Parameter "fuellen" true ist, 
	 * wird ein gefülltes Rechteck gezeichnet, sonst ein leeres.
	 * 
	 * @param breite
	 * @param hoehe
	 * @param fuellen
	 */
	static void zeichneRechteck(int breite, int hoehe, boolean fuellen) {

		for (int zeile = 0; zeile < hoehe; zeile++) {

			for (int spalte = 0; spalte < breite; spalte++) {
				
				if(fuellen || zeile==0 || zeile==hoehe-1 || spalte==0 || spalte==breite-1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}

			System.out.println();
		}

	}

	/**
	 * Die Methode zeichnet ein gefülltes Rechteck auf der Konsole
	 * 
	 * @param breite
	 * @param hoehe
	 */
	static void zeichneRechteck(int breite, int hoehe) {
		for (int zeile = 0; zeile < hoehe; zeile++) {

			for (int spalte = 0; spalte < breite; spalte++) {
				System.out.print('*');
			}

			System.out.println();
		}
	}

	/**
	 * Die Methode berechnet die Summe aller int-Werte von "from" bis "to"
	 * 
	 * @param from
	 * @param to
	 * @return Summe als double
	 */
	static double sumFromTo(int from, int to) {
		double sum = 0; // langsamer als mit int

		for (int value = from; value <= to; value++) {
			sum += value;
		}

		return sum;
	}

	/**
	 * Berechnet die Summe von a und b. Nicht immer korrekt: int-overflow möglich!
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static int sum(int a, int b) {
		return a + b;
	}

	/**
	 * Die Methode gibt alle int-Werte von "from" bis "to" auf der Konsole in einer
	 * Zeile aus.
	 * 
	 * @param from
	 * @param to
	 */
	static void printFromTo(int from, int to) {
		for (int i = from; i < to; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
