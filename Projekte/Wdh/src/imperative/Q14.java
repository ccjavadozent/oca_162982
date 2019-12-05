package imperative;

import java.util.function.Predicate;

/*
class Help implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		return x == 7;
	}
}
*/

public class Q14 {

	public static void main(String[] args) {

		int x = 3;
		
		Predicate<Integer> p = t -> {
			x = 5;
			return x == 7;
		};

//		x = 5;
	}

}
