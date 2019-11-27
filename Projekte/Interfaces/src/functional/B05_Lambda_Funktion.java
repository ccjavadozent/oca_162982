package functional;

interface Tankbar {
	void tanken();
}


/*
 * Toplevel-Klasse
 */
class ToplevelAuto implements Tankbar {
	public void tanken() { System.out.println("Toplevel"); }
}



public class B05_Lambda_Funktion {

	/*
	 * Innere (nested) Klasse
	 */
	static class NestedAuto implements Tankbar {
		public void tanken() { System.out.println("Nested"); }
	}
	

	public static void main(String[] args) {
		
		Tankbar t1 = new ToplevelAuto();
		t1.tanken();
		
		Tankbar t2 = new NestedAuto();
		t2.tanken();
		
		
		/*
		 * Innere lokale Klasse
		 */
		class LocalAuto implements Tankbar {
			public void tanken() { System.out.println("Lokal"); }
		}

		Tankbar t3 = new LocalAuto();
		t3.tanken();
		
		/*
		 * anonyme Klasse
		 */
		Tankbar t4 = new Tankbar() {
			public void tanken() { System.out.println("Anonym"); }
		};
		t4.tanken();
		
		
		/*
		 * Lambda-Funktion
		 */
		Tankbar t5 = () -> System.out.println("Lambda");
		t5.tanken();
		
	} // end of main

}
