package arrays;

public class B08_MehrdimArraysReferenzenDeklarieren {

	public static void main(String[] args) {
		
		/*
		 * Folgende drei Deklarationen sind identisch.
		 * Jedesmal wird eine Referenz vom Typ int[][] deklariert
		 */
		
		int[][] a1;
		int[] a2[];
		int a3[][];

	
		a1 = new int[2][];
		a2 = new int[2][];
		a3 = new int[2][];

//		a3 = new int[2];		// Compilerfehler: int[][] <= int[]
//		a3 = new int[2][][];	// Compilerfehler: int[][] <= int[][][]
		
		a3[0] = new int[2];		// int[] <= int[]
		a3[0][0] = 77;
		
		/*
		 * 
		 */
		int[] arrA, arrB[], arrC[][]; 
		
		arrA = new int[2]; // int[] <= int[]
		
		arrB = new int[2][2];
		
		arrC = new int[2][2][2];
		
		arrB[0] = arrA;
		
//		arrC[0] = arrB[0]; 		Compilerfehler: int[][] <= int[]
	}
	
}
