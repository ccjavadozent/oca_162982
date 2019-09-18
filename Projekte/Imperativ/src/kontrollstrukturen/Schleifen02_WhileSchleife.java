package kontrollstrukturen;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Schleifen02_WhileSchleife {

	public static void main(String[] args) {
		
//		Endlose while-Schleife:
//		while( true ) {
//			System.out.println("laufe...");
//		}
		
		/*
		 * Geht auch, aber die for-Schleife würde besser aussehen:
		 */
		int i=0;
		while( i<9 ) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		
		/*
		 * Häufig so verwendet:
		 */
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println("queue: " + queue);
		
		while( !queue.isEmpty() ) { // <- so
			int x = queue.remove();
			System.out.println("next: " + x);
		}

	}

}
