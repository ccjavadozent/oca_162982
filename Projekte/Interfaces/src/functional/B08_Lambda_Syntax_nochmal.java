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
		 * Lambda ausführlich
		 */
		Combiner c2 = (int a, int b) -> {
			return a + b;
		}; 
		
		System.out.println( c2.combine(2, 3) ); // 5
		
		/*
		 * Kompakter
		 */

//		Combiner c3 = int a, int b -> { return 0; };
		Combiner c3 = (a, b) -> { return a+b; };
//		Combiner c4 = (a, b) -> return a+b; 
		Combiner c4 = (a, b) -> a+b; 
//		Combiner c5 = (a, b) -> { a+b };
		
	}

}
