package kw17;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestChess {

	@Test
	public void testCreatePosition() throws Exception {
		char rank = 'B';
		int file = 2;
		Position p1 = new Position(rank, file);
		assertTrue(file == p1.getFile());
		assertTrue(rank == p1.getRank());

		char rank1 = 'D';
		int file1 = 2;
		Position p2 = new Position(rank1, file1);
		assertTrue(file1 == p2.getFile());
		assertTrue(rank1 == p2.getRank());
	}

	@Test
	public void testPositionToString() throws Exception {
		Position p1 = new Position('C', 4);
		assertTrue(p1.toString().equals("C4"));

	}

	@Test
	public void testPositionEquals() throws Exception {
		Position a = new Position('B', 2);
		Position b = new Position('B', 2);
		assertTrue(a.equals(b));

	}

	@Test
	public void testPawn() throws Exception {
		char rank = 'B';
		int file = 2;
		Pawn pawn = new Pawn(rank, file, true);
		assertTrue(pawn.isWhite());
		assertFalse(pawn.isBlack());
		//test toString Weißer Bauer
		assertEquals("Weißer Bauer", pawn.toString());
		//test reachablePositions pawn white
		List<Position> expect = Arrays.asList(new Position(rank, 3), new Position(rank, 4));
		assertArrayEquals(expect, pawn);
		
		//test reachablePositions pawn white
		Pawn pawnBlack = new Pawn(rank, 7, false);
		List<Position> expectBlack = Arrays.asList(new Position(rank, 6), new Position(rank, 5));
		assertArrayEquals(expectBlack, pawnBlack);

	}

	@Test
	public void testKing() throws Exception {
		char rank = 'D';
		int file = 4;
		King king = new King(rank, file);
		//test toString King
		assertEquals("König", king.toString());

	}

	@Test
	public void testBishop() throws Exception {

	}

	@Test
	public void testRook() throws Exception {

	}

	@Test
	public void testQueen() throws Exception {

	}

	@Test
	public void testKnigth() throws Exception {

	}

	private void assertArrayEquals(List<Position> expect, Chessman chessman) throws Exception {
		expect.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
		List<Position> realPosition = chessman.reachablePositions();
		realPosition.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));

	}
}
