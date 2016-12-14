package OldProjekts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 11.4
	Classe: count.java
	Datum: 30.11.2016
 */

public class count {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		 URL url;
		try {
			url = new URL("http://www.nkode.io/assets/programming/onlyone.txt");
		 Map<Character, Integer> countedChars = countChars(url);
		 for (char c : countedChars.keySet()) {
		 System.out.println("- " + c + ": " + countedChars.get(c));
		 }
		 
		} catch (IOException e) {
			// TODO Automatisch generierter Erfassungsblock
			e.printStackTrace();
		}
	}

	/**
	 * Wandelt eine Textdatei in einen String um
	 * @param url Die URL Der Textdatei
	 * @return Die Textdatei als String
	 * @throws IOException 
	 */
	public static String downloadFileText(URL url) throws IOException {
		String text ="";
		String inputLine ="";
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));		
		while ((inputLine =in.readLine()) != null) { 										//jede Zeile wird in gelesen und anschließend in text gescrieben solange sie nicht leer ist
			text += inputLine + "\n";
		}
		in.close();
		return text;
		
		
	}	
	/**
	 * Zählt die zeichen in einer Textdatei
	 * @param url Die URL der Textdatei
	 * @return Gibt die Anzahl der Zeichen in der Textdatei aus
	 * @throws IOException
	 */
	public static Map<Character, Integer> countChars(URL url) throws IOException {
		Map<Character, Integer> ret = new TreeMap<Character, Integer>();
		String text = downloadFileText(url);
		int counttemp = 0;
		text = text.toLowerCase();														//.toLowerCase() wandelt in nur leerzeichen um 
		String Characters = "abcdefghijklmnopqrstuvwxyz";
		for (String temp : Characters.split("")) {
			counttemp = text.length() - (text.replaceAll(temp, "").length());			//gesamtlänge - die länge des Textes ohne die zeichen = anzahl der ersetzten zeichen temp
			if (counttemp != 0) ret.put(temp.charAt(0), counttemp);						//Key temp 	// Value Anzahl der zeichen
		}		
		return ret;
	}

}
