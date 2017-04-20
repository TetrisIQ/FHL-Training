package kw16.uml;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Personen.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.uml <br>
 */
public class Person {
	private String vorname;
	private String nachname;
	
	/**
	 * Konstruktor für Personen 
	 * @param v Vorname 
	 * @param n Nachname 
	 */
	public Person(String v, String n) {
		this.vorname = v;
		this.nachname = n;
		
	}
	
	/**
	 * toString Methode zur ausgeb von Personen 
	 */
	public String toString() {
		return this.vorname+ " " + this.nachname;
	}

}
