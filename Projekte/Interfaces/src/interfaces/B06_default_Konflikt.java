package interfaces;

interface NameHolder {
	default String getName() {
		return "Unknown";
	}
}

interface Lebewesen {
	default String getName() {
		return "Tom";
	}
}


class Affe implements Lebewesen {
	
}

//class Zebra implements NameHolder, Lebewesen {} // Compilerfehler! Zwei default-Definitionen geerbt: Konflikt


class Maus implements NameHolder, Lebewesen {
	
	// Konflikt lösen:
	public String getName() {
		return "Mickey";
	}
}


class Katze implements NameHolder, Lebewesen {

	// Konflikt lösen:
	public String getName() {
		// String name = getName(); // this.getName() <- rekursiver Aufruf
		
		String name = Lebewesen.super.getName(); // die Methode aus Lebewesen aufrufen (nicht in der OCA-Prüfung)
		
		return name;
	}
}

public class B06_default_Konflikt {

	public static void main(String[] args) {

		System.out.println( new Katze().getName() );
		
	}

}
