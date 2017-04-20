package kw16.uml;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Reservierung.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.uml <br>
 */
public class Reservierung {

	private String bemerkung;
	private Uhrzeit beginn;
	private Uhrzeit ende;
	private Mitarbeiter mitarbeiter;
	@SuppressWarnings("unused")
	private Raum raum;

	/**
	 * Konstruktor für Reservirungen
	 * 
	 * @param b
	 *            Uhrzeit Beginn / StartZeit
	 * @param e
	 *            Uhrzeit Ende / EndZeit
	 */
	public Reservierung(Uhrzeit b, Uhrzeit e) {
		this.beginn = b;
		this.ende = e;
	}

	/**
	 * Setter Methode für Reservierung
	 * 
	 * @param b
	 *            Bemerkung
	 */
	public void setBemerkung(String b) {
		this.bemerkung = b;
	}

	/**
	 * Setter Methode für Reservierung
	 * 
	 * @param m
	 *            Mitarbeiter
	 */
	public void setMitarbeiter(Mitarbeiter m) {
		this.mitarbeiter = m;
	}

	/**
	 * Setter Methode für Reservierung
	 * 
	 * @param r
	 *            Raum
	 */
	public void setRaum(Raum r) {
		this.raum = r;
		r.addReservierung(this);
	}

	/**
	 * toString Methode zu ausgabe von Reservirungen
	 */
	public String toString() {
		return "\ngebucht von " + this.mitarbeiter + " von " + this.beginn + " bis " + this.ende + "für "
				+ this.bemerkung;
	}

}
