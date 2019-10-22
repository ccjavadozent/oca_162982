package wrapper;

public class B05_Konstantenpools {

	public static void main(String[] args) {
		
		/*
		 * Jeder der folgenden Klassen hat je einen (eigenen) Konstantenpool mit je 256 Elementen:
		 * 
		 * 	Byte, Short, Integer, Long
		 * 
		 * In einem Konstantenpool sind die Objekte mit den Werten von -128 bis 127 referenziert
		 * 
		 */
		
		Integer i1 = 12; // Integer.valueOf(12)  holt die Referenz aus dem Integer-Pool
		Integer i2 = 12; // Integer.valueOf(12)  holt die Referenz aus dem Integer-Pool

		System.out.println("i1 == i2: " + (i1 == i2)); // true
		
		Integer i3 = 1200; // Integer.valueOf(1200) erzeugt ein neues Integer-Objekt 
		Integer i4 = 1200; // Integer.valueOf(1200) erzeugt ein neues Integer-Objekt 
		
		System.out.println("i3 == i4: " + (i3 == i4)); // false
		
		Integer i5 = i4;
		System.out.println("i5 == i4: " + (i5 == i4)); // true
		
		Integer i6 = new Integer(12);
		System.out.println("i1 == i6: " + (i1 == i6)); // false

		
		System.out.println("-------------------");
		
		Integer a = 125;
		Integer b = 125;
		
		a++; b++;
		System.out.println(a == b); // true
		
		a++; b++;
		System.out.println(a == b); // true
		
		a++; b++;
		System.out.println(a == b); // false
		
		/*
		 * Nicht in der Prüfung:
		 *  Character hat auch einen Konstantenpool
		 */
		
		Character ch = 'a'; // Character.valueOf('a'); aus dem Character-Pool
		
		/*
		 * Boolean hat zwei Konstanten
		 */
		System.out.println("*** Boolean");
		Boolean bool = true; // Boolean.valueOf(true);
		System.out.println( Boolean.TRUE == bool ); // true
	} 

}
