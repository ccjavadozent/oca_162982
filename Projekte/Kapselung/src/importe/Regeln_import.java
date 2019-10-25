package importe;

/*
 * - Besonderes Package java.lang - alle Typen aus dem Package sind ohne import-Anweisung verwendbar
 * 
 * - Nur sichtbare Elemente lassen sich importieren!
 * 
 * - import: importiert einen oder alle Toplevel-Typen aus einem Package!
 * 
 * 
 */

import importe.p1.Utils; // eine Klasse (Utils) importieren

import java.util.*;	// alle Toplevel-Typen importieren

public class Regeln_import {

	public static void main(String[] args) {
		
		/*
		 * für Typen aus java.lang geht es ohne import: 
		 */
		java.lang.String s1;
		String s2;
		
		
		/*
		 * eine Klasse wurde importiert
		 */
		importe.p1.Utils u1; // Vollqualifizierter Klassenname
		
		System.out.println( importe.p1.Utils.P1 );

		Utils u2; // 'vereinfachter' Klassenname (importiert)
		
		System.out.println( Utils.P1 );

		
		/*
		 * Alle Toplevel-Typen wurden importiert
		 */
		java.util.Random r1; // Vollqualifizierter Klassenname
		
		Random r2; // 'vereinfachter' Klassenname (importiert)
		
		java.util.ArrayList<Integer> list1; // Vollqualifizierter Klassenname
		
		ArrayList<Integer> list2; // 'vereinfachter' Klassenname (importiert)
		
				
		
		
	}

}
