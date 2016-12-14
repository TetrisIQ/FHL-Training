package OldProjekts;
import java.util.LinkedList;
import java.util.List;

/**
 ***** alex***** 
 *Autor: Alexander Werner 
 *Projekt: 10.6 
 *Classe: prim.java 
 *Datum: 23.11.2016
 */

public class prim {

	/**
	 * @param args
	 * @author Alexander
	 */
	public static void main(String[] args) {

		prim prim = new prim();
		List<Integer> prims = prim.prims(1000);
		System.out.println(prim.prettyPrint(prims, 7));
	}

	/**
	 * isPrim Überprüft ob eine Zahl eine Primzahl ist oder nicht
	 * @param n Die zu Überprüfende Zahl
	 * @return <b>True</b> wenn die Zahl eine Priemzahl ist. <br>
	 * <b>False</b> wenn die Zahl keine Primzahl ist.
	 */
	private boolean isPrim(int n) {
		if (n == 2) {
			return true;
		} else if (n % 2 == 0 || n < 2) {
			return false;
		}
		for (int i = 3; n > i; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * prims Gerneriert eine Liste mit allen Primzahlen bis zu einem grenzwert
	 * @param n Der Grenzwert bis zu welchem die Primzahlen ermittelt werden sollen
	 * @return Eine Liste mit Primzahlen.
	 */
	public List<Integer> prims(int n) {
		List<Integer> ret = new LinkedList<Integer>();
		if (n >= 2) {
			ret.add(2);
		} else {
			return ret;
		}
		for (int i = 1; i < n; i += 2) {
			if (isPrim(i)) {
				ret.add(i);
			}
		}
		return ret;
	}

	/**
	 * prettyPrint Gibt eine Liste aus Zahlen <br> geordnet in einer Tabelle aus.
	 * @param is Die Liste die geordnet ausgegeben werden soll.
	 * @param row Die Anzahl der Spalten die die Tabelle haben soll. <br>
	 * Wenn <b>row</b> 0 ist werden die Zahlen Hintereinander ausgegeben.
	 * @return Die Tabelle als String
	 */
	public String prettyPrint(List<Integer> is, int row) {
		try {
			StringBuilder sb = new StringBuilder();
			int col = 0;
			int max = intlength(is.get(is.size() - 1));
			for (Integer prim : is) {
				sb.append(prim);
				for (int i = intlength(prim); i < max; i++) {
					sb.append(" ");
				}
				col++;
				sb.append(" ");
				if (col == row) {
					col = 0;
					sb.append("\n");
				}

			}
			return sb.toString();
		} catch (IndexOutOfBoundsException e) {
			return "";
		}
	}

	/**
	 * intlength berechnet die anzahl der Zeichen in einer Zahl
	 * @param n Die Zahl
	 * @return Die Anzahl der zeichen
	 */
	public int intlength(int n) {
		return String.valueOf(n).length();

	}
}
