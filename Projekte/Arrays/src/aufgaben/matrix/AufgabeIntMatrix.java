package aufgaben.matrix;

public class AufgabeIntMatrix {

	public static void main(String[] args) {

		IntMatrix m1 = new IntMatrix(2, 3);
		
		System.out.println("*** Matrix m1: ");
		System.out.println(m1);
		
		System.out.println("m1. Zeilen: " + m1.getCountRows()); 
		System.out.println("m1. Spalten: " + m1.getCountColumns());
	
		
		IntMatrix m2 = new IntMatrix(5, 3, 100);

		System.out.println();
		System.out.println("*** Matrix m2");
		System.out.println(m2);
		
		System.out.println("m2.get(1, 2) = " + m2.get(1, 2));
		
		m2.set(1, 2, -17);
		
		System.out.println("m2.get(1, 2) = " + m2.get(1, 2));
		
		
		System.out.println();
		System.out.println("*** Matrix m2");
		System.out.println(m2);
	}

}












