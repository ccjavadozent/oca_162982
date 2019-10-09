package aufgaben.javakurs;

public class AufgabeDozentTeilnehmer {

	public static void main(String[] args) {

		JavaKurs kurs = new JavaKurs(121314);
		System.out.println(kurs);
		
		Teilnehmer tn = new Teilnehmer("Max M.", "TN12345");
		tn.setKurs(kurs);
		System.out.println(tn);
		
		Dozent d = new Dozent("Peter P.", "D121314");
		d.setKurs(kurs);
		System.out.println(d);
		
		Person p = new Person("??Name", "??ID");
		System.out.println(p);
		
//		d = tn;
//		kurs = p;
//		tn = p;      // Teilnehmer <= IST-KEIN <= Person
		
		p = d;	// Person <= IS-A <= Dozent
		
	}

}
