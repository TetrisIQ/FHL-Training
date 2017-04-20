package kw16.telefonbuch;

import java.util.LinkedList;
import java.util.List;

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

		List<Mitarbeiter> li = new LinkedList<Mitarbeiter>();
		li.add(s);
		li.add(m);

		System.out.println(s);
		System.out.println("_-------------------------------------_");
		System.out.println(telefonbuch(li));

	}

	/**
	 * Methode zum Sortieren und ausgeben einer Liste von Mitarbeitern incl.
	 * Telefonanschlüssen <br>
	 * Die Liste wird Alphabetisch Sortiert ausgeben <br>
	 * Die Ursprungsliste wird NICHT verändert
	 * 
	 * @param mas Eine Liste mit Mitarbeitern 
	 * @return Auflistung von Mitarbeitern und ihrer Telefonanschlüsse
	 */
	private static String telefonbuch(List<Mitarbeiter> mas) {
		List<Mitarbeiter> li = new LinkedList<Mitarbeiter>(mas);
		li.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));
		StringBuilder sb = new StringBuilder();
		for (Mitarbeiter m : li) {
			sb.append(m.toString()).append("\n");
			for (Telefonanschluss tel : m.getRaum().getAnschluesse()) {
				sb.append("- ").append(tel.toString()).append(" (").append(m.getRaum().toString()).append(")\n");
			}

		}

		return sb.toString();
	}

}
