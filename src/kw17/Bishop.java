package kw17;

import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Bishop.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Bishop extends Chessman { // Läufer

	/**
	 * Konstruktor zum erstellen eines Läufers
	 * 
	 * @param c
	 *            Das Buchstaben Feld auf dem sich der Läufer befindet <br>
	 *            auf der X-Achse
	 * @param i
	 *            Das Zahlen Feld auf dem sich der Läufer befindet <br>
	 *            auf der y-Achse
	 */
	public Bishop(char c, int i) throws Exception {
		super(c, i);
	}

	/**
	 * Gibt eine Liste der Erreichbaren Positionen zurück <br>
	 * ausgehend von der Position der Figur gemäß den Schachregeln <br>
	 * 
	 * @return Eine Liste mit erreichbaren Positionen
	 */
	public List<Position> reachablePositions() {
		List<Position> result = new LinkedList<>();
		Position currentposition = currentPosition();
		Position work;
		int xwork = 1;
		int ywork = 1;
		for (int i = 1; i < 9; i++) {
			// diagonal nach Rechts oben
			work = currentposition.relative(xwork * 1, ywork * -1);
			if (work.isValid() && !work.equals(currentposition))
				result.add(work);
			// diagonal nach Lins Oben
			work = currentposition.relative(xwork * -1, ywork * -1);
			if (work.isValid() && !work.equals(currentposition))
				result.add(work);
			// diagonal nach rechs unten
			work = currentposition.relative(xwork * 1, ywork * 1);
			if (work.isValid() && !work.equals(currentposition))
				result.add(work);
			// diagonal nach links unten
			work = currentposition.relative(xwork * -1, ywork * 1);
			if (work.isValid() && !work.equals(currentposition))
				result.add(work);
			xwork++;
			ywork++;

		}

		return result;
	}

	/**
	 * @return Den Namen der Figur
	 */
	public String pieceName() {
		return "Läufer";
	}

}
