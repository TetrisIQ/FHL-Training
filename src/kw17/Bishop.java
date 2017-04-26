package kw17;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Bishop.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Bishop extends Chessman { // Läufer

	public Bishop(char c, int i) throws Exception {
		super(c, i);
	}

	public List<Position> reachablePositions() {
		List<Position> result = new LinkedList<>();
		Position currentposition = currentPosition();
		Position work;
		int xwork = 1;
		int ywork = 1;
		for (int i = 1; i < 9; i++) {
		// diagonal nach Rechts oben
		work = currentposition.relative(xwork * 1, ywork * -1);
		if (work.isValid() && !work.equals(currentposition))
		result.add(work);
		// diagonal nach Lins Oben
		work = currentposition.relative(xwork * -1, ywork * -1);
		if (work.isValid() && !work.equals(currentposition))
		result.add(work);
		// diagonal nach rechs unten
		work = currentposition.relative(xwork * 1, ywork * 1);
		if (work.isValid() && !work.equals(currentposition))
		result.add(work);
		// diagonal nach links unten
		work = currentposition.relative(xwork * -1,ywork * 1);
		if(work.isValid() && !work.equals(currentposition))
		result.add(work);
		xwork++;
		ywork++;
		
		}

		return result;
	}

	public String pieceName() {
		return "Läufer";
	}

}
