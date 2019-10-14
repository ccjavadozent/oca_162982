package aufgaben;

class Size {
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
}

class Kreis {
	private int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. Radius = " + radius;
	}
	
	public int getRadius() {
		return radius;
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
		
	} // end of main
	
	/*
	 * Lösdung 1 (nicht so gut). Ohne Polymorphie
	 */
	static Object getMax(Object a, Object b) {
		if(a instanceof Size) {
			Size sA = (Size) a;
			Size sB = (Size) b;
			
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
