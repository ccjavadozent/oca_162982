package inheritance;

public class CrossMethodCall {
	
	static class A {
		A() {
			this(12);
		}
		A(int x) {
//			this();
			this((byte)3);
		}
		
		A(byte b) {
			
		}
	}
	

	public static void main(String[] args) {
		a();
		System.out.println("end");
	}

	static void a() {
		b();		
	}
	static void b() {
		a();
	}
	
}
