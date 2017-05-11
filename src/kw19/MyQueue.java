/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: MyQueue.java <br>
 * Datum: 02.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	private List<T> queue = new LinkedList<T>();

	/**
	 * Überprüft ob die Queue Leer ist
	 * 
	 * @return <code>true</code> wenn die Queue leer ist <br>
	 *         <code>false</code> wenn die Liste nicht leer ist
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/**
	 * Fügt eine element der Queue am ende der Queue hinzu
	 * 
	 * @param t
	 *            Das element das hinzugefügt werden soll
	 * @return <code>true</code> wenn das hinzugügen erfolgreich ist
	 *         <code>false</code> wenn das hinzufügen nicht erfolgreich ist
	 */
	public boolean enter(T t) {
		return queue.add(t);
	}

	/**
	 * Gibt das erste element der Queue zurück
	 * 
	 * @return Das erste Element der Queue
	 */
	public T front() {
		if (isEmpty())
			return null;
		return queue.get(0);
	}

	/**
	 * Gibt das erste Element der Queue zurück und Löscht es anschlißend
	 * 
	 * @return Das Erste Element der Queue
	 */
	public T leave() {
		if (isEmpty())
			throw new NoSuchElementException();
		T ret = front();
		queue.remove(0);
		return ret;

	}
	/**
	 * toString Methode für {@link MyQueue}
	 * @return Die Queue als String 
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (T t : queue) {
			if (!(queue.get(0) == t)) {
				sb.append(", ");
			}
			sb.append(t);
		}
		sb.append("]");

		return sb.toString();

	}

}
