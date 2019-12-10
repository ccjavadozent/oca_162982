package inheritance;

public class InstanceMethodCall {
	
	static class A {
		void mA() { System.out.println("AmA"); }
		void mB() { System.out.println("AmB"); }
	}
	
	static class B extends A {
		void mB() { System.out.println("BmB"); }
		void mC() { System.out.println("BmC"); }
	}

	static class C extends A {
		void mC() { System.out.println("CmC"); }
		void mD() { System.out.println("CmD"); }
	}
	
	public static void main(String[] args) {

		A v1 = new A();
//		B v2 = new A();
		A v3 = new B();
//		B v4 = new C();
		
		v1.mA(); // AmA
		v1.mB(); // AmB
//		v1.mC();
		
		v3.mA(); // AmA
		v3.mB(); // BmB
//		v3.mC();
//		v3.mD();
		
		
	}

}
