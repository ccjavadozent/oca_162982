package imperative;

public class Q51 {

	public static void main(String[] args) {

		if(false) {
			System.out.println("moin!"); // dead code
		}

		for(;;) {
			int x = 3;
			System.out.println("x = " + x);
		}
		
		System.out.println("bye"); // unreachable code
	}

}
