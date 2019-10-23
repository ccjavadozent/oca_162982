package wrapper;

public class WdhWrapper {
	
	/*
	 * Test 1
	 */
	static int getA() { return Integer.valueOf(12); } 
	
	static void test01() {
		Integer a = getA();
		
		Integer b = (int) getA();
		
		Integer c = (Integer) getA();
	
		int d = (int) getA();
		
		int e = (Integer) getA();
		
		Object f = getA();
		
		Number n = getA();
		
		long g = getA();  // long <= int
		
//		Long h = getA();  // Long <= Integer (Autoboxing)
		
		Long i = (long)getA();  // Long <= Long (Autoboxing nach dem Casting)
	}

	
	/*
	 * Test 2
	 */
	static class Foo {
		int a;
		Integer b; // null
		
		Foo(int x) {
			a = x + b; // b.intValue()
		}
		@Override
		public String toString() {
			return String.valueOf(a);
		}
	}
	
	public static void main(String[] args) {
		System.out.println( new Foo(3) ); // NullPointerException
	}
	
}
