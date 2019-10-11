package aufgaben;

abstract class IntOperation {
	abstract int execute(int x);
	
	IntOperation andThen(IntOperation secondOperation) {
		return new TwoOperations(this, secondOperation);
	}
}


class TwoOperations extends IntOperation {
	
	private IntOperation firstOperation;
	private IntOperation secondOperation;
	
	public TwoOperations(IntOperation firstOperation, IntOperation secondOperation) {
		this.firstOperation = firstOperation;
		this.secondOperation = secondOperation;
	}

	@Override
	int execute(int x) {
		int y = firstOperation.execute(x);
		return secondOperation.execute(y);
	}
}


class AddOne extends IntOperation {
	
	int execute(int x) {
		return x + 1;
	}
}

class ChangeSign extends IntOperation {
	
	int execute(int x) {
		return -x;
	}
}

class Multiply extends IntOperation {
	private int factor;
	
	public Multiply(int factor) {
		this.factor = factor;
	}

	int execute(int x) {
		return x * factor;
	}
}

class Subtract extends IntOperation {
	private int value;
	
	public Subtract(int value) {
		this.value = value;
	}

	@Override
	int execute(int x) {
		return x - value;
	}
}

public class KleineAufgabePolymorphie {

	public static void main(String[] args) {

		/*
		 * A1.
		 */
		// IntOperation opSinnlos = new IntOperation();
		
		IntOperation op1 = new AddOne(); // Eine Einz addieren
		IntOperation op2 = new ChangeSign(); // Vorzeichen umkehren
		
		int x = 5;
		
		x = op1.execute(x);
		System.out.println("x = " + x); // 6
		
		x = op2.execute(x);
		System.out.println("x = " + x); // -6
		
		/*
		 * A2.
		 * 
		 * Erzeugen Sie ein Array mit mindestens 4 (vier) unterschiedlichen IntOperation-Arten.
		 * 
		 * Jagen Sie einen int-Wert durch das Array so, dass alle Operationen sequentiell ausgeführt werden
		 * und jede nächste Operation als Eingangswert (input) das Ergebnis der vorherigen Operation erhält
		 */
		x = 2; 
		
		IntOperation[] array = {
			new AddOne(), 		// x + 1 = 3	
			new ChangeSign(),	// -3
			new Multiply(4),	// -3 * 4 = -12
			new Subtract(7)		// -12 - 7 = -19
		};
		
		for(IntOperation op : array) {
			x = op.execute(x);
		}
		
		System.out.println("x = " + x);
		
		
		/*
		 * A3.
		 * 
		 * Nach folgendem Muster sollen Int-Operationen kombiniert werden können
		 */
		
		IntOperation op = new AddOne()
								.andThen( new ChangeSign() )
								.andThen( new Multiply(4) )
								.andThen( new Subtract(7) );
		
		int result = op.execute(2);
		System.out.println( "result = " + result ); // -19
		
		
		
	} // end of main

}
