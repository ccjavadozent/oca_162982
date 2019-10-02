package methoden;

public class WdhVarargs {

	public static void main(String[] args) {

		int[] a = {};
		
		m1(a); // m1(new int[][] { a });
		
		int[] b = {};
		
		m1(a, b); //  m1(new int[][] { a, b });
		
//		int[]... c = {}; // CF
		
		int[] c[] = { a, b };
		
		m1(c);
		
	} // end of main

	static void m1(int[]... x) {}
}
