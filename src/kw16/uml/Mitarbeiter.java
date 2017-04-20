package kw16.uml;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Mitarbeiter.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.uml <br>
 */
public class Mitarbeiter extends Person {
	private String email;
	private List<Reservierung> reservierungen = new LinkedList<Reservierung>();

	/**
	 * Konstruktor für Mitarbeiter
	 * 
	 * @param v
	 *            Vorname
	 * @param n
	 *            Nachname
	 * @param e
	 *            Emailadresse
	 */
	public Mitarbeiter(String v, String n, String e) {
		super(v, n);
		this.email = e;
	}

	/**
	 * toString Methode zur ausgabe von Mitarbeitern
	 */
	public String toString() {
		return super.toString() + " (" + this.email + ")";
	}

	/**
	 * Methode zum reservieren eines Raumes
	 * 
	 * @param raum
	 *            ein Raum
	 * @param von
	 *            Uhrzeit von
	 * @param bis
	 *            Uhrzeit bis
	 * @param s
	 *            Bemerkungs String
	 */
	public void reserviere(Raum raum, Uhrzeit von, Uhrzeit bis, String s) {
		Reservierung tmp = new Reservierung(von, bis);
		tmp.setMitarbeiter(this);
		tmp.setBemerkung(s);
		tmp.setRaum(raum);
		this.reservierungen.add(tmp);

	}

}
