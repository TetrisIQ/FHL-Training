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

public class Figur {

	int x;
	int y;
	int z;
	private static List<Figur> figuren = new LinkedList<>();

	/**
	 * Konstrukror für figuren
	 * 
	 * @param x
	 *            X Coordinate der Figur
	 * @param y
	 *            Y Coordinate der Figur
	 * @param z
	 *            Z Coordinate der Figur <br>
	 *            Legt die angelegten figuren statisch in einer liste ab
	 */
	public Figur(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		figuren.add(this);
	}

	/**
	 * Gibt die anzahl aller Figuren zurük
	 * 
	 * @return die anzahl aller Figuren
	 */
	public static final int anzFiguren() {
		return figuren.size();
	}

	/**
	 * gibt eine liste aller figuren zurück
	 * 
	 * @return eine liste mit allen figuren
	 */
	public static final List<Figur> getAlleFiguren() {
		return figuren;
	}

	/**
	 * retrunt den Z wert einer Figur
	 * 
	 * @return den Z wert einer Figur
	 */
	public int getZ() { // unnötig
		return this.z;
	}

//	/**
//	 * Berrechnet die fläche einer Figur
//	 * 
//	 * @return die fläche der Figur
//	 */
//	public abstract double berechneFlaeche();

	/**
	 * Sortiert mittels bubblesort eine Liste mit Figuren nach ihrem Z wert
	 * 
	 * @return eine Sortierte Liste
	 */
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

	/**
	 * Filtert die Liste mit figuren nach oberer und unterer schranke
	 * 
	 * @param a
	 *            Oberre schranke
	 * @param b
	 *            Unterre schranke
	 * @param f
	 *            Liste mit Figuten
	 * @return eine Liste mit Figuren die den zwischen den Schranken liegen
	 */
	static List<Figur> filterZ(int a, int b, List<Figur> f) {
		List<Figur> result = new LinkedList<>();

		for (int i = 0; i < f.size(); i++) {
			if (((f.get(i)).getZ() >= a && f.get(i).getZ() <= b)) {
				result.add(f.get(i));
			}
		}
		return result;

	}

	/**
	 * Berrechnet die durchschnittliche fläche
	 * 
	 * @return Gibt einen String in der form wie es in aufgabe 18.4 gefordert
	 *         ist aus.
	 */
	static String avgFlaecheninhalt() {
		List<Figur> list = filterZ(0, 50, figuren);
		int counter = 0;
		double sum = 0;

		for (int i = 0; i <= list.size() - 1; i++) {
			sum += ((FigMZLA) list.get(i)).berechneFlaeche();
			counter++;
		}

		return "Die Gesamtfläche aller " + counter + " Figuren beträgt " + sum + " Flächeneinheiten. " + "\n"
				+ "Die durchschnittliche Fläche pro Figur beträgt " + (sum / counter) + " Flächeneinheiten.";
	}

}
