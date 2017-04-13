package kw16.telefonbuch;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Telefonanschluss.java <br>
 * Datum: 10.04.2017 <br>
 * Package: kw16.telefonbuch <br>
 */
public class Telefonanschluss {

	private int vorwahle;
	private int hauptwahl;
	private int durchwahl;
	private Raum raum;

	public Telefonanschluss(int v, int h, int d) {
		this.vorwahle = v;
		this.hauptwahl = h;
		this.durchwahl = d;

	}

	public void setRaum(Raum r) {
		this.raum = r;
	}

	public String toString() {
		return "0" + this.vorwahle + "-" + this.hauptwahl + " " + this.durchwahl;
	}

}
