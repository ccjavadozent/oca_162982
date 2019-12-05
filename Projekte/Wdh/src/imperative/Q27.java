package imperative;

public class Q27 {

	public static void main(String[] args) {
		int x = 2;
		int y = x < 100 ? inc(x) < 100 ? 7 : inc(x) : x;
		System.out.println( y + " " + x );

		if(true || x==1) {
			
		}
	}

	static int inc(int x) {
		return ++x;
	}
}
