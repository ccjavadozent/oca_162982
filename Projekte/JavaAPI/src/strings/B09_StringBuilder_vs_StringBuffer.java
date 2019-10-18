package strings;

public class B09_StringBuilder_vs_StringBuffer {

	public static void main(String[] args) {

		/*
		 * - StringBuilder gibt es seit Java 5 alternativ zum StringBuffer
		 * 
		 * - Bitte verwenden Sie im Ihrem neuen Code StringBuilder. Der ist schneller
		 * 
		 */
//		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append(22);
		sb1.append(" > ");
		sb1.append(7.2);
		sb1.append(" = ");
		sb1.append(true);
		
		sb1.insert(2, 3344);
		//...
		
		System.out.println(sb1);
	}

}
