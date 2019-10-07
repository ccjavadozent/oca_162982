package vererbung;

/*
 * Basisklasse Fahrzeug
 */
class Fahrzeug {
	private String hersteller, modell;
	
	public Fahrzeug(String hersteller, String modell) {
		this.hersteller = hersteller;
		this.modell = modell;
	}

	public String getModell() {
		return modell;
	}
	
	@Override
	public String toString() {
		return hersteller + " " + modell;
	}
}

/*
 * Abgeleitete Klasse PKW
 */
class PKW extends Fahrzeug {
	public PKW(String hersteller, String modell) {
		super(hersteller, modell);
//		this.hersteller = hersteller;
//		this.modell = modell;
	}

	public void automatischEinparken() {
		System.out.println("Parkassistent wird aktiviert...");
	}
}

/*
 * Abgeleitete Klasse LKW
 */
class LKW extends Fahrzeug {
	private int last; 
	
	public LKW(String hersteller, String modell) {
		super(hersteller, modell);
//		this.hersteller = hersteller;
//		this.modell = modell;
	}

	public void beladen(int last) {
		this.last = last;
	}
}

/*
 * Aufgabe 1. In einem neuen Klassendiagramm 'Fahrzeuge_Version1.uxf' aktuelle PKW und LKW darstellen
 */
public class B01_extends_fuer_IS_A_Beziehung {

	public static void main(String[] args) {
		
		PKW pkw = new PKW("Opel", "Corsa");
		System.out.println("pkw: " + pkw);
		System.out.println("Modell von pkw: " + pkw.getModell());
		
		pkw.automatischEinparken();
//		pkw.beladen(20); // darf nicht kompilieren
		
		LKW lkw = new LKW("MAN", "M1");
		System.out.println("lkw: " + lkw);
		System.out.println("Modell von lkw: " + lkw.getModell());
		
//		lkw.automatischEinparken(); // darf nicht kompilieren
		lkw.beladen(20);
		
//		PKW var = new LKW("MAN", "M2"); // darf nicht kompilieren
//		var.automatischEinparken();
		
//		LKW var2 = new PKW("VW", "Golf"); // darf nicht kompilieren
//		var2.beladen(33);
	}
	
}
