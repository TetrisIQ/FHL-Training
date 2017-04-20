package kw16.uml;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: UML_Main.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.uml <br>
 */
public class UML_Main {

	public static void main(String[] args) {
		Mitarbeiter m = new Mitarbeiter("Max", "Mustermann", "mustermann@beispiel.com");

		System.out.println(m);
		Mitarbeiter m1 = new Mitarbeiter("Max", "Mustermann", "mustermann@ex.com");
		Mitarbeiter m2 = new Mitarbeiter("Tessa", "Loniki", "loniki@ex.com");
		Raum r1 = new Raum(18, 0, 1);
		Raum r2 = new Raum(2, 1, 9);
		Raum r3 = new Raum(2, 1, 10);

		m1.reserviere(r1, new Uhrzeit(12, 30), new Uhrzeit(14, 30), "VOOP");
		m1.reserviere(r2, new Uhrzeit(14, 30), new Uhrzeit(16, 30), "WebTech");
		m2.reserviere(r2, new Uhrzeit(12, 30), new Uhrzeit(13, 30), "Prog II");
		m2.reserviere(r3, new Uhrzeit(9, 30), new Uhrzeit(11, 30), "ITM");
		
		System.out.println(r2);

	}

}
