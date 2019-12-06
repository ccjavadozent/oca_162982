package arrays;

public class Q11 {

	public static void main(String[] args) {

		int[] a1 = {};
		
		// System.out.println( a1 instanceof Object[] ); // Compilerfehler! Geschwisterklassen
		 System.out.println( a1 instanceof Object ); // true
		
		Integer[] a2 = {};
		
		System.out.println( a2 instanceof Object[] ); // true
		
		
		Integer[] a3 = { 1, 2, 3 };
		
		System.out.println(a3 instanceof Integer[] ); // true

		System.out.println(a3 instanceof Number[] ); // true
		

		// int[] a4 = new int[2][];
		
		Object[] a5 = new int[2][];
		
		System.out.println("----------------------------");
		
		int[] x;
		int y [];
		int z[];
		
		x = x();
		x = y();
		
		System.out.println("---------------------------");
		int [] v1, v2, v3[];
		
		v2 = x();
//		v3 = x();  // int[][] <= int[]
	}
	
	static int[] x() { return null; }
	static int y() [] { return null; } // bitte nicht nachmachen

}
