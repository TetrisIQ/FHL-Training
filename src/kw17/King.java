package kw17;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: King.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class King extends Chessman {

	public King(char c, int i) throws Exception {
		super(c, i);

	}

	@Override
	public List<Position> reachablePositions() throws Exception {
		List<Position> result = new LinkedList<>();
		Position pos = this.currentPositions();

		// ein nach rechts
		Position position = pos.relative(1, 0);
		result.add(position);
		// ein nach Links
		position = pos.relative(-1, 0);
		result.add(position);
		// ein nach oben
		result.add(new Position(pos.getRank(), (pos.getFile() - 1)));
		// ein nach unten
		result.add(new Position(pos.getRank(), (pos.getFile() + 1)));
		
		//diagonal nach Rechts oben
		position = pos.relative(1, -1);
		result.add(position);
		//diagonal nach Lins Oben
		position = pos.relative(-1, -1);
		result.add(position);
		//diagonal nach rechs unten
		position = pos.relative(1, 1);
		result.add(position);
		//diagonal nach links unten
		position = pos.relative(-1, 1);
		result.add(position);
		

		return result;
	}

	@Override
	public String pieceName() {
		return "König";
	}

}
