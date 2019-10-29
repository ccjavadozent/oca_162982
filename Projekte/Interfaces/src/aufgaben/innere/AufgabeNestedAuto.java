package aufgaben.innere;

public class AufgabeNestedAuto {

	public static void main(String[] args) {

		Rennwagen rw = new Rennwagen("Renault");
		
	    Rennwagen.Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
	    rw.setFahrer(f);
	
	    Rennwagen.Motor m = rw.getMotor();
	
	    System.out.println(rw);		//Zeile A: Rennwagen Mercedes. Fahrer: M. Schuhmacher
	    System.out.println(m);		//Zeile B: Motor Type1 aus dem Rennwagen Mercedes
	}

}
