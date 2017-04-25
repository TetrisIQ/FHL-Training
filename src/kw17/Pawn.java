package kw17;

import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Pawn.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Pawn {
	private boolean white;
	
	public Pawn(char c, int i, Boolean white) {
		this.white = white;
	}

	public boolean isWhite() {
		return this.white;
	}
	
	public boolean isBlack() {
		return !(this.white);
	}
	
	public List<Position> reachablePositions() {	//position or PositionS! ? im er mit S
		return null; //to be done 
	}
	
	public String pieceName() {
		return "";
	}
}
