package kw17;

import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Queen.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Queen extends Chessman{

	public Queen(char c, int i) throws Exception {
		super(c, i);
	}

	@Override
	public List<Position> reachablePositions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pieceName() {
		return "Dame";
	}
	

}
