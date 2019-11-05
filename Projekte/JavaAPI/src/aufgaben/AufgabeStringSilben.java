package aufgaben;

import java.util.Arrays;
import java.util.Random;

public class AufgabeStringSilben {

	private final static String[] SILBEN = { 
			"pro", "gi", "idre", "su", "ola", "im", "se", "fo", "aa", "ner", "yd"
	}; 
	

	public static String[] createSilbenArray() {
//		return new String[] { 
//				"pro", "gi", "idre", "su", "ola", "im", "se", "fo", "aa", "ner", "yd"
//		};
		
		return Arrays.copyOf(SILBEN, SILBEN.length);
		
//		return SILBEN;
	}
	
	public static String generiereName(String[] silben, int anzahlSilben) {
		Random random = new Random();
		
		String name = "";
		
		for (int i = 0; i < anzahlSilben; i++) {
			int index = random.nextInt(silben.length);
			name += silben[index];
		}
		
		String firstLetter = name.charAt(0) + "";
		
		return firstLetter.toUpperCase() + name.substring(1);
	}
	
	public static void main(String[] args) {

//		final String[] silben = { 
//				"pro", "gi", "idre", "su", "ola", "im", "se", "fo", "aa", "ner", "yd"
//		};
		
		String[] silben = createSilbenArray();
		
		for (int i = 0; i < 50; i++) {
			String name = generiereName(silben, 4);
			System.out.println(name);
		}
		
	} // end of main
	
}
