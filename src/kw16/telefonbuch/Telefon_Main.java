package kw16.telefonbuch;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Telefon_Main.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw16.telefonbuch <br>
 */
public class Telefon_Main {

	public static void main(String[] args) {

		Telefonanschluss t = new Telefonanschluss(451, 300, 5549);
		System.out.println(t);

		Mitarbeiter m = new Angestellter("Prof. Dr.", "Musterfrau", "musterfrau@fhl.de");
		System.out.println(m);

		Mitarbeiter s = new Student("Max Mustermann", "max.mustermann@stud.fhl.de", 123456);
		System.out.println(s);
		
		 Raum r = new Raum(18, 0, 1);
		 System.out.println(r);
		 
		 r.weiseZu(m);
		 r.weiseZu(s);
		 
		 Telefonanschluss t1 = new Telefonanschluss(451, 300, 4321);
		 Telefonanschluss t2 = new Telefonanschluss(451, 300, 1234);
		 r.weiseZu(t1);
		 r.weiseZu(t2);


	}

}
