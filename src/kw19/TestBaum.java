/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: TestBaum.java <br>
 * Datum: 04.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestBaum {

	public static void main(String[] args) {
		List<MyObject> values = new LinkedList<MyObject>();
		Random r = new Random();
		for (int i = 20; i >= 1; i--) {
			values.add(new MyObject(r.nextInt(i)));
		}
		System.out.println("Unsortiert: " + values);
//		System.out.println("Sortiert: " + BTree.bsort(values));
	}
}
