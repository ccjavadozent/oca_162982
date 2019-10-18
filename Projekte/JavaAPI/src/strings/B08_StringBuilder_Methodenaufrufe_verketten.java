package strings;

public class B08_StringBuilder_Methodenaufrufe_verketten {

	public static void main(String[] args) {

		String s1 = new StringBuilder()
			.append("Java ist toll")
			.append('!')
			.insert(0, "Die Sprache ")
			.toString();
		
		System.out.println("s1 = " + s1); // "Die Sprache Java ist toll!"

		
		StringBuilder sb1 = new StringBuilder("ava")
								.insert(0, 'J')
								.append(" ist ")
								.append("schnell");
		
		System.out.println(sb1); // "Java ist schnell"
		
		StringBuilder sb2 = new StringBuilder("ava")
								.replace(0, 3, "Smalltalk")
								.append(" ist ")
								.append("schnell");
		
		System.out.println(sb2); // Smalltalk ist schnell
		
//		new StringBuilder("Java ist toll")
//				.substring(0, 4) // liefert String
//				.append(" hat ") // Compilerfehler! String hat keine append-Methode
//				.append(" einen GC");
		
	}

}
