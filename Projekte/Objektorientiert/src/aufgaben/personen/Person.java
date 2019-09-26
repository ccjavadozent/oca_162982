package aufgaben.personen;

/*
 * Weitere Verbessurengen der Lösung mit Exceptions möglich 
 * (Argumenten-check in Konstruktoren und falls vorhanden in den Setter-Methoden)
 */
public class Person {
	
	// public class Builder {}
	
	public static Person getMustermann() {
		return new Person("Max", "Mustermann", 1960, "12345");
	}
	
	private String vorname, nachname;
	private int geburtsjahr;
	private String postleitzahl;
	
	public Person(String vorname, String nachname, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}
	
	public Person(String vorname, String nachname, int geburtsjahr, String postleitzahl) {
		this(vorname, nachname, geburtsjahr);
		this.postleitzahl = postleitzahl;
	}
	
	
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public String getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	@Override
	public String toString() {
		return vorname + " " + nachname + ", Geburtsjahr: " + geburtsjahr + ", Plz: " + postleitzahl;
	}
	
	public boolean equals(Object obj) {
		Person p2 = (Person)obj;
		
		return vorname.equals(p2.vorname)
				&& nachname.equals(p2.nachname)
				&& geburtsjahr == p2.geburtsjahr
				&& postleitzahl.equals(postleitzahl); // evtl. NullPointerException
//				&& Objects.equals(postleitzahl, p2.postleitzahl);
	}
}