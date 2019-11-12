package vererbung;

interface I1 {
//	int A0; // Compilerfehler: final!
	int A1 = 11; // public static final
}


abstract class K1 {}

abstract class K2 { static final int A1 = 3; }

//abstract final class K3 {} // Compilerfehler: abstract und final = Wiederspruch

//abstract class K4 { abstract void m() {} }; // Es darf keinen Rumpf für abstracte Methode geben

//abstract class K5 { final abstract void m(); };  // Compilerfehler: abstract und final = Wiederspruch

public class WdhFinalAbstract {

	public static void main(String[] args) {

	}

}
