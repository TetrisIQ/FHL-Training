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

	/**
	 * Konstruktor für Telefonanschlüsse
	 * @param v Vorwahl
	 * @param h Hauptwahl
	 * @param d Durchwahl
	 */
	public Telefonanschluss(int v, int h, int d) {
		this.vorwahle = v;
		this.hauptwahl = h;
		this.durchwahl = d;

	}

	/**
	 * Setter Methode für Telefonanschlüsse
	 * @param r Raum 
	 */
	public void setRaum(Raum r) {
		this.raum = r;
	}

	/**
	 * toString Methode zum ausgeben von Telefonanschlüssen
	 */
	public String toString() {
		return "0" + this.vorwahle + "-" + this.hauptwahl + " " + this.durchwahl;
	}

}
