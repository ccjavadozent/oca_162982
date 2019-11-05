package enums;

import java.util.Arrays;

/*
 * Enum ist Basisklasse jeder enum-Klasse:  https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html
 */

enum Element {
	WASSER,		// new Element()
	FEUER(12),	// new Element(12)
	LUFT(77) {	// new 'anonyme Klasse'(77)
		@Override
		public String toString() {		// überschreibt toString der Klasse Element speziell für das Objekt LUFT
			return "Luft ist luftig";
		}
	},		
	ERDE(16); 	// new Element(16)
	
	/*
	 * Statische Elemente wie in jeder Klasse 
	 */
	public static Element[] valuesAbsteigend() {
		Element[] vals = values();
		Arrays.sort( vals, (e1, e2) -> e2.ordinal()-e1.ordinal() );
		return vals;
	}
	
	/*
	 * Objekt-Elemente wie in jeder Klasse.
	 * Ausnahme: alle Konstruktoren sind immer private (auch implizit)
	 */
	private int x;
	
	// Konstruktor ist implizit private:
	Element() {}
	
	private Element(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	@Override
	public String toString() {
		return name().toLowerCase() + ". x = " + x;
	}
} // end of Element



class MyValue {
	static final MyValue V1 = new MyValue() { // 'anonyme Klasse' extends MyValue
		@Override
		public String toString() {
			return "v1";
		}
	};
	
	@Override
	public String toString() {
		return "My Value";
	}
}

public class B05_EigenerCodeInEnum {

	public static void main(String[] args) {

		for( Element e : Element.values() ) {
			System.out.println(e.ordinal() + ". " + e);
		}
		
		System.out.println(new MyValue()); // My Value
		System.out.println(MyValue.V1); // v1
	
	}

}
