package KW50;

/**
*****alex*****
Autor: Alexander Werner
Projekt: KW50
Classe: Aufgabe111.java
Datum: 12.12.2016
*/

public class Aufgabe124 {

public static void main(String[] args) {
	
	System.out.println(mirror("Spiegel"));
	
}
	
/**
 * Spiegelt ein String
 * @param s Der zu Spiegelnde Strin
 * @return Der String und den gespiegelten string aneinander
 */
public static String mirror(String s) {
	if (s.isEmpty()) return"";
	if (s.length() == 0 ) return s;
	char head = s.charAt(0);
	String rest = s.substring(1);
	return  head + mirror(rest) + head; 
}

}