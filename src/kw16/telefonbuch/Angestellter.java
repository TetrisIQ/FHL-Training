package kw16.telefonbuch;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Angestellter.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.telefonbuch <br>
 */
public class Angestellter implements Mitarbeiter {
	private Raum raum;
	private String name;
	private String mail;
	private String titel;

	/**
	 * Konstruktor für Angestellte
	 * @param t Titel
	 * @param n Name
	 * @param m MailAdresse
	 */
	public Angestellter(String t, String n, String m) {
		this.name = n;
		this.mail = m;
		this.titel = t;
	}

	/**
	 * toString Methode zur ausgabe von angestellten 
	 */
	public String toString() {
		return this.titel + " " + this.name + " (" + this.mail + ")";
	}

	@Override
	/**
	 * Getter Methode für Angestellte
	 */
	public String getName() {
		return this.name;
	}

	@Override
	/**
	 * Getter Methode für Angestellte
	 */
	public Raum getRaum() {
		return this.raum;
	}

	@Override
	/**
	 * Setter Methode für Angestellte
	 * @parm r Raum
	 */
	public void setRaum(Raum r) {
		this.raum = r;

	}

	@Override
	public int compareTo(Mitarbeiter o) {
		return this.name.compareToIgnoreCase(o.getName());
	}


}
