package kw15.auto;

public class Auto {
	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double leistung;
	
	
	public Auto(String h, long l, double p, String f, boolean u, String k, double ps) {
		this.hersteller = h;
		this.laufleistung = l;
		this.preis = p;
		this.farbe = f;
		this.unfallwagen = u;
		this.kraftstoff = k;
		this.leistung = ps;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("---\n")
		  .append("Hersteller: ").append(this.hersteller).append("\n")
		  .append("Preis: ").append(this.preis).append("\n")
		  .append("Motor: ").append(this.leistung).append(" (").append(this.kraftstoff).append(") \n")
		  .append("KM-Stand: ").append(this.laufleistung).append("\n")
		  .append("Farbe: ").append(this.farbe).append("\n").append(unfallwagen ? "unfallwagen" : "unfallfrei").append("\n")
		  .append("---");
		return sb.toString();
	}
	
	public double getPreis() {
		return this.preis;
	}
	
	public boolean getUnfallwagen() {
		return this.unfallwagen;
	}
	
	public String getKraftstoff() {
		return this.kraftstoff;
	}

}
