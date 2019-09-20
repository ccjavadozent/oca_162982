package methoden;

public class B02_StatischeMethodeAufrufen {

	public static void main(String[] args) {

//		 sayHello(); // Compilerfehler: Methode nicht gefunden, wenn sie in dieser Klasse NICHT existiert
		
		methoden.B01_StatischeMethodeDefinieren.sayHello();
		
		B01_StatischeMethodeDefinieren.sayHello();
	
		B02_StatischeMethodeAufrufen.sayBye();
		
		sayBye(); // der Compiler findet die Methode, wenn sie in dieser Klasse existiert
		
	} // end of main
	
	
	static void sayBye() {
		
		System.out.println("-----------------");
		System.out.println("--- bye bye! ----");
		System.out.println("-----------------");
		
	}
	

}
