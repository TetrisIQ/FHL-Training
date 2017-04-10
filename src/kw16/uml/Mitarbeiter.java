package kw16.uml;

import java.util.LinkedList;
import java.util.List;

public class Mitarbeiter extends Person {
	private String email;
	private List<Reservierung> reservierungen = new LinkedList<Reservierung>();

	public Mitarbeiter(String v, String n, String e) {
		super(v, n);
		this.email = e;
	}

	public String toString() {
		return super.toString() + " (" + this.email + ")";
	}

	public void reserviere(Raum raum, Uhrzeit von, Uhrzeit bis, String s) {
		Reservierung tmp = new Reservierung(von, bis);
			tmp.setMitarbeiter(this);
			tmp.setBemerkung(s);
			tmp.setRaum(raum);
		this.reservierungen.add(tmp);
		
	}

}
