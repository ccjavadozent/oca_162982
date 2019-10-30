package aufgaben.lambdas;

import java.util.Arrays;
import java.util.List;

class CPU {
	private int anzahlKerne;
	private String hersteller;
	
	public CPU(String hersteller, int anzahlKerne) {
		super();
		this.anzahlKerne = anzahlKerne;
		this.hersteller = hersteller;
	}

	public String getHersteller() {
		return hersteller;
	}
	@Override
	public String toString() {
		return hersteller;// + ", " + anzahlKerne + " Kern(e)";
	}
}

public class AufgabeLambdas_A4 {

	public static void main(String[] args) {
		
		List<CPU> list = Arrays.asList(
					new CPU("AMD", 4),
					new CPU("Intel", 2),
					new CPU("Samsung", 6),
					new CPU("AMD", 16)
				);
		

		//Consumer mit Lambda:
		list.forEach( cpu -> System.out.println(cpu.getHersteller()) );
		
		//Consumer mit einer Methode-Referenz (nicht in der Prüfung)
		list.forEach( System.out::println );

	}

}
