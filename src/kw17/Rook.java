package kw17;

import java.util.LinkedList;
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
	}

	@Override
	public List<Position> reachablePositions() throws Exception {
		List<Position> result = new LinkedList<>();
		Position pos = currentPosition();
		//alle wege auf der Y achse
		result.add(new Position(pos.getRank(), 1));
		result.add(new Position(pos.getRank(), 2));
		result.add(new Position(pos.getRank(), 3));
		result.add(new Position(pos.getRank(), 4));
		result.add(new Position(pos.getRank(), 5));
		result.add(new Position(pos.getRank(), 6));
		result.add(new Position(pos.getRank(), 7));
		result.add(new Position(pos.getRank(), 8));
		// Alle wege auf der X Achse
		result.add(new Position('A', pos.getFile()));
		result.add(new Position('B', pos.getFile()));
		result.add(new Position('C', pos.getFile()));
		result.add(new Position('D', pos.getFile()));
		result.add(new Position('E', pos.getFile()));
		result.add(new Position('F', pos.getFile()));
		result.add(new Position('G', pos.getFile()));
		result.add(new Position('H', pos.getFile()));

		
		return result;
	}

	@Override
	public String pieceName() {
		return "Turn";
	}

}
