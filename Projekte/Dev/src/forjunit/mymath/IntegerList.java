package forjunit.mymath;

import java.util.ArrayList;

public class IntegerList extends ArrayList<Integer> {

	public int sum() {
		int summe = 0;
		
		for( Integer x : this ) {
			summe += x;
		}
		
		return summe;
	}
	
}
