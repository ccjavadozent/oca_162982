package classes;


class Fahrzeug {
	final int k1;		// A
	final int k2 = 2;	// B
	final int k3;		// C
	{ k3 = 3; }			// D
	Fahrzeug() { }		// E
}	


class A {
	A(int x) {}
}

class B extends A {
	
	B() {
		
	}
	
	B(int x) {
		super();
	}
	
}


public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
