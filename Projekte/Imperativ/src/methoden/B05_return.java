package methoden;

public class B05_return {
	
	public static void main(String[] args) {

		testReturn(22);
		testReturn(-33);
		testReturn(0);
		
	}

	static void testReturn(int x) {
		System.out.println("Zeile A, x = " + x);
		
		if(x > 0) {
			System.out.println("x ist positiv");
			return;
		}
		
		System.out.println("Zeile B");
		
		if(x<0) {
			System.out.println("x ist negativ");
			return;
		}
		
//		return; // Nach dieser Zeile ist der Code 'unreachable'
		
		System.out.println("x ist null");
		System.out.println("Zeile C");
		
		return;
	}
	
}
