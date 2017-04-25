package kw17;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Position.java <br>
 * Datum: 13.04.2017 <br>
 * Package: kw17 <br>
 */
public class Position {
	private int rank; // spalte a,b,c ...
	private int file; // Zeile

	public Position(char x, int y) throws Exception {
		this.rank = charToInt(x);
		this.file = y;
		if (!isValid()) {
			throw new Exception("Die Position ist nicht gültig!");
		}
	}

	private Position(int x, int y) throws Exception {
		this.file = x;
		this.rank = y;

	}

	private int charToInt(char x) {
		char[] pos = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		int counter = 1;
		int result = 0;
		x = Character.toUpperCase(x);
		for (char s : pos) {
			if (s == x) {
				result = counter;
			} else {
				counter++;
			}

		}

		return result;
	}

	private char intToChar(int x) {
		if (x > 8 || x == 0)
			return '0';
		char[] pos = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		x--;
		return pos[x];

	}

	public String toString() {
		return (intToChar(this.rank)) + "" + this.file + "";
	}

	public boolean isValid() {
		if (this.rank <= 8 && this.rank >= 1 && this.file <= 8 && this.file >= 1) { return true; }
			return false;
	}

	public char getRank() {
		return intToChar(this.rank);

	}
	
	public int getRankInt() {
		return this.rank;
	}

	public int getFile() {
		return this.file;
	}

	public Position relative(int x, int y) {

		try {
			return new Position(this.rank + rank, this.file + file);
		} catch (Exception e) {
			return null;
		}

	}

	public boolean equals(Position pos) {
		if (this.file == pos.file && this.rank == pos.rank)
			return true;
		return false;
	}

}
