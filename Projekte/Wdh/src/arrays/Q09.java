package arrays;

import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3 };

		System.out.println(a); // [I@53bd815b
		
		System.out.println( Arrays.toString(a) ); // [1, 2, 3]
		
		String s1 = String.valueOf(a);
		
		System.out.println( s1 ); // [I@53bd815b
		
		char[] a2 = { '1', '2', '3' };
		
		String s2 = String.valueOf(a2);
		
		System.out.println(s2); // 123
	}

}
