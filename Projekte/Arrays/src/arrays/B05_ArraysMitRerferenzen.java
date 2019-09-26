package arrays;

class Dozent {
	String vorname;
	String nachname;
}

public class B05_ArraysMitRerferenzen {

	public static void main(String[] args) {
		
		Dozent d1 = new Dozent(); 
		System.out.println(d1.vorname); // null

		String[] a1 = new String[2];
		System.out.println(a1[0]); // null 
		
		d1.nachname = "Meyer";
		a1[1] = d1.nachname;
		
		System.out.println("*** 1");
		System.out.println(d1.nachname);
		System.out.println(a1[1]);
		
		d1.nachname = "Schmidt";

		System.out.println("*** 2");
		System.out.println(d1.nachname);
		System.out.println(a1[1]);
	}

}
