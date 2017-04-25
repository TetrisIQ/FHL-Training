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

	public Pawn(char c, int i, Boolean white) throws Exception {
		super(c, i);
		this.white = white;
	}

	public boolean isWhite() {
		return this.white;
	}

	public boolean isBlack() {
		return !(this.white);
	}

	public List<Position> reachablePositions() throws Exception { // position or
																	// PositionS!
																	// ? im
		// er mit S
		List<Position> result = new LinkedList<>();
		Position pos = this.currentPositions();
		if (this.isWhite()) {
			if (pos.getFile() == 2) {
				result.add(new Position(pos.getRank(), (pos.getFile() + 1)));
				result.add(new Position(pos.getRank(), (pos.getFile() + 2)));
			}
			if (pos.getFile() > 2) {
				result.add(new Position(pos.getRank(), (pos.getFile() + 1)));

			}
			
		if (this.isBlack()) {
			if (pos.getFile() == 7) {
				result.add(new Position(pos.getRank(), (pos.getFile() - 1)));
				result.add(new Position(pos.getRank(), (pos.getFile() - 2)));
			}
			if (pos.getFile() < 7) {
				result.add(new Position(pos.getRank(), (pos.getFile() - 1)));
			}
		}
		}

		return result;
	}

	public String pieceName() {
		return white ? "Weißer Bauer" : "Schwarzer Bauer";
	}
}
