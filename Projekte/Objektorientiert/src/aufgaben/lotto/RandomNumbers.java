package aufgaben.lotto;

import java.util.Random;

public class RandomNumbers {
	
	/**
	 * Generiert einzigartige Zufallswerte und liefert sie in einem Array zurück
	 * 
	 * @param length Anzahl der Zufallswerte
	 * @param min Untegrenze inklusive
	 * @param max Obergrenze exkusive
	 * @return Array mit der Zufallswerten
	 */
	public static int[] createUniqueRandomArray(int length, int min, int max) {
		
		int[] array = new int[length];
		
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			int number = random.nextInt(max - min) + min;
			
//			if(number bereits irgendwo im array in den Positionen vor i steht) {
			if( hasNumber(number, array, i) ) {
				i--; // gleich wird inkrementiert und damit kommt es nochmal zum selben i für den wiederholten Versuch
				continue;
			}
			
			array[i] = number;
		}

		return array;
	}
	
	private static boolean hasNumber(int number, int[] array, int toIndex) {
		for (int i = 0; i < toIndex; i++) {
			if(array[i]==number) {
				return true;
			}
		}
		
		return false;
	}
	

}
