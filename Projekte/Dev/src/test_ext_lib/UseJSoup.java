package test_ext_lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * Beispiele für JSoup:
 * 
 * https://jsoup.org/cookbook/
 * 
 */
public class UseJSoup {

	public static void main(String[] args) {
		
		String html = "<html><head><title>First parse</title></head><body><p>p Nr. 1</p><p>Parsed HTML into a doc.</p></body></html>";
		
		Document doc = Jsoup.parse(html);
				
		System.out.println(doc);
	
		/*
 	    <html>
		 <head>
		  <title>First parse</title>
		 </head>
		 <body>
		  <p>p Nr. 1</p>
		  <p>Parsed HTML into a doc.</p>
		 </body>
		</html>
		 */
		
		Elements allePTags = doc.getElementsByTag("p");
		
		System.out.println("*** alle p-Tags:");
		System.out.println(allePTags);
		
		System.out.println("*** alle p-Tags mit for:");

		for (int i = 0; i < allePTags.size(); i++) {
			
			Element pTag = allePTags.get(i);
			System.out.println( "Nr. " + i + ": text: " + pTag.ownText() );
		}
		
	} // 

}
