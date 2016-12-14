package OldProjekts;
/**
    Datentypen zum Speichern von reihen und ihren eigenschaften
	Autor: Alexander Werner
	Projekt: 10.5
	Classe: Reihe.java
	Datum: 30.11.2016
 */
public class Reihe {

	public int directionX;
	public int directionY;
	public char character;
	public int posX;
	public int posY;
	public int length;
	
	/**
	 * Konstruktor für die Eigenschaften von Reihen
	 * @param d directionX - Richtung X
	 * @param e directionY - Richtung Y
	 * @param c character  - Zeichen der Reihe 
	 * @param x posX       - Start Positzion X
	 * @param y posY       - Start Posutzion Y
	 * @param l length     - Länge der Reihe 
	 */
	public Reihe(int d, int e, char c, int x, int y, int l) {
		this.directionX = d;
		this.directionY = e;
		this.character = c;
		this.posX = x;
		this.posY = y;
		this.length = l;
	}
	
	/**
	 * @return Wandelt die Reihe in einen String um
	 */
	public String toString() {
		return "Zeichen: " + this.character + " Start: (" + this.posX + "," + this.posY + "); Richtung " + this.directionX +":" + this.directionY + "; Länge: " + this.length;
	}
	
	/**
	 * 
	 * @return Gibt die Richtung einer Reihe aus
	 */
	public String direction() {
		return this.directionX + ":" + this.directionY;
	}
	/**
	 * 
	 * @return gibt das Zeichen einer Reihe aus
	 */
	public char character() {
		return this.character;
	}
	/**
	 * @return Gibt die Startpositzion X einer Reihe aus
	 */
	public int posX() {
		return this.posX;
	}
	/**
	 * 
	 * @return Gibt die Startpositzion Y einer Reihe aus
	 */
	public int posY() {
		return this.posY;
	}
	/**
	 * 
	 * @return Gibt die Länge einer Reihe aus
	 */
	public int length(){
		return this.length;
	}
}
