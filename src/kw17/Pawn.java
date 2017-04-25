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
		Position curentposition = currentPosition();
		int yfile = curentposition.getFile();
		
		if(yfile == 2 && isWhite()) {
			result.add(new Position(curentposition.getRank(), (yfile +2)));
		}
		
		if(yfile == 7 && isBlack()) {
			result.add(new Position(curentposition.getRank(), (yfile -2)));
		}
		
		if (isWhite()) {
			result.add(new Position(curentposition.getRank(), (yfile + 1)));
		}
		
		if (isBlack()) {
			result.add(new Position(curentposition.getRank(), (yfile - 1)));
		}
		
		
		
		
		
		
		return result;
	}

	public String pieceName() {
		return white ? "Weißer Bauer" : "Schwarzer Bauer";
	}
}
