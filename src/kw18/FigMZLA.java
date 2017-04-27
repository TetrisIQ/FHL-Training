/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: FigMZLA.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;


public abstract class FigMZLA extends Figur {

	int a;
	int b;
	String figurenTyp;

	public FigMZLA(int x, int y, int z, int a, int b) {
		super(x, y, z);
		this.a = a;
		this.b = b;
		figurenTyp = this.getClass().getSimpleName();
		if (figurenTyp.equals("RWDreieck")) {
			figurenTyp = "Rechtwinkliges Dreieck";
		}
		
	}

	public abstract double berechneFlaeche();

	public String toString() {

		return figurenTyp + " an Position (" + this.x + ", " + this.y + ", " + this.z + ") mit einer Fläche von "
				+ berechneFlaeche() + " Flächeneinheiten";
	}

}