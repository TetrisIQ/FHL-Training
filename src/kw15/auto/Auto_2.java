package kw15.auto;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Auto_2.java <br>
 * Datum: 05.04.2017 <br>
 * Package: kw15.auto <br>
 */
public class Auto_2 {

	public static void main(String[] args) {
		// System.out.println("Auto_2");
		Auto[] autos = { new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0),
				new Auto("Mercedes", 63000, 2299.99, "blue silver", true, "Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0) };
		bubbleSort(autos);
		for (Auto a : autos) {
			System.out.println(a);
		}
	}

	/**
	 * Sortiert eine Liste an Autos absteigend nach ihrem Preis
	 * 
	 * @param a
	 *            Ein Array an Autos
	 */
	public static void bubbleSort(Auto[] a) {
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < a.length - 1; i++) {
				// Aufsteigend sortiert
				// if (!(a[i].getPreis() <= a[i+1].getPreis())) {
				// Absteigend sortiert
				if (!(a[i].getPreis() >= a[i + 1].getPreis())) {
					Auto dummy = a[i];
					a[i] = a[i + 1];
					a[i + 1] = dummy;
					unsorted = true;
				}
			}
		}
	}

}
