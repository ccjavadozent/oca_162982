package staedte;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AufgabeDeutscheStaedte {
	
	public static void main(String[] args) throws IOException {
		
//		String urlName = "https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
//		String htmlText = TextIO.getFromWiki(urlName);
//		TextIO.save(htmlText, "wiki.html");
		
//		String htmlText = Jsoup.connect(urlName).get().toString(); // alternativ möglich

		String htmlText = TextIO.loadFromFile("wiki.html");
		
		System.out.println("Html-Text geladen");
		
//		htmlText.lines().limit(10).forEach(System.out::println); // 10 Zeilen ausgeben
		
		List<Stadt> staedte = parseStaedte(htmlText);
		
		for (Stadt stadt : staedte) {
			System.out.println(stadt);
		}
		
		
		System.out.println("Städte geladen: " + staedte.size()); // 81
	} // end of main 

	
	private static List<Stadt> parseStaedte(String htmlText) {
		Document doc = Jsoup.parse(htmlText);
		
		Elements alleTabellen = doc.getElementsByTag("table");
		
//		System.out.println("Tabellen gefunden: " + alleTabellen.size());
		Element table =  alleTabellen.get(0);
		
		Elements alleZeilen = table.getElementsByTag("tr");
//		System.out.println("Zeilen: " + alleZeilen.size()); // 85
		
		List<Stadt> staedte = new ArrayList<>();
		
		// Header und Footer ignoriert (verwende Table-rows ab 2 bis 83 )
		for (int i = 2; i < 83; i++) {
			Element zeile = alleZeilen.get(i);
			Stadt s = parseStadt(zeile);
			staedte.add(s);
		}
		
		return staedte;
	}
	
	private static Stadt parseStadt(Element tableRow) {
//		System.out.println(tableRow);
		
		Elements alleSpalten = tableRow.getElementsByTag("td");
		
		Element spalteName = alleSpalten.get(1);
//		System.out.println(spalteName);
		String name = spalteName.getElementsByTag("a").get(0).ownText();
//		System.out.println(name);
		
		Element spalteEinwohner = alleSpalten.get(11);
//		System.out.println(spalteEinwohner);
		int einwohner = Integer.parseInt( spalteEinwohner.ownText().replace(".", "") );
//		System.out.println(einwohner);
		
		Element spalteLand = alleSpalten.get(16);
//		System.out.println(spalteLand);
		
		String land = spalteLand.getElementsByTag("a").last().ownText();
//		System.out.println(land);
		
		return new Stadt(name, einwohner, land);
	}
}
















