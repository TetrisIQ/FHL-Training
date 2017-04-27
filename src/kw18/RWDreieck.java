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

	public RWDreieck(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
	}

	public double berechneFlaeche() {
		return ((this.a * this.b) / 2);
	}
	
	

}
