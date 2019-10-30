package aufgaben.lambdas;

import java.util.function.Function;

public class KleineAufgabeFunction {

	public static void main(String[] args) {

		/*
		 * definieren Sie bitte eine Lambda-Function, die ein Integer verdoppelt
		 */
		Function<Integer, Integer> f1 = x -> 2*x;
		
		int result = f1.apply(12);
		System.out.println( result ); // 24
		
		
		
	}

}
