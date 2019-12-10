
public class InfinityUndNaN {

	public static void main(String[] args) {

		int x = 0;
		
		double a = 5.0 / x;
		double b = 5.0 / x;
		
		System.out.println(a); // Infinity
		System.out.println( "is Finite: " + Double.isFinite(a) ); // false 
		
		
		System.out.println( a==b ); // true
		
		a = Math.sqrt(-4);
		b = Math.sqrt(-4);
		
		System.out.println( a ); // NaN (not a number)

		System.out.println( a==b ); // false
		
		System.out.println( "is NaN: " + Double.isNaN(a) ); // true
		
		System.out.println( -5.0 / 0 ); // -Infinity
	}

}
