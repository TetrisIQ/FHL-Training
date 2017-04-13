package kw16.telefonbuch;

import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.xml.internal.serializer.SerializerTrace;

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

	public Raum(int g, int e, int r) {
		this.geb = g;
		this.etage = e;
		this.raum = r;
	}

	public String toString() {
		return this.geb + "-" + this.etage + "." + this.raum;
	}

	public boolean weiseZu(Mitarbeiter m) {
		m.setRaum(this);
		return true; //????????????????????????????????
	}

	public boolean weiseZu(Telefonanschluss tel) {
		tel.setRaum(this);
		return true; //??????????????????????????????????
	}

	public List<Mitarbeiter> getMitarbeiter() {
		List<Mitarbeiter> ret = new LinkedList<Mitarbeiter>();
		return ret;
	}

	public List<Telefonanschluss> getAnschluesse() {
		List<Telefonanschluss> tel = new LinkedList<Telefonanschluss>();
		return tel;
	}

}
