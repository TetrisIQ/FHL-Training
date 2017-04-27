/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Ellipse.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

public class Ellipse extends FigMZLA {

	public Ellipse(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
	}

	@Override
	public double berechneFlaeche() {
		return ((Math.PI) * a * b);
	}
	

}
