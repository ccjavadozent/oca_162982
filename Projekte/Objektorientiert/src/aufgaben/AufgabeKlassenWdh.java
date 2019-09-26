package aufgaben;


class Wdh {
	
	int x;
	
	// void Wdh() { } // Kompiliert aber NICHT empfohlen
	
	/*
	 
	 Anders als bei den Methoden (s. m1-Definitionen):
	 
	 hier Compilerfehler:
	 
	 Wdh() { 
		this(2); 
	 }
	 
	 Wdh(int x) {
		this();		 
	 }
	 
	 */

	
	void m1() {
		m1(2);
	}
	void m1(int x) {
    	m1();
    	System.out.println("m(int)");
	}

}



public class AufgabeKlassenWdh {

	public static void main(String[] args) {

		// Wdh.m1();		// Compilerfehler

		// new Wdh().m1(); 	// StackOverflowError
		
	}

}
