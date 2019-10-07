package aufgaben.lotto;

import java.util.Arrays;

public class LottoStringUtils {

	public static String formatNumberArray(int anzahlKugel, int anzahlKugelGesamt, int[] zahlen, String prefix, String suffixForNullArray) {
		String text = prefix + " " + anzahlKugel + " aus " + anzahlKugelGesamt + ". ";
		
		if(zahlen==null) {
			text += suffixForNullArray; 
		} else {
			text += Arrays.toString(zahlen);
		}
		
		return text;
		
	}
	
}
