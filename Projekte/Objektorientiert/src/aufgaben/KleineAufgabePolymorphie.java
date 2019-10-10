package aufgaben;

public class KleineAufgabePolymorphie {

	public static void main(String[] args) {

		IntOperation op1 = new AddOne(); // Eine Einz addieren
		IntOperation op2 = new Negate(); // Vorzeichen umkehren
		
		int x = 5;
		
		x = op1.execute(x);
		System.out.println("x = " + x); // 6
		
		x = op2.execute(x);
		System.out.println("x = " + x); // -6
	}

}
