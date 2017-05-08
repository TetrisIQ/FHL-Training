/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Node.java <br>
 * Datum: 02.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;


/**
 * Zum speichern von Knoten und ihren Eigenschaften
 */
public class Node<T extends Comparable<T>> {

	public Node<T> left;
	public Node<T> right;
	public T value;

	/**
	 * Konstruktor von Bäume
	 * 
	 * @param v
	 *            Der Wert des Knoten
	 * @param l
	 *            Der linke Kindknoten
	 * @param r
	 *            Der rechte Kindknoten
	 */
	public Node(T t, Node<T> l, Node<T> r) {
		value = t;
		left = l;
		right = r;
	}

	/**
	 * toString Methode <br>
	 * Gibt den Wert des obersten Wurzelknoten aus
	 */
	public String toString() {
		return value + " ";
	}

}
