package kw16.uml;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Uhrzeit.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.uml <br>
 */
public class Uhrzeit {

	private int stunde;
	private int minute;

	/**
	 * Konstruktor für Uhrzeiten
	 * 
	 * @param s
	 *            Stunde
	 * @param m
	 *            Minute
	 */
	public Uhrzeit(int s, int m) {
		this.stunde = s;
		this.minute = m;
	}

	/**
	 * to String Methode für Uhrzeiten
	 */
	public String toString() {
		return this.stunde + ":" + this.minute + " Uhr";

	}
}
