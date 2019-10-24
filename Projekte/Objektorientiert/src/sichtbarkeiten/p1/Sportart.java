package sichtbarkeiten.p1;

public class Sportart {

	public static int MAX_ALTER = 22; // sichtbar überall
	
	static int getMaxAlter() { return MAX_ALTER; } // sichtbar im Package 'sichtbarkeiten.p1'
	

	private String name;	// sichtbar nur in der Klasse Sportart
	
	protected boolean olympisch; // sichtbar im ganzen Package und in den abgeleiteten Klassen
	
	public Sportart() {}   // sichtbar überall
	
	
	
}
