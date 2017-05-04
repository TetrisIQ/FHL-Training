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

	protected int a;
	protected int b;
	protected String figurenTyp;

	/**
	 * Konstruktor für Figuren mit 2 Kantenlängen
	 * 
	 * @param x
	 *            X Coordinate der Figur
	 * @param y
	 *            Y Coordinate der Figur
	 * @param z
	 *            Z Coordinate der Figur
	 * @param a
	 *            Kantenlänge a
	 * @param b
	 *            Kantenlänge b
	 */
	public FigMZLA(int x, int y, int z, int a, int b) {
		super(x, y, z);
		this.a = a;
		this.b = b;
		figurenTyp = this.getClass().getSimpleName();
		if (figurenTyp.equals("RWDreieck")) {
			figurenTyp = "Rechtwinkliges Dreieck";
		}

	}

	/**
	 * abstrakte methode zur berechnung der Fläche von {@link FigMZLA}
	 * @return Die Fläche der {@link FigMZLA}
	 */
	public abstract double berechneFlaeche();

	/**
	 * toString Methode für {@link FigMZLA}
	 * @return Die Position der Figur und ihre
	 */
	public String toString() {

		return figurenTyp + " an Position (" + this.x + ", " + this.y + ", " + this.z + ") mit einer Fläche von "
				+ berechneFlaeche() + " Flächeneinheiten";
	}

}
