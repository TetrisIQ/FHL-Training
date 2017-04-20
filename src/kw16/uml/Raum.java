package kw16.uml;

import java.util.LinkedList;
import java.util.List;
/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Raum.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.uml <br>
 */
public class Raum {
	
	private int geb;
	private int etage;
	private int raum;
	private List<Reservierung> re = new LinkedList<Reservierung>();
	
	/**
	 * Konstruktor für ein Raum
	 * @param g Gebäude Nr.
	 * @param e Etage Nr.
	 * @param r Raum Nr.
	 */
	public Raum(int g, int e, int r) {
		this.geb = g;
		this.etage = e;
		this.raum = r;
	}
	
	/**
	 * toString Methode zur ausgabe von Räumen 
	 */
	public String toString() {
		String result = "";
		for (Reservierung r : this.re) {
			result += r.toString();
		}
		return "Raum " + this.geb + "-" + this.etage +"." +this.raum + result;
	}
	
	/**
	 * Fügt einem Raum eine Reservierung hinzu
	 * @param res Reservierung
	 */
	public void addReservierung(Reservierung res) {
		this.re.add(res);
		
	}

}
