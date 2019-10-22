package wrapper;

public class B01_Welche_Wrapper_Klassen_gibt_es {

	public static void main(String[] args) {
		
		byte v1;
		Byte w1;

		short v2;
		Short w2;
		
		int v3 = 12;
		Integer w3 = new Integer(12);	// erst ab Java 9 deprecated
		System.out.println(w3); // 12
		
		long v4;
		Long w4;
		
		float v5;
		Float w5;
		
		double v6;
		Double w6;
		
		
		char v7 = 'a';
		Character w7 = new Character(v7);
		System.out.println(w7); // a
		
		boolean v8;
		Boolean w8;
		
	} // end of main

}
