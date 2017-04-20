package kw16.telefonbuch;

import java.util.LinkedList;
import java.util.List;


/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Raum.java <br>
 * Datum: 10.04.2017 <br>
 * Package: kw16.telefonbuch <br>
 */
public class Raum {
	private int geb;
	private int etage;
	private int raum;
	private List<Mitarbeiter> m = new LinkedList<Mitarbeiter>();
	private List<Telefonanschluss> anschluesse = new LinkedList<Telefonanschluss>();
	

	public Raum(int g, int e, int r) {
		this.geb = g;
		this.etage = e;
		this.raum = r;
	}

	public String toString() {
		return this.geb + "-" + this.etage + "." + this.raum;
	}

	public boolean weiseZu(Mitarbeiter m) {
		if (this.m.contains(m)) return false;
		m.setRaum(this);
		return this.m.add(m); 
	}

	public boolean weiseZu(Telefonanschluss tel) {
		if (this.anschluesse.contains(tel)) return false;
		tel.setRaum(this);
		return this.anschluesse.add(tel); 
	}

	public List<Mitarbeiter> getMitarbeiter() {
		return this.m;
	}

	public List<Telefonanschluss> getAnschluesse() {
		return this.anschluesse;
	}

}
