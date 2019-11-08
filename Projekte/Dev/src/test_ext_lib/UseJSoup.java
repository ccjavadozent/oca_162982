package test_ext_lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * Beispiele für JSoup:
 * 
 * https://jsoup.org/cookbook/
 * 
 */
public class UseJSoup {

	public static void main(String[] args) {
		
		String html = "<html><head><title>First parse</title></head><body><p>Parsed HTML into a doc.</p></body></html>";
		
		Document doc = Jsoup.parse(html);
				
		System.out.println(doc);		

	}

}
