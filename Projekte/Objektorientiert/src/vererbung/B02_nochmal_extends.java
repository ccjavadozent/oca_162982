package vererbung;

class TextFormat {
	String text;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public String toString() {
		return "Formatter for: " + text;
	}
}

/*
 * Html
 */
class HtmlTextFormat extends TextFormat {
	
	public HtmlTextFormat(String text) { // super();
		this.text = text;
	}
	
	public String fett() {
		return "<b>" + text + "</b>";
	}

	public String kursiv() {
		return "<i>" + text + "</i>";
	}
	
	public String toString() {
		return "Html" + super.toString();
	}
}

/*
 * Markdown
 */
class MarkdownTextFormat extends TextFormat {
	
	public MarkdownTextFormat(String text) { // super();
		this.text = text;
	}
	
	public String fett() {
		return "__" + text + "__";
	}
	
	public String toString() {
		return "Markdown" + super.toString();
	}
}


public class B02_nochmal_extends {

	public static void main(String[] args) {
		
		String text = "Heute ist Dienstag";
		
		HtmlTextFormat htmlFormat = new HtmlTextFormat(text);
		System.out.println("fett html: " + htmlFormat.fett());

		MarkdownTextFormat mdFormat = new MarkdownTextFormat(text);
		System.out.println("fett markdown: " + mdFormat.fett());

		/*
		 * Elemente der Basisklasse mit Objekten der abgeleiteten Typen:
		 */
		System.out.println("mdFormat.text: " + mdFormat.text);
		mdFormat.setText("Freitag");
		String newText = mdFormat.getText();
		
		System.out.println("htmlFormat.text: " + htmlFormat.text);
		htmlFormat.setText("Moin");
		System.out.println("htmlFormat.text: " + htmlFormat.text);
		System.out.println("htmlFormat.text: " + htmlFormat.getText());
		
		/*
		 * toString-Test
		 */
		System.out.println("**** toString-Test");
		System.out.println("htmlFormat: " + htmlFormat);
		System.out.println("mdFormat: " + mdFormat);
		
	}

}
