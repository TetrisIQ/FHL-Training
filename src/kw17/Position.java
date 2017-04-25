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

	public Position(char x, int y) {
		this.rank = charToInt(x);
		this.file = y;
	}

	// private Position(int x, int y) throws Exception {
	// this.file = x;
	// this.rank = y;
	//
	// }

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
		return (intToChar(this.rank)) + "" + this.file + ":";
	}
	
	public boolean isValid() {
		//to be done
		return false;
	}
	
	public char getRank() {
		return intToChar(this.rank);
		
	}
	public int getFile() {
		return this.file;
	}
	
	public Position relative(int x, int y) {
		//to be done
		return null;
		
	}
	
	public boolean equals(Position pos) {
		if (this.file == pos.file && this.rank == pos.rank) return true;
		return false;	
	}

}
