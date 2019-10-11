package aufgaben;

abstract class Tier {
	
	private String name;
	private int alter;
	private boolean gesund;
	
	public Tier(String name, int alter, boolean gesund) {
		this.name = name;
		this.alter = alter;
		this.gesund = gesund;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public boolean isGesund() {
		return gesund;
	}
	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}
	
	abstract void laufen();
	
} // end of Tier


public class AufgabePolymorphieTiere {
	
	static class Hund extends Tier {
		
		public Hund(String name, int alter, boolean gesund) {
			super(name, alter, gesund);
		}
		
		void laufen() {  
			System.out.println("Hund " + getName() + " läuft");
		}
		
	} // end of Hund
	
	
	static class Katze extends Tier {

		public Katze(String name, int alter, boolean gesund) {
			super(name, alter, gesund);
		}
		
		void laufen() {
			System.out.println("Katze " + getName() + " läuft");
		}
		
	} // end of Katze
	

	public static void main(String[] args) {

		Hund hund = new Hund("Rex", 3, true);
		
		Katze katze = new Katze("Tom", 5, true);
		
		print(hund); // ? param = hund
		print(katze); // ? param = katze
	}

	static void print(Tier tier) {
		String tierArt = tier.getClass().getSimpleName() ;
		String tierName = tier.getName();
		
		System.out.println( tierArt + ". Name: " + tierName );
	}
}
