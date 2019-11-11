package staedte;

public class Stadt {

	private String name;
	private int einwohner;
	private String land;
	
	public Stadt(String name, int einwohner, String land) {
		super();
		this.name = name;
		this.einwohner = einwohner;
		this.land = land;
	}
	
	@Override
	public String toString() {
		return name + " (" + land + "). Einwohner: " + einwohner;
	}
	
}
