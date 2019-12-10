package exceptions;

public class Q16 {

	static void test() {
		try {
			mE();
			
			System.out.print("a ");
		
		} catch (Exception e) {
			System.out.print("b ");
			
		} finally { 
			System.out.print("c ");
		} 
	}


//[X] A. a b c
//       
//[X] B. b c
//       
//[X] C. a c
//       
//[X] D. c gefolgt von einem Error
//       
//[X] E. keine Ausgaben, die Anwendung friert ein.
    
	static void mA() throws Exception {
		System.out.print("a ");
		throw new Exception();
	}
	
	static void mB() {
		throw new RuntimeException();
	}
	
	static void mC() {
	}
	
	static void mD() {
		throw new Error();
	}
	static void mE() {
		for(;;);
	}
	
	public static void main(String[] args) {
		
		test();

	}

}
