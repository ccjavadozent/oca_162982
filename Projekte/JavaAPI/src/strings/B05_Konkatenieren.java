package strings;

/*
 * Konkatenieren ist bequem (lesbar) aber evtl. langsam
 */
public class B05_Konkatenieren {

	public static void main(String[] args) {

		String s = "";
		
		/*
		 * 1000 String-Objekte entstehen in der Schliefe
		 */
		for (int i = 0; i < 1000; i++) {
			s = s + i;
		}
		/*
		 * 999 String-Objekte stehen dem GC zur Verfügung nach der Schleife
		 */
		
		System.out.println(s.length()); // 1+9+90*2+3*900=2890
		
	}

}
