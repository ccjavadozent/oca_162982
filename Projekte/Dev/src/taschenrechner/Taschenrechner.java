package taschenrechner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		
		if( args.length == 3 ) {
			computeMitArgs(args);
		} else {
			computeInteractive();
		}

	} // end of main
	
	private static void computeMitArgs(String[] args)  {
		try {
			double a = Double.valueOf( args[0] );
			
			char operator = args[1].charAt(0);
			
			double b = Double.valueOf( args[2] );
			
			compute(a, b, operator);
			
		} catch (NumberFormatException e) {
			System.out.println("Fehler! Operand ist keine Zahl: " + e.getMessage());
			
		} catch (IllegalOperatorException e) {
			System.out.println("Fehler! Nur folgende Operatoren werden unterstützt: +, -, *, /");
			
		}
	}
	
	private static void computeInteractive()  {
		while(true) {
			try {

				System.out.println("Zahl 1: ");
				double a = readDouble();
				
				System.out.println("Operator: ");
				char operator = readChar();
				
				System.out.println("Zahl 2: ");
				double b = readDouble();
				
				compute(a, b, operator);
				
				System.out.println("Nochmal? (q=Abbrechen, j=Nochmal): ");
				
			} catch (InputMismatchException e) {
				System.out.println("Eingabefehler! Es soll doch eine Zahl sein!");
				continue;
			} catch (IllegalOperatorException e) {
				System.out.println("Eingabefehler! Nur folgende Operatoren werden unterstützt: +, -, *, /");
				continue;
			}
			
			char userInput = readChar();
			
			if(userInput=='q' || userInput=='Q') {
				break;
			}
		}
	}
	
	private static void compute(double a, double b, char operator) throws IllegalOperatorException {
		double result;
		
		switch (operator) {
			case '+':
				result = a + b; 
				break;
			case '-':
				result = a - b; 
				break;
			case '*':
				result = a * b; 
				break;
			case '/':
				result = a / b; 
				break;
	
			default:
				throw new IllegalOperatorException("Operator not supported: " + operator);
		}
		
		System.out.println(a + " " + operator + " " + b + " = " + result);
	}
	

	@SuppressWarnings("resource")
	private static double readDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	@SuppressWarnings("resource")
	private static char readChar() {
		return new Scanner(System.in).nextLine().charAt(0);
	}
	
	
	
}
