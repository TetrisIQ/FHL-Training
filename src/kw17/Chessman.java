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

	public Chessman(char c, int i) throws Exception {
		this.p = new Position(c, i);
	}

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

	public boolean isReachable(Position p) throws Exception {
		for (Position pos : reachablePositions()) {
			if (pos.equals(p))
				return true;
		}
		return false;

	}

	public String toString() {
		return pieceName();
	}

	public abstract List<Position> reachablePositions() throws Exception;

	public abstract String pieceName();

}
