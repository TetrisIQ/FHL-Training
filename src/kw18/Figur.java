/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Figur.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

import java.util.LinkedList;
import java.util.List;

public abstract class Figur {

	int x;
	int y;
	int z;
	private static List<Figur> figuren = new LinkedList<>();
	private static List<Figur> zFiguren = new LinkedList<>();

	public Figur(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		figuren.add(this);
	}
	
	public static final int anzFiguren() {
		return figuren.size();
	}
	public static final List<Figur> getAlleFiguren() {
		return figuren;
	}
	
	public int getZ() {
		return this.z;
	}

	public abstract double berechneFlaeche();

	public static List<Figur> getZsortierteFiguren() {
		List<Figur> list = new LinkedList<>(figuren);
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < list.size() - 1; i++) {
				if (!(list.get(i).getZ() <= list.get(i + 1).getZ())) {
					Figur dummy = list.get(i);
					list.set(i, (list.get(i + 1)));
					list.set((i + 1), dummy);

					unsorted = true;
				}
			}
		}
		return list;
	}
	
	static List<Figur> filterZ(int a, int b, List<Figur> f) {
		List<Figur> result = new LinkedList<>(f);

		for (int i = 0; i <= result.size() - 1; i++) {
			if (!((result.get(i)).getZ() >= a && result.get(i).getZ() >= b)) {
				result.remove(i);
			}
		}

		return result;	
		
		
	}






	
	
	
	
}

	