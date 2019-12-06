package api;

import java.util.ArrayList;

class Kreis {
	int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
//	@Override
	public boolean equals(Kreis obj) {
		if( getClass() != obj.getClass() ) {
			return false;
		}
		
		Kreis k2 = (Kreis)obj;
		
		return radius == k2.radius;
	}
}

public class Q07 {

	public static void main(String[] args) {
		
		ArrayList<Kreis> list = new ArrayList();
		list.add(new Kreis(3));
		System.out.print( list.contains(new Kreis(3)) );

		System.out.println( new Kreis(12).equals( new Kreis(12) ) );
		
		System.out.println( new Kreis(12).equals( "bin kein Kreis" ) );
		
	}

}
