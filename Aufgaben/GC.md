# Aufgabe 'Garbage Collector'

Gegeben ist der Code

	public class Tahiti { 
		Tahiti t;
		 
		public static void main(String[] args) { 
			Tahiti t = new Tahiti(); 
			Tahiti t2 = t.go(t); 
			t2 = null; 
			// Zeile A 
			// ...
		} 
		
		Tahiti go(Tahiti t) { 
			Tahiti t1 = new Tahiti(); 
			Tahiti t2 = new Tahiti(); 
			t1.t = t2; 
			t2.t = t1; 
			t.t = t2; 
			return t1; 
		} 
	}


- Wie viele Objekte stehen dem Garbage Collector in der Zeile A zur Verfügung, falls der GC zu diesem Zeitpunkt startet?

- Zeichnen Sie die Speicherbelegung (Stack/Heap), die durch das Ausführen der main-Methode entsteht.
 

