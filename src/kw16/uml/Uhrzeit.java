package kw16.uml;

public class Uhrzeit {

	private int stunde;
	private int minute;
	
	public Uhrzeit(int s, int m) {
		this.stunde = s;
		this.minute = m;
	}
	
	public String toString() {
		return this.stunde + ":" + this.minute + " Uhr";
		
	}
}
