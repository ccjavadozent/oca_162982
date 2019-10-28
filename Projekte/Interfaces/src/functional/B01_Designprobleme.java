package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Situation:
 * 		- Eine Komponente einbinden, die auf ein Interface programmiert wurde:
 * 			Hier: Collections.sort(List, Comparator) aufrufen, um besonders eine List zu sortieren
 * Dafür nötig:
 * 		- Interface Comparator realisieren (eine neue Klasse schreiben, compare-Methode implementieren)
 * 		- Neues Objekt von der neuen Klasse erzeugen
 * 		- sort aufrufen, die Referenz auf das neue Comparator übergeben und 
 * 			mit dem Objekt den Verweis auf die konkrete Realisierung der Methode 'compare'  
 * 
 * Design-Probleme:
 * 
 * 		- Kein direktes Lösen der Aufgabe: (Vergleichslogik an die sort übergeben). 
 * 			Es wird immer ähnlicher Dienstcode nötig: Klasse realisieren...
 * 
 * 		- Es entsteht eine weitere Klasse in der Anwendungsbibliothek (mehr Möglichkeiten für Kopplung, mehr Namen zu berücksichtigen...)
 * 			Hier: MyStringCmp
 */


class MyStringCmp implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class B01_Designprobleme {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("abcdefgh");
		list.add("ab");
		list.add("aaaa");
		list.add("def");

		Collections.sort(list, new MyStringCmp());
		
		System.out.println("list: " + list);
	}

}
