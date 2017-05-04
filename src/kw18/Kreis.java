/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Kreis.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

public class Kreis extends Ellipse {

	/**
	 * Konstruktor für kreis
	 * 
	 * @param x
	 *            X Coordinate des Kreises
	 * @param y
	 *            Y Coordinate des Kreises
	 * @param z
	 *            Z Coordinate des Kreises
	 * @param r
	 *            Der Radius des Kreises
	 */
	public Kreis(int x, int y, int z, int r) {
		super(x, y, z, r, r);

	}

}
