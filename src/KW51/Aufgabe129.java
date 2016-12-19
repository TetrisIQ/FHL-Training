package KW51;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Aufgabe111.java <br>
 * Datum: 12.12.2016 <br>
 * Package: KW51 <br>
 */
public class Aufgabe129 {

	public static void main(String[] args) {
		List<String> words = getShortestWords("Dies ist nur ein dummes Beispiel");
		System.out.println(words);
		// => [ist, nur, ein]
		System.out.println(getShortestWords("Dies ist so ein dummes Beispiel"));
		// => [so]
		System.out.println(getShortestWords(""));
		// => []
		// System.out.println(getShortestWords(" a bb ss sssss"));

	}

	/**
	 * Trennt einen String am Leerzeichen und übergibt ihn an einen Liste
	 * 
	 * @param s
	 *            Ein String mit Leerzeichen getrennt
	 * @return Den getrennten String als Liste <br>
	 *         getShortestWords(test, ret.size(), 1, 1);
	 */
	public static List<String> getShortestWords(String s) {
		String[] work = s.trim().split("\\s+"); // \\s+ trennt an mehrzeichen
												// incl.
		// doppelungen
		List<String> ret = Arrays.asList(work);
		List<String> words = new ArrayList<String>(ret);
		return getShortestWords(words, ret.size(), 1, 1);
	}

	/**
	 * Vergleicht 2 elemente in einer Liste und Löscht das Längere
	 * 
	 * @param ls
	 *            Eine Liste
	 * @param origin
	 *            Die Ursprüngliche Länge der Liste
	 * @param counter
	 *            Zählt die Durchgange -> <b> Default: </b> 1
	 * @param second
	 *            Zweites Vergleichs Variable -> <b> Default: </b> 1
	 * @return Die Kurzesten Wörter in einer Liste
	 */
	public static List<String> getShortestWords(List<String> ls, int origin, int counter, int second) {
		List<String> ret = new ArrayList<String>(ls);
		if (ret.isEmpty() || origin == counter)
			return ret; // || ret.size() == 1
		if (ret.get(0).length() > ret.get(second).length())
			ret.remove(0);
		else if (ret.get(0).length() < ret.get(second).length())
			ret.remove(second);
		else if ((ret.get(0).length() == ret.get(second).length())) {
			second++;
		}
		counter++;

		return getShortestWords(ret, origin, counter, second);

	}

}
