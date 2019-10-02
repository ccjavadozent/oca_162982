package klassen;

/*
 * - Wenn der GC aktiv wird, sammelt (löscht) er die Objekte auf dem Heap, 
 * zu denen es keine Verbindung vom Stack oder mit statischen Referenzen gibt.
 * 
 * - Für die Prüfung: Klassenobjekte bleiben nach dem Laden im Arbeitspeicher 
 * bis zum Ende und werden nicht vom GC gelöscht 
 */

public class B12_GarbageCollector {

	public static void main(String[] args) {

		// Zeile A: 0 Objekte stehen dem GC zu Verfügung
		
		args = null;
		
		// Zeile B: ? Objekte für GC
		
		
	}

}
