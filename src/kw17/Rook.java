package kw17;

import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Rook.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Rook extends Chessman {

	public Rook(char c, int i) throws Exception {
		super(c, i);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Position> reachablePositions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pieceName() {
		return "Turn";
	}

}