package OldProjekts;
/**
 	****alex*****
	Autor: Alexander Werner
	Projekt: 7.7
	Classe: Sandwich.java
	Datum: 08.11.2016
 */
import java.util.Scanner;
public class Sandwich {

	/**
	 * Die Sandwich Methode
	 * @param str Dein Sandwich
	 * @return Dein Belag
	 * @author Alexander
	 */
	public static String getSandwich(String str) {
		int last = str.lastIndexOf("bread");
		int first = str.indexOf("bread");
		if (str.length() <= 10 || last != 0 && first !=0) {
			return "";
		}
		
		return str.substring(first+5, last);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Gib eine Zeichenkette gem. der Aufgabenstellung ein: ");
		String str = in.nextLine();
		System.out.println("Dein belag ist: "+getSandwich(str));
		in.close();
	}

}
