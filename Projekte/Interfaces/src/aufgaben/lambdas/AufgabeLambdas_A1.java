package aufgaben.lambdas;

interface IntOperation {
	int execute(int x, int y);
}

class Sum implements IntOperation {
	@Override
	public int execute(int x, int y) {
		return x + y;
	}
}

class Max implements IntOperation {
	@Override
	public int execute(int x, int y) {
		return x > y ? x : y;
	}
}

public class AufgabeLambdas_A1 {

	public static void main(String[] args) {
		
		IntOperation op1 = new Sum();	// Kann Summe bilden
		System.out.println( op1.execute(2, 3) ); // 5
		
		IntOperation op2 = (x, y) -> x + y;	// hier eine Lambda zum Bilden der Summe
		System.out.println( op2.execute(2, 3) ); // 5
		
		IntOperation op3 = new Max(); // Kann den größeren Wert ermitteln
		System.out.println( op3.execute(-6, 17) ); // 17
		
		IntOperation op4 = (x, y) -> x > y ? x : y; // hier eine Lambda um den größeren Wert zu ermitteln
		System.out.println( op4.execute(-6, 17) ); // 17

	}

}
