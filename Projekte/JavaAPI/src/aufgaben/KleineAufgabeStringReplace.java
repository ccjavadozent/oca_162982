package aufgaben;

public class KleineAufgabeStringReplace {

	public static void main(String[] args) {

		String s = "Heute ist Donnerstag. Donnerstag ist toll";
		
		/*
		 * Ersetzen Sie bitte alle Donnerstag-Unterstrings mit 'Freitag'
		 */
		System.out.println(s.replace("Donnerstag", "Freitag"));
	}

}
