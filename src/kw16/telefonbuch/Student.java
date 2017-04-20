package kw16.telefonbuch;


/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Student.java <br>
 * Datum: 10.04.2017 <br>
 * Package: kw16.telefonbuch <br>
 */
public class Student implements kw16.telefonbuch.Mitarbeiter {
	private Raum raum;
	private String name;
	private String mail;
	@SuppressWarnings("unused")
	private int matrNr;

	/**
	 * Konstruktor für Studenten 
	 * @param n Name 
	 * @param m MailAdresse
	 * @param matrNr MatrikelNr.
	 */
	public Student(String n, String m, int matrNr) {
		this.name = n;
		this.mail = m;
		this.matrNr = matrNr;
	}

	/**
	 * toString Methode zur ausgabe von Studenten
	 */
	public String toString() {
		return this.name + " (" + this.mail + ")";
	}


	@Override
	/**
	 * Getter Methode für Studenten
	 */
	public String getName() {
		return this.name;
	}


	@Override
	/**
	 * Getter Methode für Studenten
	 */
	public Raum getRaum() {
		return this.raum;
	}

	
	@Override
	/**
	 * Setter Methode für Studenten 
	 * @param raum Raum
	 */
	public void setRaum(Raum raum) {
		this.raum = raum;
	}


}
