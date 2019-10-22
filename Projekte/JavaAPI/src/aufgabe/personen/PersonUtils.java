package aufgabe.personen;

import java.util.Arrays;
import java.util.Random;

public class PersonUtils {
	private final static String[] SILBEN = { 
			"pro", "gi", "idre", "su", "ola", "im", "se", "fo", "aa", "ner", "yd"
	}; 
	

	public static String[] createSilbenArray() {
		return Arrays.copyOf(SILBEN, SILBEN.length);
	}
	
	public static String generiereName(String[] silben, int anzahlSilben) {
		Random random = new Random();
		
		String name = "";
		
		for (int i = 0; i < anzahlSilben; i++) {
			int index = random.nextInt(silben.length);
			name += silben[index];
		}
		
		String firstLetter = name.charAt(0) + "";
		
		return firstLetter.toUpperCase() + name.substring(1);
	}
	
	public static void printPersonen(Person[] personen) {
	
		String fmt = "|%5s|%20s|%20s|%12s|%n";
		
		System.out.printf(fmt, "Nr.", "Vorname", "Nachname", "Geburtsjahr");
		
		for (int i = 0; i < personen.length; i++) {
			Person p = personen[i];
			System.out.format(fmt, i+1, p.getVorname(), p.getNachname(), p.getGeburtsjahr());
		}
		
	}
	
}
