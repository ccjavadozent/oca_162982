package functional;

public class B08_Lambda_Syntax_nochmal {

	interface Combiner {
		int combine(int a, int b);
	}
	
	static class Adder implements Combiner {
		@Override
		public int combine(int a, int b) {
			return a + b;
		}
		
	} // end of Adder
	
	public static void main(String[] args) {

		Combiner c1 = new Adder();
		
		System.out.println( c1.combine(2, 3) ); // 5
		
		/*
		 * 
		 */
		Combiner c2 = null; // bitte mit einer Lambda die Adder-Realisierung nachbilden
		
		System.out.println( c2.combine(2, 3) ); // 5 
		
	}

}
