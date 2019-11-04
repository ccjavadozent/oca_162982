package functional;

interface MyFuncInterface {
	String getString();
}

public class LambdasSindBesonders {

	public static void main(String[] args) {
		
		/*
		 * Unterschied in der Realisierung einer 'normalen' Klasse und eine Lambda ist nicht in der Prüfung
		 */
		
		class Montag {
			@Override
			public String toString() {
				return "Montag/toString/this-Klassenname: " + this.getClass().getName();
			}
		}
		
		System.out.println( new Montag() );

		
		Object obj = new Object() {
			@Override
			public String toString() {
				return "Anonym/toString/this-Klassenname: " + this.getClass().getName();
			}
		}; 
		
		System.out.println( obj );
		
		MyFuncInterface var = () -> "Lambda/getString/hat kein this!";// + this.getClass().getName();
		
		System.out.println( var.getString() );
		
		
		new LambdasSindBesonders().test();
	}

	
	void test() {
		MyFuncInterface var = () -> "this des äußeren Objektes: " + this.getClass().getName();
		System.out.println( var.getString() );
	}
}
