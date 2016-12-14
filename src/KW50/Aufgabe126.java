package KW50;

import java.util.LinkedList;
import java.util.List;

public class Aufgabe126 {
	
public static void main (String [] args){
		
		List<Integer>vs = new LinkedList<Integer>();
		for (int i =1 ; i <= 5; i++){ 
			vs.add(i);
			}
		System.out.println(join(vs, "+") + "=" + sum(vs));
		//System.out.println(vs);
	}

	/**
	 * Fügt alle elemte einer Liste zusammen und trennt sie durch einen einen Operator
	 * @param vs Die Liste
	 * @param sep Ein Operator <b>Z.b. "+" </b>
	 * @return Alle elemente der Liste getrent durch den Operator
	 */
	public static String join(List<Integer>vs, String sep) {
		return join(vs, sep, vs.size());  // vs.size gibt die größe der nächsten methode über		
	}
	
	/**
	 * Fügt alle elemte einer Liste zusammen und trennt sie durch einen einen Operator
	 * @param vs Die Liste
	 * @param sep Ein Operator <b>Z.b. "+" </b> 
	 * @param count Die Größe der Liste
	 * @return Alle elemente der Liste getrent durch den Operator
	 */
	public static String join(List<Integer>vs, String sep, int count) {
		if (count == 0) return "";				
		if (count == 1) return vs.get(0) + "";	
		
		int n =vs.get(count-1);	// gibt das letzte element bei jeden durchgang zurück					
		count--;					

		return join(vs, sep, count) + sep + n;
		
	}
	
	/**
	 * Addiert alle werte der Liste zusammen
	 * @param n Die Liste
	 * @return Die Summe aller werte der Liste
	 */
	public static int sum (List<Integer> n){
		if (n.size() == 0) return 0;	
		if (n.size() == 1) return n.get(0);
		return n.remove(0) + sum(n);
	}
	
	
}