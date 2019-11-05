package exceptions;

public class B05_Throwable {

	public static void main(String[] args) {
		
		try {
			
//			System.out.println(5 / 0); // ArithmeticException
			
//			int[] arr = new int[1];
//			System.out.println( arr[1] ); // ArrayIndexOutOfBoundsException
			
			Integer x = null;
			int y = x; // NullPointerException
			
		} catch (Exception e) {
			System.out.println("Abgefangen: " + e);
			e.printStackTrace();
		}

		
		/*
		 * Vererbungshierarchie (s. das Klassendiagramm 'Throwable.uxf')'
		 */
		Throwable t1 = new ArithmeticException("ae");
		RuntimeException rt1 = new NullPointerException("npe");

		/*
		 * Throwable hat die Methode 'String getMessage()'
		 */
		System.out.println( t1.getMessage() ); // ae
		System.out.println( rt1.getMessage() ); // npe 
		
		/*
		 * Throwable hat die Methode 'printStackTrace()' 
		 */
		t1.printStackTrace();
		
	}

}
