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
	private String name;
	private String mail;
	private String titel;

	public Angestellter(String t, String n, String m) {
		this.name = n;
		this.mail = m;
		this.titel = t;
	}

	public String toString() {
		return this.titel + " " + this.name + " (" + this.mail + ")";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Raum getRaum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRaum(Raum raum) {
		// TODO Auto-generated method stub

	}

}
