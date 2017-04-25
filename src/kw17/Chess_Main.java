package kw17;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.junit.Test;

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
			 String mans = possibleChessmans(submoves).stream().map(cm ->
			 cm.pieceName())
			 .collect(Collectors.joining(", "));
			 System.out.println(moves.get(i) + ": " + mans);
		}
		
		Chessman a = new Pawn('B', 2, true);
		System.out.println(a.reachablePositions());

		

	}

	private static List<Chessman> possibleChessmans(List<Position> submoves) throws Exception {
		if (submoves == null || submoves.isEmpty()) {
			return Collections.emptyList();
		}

		List<Chessman> chessmen = null;
		for (int i = 0; i < submoves.size(); i++) {
			Position position = submoves.get(i);
			if (i == 0) {
				chessmen = createAllChessman(position);
				continue;
			}
			for (Chessman chessman : chessmen) {
				if (!chessman.moveTo(position)) {
					chessmen.remove(chessman);
				}
			}
		}
		return chessmen;
	}

	private static List<Chessman> createAllChessman(Position position) throws Exception {
		int file = position.getFile();
		char rank = position.getRank();
		return new CopyOnWriteArrayList<>(
				Arrays.asList(new Pawn(rank, file, true), new Pawn(rank, file, false), new King(rank, file),
						new Bishop(rank, file), new Queen(rank, file), new Knight(rank, file), new Rook(rank, file)));
	}

}