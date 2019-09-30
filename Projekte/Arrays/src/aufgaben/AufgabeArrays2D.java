package aufgaben;

public class AufgabeArrays2D {

	public static void main(String[] args) {

		System.out.println("*** A1");
		
		int[][] arr = createArray(4, 5);
		
		printArray(arr);
		
		System.out.println("*** A2");
		
		arr[1][1] = 5;
		
		printArray(arr);
		
		System.out.println("*** A3");
		
		setValue(arr, 2);
		
		printArray(arr);
		
	} // end of main
	
	static int[][] createArray(int rows, int columns) {
		return new int[rows][columns];
	}


	static void printArray(int[][] arr) {
		for(int row=0 ; row < arr.length ; row++) {
			
			for(int col=0; col<arr[row].length ;col++) {
				System.out.print(arr[row][col]);
				
				if(col<arr[row].length-1) {
					System.out.print(", ");					
				}
				
			}
			System.out.println();
		}
	}
	
	static void setValue(int[][] arr, int value) {
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = value;
			}
		}
	}
	
}
