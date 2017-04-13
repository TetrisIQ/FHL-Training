package kw15.auto;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Auto.java <br>
 * Datum: 05.04.2017 <br>
 * Package: kw15.auto <br>
 */
public class Auto {
	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double leistung;

	/**
	 * Kostruktor für ein Auto
	 * 
	 * @param h
	 *            Hersteller
	 * @param l
	 *            Kilometerstand / Laufleistung
	 * @param p
	 *            Preis
	 * @param f
	 *            Farbe
	 * @param u
	 *            unfallwagen, Boolean
	 * @param k
	 *            Kraftstoff
	 * @param ps
	 *            Leistung
	 */
	public Auto(String h, long l, double p, String f, boolean u, String k, double ps) {
		this.hersteller = h;
		this.laufleistung = l;
		this.preis = p;
		this.farbe = f;
		this.unfallwagen = u;
		this.kraftstoff = k;
		this.leistung = ps;

	}

	/**
	 * toString methode für ein Auto
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("---\n").append("Hersteller: ").append(this.hersteller).append("\n").append("Preis: ")
				.append(this.preis).append("\n").append("Motor: ").append(this.leistung).append(" (")
				.append(this.kraftstoff).append(") \n").append("KM-Stand: ").append(this.laufleistung).append("\n")
				.append("Farbe: ").append(this.farbe).append("\n").append(unfallwagen ? "---" : "unfallfrei \n---");
		return sb.toString();
	}

	/**
	 * Getter Methode für Preis
	 * 
	 * @return Den Preis vom Auto
	 */
	public double getPreis() {
		return this.preis;
	}

	/**
	 * Getter Methode für den boolean Unfallwagen
	 * 
	 * @return True = Unfallwagen False = Unfallfrei
	 */
	public boolean getUnfallwagen() {
		return this.unfallwagen;
	}

	/**
	 * Getter Methode für den Kraftstoff
	 * 
	 * @return Den Kraftstoff
	 */
	public String getKraftstoff() {
		return this.kraftstoff;
	}

}
