package kw16.telefonbuch;

import kw16.uml.Mitarbeiter;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Student.java <br>
 * Datum: 10.04.2017 <br>
 * Package: kw16.telefonbuch <br>
 */
public class Student implements kw16.telefonbuch.Mitarbeiter {
	private String name;
	private String mail;
	private int matrNr;

	public Student(String n, String m, int matrNr) {
		this.name = n;
		this.mail = m;
		this.matrNr = matrNr;
	}

	public String toString() {
		return this.name + " (" + this.mail + ")";
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
