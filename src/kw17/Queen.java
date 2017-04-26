package kw17;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Queen.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Queen extends Chessman {

	public Queen(char c, int i) throws Exception {
		super(c, i);
	}

	@Override
	public List<Position> reachablePositions() throws Exception {
		List<Position> result = new LinkedList<>();
		Position curentposition = currentPosition();
		Position work;
		// alle wege auf der Y Achse
		result.add(new Position(curentposition.getRank(), 1));
		result.add(new Position(curentposition.getRank(), 2));
		result.add(new Position(curentposition.getRank(), 3));
		result.add(new Position(curentposition.getRank(), 4));
		result.add(new Position(curentposition.getRank(), 5));
		result.add(new Position(curentposition.getRank(), 6));
		result.add(new Position(curentposition.getRank(), 7));
		result.add(new Position(curentposition.getRank(), 8));
		// Alle wege auf der X Achse
		result.add(new Position('A', curentposition.getFile()));
		result.add(new Position('B', curentposition.getFile()));
		result.add(new Position('C', curentposition.getFile()));
		result.add(new Position('D', curentposition.getFile()));
		result.add(new Position('E', curentposition.getFile()));
		result.add(new Position('F', curentposition.getFile()));
		result.add(new Position('G', curentposition.getFile()));
		result.add(new Position('H', curentposition.getFile()));
		//digonale Wege
		int xwork = 1;
		int ywork = 1;
		
		for (int i = 1; i < 9; i++) {
		// diagonal nach Rechts oben
		work = curentposition.relative(xwork * 1, ywork * -1);
		if (work.isValid() && !work.equals(curentposition))
		result.add(work);
		// diagonal nach Lins Oben
		work = curentposition.relative(xwork * -1, ywork * -1);
		if (work.isValid() && !work.equals(curentposition))
		result.add(work);
		// diagonal nach rechs unten
		work = curentposition.relative(xwork * 1, ywork * 1);
		if (work.isValid() && !work.equals(curentposition))
		result.add(work);
		// diagonal nach links unten
		work = curentposition.relative(xwork * -1,ywork * 1);
		if(work.isValid() && !work.equals(curentposition))
		result.add(work);
		xwork++;
		ywork++;
		
		}

		return result;
	}

	@Override
	public String pieceName() {
		return "Dame";
	}

}
