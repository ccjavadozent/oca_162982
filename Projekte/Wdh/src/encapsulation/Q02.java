package encapsulation;

//public
class Kreis {
	private int radius;
	private double flaeche;
	
	public Kreis(int radius) {
		setRadius(radius);
	}

	public void setRadius(int radius) {
		this.radius = radius;
		flaeche = Math.PI * radius * radius;
	}
	
	public final int getRadius() {
		return radius;
	}
	
	public final double getFlaeche() {
		return flaeche;
	}
}


class MyKreis extends Kreis {
	public MyKreis() {
		super(1);
	}
	
	@Override
	public void setRadius(int radius) {
		
	}
}


public class Q02 {

	public static void main(String[] args) {
		double d = compute( new Kreis(1) );
		System.out.println( d ); // 3.141592653589793
	}
	
	static double compute(Kreis k) {
		return k.getFlaeche();
	}

}
