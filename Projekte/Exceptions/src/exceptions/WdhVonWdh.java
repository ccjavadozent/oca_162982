package exceptions;

public class WdhVonWdh {
	
	static class Foo {
		void m() throws ArithmeticException { 
			System.out.println(5/0); 
		}
	}
	
	static class Bar extends Foo {
		void m() {
			try {
				super.m();
				
			} finally {
				System.out.print("a ");
			}
		}
	}
	

	public static void main(String[] args) {

		try {
			
			Foo f = new Bar();
			f.m(); // <- Polymorphischer Aufruf
			
		} catch (Exception e) {
			System.out.print("b ");
		}
		
	}

}
