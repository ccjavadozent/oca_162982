package aufgaben.lotto;

public class LottoSpielSimulation {

	public static void main(String[] args) {

		int anzahlKugel = 7;
        int anzahlKugelGesamt = 49;
        LottoSpiel lotto = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
        
        System.out.println( lotto );
        
        lotto.ziehen();
        
        System.out.println( lotto );
        
        
        LottoTipp tipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
        
        System.out.println(tipp);
        
        tipp.abgeben();
        
        System.out.println(tipp);
        
        int gewinn = lotto.vergleichen(tipp);
        
        System.out.println("Gewinn: " + gewinn);
	}

}
