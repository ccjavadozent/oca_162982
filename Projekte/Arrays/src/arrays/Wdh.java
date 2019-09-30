package arrays;

import java.util.Arrays;

public class Wdh {

	public static void main(String[] args) {
		
		char[] tom = { 't', 'o', 'm' };
		
		char[] paul = { 'p', 'a', 'u', 'l' };
		
//		int[] x = tom; // CF
		
//		int[][] room = {	// CF
//			tom	
//		};

		char[][] room = {
			tom,
			null,
			null,
		};
		
		System.out.println("room.length: " + room.length); // 3
		
//		room = { tom, jerry }; 
//		room = { tom, paul };  // CF
		
//		room = new int[3] { tom, null, null }; // CF 
	
//		room = new char[3][] { tom, null, null }; // CF
		
		room = new char[][] { tom, null, null };
		
		try {
			room[3] = paul; //  java.lang.ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Laufzeitfehler! " + e.getMessage());
		}
		
		room[1] = paul;
		room[2] = tom;
		
		for(char[] subArr : room) {
			System.out.println( Arrays.toString(subArr) );
		}
		
		System.out.println("-------------------------");
		
		room[0][2] = 'R';
		
		System.out.println(room[2][2]); // R
		
		System.out.println("-------------------------");
		
		for(char[] subArr : room) {
			System.out.println( Arrays.toString(subArr) );
		}
		
		
	}

}

