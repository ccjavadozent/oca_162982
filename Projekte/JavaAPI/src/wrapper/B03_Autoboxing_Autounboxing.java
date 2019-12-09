package wrapper;

class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	public int intValue() {
		return value;
	}
}


public class B03_Autoboxing_Autounboxing {

	/*
	 * - Dort, wo die Wrapperklassen-Referenz steht, aber ein primitiver Wert nötig ist, kommt es zum Autounboxing.
	 * - Dort, wo ein primitiver Werte steht, aber eine Referenz nötig ist (meistens Zuweisung), kommt es zum Autoboxing 
	 * 
	 */
	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		int sum = x + y;
		System.out.println(sum);
		
		
		MyInteger m1 = new MyInteger(2);
		MyInteger m2 = new MyInteger(3);
		// MyInteger sumA = m1 + m2;	// Compilerfehler: kein + Operator für Referenzen
		MyInteger sumA = new MyInteger( m1.intValue() + m2.intValue() );
		System.out.println(sumA);
		
		
		Integer i1 = 2; // Autoboxing für die Zuweisung
		Integer i2 = 3; // Autoboxing
		Integer sumB = i1 + i2; // Autounboxing für Addition, danach Autoboxing für die Zuweisung
		System.out.println(sumB);
		
		
		Integer i3 = Integer.valueOf(2); // manuelles Boxing
		Integer i4 = Integer.valueOf(3); // manuelles Boxing
		Integer sumC = Integer.valueOf( i3.intValue() + i4.intValue() ); // manuelles Unboxing und danach manuelles Boxing
		System.out.println(sumC);
		
		int var = i3;
		
	} // 

}
