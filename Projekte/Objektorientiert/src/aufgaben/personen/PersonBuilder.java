package aufgaben.personen;

public class PersonBuilder {

//	private String vorname, nachname;
//	private int geburtsjahr;
//	private String postleitzahl;
	
	private Person person = new Person(null, null, -1);

	public PersonBuilder vorname(String vorname) {
		person.setVorname(vorname);
		return this;
	}
	
	public PersonBuilder nachname(String nachname) {
		person.setNachname(nachname);
		return this;
	}
	
	
	public PersonBuilder geburtsjahr(int geburtsjahr) {
		person.setGeburtsjahr(geburtsjahr);
		return this;
	}
	
	public PersonBuilder postleitzahl(String postleitzahl) {
		person.setPostleitzahl(postleitzahl);
		return this;
	}
	
	
	public Person build() {
		//alle Person-Attribute hier überprüfen
		
		Person tmp = person;
		person = new Person(null, null, -1);
		return tmp;
	}
	
	
	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder();
		
		builder.vorname("Max");
		builder.postleitzahl("12345");
		
		Person p = builder.build();
		
		System.out.println(p);
		
		Person p2 = new PersonBuilder()
			.vorname("Max")
			.postleitzahl("12345")
			.build();
		
		System.out.println(p2);
	}
}
