package arrays;

public class B06_MehrdimArrays {

	public static void main(String[] args) {

		int[][] a1 = new int[2][];
		
		System.out.println("1. a1[0] = " + a1[0]); // null
		
		a1[0] = new int [] { 0, 77, 0 };
		
		System.out.println("2. a1[0] = " + a1[0]); // [I@59f95c5d

		System.out.println("3. a1[0][1] = " + a1[0][1]); // 77
	
		
		int[] tmp = { 1, 2, 3, 4, 5 };
		
		a1[1] = tmp;
		
		System.out.println("4. a1[1][1] = " + a1[1][1]); // 2
		
		
		/*
		 * 
		 */
		System.out.println("*** A. Alles aus a1: ");
		
		for(int i=0; i<a1.length; i++) {
			int[] subArray = a1[i];
			
			for(int j=0; j<subArray.length; j++) {
				System.out.print( subArray[j]  + " ");
			}
			System.out.println();
			
		}
		
		/*
		 * 
		 */
		System.out.println("*** B. Alles aus a1 nochmal:");
		
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * 
		 */
		System.out.println("*** C. Alles aus a1 nochmal:");
		for(int[] subArray : a1) {
			for(int x : subArray) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
