package kw16.uml;

public class Person {
	private String vorname;
	private String nachname;
	
	
	public Person(String v, String n) {
		this.vorname = v;
		this.nachname = n;
		
	}
	
	public String toString() {
		return this.vorname+ " " + this.nachname;
	}

}
