package vererbung;

/*
 * Polymorphismus = Vielgestaltigkeit
 * 
 * Polymorphismus gibt es nur bim Aufruf einer Instanzmethode
 */

public class B10_Polymorphismus {
	
	static class Auto {
		void fahren() {
			System.out.println("Auto fährt...");
		}
	}
	
	static class PKW extends Auto {
		void fahren() {
			System.out.println("PKW fährt...");
		}
	}
	
	static class LKW extends Auto {
		
	}

	
	public static void main(String[] args) {
		
		System.out.println("*** a1 = new Auto()");
		Auto a1 = new Auto();
		
		a1.fahren(); // polymorphischer Aufruf ( late binding )
		
		/*
		 * polymorphischer Aufruf:
		 * 
		 * - Suche das Objekt, auf das die Referenz a1 zeigt
		 * - Finde die Klassendefinition des Objektes (Klassenobjekt)
		 * - Finde die Methode 'fahren' in der Klassendefinition und starte sie
		 * 
		 */

		System.out.println("*** a1 = new PKW()");
		a1 = new PKW();
		a1.fahren(); // polymorphischer Aufruf

		System.out.println("*** a1 = new LKW()"); // polymorphischer Aufruf der println

		a1 = new LKW();
		a1.fahren(); // polymorphischer Aufruf
		
	}
}
