package aufgaben.filtern;

import java.util.ArrayList;

public class AufgabeFiltern {

	public static void main(String[] args) {

		/*
		 * A1. Eine ArrayList mit folgenden Zahlen bilden: 12, 13, 14, 15, -4, 77
		 * 
		 *     Bitte die Liste ausgeben
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(-4);
		list.add(77);
		
		System.out.println("list: " + list);
		
		/*
		 * A2.
		 * 
		 * Bitte die Methode 'filtern' realisieren, die aus der übergebenen Liste nur die gerade Zahlen nimmt 
		 * und in eine neue ArrayList kopiert.
		 * 
		 * Die neue ArrayList wird zurück geliefert.
		 * 
		 */
		ArrayList<Integer> listGerade = filtern(list, logikZumAuswählenDerGeradenZahlen);
		System.out.println("list gerade: " + listGerade); // 12, 14, -4
		
		/*
		 * Ändern Sie die Methode 'filtern' so, dass sie nicht selbst den Auswahlskriterium definiert, 
		 * sondern dem Benutzer es überlässt:
		 *  
		 */
		
		ArrayList<Integer> listPositive = filtern(list, logikZumAuswählenDerPositivenZahlen);
		System.out.println("list positive: " + listPositive); // 12, 13, 14, 15, 77

		
		ArrayList<Integer> listStartenMit1 = filtern(list, logikZumAuswählenDerZahlenDieMit1Starten);
		System.out.println("list positive: " + listPositive); // 12, 13, 14, 15
		
		
	} // end of main

	static ArrayList<Integer> filtern(ArrayList<Integer> list, param) {
		ArrayList<Integer> back = new ArrayList<>();
		
		for (Integer value : list) {
			if(value %2 == 0) {
				back.add(value);
			}
		}
		
		return back;
	}
	
}
