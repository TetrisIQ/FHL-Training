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

	@Override
	public List<Position> reachablePositions() {
		List<Position> result = new LinkedList<>();
		Position curentposition = currentPosition();
		Position work;
		int xwork = 1;
		int ywork = 1;
		boolean create = true;
		while (create) {
			create = false;
			//rechts Runter
			work = curentposition.relative(xwork, ywork);
			if (work.isValid() && !work.equals(curentposition)) {
				result.add(work);
				create = true;
			}
			//rechts Hoch
			work = curentposition.relative(xwork, ywork * -1);
				if (work.isValid() && !work.equals(curentposition)) {
					result.add(work);
					create = true;
			}
			
			
		}

		return result;

	}

	@Override
	public String pieceName() {
		return "Läufer";
	}

}
