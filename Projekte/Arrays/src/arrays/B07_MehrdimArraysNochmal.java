package arrays;

class Giraffe {
	String name = "Phelix";
}



public class B07_MehrdimArraysNochmal {

	public static void main(String[] args) {

		int[] arr1; // 0 Objekte
		
		int[][] arr2 = new int[5][]; // 1 Objekt 
		
		int[][][][][][] arr3 = new int[2][][][][][]; // 1 Objekt
		
		
		int[][][] arr4 = new int[2][3][2]; // 9 Objekte

		int[][][] arr5 = new int[3][2][3]; // 10 Objekte

		String[] arr6 = new String[3]; // 1 Objekt (alle Elemente sind null)

		String[][][] arr7 = new String[3][2][3]; // 10 Objekte
		
		
		Giraffe[] arr8 = new Giraffe[10]; // 1 Objekt (Array selbst)
		
		arr8[0] = new Giraffe(); // + 1 Objekt 
		
		Giraffe[][] arr9 = new Giraffe[1][2]; // 2 Objekte (1 2D-Array + 1 einfaches Giraffen-Array)
		
		// arr9[1] = arr8; // java.lang.ArrayIndexOutOfBoundsException
		arr9[0] = arr8;
		
		System.out.println( arr8[0].name ); // Phelix
		System.out.println(  arr9[0][0].name ); // Phelix
		
		
		System.out.println("end of main");
		
	} 
	
}
 