package operatoren;

public class Inkrement_Dekrement {

	public static void main(String[] args) {

		int x = 0;
		
		x++; // x = x + 1;
		
		System.out.println("1. x = " + x); // 1

		++x; // x = x + 1;
		
		System.out.println("2. x = " + x); // 2
		
		
		/*
		 * Post- bzw. Präinkrement unterscheiden sich NUR
		 * wenn die inkrementierte Variable in einem komplexen Ausdrück
		 * an einer weiteren Operation beteiligt wird!
		 * 
		 */
		
		System.out.println( "3. x = " + ++x ); // 3: zuerst x um 1 erhöhen, dann mit dem neuen wert den Text bilden (konkatenieren)
		
		System.out.println("4. x = " + x); // 3
		
		
		System.out.println( "5. x = " + x++ ); // 3:  zuerst x lesen fürs Konkatenieren, danach x inkrementieren
		
		System.out.println("6. x = " + x); // 4
		
		
		/*
		 * Nochmal
		 */
		
		int var1 = 7;
		
		int var2 = var1--; 	// 		Schritt 1. var1 Wert notieren (z.B. in einem CPU-Redister Reg1 = 7)
							// 		Schritt 2. Postdekrement ( var1 wird 6 )
							//		Schritt 3. Den notierten alten Wert (aus dem Reg1) int var2 kopieren 
		
		System.out.println("A. var: " + var2); // 7 
		
		
		System.out.println("var1 wieder zurückgesetzt auf 7");
		var1 = 7;
		
		int var3 = --var1;	// 		Schritt 1. Prädekrement ( var1 wird 6 )
							// 		Schritt 2. var1 Wert notieren (z.B. in einem CPU-Redister Reg1 = 6)
							//		Schritt 3. Den notierten Wert (aus dem Reg1) int var3 kopieren
		
		System.out.println("B. var3: " + var3);
		
		/*
		 * Und nochmal
		 */
		
		int hallo = 0;
		
		hallo = hallo++; // Sinnlos. Bitte in der Praxis so nicht programmieren.
		
		System.out.println("A. hallo: " + hallo); // 0
		
		hallo = ++hallo;
		
		System.out.println("B. hallo: " + hallo); // 1
		
	}

}
