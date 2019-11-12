package vererbung;

import java.util.function.Predicate;

/*
 * final class: keine Vererbung
 */
final class KlasseVonDerNichGeerbtWerdenDarf {}
//class X extends KlasseVonDerNichGeerbtWerdenDarf {} // Compilerfehler (Basisklasse ist final)


/*
 * final Methoden: kein Überschreiben
 */
class Base {
	@Override
	public final String toString() {
		return "Base";
	}
}

class Derived extends Base {
	// public String toString() { return "Derived"; } // Compilerfehler (Die Methode ist final)
}


/*
 * final Variablen: Konstanten
 */
public class B17_final {
	
	static final int K1 = 1; // statische Konstante (nur lesen)
	
	static final int K2;

	static {
		K2 = 2;
	}
	
	
	final int objK1 = 12; // Objekt-Konstante
	
	final int objK2;
	
	{
		objK2 = 23;
	}
	
	final int objK3;
	
	public B17_final() {
		objK3 = 34;
	}
	
	public static void main(final String[] args) { // Konstante (auch Parameter dürfen konstant werden)

		System.out.println(K1);
		// K1 = 111; // Compilerfehler (Konstante)
		
		System.out.println( new B17_final().objK1 );
		// new B17_final().objK1 = 555; // Compilerfehler (Konstante)
		
		System.out.println(args);
		// args = null; // Compilerfehler (Konstante)
		
		final StringBuilder sb = new StringBuilder(); // lokale Konstante
		sb.append("java");
		// sb = new StringBuilder(); // Compilerfehler (Konstante)
		
		
		int x = 22; // muss 'effectively final' bleiben, wenn in einer Lambda verwendet
		
		Predicate<Integer> p1 = var -> {
//			x = 3; // muss 'effectively final' bleiben
			System.out.println(x);
			return true;
		};
		
//		x = 3; // für main OK, aber beim Zugriff in der Lambda: Compilerfehler in der Lambda
		
	}

}
