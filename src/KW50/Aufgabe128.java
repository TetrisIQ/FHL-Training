package KW50;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Alexander
 */
public class Aufgabe128 {

	public static void main(String[] args) {
		System.out.println(max(generateRandoms(1, 10, 100))); // vermutlich 10
		System.out.println(max(generateRandoms(1, 10, 0))); // null
//		System.out.println(max(Arrays.asList(0,1,2,3,4,5,6)));
	}

	/**
	 * Vergleicht die ersten beiden Positionen <br> der Übergebenen Liste und löscht die kleinere Zahl
	 * @param figures Liste mit Zahlen
	 * @return Das Größte Zahl der Liste
	 */
	public static int max(List<Integer> figures) {
		// Abbruchbedingung null oder empty
		if (figures == null || figures.isEmpty()) return 0;
			if (figures.size() == 1) return figures.get(0);
				if (figures.get(0) > figures.get(1)) figures.remove(1);
				else figures.remove(0);
				return max(figures);
		}
	/**
	 * Generiert zufällige zahlen zwischen 2 Werten
	 * @param start Der start Wert
	 * @param end Der end Wert
	 * @param n Die Anzahl der zufällig generierten Zahlen
	 * @return Eine Liste mit Zufällig generierten zahlen
	 */
	public static List<Integer> generateRandoms(int start, int end, int n) {

		List<Integer> ret = new LinkedList<Integer>();
		Stream<Integer>	rand = Stream.generate(() -> (start + (int)(Math.random() * ((end - start) + 1)))); 	
		ret.addAll(rand.limit(n).collect(Collectors.toList()));	
		return ret;
	}
}