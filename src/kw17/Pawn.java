package kw17;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Pawn.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Pawn extends Chessman {
	private boolean white;

	/**
	 * Konstruktor zum erstellen eines neuen {@link Pawn}
	 * 
	 * @param c
	 *            Das Buchstaben Feld auf dem sich der Springer befindet <br>
	 *            auf der X-Achse
	 * @param i
	 *            Das Zahlen Feld auf dem sich der Springer befindet <br>
	 *            auf der y-Achse
	 * @param white
	 *            <code>true</code> wenn der Bauer weiß sein soll <br>
	 *            <code>false</code> wenn der Bauer Schwarz sein soll
	 */
	public Pawn(char c, int i, Boolean white) throws Exception {
		super(c, i);
		this.white = white;
	}

	/**
	 * Überprüft ob der Bauer weiß ist
	 * 
	 * @return <code>true</code> Wenn der Bauer weiß ist <br>
	 *         <code>false</code> wenn der bauer Schwarz ist
	 */
	public boolean isWhite() {
		return this.white;
	}

	/**
	 * Überprüft ob der Bauer schwarz ist
	 * 
	 * @return <code>true</code> Wenn der Bauer Schwarz ist <br>
	 *         <code>false</code> Wenn der Bauer Weiß ist
	 */
	public boolean isBlack() {
		return !(this.white);
	}

	/**
	 * Gibt eine Liste der Erreichbaren Positionen zurück <br>
	 * ausgehend von der Position der Figur gemäß den Schachregeln <br>
	 * 
	 * @return Eine Liste mit erreichbaren Positionen
	 */
	public List<Position> reachablePositions() throws Exception {
		List<Position> result = new LinkedList<>();
		Position curentposition = currentPosition();
		int yfile = curentposition.getFile();

		if (yfile == 2 && isWhite()) {
			result.add(new Position(curentposition.getRank(), (yfile + 2)));
		}

		if (yfile == 7 && isBlack()) {
			result.add(new Position(curentposition.getRank(), (yfile - 2)));
		}

		if (isWhite()) {
			result.add(new Position(curentposition.getRank(), (yfile + 1)));
		}

		if (isBlack()) {
			result.add(new Position(curentposition.getRank(), (yfile - 1)));
		}
		return result;
	}

	/**
	 * @return Gibt den namen der Figur incl. der Farbe aus
	 */
	public String pieceName() {
		return white ? "Weißer Bauer" : "Schwarzer Bauer";
	}
}
