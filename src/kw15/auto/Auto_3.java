package kw15.auto;

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

//		System.out.println(autobestand[0].getKraftstoff().trim().equalsIgnoreCase("diesel"));
		System.out.println("Erlös ohne Nachlässe: " + erlose(autobestand) + " EUR");
		System.out.println("Anteil an Unfallwagen: " + unfallwagen(autobestand) + " %");
		System.out.println("Anteil an Dieselwagen: " + dieselwagen(autobestand) + " %");
		System.out.println("Anteil an Elektrowagen: " + elektrowagen(autobestand) + " %");
		System.out.println("Erlös mit Nachlässen: " + erloseMitNachlass(autobestand) + " EUR");
	}

	private static double erlose(Auto[] a) {
		double ret = 0.0;
		for (Auto au : a) {
			ret += au.getPreis();
		}
		return ret;
	}

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

	private static double erloseMitNachlass(Auto[] a) {
		double sum = 0.0;
		for (Auto au : a) {
			if (au.getUnfallwagen()) {
				sum += (au.getPreis() * 0.75);
			}
			else {
				sum += (au.getPreis() * 0.9);
			}
		}
		
		
		
		return sum;
	}

}
