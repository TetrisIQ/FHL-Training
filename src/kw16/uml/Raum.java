package kw16.uml;

import java.util.LinkedList;
import java.util.List;

public class Raum {
	
	private int geb;
	private int etage;
	private int raum;
	private List<Reservierung> re = new LinkedList<Reservierung>();
	
	public Raum(int g, int e, int r) {
		this.geb = g;
		this.etage = e;
		this.raum = r;
	}
	
	public String toString() {
		String result = "";
		for (Reservierung r : this.re) {
			result += r.toString();
		}
		return "Raum " + this.geb + "-" + this.etage +"." +this.raum + result;
	}
	
	public void addReservierung(Reservierung res) {
		this.re.add(res);
		
	}

}
