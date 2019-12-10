package inheritance;

interface I {
	default void m1() {
		m2();
		sMethod();
	}

	/*
	 * In der Prüfung: Compilerfeheler! 
	 * 
	 * private erst ab Java 9:
	 */
	private void m2() {}
	private static void sMethod() {}
	
}

public class Tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
