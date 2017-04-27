package kw17;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Knight.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Knight extends Chessman {

	/**
	 * Konstruktor zum erstellen eines neuen {@link Knight}
	 * 
	 * @param c
	 *            Das Buchstaben Feld auf dem sich der Springer befindet <br>
	 *            auf der X-Achse
	 * @param i
	 *            Das Zahlen Feld auf dem sich der Springer befindet <br>
	 *            auf der y-Achse
	 */
	public Knight(char c, int i) throws Exception {
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
		// 2 Nach rechts 1 Runter
		work = currentposition.relative(2, 1);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);
		// 2 Nach rechts 1 Hoch
		work = currentposition.relative(2, -1);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);
		// 2 Runter 1 nach Rechts
		work = currentposition.relative(1, 2);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);

		// 2 Runter 1 Nach Links
		work = currentposition.relative(-1, 2);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);

		// 2 Hoch 1 Nach Links
		work = currentposition.relative(-1, -2);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);

		// 2 Hoch 1 Nach Rechts
		work = currentposition.relative(1, -2);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);

		// 2 Nach Links 1 Runter
		work = currentposition.relative(-2, 1);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);

		// 2 nach Links 1 Hoch
		work = currentposition.relative(-2, -1);
		if (work.isValid() && !work.equals(currentposition))
			result.add(work);

		return result;
	}

	/**
	 * @return Den Namen der figur
	 */
	public String pieceName() {
		return "Springer";
	}

}
