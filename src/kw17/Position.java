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
	private int rank; //spalte
	private int file; //Zeile
	
	public Position(char c, int i) throws Exception {
		this.file = i;
		this.rank = c;
	}
	
	private Position(int c, int i) throws Exception {
		this.file = i;
		this.rank = c;
		
	}

}
