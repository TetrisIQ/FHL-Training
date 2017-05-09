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

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public boolean enter(T t) {
		return queue.add(t);
	}

	public T front() {
		if (isEmpty())
			return null;
		return queue.get(0);
	}

	public T leave() {
		if (isEmpty())
			throw new NoSuchElementException();
		T ret = front();
		queue.remove(0);
		return ret;

	}

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
