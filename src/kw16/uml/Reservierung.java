package kw16.uml;

public class Reservierung {
	
	private String bemerkung;
	private Uhrzeit beginn;
	private Uhrzeit ende;
	private Mitarbeiter mitarbeiter;
	private Raum raum;
	
	
	public Reservierung(Uhrzeit b, Uhrzeit e) {
		this.beginn = b;
		this.ende = e;
	}
	
	
	public void setBemerkung(String b) {
		this.bemerkung = b;
	}
	
	public void setMitarbeiter(Mitarbeiter m) {
			this.mitarbeiter = m;
	}
	
	public void setRaum(Raum r) {
		this.raum = r;
		r.addReservierung(this);
	}
	
	public String toString() {
		return "\ngebucht von " + this.mitarbeiter + " von " +this.beginn +" bis " +this.ende + "für " +this.bemerkung;
	}

}
