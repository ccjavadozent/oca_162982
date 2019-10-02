package aufgaben.kampfarena;

import java.util.Arrays;
import java.util.Random;

public class Sitzbank {
	
	private Kaempfer[] data = new Kaempfer[8];
	
	private int index = 0; // Die Position im Array data, die frei ist 
							// und beim nächsten Aufruf der add-Methode belegt wird

	public void add(Kaempfer k) {
		if(index==data.length) {
			data = Arrays.copyOf(data, data.length + 4);
		}
		
		data[index] = k;
		index++;
	}
	
	public int getSize() {
		return index;
	}
	
	/**
	 * Entfernt unf liefert einen zufälligen Kämpfer. Oder liefert null, wenn es keine Kämpfer gibt
	 * @return
	 */
	public Kaempfer removeRandom() {
		if(index==0) {
			return null;
		}
		
		Random random = new Random();
		int randomIndex = random.nextInt(index);
		
		Kaempfer k = data[randomIndex];
		for (int i = randomIndex+1; i < index; i++) {
			data[i-1] = data[i];
		}
		
		index--;
		
		return k;
	}
	
	@Override
	public String toString() {
		String text = ""; 
		
		for (int i = 0; i < index; i++) {
			Kaempfer k = data[i];
			text += k;
			
			if(i<index-1) {
				text += ", ";
			}
		}
		
		return text;
	}
	
	
	/*
	public static void main(String[] args) {
		
		Sitzbank bank = new Sitzbank();
		
		int size = bank.getSize();
		System.out.println( size == 0 ? "OK" : "1. Fehler: size != 0" );
		
		bank.add(new Kaempfer("Tom"));
		
		size = bank.getSize();
		System.out.println( size == 1 ? "OK" : "2. Fehler: size != 1" );
		
		bank.add(new Kaempfer("Jerry"));
		
		size = bank.getSize();
		System.out.println( size == 2 ? "OK" : "3. Fehler: size != 2" );
		
		String s = bank.toString();
		System.out.println("Tom, Jerry".equals(s) ? "OK" : "4. Fehler: toString liefert nicht 'Tom, Jerry'");
		
		Kaempfer k = bank.removeRandom();
		System.out.println( k != null ? "OK" : "5.a Fehler: removeRandom lieferte null");
		size = bank.getSize();
		System.out.println( size == 1 ? "OK" : "5.b Fehler: size != 1" );
		
		
		k = bank.removeRandom();
		System.out.println( k != null ? "OK" : "6.a Fehler: removeRandom lieferte null");
		size = bank.getSize();
		System.out.println( size == 0 ? "OK" : "6.b Fehler: size != 0" );
		
		k = bank.removeRandom();
		System.out.println( k == null ? "OK" : "7 Fehler: removeRandom lieferte keine null");
		
		
		for (int i = 0; i < 10; i++) {
			bank.add(new Kaempfer("K"+i));
		}
		size = bank.getSize();
		System.out.println( size == 10 ? "OK" : "8. Fehler: size != 10" );
		
		
		System.out.println(bank);
	}
	*/
}








