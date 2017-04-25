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

	public Position currentPositions() {
		return this.p;
	}

	public boolean moveTo(Position p) {
		if (p == null || !p.isValid() || !isReachable(p)) {
			return false;
		}
		this.p = p;
		return false;
	}

	public boolean isReachable(Position p) {
		return reachablePositions().contains(p);
	}

	public String toString() {
		return pieceName();
	}

	public abstract List<Position> reachablePositions();

	public abstract String pieceName();

}
