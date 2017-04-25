package kw17;

import java.util.LinkedList;
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

	public abstract List<Position> reachablePositions();

	public abstract String pieceName();

	public boolean moveTo(Position p) {
		return false;
	}

	public boolean isReachable(Position p) {
		return false;
	}
	
	public String toString() {
		return "";
	}

}
