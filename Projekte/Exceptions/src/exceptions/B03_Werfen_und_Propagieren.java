package exceptions;

public class B03_Werfen_und_Propagieren {
	
	static void m1() {
		System.out.println("a");			// 3. Ausgabe
		
		if(true) 
			throw new ArithmeticException("test exc"); // propagiert zu der Stelle des Aufrufes (in m2)
		
		System.out.println("b");
	}
	
	
	static void m2() {
		System.out.println("c");			// 2. Ausgabe
		
		m1(); // Exception erscheint hier und wird weiter an die Stelle des Aufrufes (in main) propagiert
		
		System.out.println("d");
	}
	

	public static void main(String[] args) {

		System.out.println("m");			// 1. Ausgabe
		
		m2(); // Exception erscheint hier und wird weiter an die Stelle des Aufrufes (zu der VM) propagiert
		
		System.out.println("end of main");
	}

}
