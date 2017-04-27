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

	/**
	 * Konstruktor zum anlegen einer neuen {@link Position} auf einem
	 * Schachbrett
	 * 
	 * @param x
	 *            Rank Das Buchstabenfeld auf dem Schachbrett <br>
	 *            muss Zwischen A und H liegen
	 * @param y
	 *            File Das Fahlenfeld auf dem Schachbrett <br>
	 *            muss Zwischen 1 und 9 Liegen
	 * @throws Exception
	 *             Wenn die Positzion ungültig ist
	 */
	public Position(char x, int y) throws Exception {
		this.rank = charToInt(x);
		this.file = y;
		if (!isValid()) {
			throw new Exception("Die Position ist nicht gültig!");
		}
	}

	/**
	 * Privater Konstruktor zum anlegen einer Position mit 2 int werten
	 * 
	 * @param x
	 *            Rank Das Buchstabenfeld auf dem Schachbrett <br>
	 *            muss Zwischen 1 und 9 liegen
	 * @param y
	 *            File Das Zahlenfeld auf dem Schachbrett <br>
	 *            muss Zwischen 1 und 9 Liegen
	 * @throws Exception
	 *             Wenn die Positzion ungültig ist
	 */
	private Position(int x, int y) throws Exception {
		this.rank = x;
		this.file = y;
		if (!isValid()) {
			throw new Exception("Die Position ist nicht gültig!");
		}

	}

	/**
	 * Chast Methode zum umwandeln von dem Buchstaben des Schachbrettes in die
	 * entsprechene Zahl
	 * 
	 * @param x
	 *            Die Buchstabenbezeichnung des Feldes
	 * @return Die Zahlenbeschreibung des Feldes
	 */
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

	/**
	 * Chast Methode zum rückwandel von einer Integerzahl zur
	 * Buchstabenbezeichnung
	 * 
	 * @param x
	 *            Die Zahlenbeschreibung des Feldes Rank
	 * @return Die Buchstabenbeschreibung des Feldes Rank
	 */
	private char intToChar(int x) {
		if (x > 8 || x == 0)
			return '0';
		char[] pos = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		x--;
		return pos[x];

	}

	/**
	 * @return gibt das Feld Korrekt aus
	 */
	public String toString() {
		return (intToChar(this.rank)) + "" + this.file + "";
	}

	/**
	 * Überprüft ob (Rank) Das Buchstabenfeld auf dem Schachbrett Zwischen A und
	 * H und (File) Das Zahlenfeld auf dem Schachbrett Zwischen 1 und 9 Liegen
	 * 
	 * @return <code>true</code> wenn das feld gemäß der regeln Korrekt ist <br>
	 *         <code>false</code> wenn das feld <b> nicht </b> Korrekt ist
	 */
	public boolean isValid() {
		if (this.rank <= 8 && this.rank >= 1 && this.file <= 8 && this.file >= 1) {
			return true;
		}
		return false;
	}

	/**
	 * Gettermethode für Rank
	 * 
	 * @return Das Buchstabenfeld
	 */
	public char getRank() {
		return intToChar(this.rank);

	}

	/**
	 * Gettermethode für Rank als Zahl
	 * 
	 * @return Das Buchstabenfeld als Zahl gewandelt
	 */
	public int getRankInt() {
		return this.rank;
	}

	/**
	 * Gettermethode für das Zahlenfeld
	 * 
	 * @return Das Zahlenfeld
	 */
	public int getFile() {
		return this.file;
	}

	/**
	 * Errechnet eine neue Positzion im bezug auf die alte Position
	 * 
	 * @param x
	 *            Anzahl der Felder auf der X-Achse die die neue Position von
	 *            der Alten entfernt sein soll
	 * @param y
	 *            Anzahl der Felder auf der Y-Achse die die neue Position von
	 *            der Alten entfernt sein soll
	 * @return
	 */
	public Position relative(int x, int y) {

		try {
			return new Position(this.rank + x, this.file + y);
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * Überprüft ob die Position die selben Koordinaten hat
	 * 
	 * @param pos
	 *            die zu Überprüfende Position
	 * @return <code>true</code> Wenn die Koordinaten <b>geleich</b> sin <br>
	 *         <code>false</code> Wenn die Koordinaten <b>ungleich</b> sind
	 */
	public boolean equals(Position pos) {
		if (this.file == pos.file && this.rank == pos.rank)
			return true;
		return false;
	}

}
