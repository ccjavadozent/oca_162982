package imperative;

class Foo {
	
	final int K0;		 	// A
	final int K1 = 1; 		// B
	final int K2;			// C
	
	{
		K1 = 1;				// D
		K2 = 2;				// E
	}
	
	int K3;					// F
	
	Foo() {
		K3 = 3;				// G
	}
}

public class Q13 {

}
