package kw19;

/**
 * Klasse aus der Aufgabenstellung 
 * 
 */
public class MyObject implements Comparable<MyObject> {
	int value;
	
	/**
	 * Konstruktor für {@link MyObject}
	 */
	public MyObject(int v) {
		this.value = v;
	}

	/**
	 * CompareTo Methode für {@link MyObject}
	 */
	public int compareTo(MyObject o) {
		return this.value - o.value;
	}
	/**
	 * toString Methode für {@link MyObject}
	 */
	public String toString() {
		return "" + value;
	}
}
