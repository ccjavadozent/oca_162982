package aufgaben.lotto;

import java.util.Arrays;

public class LottoSpiel {
	
	private int anzahlKugel, anzahlKugelGesamt;
	
	private int[] zahlen;

	public LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel = anzahlKugel;
		this.anzahlKugelGesamt = anzahlKugelGesamt;
	}

	public void ziehen() {
		zahlen = RandomNumbers.createUniqueRandomArray(anzahlKugel, 1, anzahlKugelGesamt+1);
		Arrays.sort(zahlen);
	}
	
	public int vergleichen(LottoTipp tipp) {
		
		int anzahlRichtige = 0;
		for (int i = 0; i < zahlen.length; i++) {
			
			if( tipp.hatZahl( zahlen[i] ) ) {
				 anzahlRichtige++;
			}
			
		}
		
		return (int)Math.pow(10, anzahlRichtige-1);
	}
	
	@Override
	public String toString() {
		return LottoStringUtils.formatNumberArray(anzahlKugel, anzahlKugelGesamt, zahlen, "Spiel", "Es gab noch keine Ziehung");
	}

}
