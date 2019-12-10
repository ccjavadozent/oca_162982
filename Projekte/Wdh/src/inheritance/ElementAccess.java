package inheritance;

public class ElementAccess {
	
	static class A {
		static void smA() { System.out.println( "AsmA" ); }
		
		int x = 12;
		
		public int getX() {
			return x;
//			return this.x;
//			return A.this.x;
		}
		
		int get() { 
			return x; 
		}
	}
	
	static class B extends A {
		static void smA() { System.out.println( "BsmA" ); }
		
		int x = 33;
	
		int get() {
			return x;
//			return B.this.x;
		}
	}

	
	
	public static void main(String[] args) {

		A v1 = new B();
		
		v1.smA(); // AsmA 	// Achtung! Keine Instanzmethode! Keine Polymorphie!
		A.smA();  // AsmA
		
		
		System.out.println( v1.x ); // 12
		System.out.println( v1.getX() ); // 12
		
		System.out.println( v1.get() );  // 33
	}

}
