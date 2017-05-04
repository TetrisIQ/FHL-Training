/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: RWDreieck.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

public class RWDreieck extends FigMZLA {

	/**
	 * 
	 * @param x
	 *            X Coordinate des Rechtwinkligen Dreiecks
	 * @param y
	 *            Y Coordinate des Rechtwinkligen Dreiecks
	 * @param z
	 *            Z Coordinate des Rechtwinkligen Dreiecks
	 * @param a
	 *            Die seitenlänge des Rechtwinkligen Dreiecks
	 * @param b
	 *            Die zweite Seitenlänge des Rechtwinkligen Dreiecks
	 */
	public RWDreieck(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
	}

	/**
	 * Berechnet die Fläche eines Rechtwinkligen Dreiecks
	 * 
	 * @return Die Fläche des Rechtwinkligen Dreiecks
	 */
	public double berechneFlaeche() {
		return ((this.a * this.b) / 2);
	}

}
