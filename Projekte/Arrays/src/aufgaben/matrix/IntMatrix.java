package aufgaben.matrix;

import java.util.Random;

public class IntMatrix {
	
	/**
	 * Erstellt eine IntMatrix mit rows Zeilen und columns Spalten. 
	 * Alle Elemente werden zufällig initialisiert. 
	 * Der Wertebereich für die Elemente: 0 bis max:
	 * 
	 * @param rows
	 * @param columns
	 * @param max Obergrenze für die Zufallswerte. Untergrenze ist 0
	 * @return
	 */
	public static IntMatrix getRandomMatrix(int rows, int columns, int max) {
		IntMatrix m = new IntMatrix(rows, columns);
		
		Random random = new Random();
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				
				int value = random.nextInt(max+1);
				m.values[row][col] = value;
//				m.set(row, col, value);
				
			}
		}
		
		return m;
	}
	
	
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
	
	public boolean equals(Object obj) { // Überschreiben der Methode aus der Klasse Objekt.
										// Überladen der Methode mit der Signatur equals(IntMatrix)
		if( !(obj instanceof IntMatrix) ) {
			return false;
		}
		
		IntMatrix m2 = (IntMatrix) obj;
		
		return equals(m2);
	}
	
	public boolean equals(IntMatrix m2) { // Überladen der Methode mit der Signatur equals(Object)
		
		if(m2==null) {
			return false;
		}
		
		if( getCountRows() != m2.getCountRows() || getCountColumns() != m2.getCountColumns() ) {
			return false;
		}
	
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				if( get(row, col) != m2.get(row, col) ) {
					return false;
				}
			}
		}
		
		return true;
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
