package kw17;

import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Knight.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Knight extends Chessman{

	public Knight(char c, int i) throws Exception {
		super(c, i);
	}

	@Override
	public List<Position> reachablePositions() {
		
		
		
		return null;
	}

	@Override
	public String pieceName() {
		return "Springer";
	}

}
