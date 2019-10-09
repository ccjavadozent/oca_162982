package aufgaben.javakurs;

public class Person {
	private String name;
	private String id;
	
	private JavaKurs kurs;

	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void setKurs(JavaKurs kurs) {
		this.kurs = kurs;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public JavaKurs getKurs() {
		return kurs;
	}

	@Override
	public String toString() {
		String kursText = kurs != null ? kurs.toString() : "Kein Kurs zugeordnet";
		
		Class<?> clazz = getClass();
		String className = clazz.getSimpleName();
		
		return  className + " [name=" + name + ", id=" + id + ", kurs=" + kursText + "]";
	}
}
