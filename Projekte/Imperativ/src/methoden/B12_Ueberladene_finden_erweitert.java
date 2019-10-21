package methoden;

/*
 * Nicht in der Prüfung: Zweideutigkeit beim Aufruf der überladenen Methoden
 */
interface Lauffaehig {}

class Auto {}

class Opel extends Auto implements Lauffaehig {}


public class B12_Ueberladene_finden_erweitert {

	static void fahren(Auto param) { System.out.println("Auto"); } 
	static void fahren(Lauffaehig param) { System.out.println("Lauffähig"); }

	static void m(int x, long y) { System.out.println("int, long"); }
	static void m(long x, int y) { System.out.println("long, int"); }

	
	public static void main(String[] args) {
		
		Auto var1 = new Opel();
		fahren(var1);
		
		Lauffaehig var2 = new Opel();
		fahren(var2);
		
		Opel var3 = new Opel();
//		fahren(var3); // Zweideutig - Compilerfehler
		fahren((Auto)var3);
		fahren((Lauffaehig)var3);
		
		
		short s1 = 1;
		short s2 = 1;
		
//		m(s1, s2); // Zweideutig - Compilerfehler
		
//		m(2, 3); // Zweideutig - Compilerfehler
		
		m((int)s1, (long)s2);

		m((long)s1, s2);
		
	} // end of main
	
}
