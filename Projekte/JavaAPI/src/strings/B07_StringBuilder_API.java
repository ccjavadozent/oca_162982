package strings;

public class B07_StringBuilder_API {

	public static void main(String[] args) {

		/*
		 * Konstruktoren
		 */
		new StringBuilder();
		new StringBuilder("java"); // String-Parameter
		new StringBuilder(20); // int-Parameter (Anfangsgröße des internen Arrays)

		/*
		 * StringBuilder append(param) (für alles mögliche überladen)
		 */
		StringBuilder sb1 = new StringBuilder();
		sb1.append("java");
		sb1.append(" ist ");
		sb1.append("toll");
		
		/*
		 * StringBuilder delete(int start, int end)
		 */
		sb1.delete(0, 4);
		System.out.println("1:" + sb1); // " ist toll"
		
		
		
	}

}
