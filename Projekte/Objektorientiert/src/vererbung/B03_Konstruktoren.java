package vererbung;

/*
 * - Jede Klasse hat mindestens einen Konstruktor
 * - Falls keine expliziten Konstruktoren definiert wurden, wird der implizite default-Constructor generiert
 * - in jedem Konstruktor ist die erste Anweisung ein Aufruf von einem anderen Konstruktor mit this(...) oder super(...)
 * - in jedem Konstruktor werden (direkt oder indirekt) alle Attribute vorinitialisiert
 */

class C1 {
	/*
	 * die Klasse hat den default-Constructor:
	 * 
	 * C1() {
	 * 	super();
	 * }
	 */
}


class C2 {
	int x;
	
	/*
	 * die Klasse hat den default-Constructor:
	 * 
	 * C2() {
	 * 	super();
	 *  this.x = 0;
	 * }
	 */
}


class BaseA {
	int x;
	
	public BaseA(int x) {
		// super(); <- generiert vom Compiler
		// this.x = 0; <- generiert vom Compiler
	}

}

class DerivedA extends BaseA {
	/*
	 * die Klasse hat den default-Constructor:
	 * 
	 * DerivedA() {
	 * 	super();  // die Zeile hat einen Fehler: die Basisklasse hat keinen noargs-Constructor
	 * }
	 */
}


class DerivedB extends BaseA {
	DerivedB() {
		// super(); <- generiert vom Compiler. Die Zeile hat einen Fehler: die Basisklasse hat keinen noargs-Constructor
	}
}


class DerivedC extends BaseA {
	DerivedC() {
		super(); // die Basisklasse hat keinen noargs-Constructor
	}
}


class DerivedD extends BaseA {
	DerivedD() {
		super(13); 
	}
}



public class B03_Konstruktoren {

	public static void main(String[] args) {
		BaseA var1 = new BaseA(13);
		System.out.println("var1.x: " + var1.x); // 0 
	}

}
