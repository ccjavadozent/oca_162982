package functional;

import javax.swing.JFrame;

/*
 * Swing (GUI) ist nicht in der Prüfung
 * 
 */

@SuppressWarnings("serial")
class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		/*
		 * Anfangsposition
		 */
		int x = -800; // Negativ, damit die Test-Starts auf dem Dozentenrechner auf dem sekundären Monitor das Fenster zeigen
		int y = 300;
		
		setLocation(x, y);
		
		/*
		 * Maße
		 */
		int width = 300;
		int height = 200;
		setSize(width, height);
		
		/*
		 * Aktueller Layout-Manager: BorderLayout, der 5 Bereiche im Fenster definiert
		 */
		
		
		
		
	}
}


public class BspNichtstatscheInnereKlasse {

	public static void main(String[] args) {

		JFrame frame = new MyFrame();
		
		frame.setVisible(true);
		
		System.out.println("end of main");
	}

	
}
