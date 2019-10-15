package sort_search;

import java.util.Arrays;

public class B01_StringsSortieren {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "defg";
		
		int result = s1.compareTo(s2);
		
		if(result > 0) {
			System.out.println( s1 + " ist größer als " + s2 );
		} else if(result < 0) {
			System.out.println( s1 + " ist kleiner als " + s2 );
		} else {
			System.out.println( s1 + " ist gleich " + s2 );
		}
		
		
		String[] array = {
			"abcd",	
			"kkkk",	
			"kk",	
			"defg"	
		};
		
		
		Arrays.sort(array);
		
		System.out.println( array ); // [Ljava.lang.String;@7960847b
		
		System.out.println( Arrays.toString(array) ); // [abcd, defg, kk, kkkk]
		
	}

}
