package klassen;

/*
 * s. Die Datei 'Diagramme/GarbageCollector.pptx' 
 * 
 * - Wenn der GC aktiv wird, sammelt (löscht) er die Objekte auf dem Heap, 
 * zu denen es keine Verbindung vom Stack oder mit statischen Referenzen gibt.
 * 
 * - Für die Prüfung: Klassenobjekte bleiben nach dem Laden im Arbeitspeicher 
 * bis zum Ende und werden nicht vom GC gelöscht 
 * 
 * - Es wird nicht versprochen, dass oder wann GC den Sammelvorgang startet.
 * - Mit System.gc() kann man versuchen den GC anzustoßen (keine Garantie) 
 * - Vor dem Löschen eines Objektes (wenn es überhaupt dazu kommt) ruft der GC die Methode finalize auf 
 */

public class B12_GarbageCollector {

	public static void main(String[] args) {

		// Zeile A: 0 Objekte stehen dem GC zu Verfügung
		
		args = null;
		
		// Zeile B: 1 Objekte für GC
		
		
	}

}
