package aufgaben.filtern;

import java.util.ArrayList;

interface Filter {
	public abstract boolean istOk(int value);
}

class FilterGerade implements Filter {
	@Override
	public boolean istOk(int value) {
		return value %2 == 0;
	}
}


class FilterPositive implements Filter {
	@Override
	public boolean istOk(int value) {
		return value > 0;
	}
}


class FilterStartMitEins implements Filter {
	@Override
	public boolean istOk(int value) {
		String valueAsString = String.valueOf( Math.abs(value) );
		
		return valueAsString.charAt(0) == '1';
	}
}

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
		ArrayList<Integer> listGerade = filtern(list, new FilterGerade());
		System.out.println("list gerade: " + listGerade); // 12, 14, -4
		
		/*
		 * A3.
		 * 
		 * Ändern Sie die Methode 'filtern' so, dass sie nicht selbst den Auswahlskriterium definiert, 
		 * sondern dem Benutzer es überlässt:
		 *  
		 */
		
		ArrayList<Integer> listPositive = filtern(list, new FilterPositive());
		System.out.println("list positive: " + listPositive); // 12, 13, 14, 15, 77

		
		ArrayList<Integer> listStartenMit1 = filtern(list, new FilterStartMitEins());
		System.out.println("list mit Zahlen die mit 1 starten: " + listStartenMit1); // 12, 13, 14, 15
		
		// Tipp: Denken Sie an die Methode Arrays.sort(Object[], Comparator). 
		// Sie bekommt die Logik zum Vergleichen der Elemente auch übergeben.
		
	} // end of main

	static ArrayList<Integer> filtern(ArrayList<Integer> list, Filter filter) {
		ArrayList<Integer> back = new ArrayList<>();
		
		for (Integer value : list) {
			if( filter.istOk(value) ) {
				back.add(value);
			}
		}
		
		return back;
	}
	
}






















