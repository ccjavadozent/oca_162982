package arrays;

class Rechteck {
	int breite;
	int hoehe;
}


public class B01_ArraysMitPrimitiven {

	public static void main(String[] args) {

//		int x1 = 0;
//		int x2 = 0;
//		...		
//		int x100 = 0;
		
		int[] arr1 = new int[100];
		System.out.println(arr1[0]);
		
		Rechteck r1 = new Rechteck();
		System.out.println(r1.breite);
		
		System.out.println(arr1[100]); // java.lang.ArrayIndexOutOfBoundsException
		
		
		short[] tmp = { 1, 2, 3 }; // Geht mit int-Literalen

		int x = 2;
		short[] ref = { 1, x, 3 }; 

		
		
	}

}
