package aufgaben;

interface Vergleichbar {
	/**
	 * Kontrakt:
	 * 	vergleicheMit soll etwas positives liefern, wenn this größer als b ist;
	 *  etwas negatives, wenn this kleiner als b ist; Null, wenn this gleich b ist
	 * @param b
	 * @return
	 */
	int vergleicheMit(Vergleichbar b);
}

class Size implements Vergleichbar {
	private int value;

	public Size(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Size = " + value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int vergleicheMit(Vergleichbar b) {
		Size s2 = (Size) b;
		
		return this.value - s2.value;
	}
}

class Kreis implements Vergleichbar {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. Radius = " + radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int vergleicheMit(Vergleichbar b) {
		return radius - ((Kreis)b).radius;
	}
}

public class KleineAufgabeInterfaces {
	
	public static void main(String[] args) {

		/*
		 * A1
		 */
		Size s1 = new Size(20);
		System.out.println(s1); // Size = 20          <- notwendige Ausgabe
		
		/*
		 * A2
		 */
		Kreis k1 = new Kreis(3);
		System.out.println(k1); // Kreis. Radius = 3
		
		System.out.println("*** ");
		
		/*
		 * A3
		 */
		Size sA = new Size(12);
		Size sB = new Size(7);
		System.out.println( getMax(sA, sB) ); // Size = 12
		
		Kreis kA = new Kreis(4);
		Kreis kB = new Kreis(77);
		
		System.out.println( getMax(kA, kB) ); // Kreis. Radius = 77
		
		// getMax(kA, sA); // ClassCastException
		
		Kreis maxKreis = (Kreis) getMax(kA, kB); // Casting ist nötig
		Size maxSize = (Size) getMax(sA, sB); // Casting ist nötig
		
	} // end of main
	
	
	/*
	 * Lösung 2 mit Interface und Polymorphie.
	 * Keine perfekte Lösung:
	 * 	- erlaubt Size vergleicheMit Kreis (ClassCastException)  
	 *  - Rückgabetyp ist unbequem
	 */
	static Vergleichbar getMax(Vergleichbar a, Vergleichbar b) {
		if( a.vergleicheMit(b) > 0 ) {
			return a;
		} else {
			return b;
		}
	}
	
	
	/*
	 * Lösung 1 (nicht so gut). Ohne Polymorphie
	 */
	static Object getMaxV1(Object a, Object b) {
		if(a instanceof Size) {
			Size sA = (Size) a;
			Size sB = (Size) b; // evtl. ClassCastException
			
			if( sA.getValue() > sB.getValue() ) {
				return a;
			} else {
				return b;
			}
		} else if( a instanceof Kreis ) {
			Kreis kA = (Kreis) a;
			Kreis kB = (Kreis) b;
			
			if( kA.getRadius() > kB.getRadius() ) {
				return a;
			} else {
				return b;
			}
		}
		
		return a;
	}
	
	
	

}
