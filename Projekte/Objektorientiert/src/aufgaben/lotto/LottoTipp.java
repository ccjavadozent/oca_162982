package aufgaben.lotto;

import java.util.Arrays;

public class LottoTipp {

	private int anzahlKugel, anzahlKugelGesamt;
	private int[] zahlen;
	
	public LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel = anzahlKugel;
		this.anzahlKugelGesamt = anzahlKugelGesamt;
	}
	
	public boolean hatZahl(int zahl) {
		if(zahlen==null) {
			return false;
		}
		
		for (int i = 0; i < zahlen.length; i++) {
			if(zahlen[i]==zahl) {
				return true;
			}
		}
		
		return false;
	}
	
	public void abgeben() {
		zahlen = RandomNumbers.createUniqueRandomArray(anzahlKugel, 1, anzahlKugelGesamt+1);
		Arrays.sort(zahlen);
	}
	
	@Override
	public String toString() {
		return LottoStringUtils.formatNumberArray(anzahlKugel, anzahlKugelGesamt, zahlen, "Tipp", "Noch keine Zahlen getippt");
	}
	
}
