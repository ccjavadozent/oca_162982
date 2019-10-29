package functional;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Swing (GUI) ist nicht in der Prüfung
 * 
 */

@SuppressWarnings("serial")
class MyFrame extends JFrame {
	
	private class OnClickListener implements ActionListener {
		private int clicksCount;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("click");
			
			String text = "Clicks: " + ++clicksCount;
			label.setText(text);
			
			button.setText("Click (" + clicksCount + ")");
		}
	}
	
	
	private JLabel label = new JLabel("Clicks: 0");
	
	private JButton button = new JButton("Click");
	

	public MyFrame() {
		super("Clicks Counter");
		
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
		
		/*
		 * Label im Norden:
		 */
		add(label, BorderLayout.NORTH);
		
		/*
		 * Schaltfläche bilden und im Süden platzieren
		 */
		add(button, BorderLayout.SOUTH);

		/*
		 * Den Listener für Click-Events bilden
		 * und bei dem JButton registrieren.
		 */
		ActionListener onClick = new OnClickListener();
		button.addActionListener(onClick);
		
	}
}


public class BspNichtstatscheInnereKlasse {

	public static void main(String[] args) {

		JFrame frame = new MyFrame();
		
		frame.setVisible(true);
		
		System.out.println("end of main");
	}

	
}
