/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Rechteck.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

public class Rechteck extends FigMZLA {
	/**
	 * @param x
	 *            X Coordinate des Rechtecks
	 * @param y
	 *            Y Coordinate des Rechtecks
	 * @param z
	 *            Z Coordinate des Rechtecks
	 * @param a
	 *            Die seitenlänge des Rechtecks
	 * @param b
	 *            Die zweite Seitenlänge des Rechtecks
	 */
	public Rechteck(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
	}

	/**
	 * Berechnung der Fläche eines Rechtecks
	 * 
	 * @return die Fläche des Rechtecks
	 */
	public double berechneFlaeche() {
		return this.a * this.b;
	}

}
