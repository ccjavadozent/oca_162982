package inheritance;

public class StaticInit {
	
	static class A {
		static {
			System.out.println("SIA");
		}
	}
	
	static class B extends A {
		static {
			System.out.println("SIB");
		}
	}
	

	public static void main(String[] args) {
		
		new B();

		new A();
	}

}
