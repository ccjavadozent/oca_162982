package aufgaben.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AufgabeLambdas_A2 {

	public static void main(String[] args) {
		
		List<String> vorlage = Arrays.asList("hallo welt", "mamba", "abcdef", "xyz");
		
		ArrayList<String> list = new ArrayList<>( vorlage );

		Collections.sort( list, (s1, s2) -> s1.length() - s2.length() );
		
		System.out.println("list: " + list);
	}

}
