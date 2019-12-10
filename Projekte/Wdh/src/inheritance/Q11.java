package inheritance;

public class Q11 {

	public static void main(String[] args) {
		Object[] a1 = { 1, 2 };
		a1[0] = 7.2;						// A
		System.out.print(a1[0] + " "); 		
		
		Integer[] a2 = { 1, 2 };
		a1 = a2;
		
		a1[0] = 7.3; 						// B
		System.out.print(a1[0]); 		
	}

}
