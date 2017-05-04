/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Quadrat.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

public class Quadrat extends Rechteck {

	/**
	 * @param x
	 *            X Coordinate des Quadrats
	 * @param y
	 *            Y Coordinate des Quadrats
	 * @param z
	 *            Z Coordinate des Quadrats
	 * @param a
	 *            Die seitenlänge des Quadrates
	 */
	public Quadrat(int x, int y, int z, int a) {
		super(x, y, z, a, a);
	}

}
