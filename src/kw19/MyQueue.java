/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: MyQueue.java <br>
 * Datum: 02.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;

public class MyQueue<T> {
	private T[] array;
	private int size;
	private int anfang;
	private int ende;
	private static final int CAPACITY = 999;

	@SuppressWarnings("unchecked")
	public MyQueue() {
		array = (T[]) new Object[CAPACITY];
		anfang = 0;
		ende = -1;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean enter(T t) {
		if (array.length >= CAPACITY)
			return false;
		ende = inc(ende);
		array[ende] = t;
		size++;
		return true;
	}

	public T front() {
		if (array.length == 0) return null;
		return array[anfang];
	}

	public T leave() {
		T ret = front();
		deQueue();
		return ret;

	}

	public void deQueue() {
		anfang = inc(anfang);
		size--;

	}

	private int inc(int i) {
		if (++i == array.length)
			i = 0;
		return i;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (T t : array) {
			sb.append(t);
		}
		
		return sb.toString();
		
	}

}
