package kw17;

import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Chessman.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public abstract class Chessman {
	private Position p;

	/**
	 * Konstruktor zum erstellen neuer {@link Chessman}
	 * 
	 * @param c
	 *            Das Buchstabenfeld der Schachfigur
	 * @param i
	 *            Das Zahlenfeld der Schachfigur
	 */
	public Chessman(char c, int i) throws Exception {
		this.p = new Position(c, i);
	}

	/**
	 * Gibt die Aktuelle Position zurück
	 * 
	 * @return die Aktuelle Position
	 */
	public Position currentPosition() {
		return p;
	}

	public boolean moveTo(Position p) throws Exception {
		if (p == null || !p.isValid() || !isReachable(p)) {
			return false;
		}
		this.p = p;
		return true;
	}

	/**
	 * Überprüft ob eine Position für die Schachfigur gemäß der Schachregeln
	 * erreichbar ist
	 * 
	 * @param p
	 *            Die Position die erreicht werden soll
	 * @return <code>true</code> wenn die Position p erreichbar ist <br>
	 *         <code>false</code> wenn die Position p <b> nicht </b> erreichbar
	 *         ist
	 * @throws Exception
	 */
	public boolean isReachable(Position p) throws Exception {
		for (Position pos : reachablePositions()) {
			if (pos.equals(p))
				return true;
		}
		return false;

	}

	/**
	 * @return den namen der Figur 
	 */
	public String toString() {
		return pieceName();
	}

	public abstract List<Position> reachablePositions() throws Exception;

	public abstract String pieceName();

}
