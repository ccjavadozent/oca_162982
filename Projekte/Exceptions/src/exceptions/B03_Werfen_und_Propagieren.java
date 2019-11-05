package exceptions;

public class B03_Werfen_und_Propagieren {
	
	static void m1() {
		System.out.println("a");
		
		if(true) 
			throw new ArithmeticException("test exc");
		
		System.out.println("b");
	}
	

	public static void main(String[] args) {

		System.out.println("m");
		
		m1();
		
		System.out.println("end of main");
	}

}
