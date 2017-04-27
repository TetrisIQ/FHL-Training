package kw17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
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
			String mans = possibleChessmans(submoves).stream().map(cm -> cm.pieceName())
					.collect(Collectors.joining(", "));
			System.out.println(moves.get(i) + ": " + mans);
		}

	}

	/**
	 * Überprüft welche Schach Figur die beschriebene zugfolge meistern kann
	 * 
	 * @param submoves
	 *            Eine Liste an {@link Position}
	 * @return Alle {@link Chessman} die die Nächste {@link Position} erreichen
	 *         können
	 * @throws Exception
	 */
	private static List<Chessman> possibleChessmans(List<Position> submoves) throws Exception {
		if (submoves == null || submoves.isEmpty())
			return Collections.emptyList();
		List<Chessman> liChesman = allChessman(submoves.get(0));

		for (int i = 1; i < submoves.size(); i++) {
			Position p = submoves.get(i);
			for (Chessman chesman : liChesman) {
				if (!chesman.moveTo(p))
					liChesman.remove(chesman);

			}

		}

		return liChesman;
	}

	/**
	 * Errstellt alle {@link Chessman}s die möglich sind <br>
	 * {@link Bishop} <br>
	 * {@link King}<br>
	 * {@link Pawn} <br>
	 * {@link Queen} <br>
	 * {@link Rook}
	 * 
	 * @param p
	 *            Die {@link Position} auf der die Figuren erstellt werden
	 *            sollen
	 * @return eine Lisste mit allen Schachfiguren auf der Startposition
	 * @throws Exception
	 */
	private static List<Chessman> allChessman(Position p) throws Exception {
		List<Chessman> li = new CopyOnWriteArrayList<>();
		char xrank = p.getRank();
		int yfild = p.getFile();
		li.add(new Bishop(xrank, yfild));
		li.add(new King(xrank, yfild));
		li.add(new Knight(xrank, yfild));
		li.add(new Pawn(xrank, yfild, true));
		li.add(new Pawn(xrank, yfild, false));
		li.add(new Queen(xrank, yfild));
		li.add(new Rook(xrank, yfild));

		return li;
	}

}