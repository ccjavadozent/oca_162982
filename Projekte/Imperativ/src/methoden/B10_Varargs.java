package methoden;

/*
 * Der einzige Unterschied zw. einer Varargs-Methode und einer Methode mit einem Array-Parameter:
 * 	die Varargs-Methode kann man bequemer aufrufen. 
 * 
 * Regel:
 * 
 *  - Der Vararg-Parameter muss immer der letzte Parameter in der Liste der Methodenparameter sein!
 */
public class B10_Varargs {
	
	static void m1(int x, boolean... p1) {} 
	// static void m1(boolean... p1, int x) {} // Compilerfehler (nicht der letzte Parameter) 
	// static void m1(boolean... p1, int... x) {} // Compilerfehler (p1: nicht der letzte Parameter) 

	
	public static void main(String... args) {

		System.out.println( sum() );
		
		System.out.println( sum(2) );
		
		System.out.println( sum(2, 3) ); // bequem
		
		System.out.println( sum( new int[]{2, 3} ) ); // unbequem (unlesbar)
		
		System.out.println( sum(2, 3, 4) );
		System.out.println( sum(2, 3, 4, 5) );
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println( sum(arr) );
		
		System.out.println( sum(1, 23, 55, 222, 6666, 22136) );
		
	} // end of main


//	static int sum(int a, int b) {
//		return a + b;
//	}
//	
//	static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//	
//	static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}

	static int sum(int... arr) {
		int result = 0;
		
		for (int x : arr) {
			result += x;
		}
		
		return result;
	}
	
//	static int sum(int[] arr) {
//		int result = 0;
//		
//		for (int x : arr) {
//			result += x;
//		}
//		
//		return result;
//	}
	
	
	
	
	
}
