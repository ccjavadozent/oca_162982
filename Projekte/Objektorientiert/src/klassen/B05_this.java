package klassen;

/*
 * - this ist das Schlüßelwort, das nur in Instanz-Methoden (bzw. Konstruktoren) existiert.
 * 
 * - this zeigt auf das Objekt, mit dem die Instanz-Methode aufgerufen wird.
 */


class Hund {
	String name;
	int alter;
	

	public void setAlter(int alter) {
		// alter = alter; // falsch! lokale Variable auch links
		this.alter = alter; // richtig: links Attribut, rechts lokale Variable
	}
	
	/*
	 * toString wurde überschrieben:
	 */
	public String toString() {
		return "Hund " + name + ", Alter: " + this.alter;
	}
}



public class B05_this {

	public static void main(String[] args) {
		
		Hund h1 = new Hund();
		h1.name = "Rex";
		h1.alter = 3;
		
		String h1AlsString = h1.toString(); // Vor dem Überschreiben der toString: klassen.Hund@4d591d15
												// Nach dem Überschreiben: Hund Rex, Alter: 3
		System.out.println( "h1.toString(): " + h1AlsString );
		
		System.out.println("h1: " + h1); // Vor dem Überschreiben der toString: klassen.Hund@4d591d15
											// Nach dem Überschreiben: Hund Rex, Alter: 3

		System.out.println(h1); // Hund Rex, Alter: 3
		
		h1.setAlter(4);
		
		System.out.println(h1); // Hund Rex, Alter: 4
		
		Hund h2 = new Hund();
		h2.name = "Lassie";
		
		System.out.println(h2); // Hund null, Alter: 0
		
		h2.setAlter(6);
		System.out.println(h2); // Hund null, Alter: 6
	}

}
