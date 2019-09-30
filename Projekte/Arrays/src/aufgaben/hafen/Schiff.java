package aufgaben.hafen;

public class Schiff {
	private String name;

	public Schiff(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Schiff " + name;
	}
}
