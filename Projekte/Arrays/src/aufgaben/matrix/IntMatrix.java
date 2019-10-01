package aufgaben.matrix;

public class IntMatrix {
	
	private int[][] values;

	/**
	 * Erstellt eine IntMatrix mit rows Zeilen und columns Spalten.
	 * 
	 * @param rows
	 * @param columns
	 */
	public IntMatrix(int rows, int columns) {
		// todo: Argumente überprüfen
		this.values = new int[rows][columns];
	}

	/**
	 * 
	 * Erstellt eine IntMatrix mit rows Zeilen und columns Spalten. 
	 * Alle Elemente der IntMatrix sind mit dem Wert initValue initialisiert
	 * 
	 * @param rows
	 * @param columns
	 * @param intiValue
	 */
	public IntMatrix(int rows, int columns, int intiValue) {
		this(rows, columns);
		
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				values[row][col] = intiValue;
			}
		}
	}

	public int getCountRows() {
		return values.length;
	}
	
	public int getCountColumns() {
		return values[0].length;
	}
	
	public int get(int row, int column) {
		//todo: Argumente überprüfen
		return values[row][column];
	}
	
	public void set(int row, int column, int newValue) {
		//todo: Argumente überprüfen		
		values[row][column] = newValue;
	}
	
	@Override
	public String toString() {
		// todo: StringBuilder einsetzen
		
		String text = "";
		
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				text = text + values[row][col];
				
				if(col < getCountColumns()-1) {
					text = text + ", "; 
				}
			}
			text = text + '\n';
		}
		
		return text;
	}
	
}
