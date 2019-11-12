package forjunit.mymath;

public class TestMathUtilsManuell {
	
	public static void main(String...strings) {
		testAdd();
		
		testAddFailsOnIntegerOverflow();
	}
	

	static void testAdd() {
		int expected = 5; // mit einem Taschenrechner
		
		int actual = MathUtils.add(2, 3);
		
		if(  expected != actual ) {
			throw new AssertionError("add: erwartet 5, erhalten aber: " + actual);
		} 
		
		System.out.println("add: OK");
	}

	
	static void testAddFailsOnIntegerOverflow() {
	
		try {
			MathUtils.add(1, Integer.MAX_VALUE);
			
			throw new AssertionError("1 + Integer.MAX_VALUE hat keine Exception verursacht!");
			
		} catch (IllegalArgumentException e) {
			System.out.println("addFailsOnIntegerOverflow: OK");
		}
		
	}
	
}
