package kw15.auto;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Auto_3.java <br>
 * Datum: 05.04.2017 <br>
 * Package: kw15.auto <br>
 */
public class Auto_3 {
	public static void main(String[] args) {
		Auto[] autobestand = { new Auto("Ford", 125000, 7999.99, "silbermetallic", false, "Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "bluesilver", true, "Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "greendynamite", false, "Benzin", 75.0),
				new Auto("Ford", 1700, 17999.99, "silbermetallic", false, "Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "bluesilver", true, "Elektro", 37.0),
				new Auto("Daihatsu", 12000, 3099.99, "greendynamite", true, "Benzin", 75.0),
				new Auto("Ford", 12500, 12999.99, "silbermetallic", false, "Super", 121.0),
				new Auto("Mercedes", 6300, 32999.99, "bluesilver", false, "Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "greendynamite", true, "Benzin", 75.0),
				new Auto("Ford", 1700, 17999.99, "silbermetallic", false, "Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "bluesilver", true, "Elektro", 37.0),
				new Auto("Daihatsu", 12000, 3099.99, "greendynamite", true, "Benzin", 75.0) };

		// System.out.println(autobestand[0].getKraftstoff().trim().equalsIgnoreCase("diesel"));
		System.out.println("Erlös ohne Nachlässe: " + erlose(autobestand) + " EUR");
		System.out.println("Anteil an Unfallwagen: " + unfallwagen(autobestand) + " %");
		System.out.println("Anteil an Dieselwagen: " + dieselwagen(autobestand) + " %");
		System.out.println("Anteil an Elektrowagen: " + elektrowagen(autobestand) + " %");
		System.out.println("Erlös mit Nachlässen: " + erloseMitNachlass(autobestand) + " EUR");
	}

	/**
	 * Zählt alle Preise der Autos im Array zusammen
	 * 
	 * @param a
	 *            Ein Array an Autos
	 * @return Den zu erwartenden erlös aller Autos
	 */
	private static double erlose(Auto[] a) {
		double ret = 0.0;
		for (Auto au : a) {
			ret += au.getPreis();
		}
		return ret;
	}

	/**
	 * Errechnet den Prozentualen anteil an Unfallwagen
	 * 
	 * @param a
	 *            Ein Array an Autos
	 * @return Den Prozentualen anteil an Unfallwagen
	 */
	private static double unfallwagen(Auto[] a) {
		int sum = 0;
		int accident = 0;
		for (Auto au : a) {
			sum++;
			if (au.getUnfallwagen()) {
				accident++;
			}
		}
		return (100.0 / sum * accident);
	}

	/**
	 * Errechnet den Prozentualen anteil an Dieselfahrzeugen
	 * 
	 * @param a
	 *            Ein Array an Autos
	 * @return Den Prozentualen anteil an Dieselfahrzeugen
	 */
	private static double dieselwagen(Auto[] a) {
		int sum = 0;
		int diesel = 0;
		for (Auto au : a) {
			sum++;
			if (au.getKraftstoff().trim().equalsIgnoreCase("diesel")) {
				diesel++;
			}
		}

		return (100.0 / sum * diesel);
	}

	/**
	 * Errechnet den Prozentualen anteil an Elektrofahrzeugen
	 * 
	 * @param a
	 *            Ein Array an Autos
	 * @return Den Prozentualen anteil an Elektrofahrzeugen
	 */
	private static double elektrowagen(Auto[] a) {
		int sum = 0;
		int elektro = 0;
		for (Auto au : a) {
			sum++;
			if (au.getKraftstoff().trim().equalsIgnoreCase("elektro")) {
				elektro++;
			}
		}

		return (100.0 / sum * elektro);
	}

	/**
	 * Errechent den zu erwartenden Erlös wenn auf unfallwagen 25% rabatt und
	 * auf unfallfreie wagen 10% rabatte gegeben werden
	 * 
	 * @param a
	 *            Ein Array an Autos
	 * @return Den Zuerwartenden Erlös
	 */
	private static double erloseMitNachlass(Auto[] a) {
		double sum = 0.0;
		for (Auto au : a) {
			if (au.getUnfallwagen()) {
				sum += (au.getPreis() * 0.75);
			} else {
				sum += (au.getPreis() * 0.9);
			}
		}

		return sum;
	}

}
