package exceptions;

import java.util.Random;

public class B06_PassenderCatchBlock {

	public static void main(String[] args) {

		try {
			
			int var = new Random().nextInt(3);
			
			switch (var) {
				case 0:
					System.out.println(5/0); //ArithmeticException
				case 1:
					throw new NullPointerException("test npe");
				default:
					Integer i = (Integer)(Number)22.0; // ClassCastException
			}
			
			
		} catch (ArithmeticException e) {
			//Hier spezielle Behandlung für ArithmeticException
			System.out.println("ArithmeticException abgefangen");
			
		}  catch (Exception e) {
			//Hier allgemeine Behandlung für alle anderen Exceptions
			System.out.println("Exception abgefangen");
		}
		
		
		/*
		 * catch-Reihenfolge ist wichtig!
		 * Zuerst immer die catch-Blöcke für die abgeleiteten Exceptions-Typen, 
		 * danach für die Basis-Exeptions-Typen 
		 */
		
		try {
			
		} 
		catch (Exception e) {
		} 
//		catch (ArithmeticException e) { // Compilerfehler! Unreachable catch-Block
//		}
		
		
		
		/*
		 * catch-Reihenfolge für die Geschwister-Exceptionstypen ist egal
		 */
		
		try {
			
		} catch (ArithmeticException e) {
			
		} catch (NullPointerException e) {
			
		}

		
		try {
			
		} catch (NullPointerException e) {
			
		} catch (ArithmeticException e) {
			
		} 
		
		
	}  

}
