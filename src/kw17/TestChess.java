package kw17;

import static org.junit.Assert.*;

import java.util.Arrays;
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
		// test toString Weißer Bauer
		assertEquals("Weißer Bauer", pawn.toString());
		// test reachablePositions pawn white
		List<Position> expect = Arrays.asList(new Position(rank, 3), new Position(rank, 4));
		assertArrayEquals(expect, pawn);

		// test reachablePositions pawn black
		Pawn pawnBlack = new Pawn(rank, 7, false);
		List<Position> expectBlack = Arrays.asList(new Position(rank, 6), new Position(rank, 5));
		assertArrayEquals(expectBlack, pawnBlack);

	}

	@Test
	public void testKing() throws Exception {
		char rank = 'D';
		int file = 4;
		King king = new King(rank, file);
		// test toString King
		assertEquals("König", king.toString());
		// test reachablePositions King
		List<Position> expect = Arrays.asList(new Position('D', 3), new Position('D', 5), new Position('C', 4),
				new Position('E', 4), new Position('E', 5), new Position('C', 5), new Position('E', 3),
				new Position('C', 4));
		assertArrayEquals(expect, king);

	}

	@Test
	public void testBishop() throws Exception {
		Bishop bishop = new Bishop('D', 4);
		// test toString bishop
		assertEquals("Läufer", bishop.toString());
		// test reachablePositions bishop
		List<Position> expect = Arrays.asList(new Position('A', 1), new Position('B', 2), new Position('C', 3),
				new Position('E', 5), new Position('F', 6), new Position('G', 7), new Position('H', 8),
				new Position('A', 7), new Position('B', 6), new Position('C', 5), new Position('E', 3),
				new Position('F', 2), new Position('G', 1));
		assertArrayEquals(expect, bishop);

	}

	@Test
	public void testRook() throws Exception {
		Rook rook = new Rook('D', 4);
		// test toString rook
		assertEquals("Turn", rook.toString());
		// test reachablePositions rook
		List<Position> expect = Arrays.asList(new Position('D', 1), new Position('D', 2), new Position('D', 3),
				new Position('D', 5), new Position('D', 6), new Position('D', 7), new Position('D', 8),
				new Position('A', 4), new Position('B', 4), new Position('C', 4), new Position('E', 4),
				new Position('F', 4), new Position('G', 4), new Position('H', 4));
		assertArrayEquals(expect, rook);

	}

	@Test
	public void testQueen() throws Exception {
		Queen queen = new Queen('D', 4);
		// test toString
		assertEquals("Dame", queen.toString());
		// test reachablePositions Queen
		List<Position> expect = Arrays.asList(new Position('D', 1), new Position('D', 2), new Position('D', 3),
				new Position('D', 5), new Position('D', 6), new Position('D', 7), new Position('D', 8),
				new Position('A', 4), new Position('B', 4), new Position('C', 4), new Position('E', 4),
				new Position('F', 4), new Position('G', 4), new Position('H', 4), new Position('A', 1),
				new Position('B', 2), new Position('C', 3), new Position('E', 5), new Position('F', 6),
				new Position('G', 7), new Position('H', 8), new Position('A', 7), new Position('B', 6),
				new Position('C', 5), new Position('E', 3), new Position('F', 2), new Position('G', 1));
		assertArrayEquals(expect, queen);
	}

	@Test
	public void testKnigth() throws Exception {
		Knight knight = new Knight('D', 4);
		// test toString
		assertEquals("Springer", knight.toString());
		List<Position> expect = Arrays.asList(new Position('E', 2), new Position('C', 2), new Position('E', 5),
				new Position('C', 5), new Position('F', 3), new Position('F', 5), new Position('B', 3),
				new Position('B', 5));
		assertArrayEquals(expect, knight);

	}
	
	@Test
	public void testCaseSensitivity() throws Exception {
		Position a = new Position('a', 1);
		Position b = new Position('A', 1);
		assertTrue(a.equals(b));
	}
	
	@Test
	public void testCastCharAndInt() throws Exception {
		Position a = new Position('A', 1);
		assertEquals('A', a.getRank());
		assertEquals(1, a.getRankInt());
		assertEquals(1, a.getFile());
		Position b = new Position('D', 4);
		assertEquals('D', b.getRank());
		assertEquals(4, b.getRankInt());
		assertEquals(4, b.getFile());
		
		
	}

	private void assertArrayEquals(List<Position> expect, Chessman chessman) throws Exception {
		expect.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
		List<Position> realPosition = chessman.reachablePositions();
		realPosition.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));

	}
}
