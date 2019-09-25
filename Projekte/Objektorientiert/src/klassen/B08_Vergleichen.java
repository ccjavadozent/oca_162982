package klassen;


class Blume {
	int preis;

	public Blume(int preis) {
		this.preis = preis;
	}
	
	/*
	 * toString überschreiben
	 */
	public String toString() {
		return "Blume. Preis: " + preis;
	}
	
	/*
	 * equals überschreiben
	 */
	public boolean equals(Object param) {
		Blume b2 = (Blume)param;
		return preis == b2.preis;
	}
	
}



public class B08_Vergleichen {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 3;
		
		System.out.println("x == y: " + (x == y)); // true. Vergleich der primitiven

		System.out.println("*** b1 und b2 referenzieren unterschiedliche Objekte");
		
		Blume b1 = new Blume(12);
		Blume b2 = new Blume(12);
		
		System.out.println("A. b1 == b2: " + (b1 == b2)); // false. Referenzenvergleich

		boolean result = b1.equals(b2); // true. Vergleich der Inhalte (equals ist überschrieben)
		System.out.println("A. b1.equals(b2): " + result); 
		
		
		
		System.out.println("*** b1 und b2 referenzieren dasselbe Objekt");
		
		b1 = b2;
		System.out.println("B. b1 == b2: " + (b1 == b2)); // true. Referenzenvergleich
		
		result = b1.equals(b2); // true. Vergleich der Inhalte (equals ist überschrieben)
		System.out.println("B. b1.equals(b2): " + result);
		
	}

}
