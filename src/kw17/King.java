package kw17;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: King.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class King extends Chessman {

	/**
	 * Konstruktor zum erstellen eines neuen {@link King}
	 * 
	 * @param c
	 *            Das Buchstaben Feld auf dem sich der König befindet <br>
	 *            auf der X-Achse
	 * @param i
	 *            Das Zahlen Feld auf dem sich der König befindet <br>
	 *            auf der y-Achse
	 */
	public King(char c, int i) throws Exception {
		super(c, i);

	}

	/**
	 * Gibt eine Liste der Erreichbaren Positionen zurück <br>
	 * ausgehend von der Position der Figur gemäß den Schachregeln <br>
	 * 
	 * @return Eine Liste mit erreichbaren Positionen
	 */
	public List<Position> reachablePositions() throws Exception {
		List<Position> result = new LinkedList<>();
		Position pos = currentPosition();

		// ein nach rechts
		Position position = pos.relative(1, 0);
		result.add(position);
		// ein nach Links
		position = pos.relative(-1, 0);
		result.add(position);
		// ein nach oben
		result.add(new Position(pos.getRank(), (pos.getFile() - 1)));
		// ein nach unten
		result.add(new Position(pos.getRank(), (pos.getFile() + 1)));

		// diagonal nach Rechts oben
		position = pos.relative(1, -1);
		result.add(position);
		// diagonal nach Lins Oben
		position = pos.relative(-1, -1);
		result.add(position);
		// diagonal nach rechs unten
		position = pos.relative(1, 1);
		result.add(position);
		// diagonal nach links unten
		position = pos.relative(-1, 1);
		result.add(position);

		return result;
	}

	/**
	 * gibt den Namen der Figur aus
	 */
	public String pieceName() {
		return "König";
	}

}
