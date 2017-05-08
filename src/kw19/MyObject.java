package kw19;

import com.sun.org.apache.regexp.internal.recompile;

public class MyObject implements Comparable<MyObject> {
	int value;

	public MyObject(int v) {
		this.value = v;
	}

	public int compareTo(MyObject o) {
		return this.value - o.value;
	}

	public String toString() {
		return "" + value;
	}
}
