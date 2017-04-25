package kw17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Chess_Main.java <br>
 * Datum: 20.04.2017 <br>
 * Package: kw17 <br>
 */
public class Chess_Main {

	public static void main(String[] args) throws Exception {
		List<Position> moves = Arrays.asList(new Position('B', 2), new Position('B', 4), new Position('D', 4),
				new Position('D', 8), new Position('G', 5));
		for (int i = 0; i < moves.size(); i++) {
			List<Position> submoves = moves.subList(0, i + 1);
//			String mans = possibleChessmans(submoves).stream().map(cm -> cm.pieceName())
//					.collect(Collectors.joining(", "));
//			System.out.println(moves.get(i) + ": " + mans);
		}

	}

	private static Collection<Position> possibleChessmans(List<Position> submoves) {
		if (submoves == null || submoves.isEmpty()) {
			return Collections.emptyList();
		}
		//to be done 
		return Collections.emptyList();

	}

}
