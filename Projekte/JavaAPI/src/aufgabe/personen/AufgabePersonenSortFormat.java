package aufgabe.personen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class AufgabePersonenSortFormat {
	
	private static class CmpPersonGeburtsjahr implements Comparator<Person>  {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.getGeburtsjahr() - p2.getGeburtsjahr();
		}
	}

	public static void main(String[] args) {

		Person[] personen = new Person[10];
		
		Random random = new Random();
		
		String[] silben = PersonUtils.createSilbenArray();
		
		for (int i = 0; i < personen.length; i++) {
			
			int anzahlSilben = random.nextInt(5) + 1;
			String vorname = PersonUtils.generiereName(silben, anzahlSilben);
			
			anzahlSilben = random.nextInt(5) + 1;
			String nachname = PersonUtils.generiereName(silben, anzahlSilben);
			
			int geburtsjahr = random.nextInt(120) + 1900;
			
			personen[i] = new Person(vorname, nachname, geburtsjahr); 
		}
		
		System.out.println("*** Nicht sortiert: ");
		PersonUtils.printPersonen(personen);
		
		
		System.out.println("*** Natürlich aufsteigend sortiert: ");
		Arrays.sort(personen);
		PersonUtils.printPersonen(personen);
		
		
		System.out.println("*** Absteigend sortiert: ");
		Comparator<Person> cmp = Comparator.reverseOrder();
		
		Arrays.sort(personen, cmp);
		PersonUtils.printPersonen(personen);
		
		
		System.out.println("*** Absteigend nach Geburtsjahr sortiert: ");
		cmp = new CmpPersonGeburtsjahr();
		
		Arrays.sort(personen, cmp);
		PersonUtils.printPersonen(personen);
		
	} 

}
