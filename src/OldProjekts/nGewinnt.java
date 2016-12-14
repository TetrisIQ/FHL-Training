package OldProjekts;
import java.util.LinkedList;
import java.util.List;

/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 10.5
	Classe: nGewinnt.java
	Datum: 30.11.2016
 */

public class nGewinnt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//char[][] feld = generiereZufaelligesFeld(5, 5, "rb");
		char[][] feld = {
				{'r','b','b'},
				{'r','b','x'},
				{'b','b','r'}
				};
		System.out.println("Dieses Feld wurde zufällig bestimmt: \n");
		System.out.println(feldToString(feld));
		List<Reihe> reihen = bestimmeAlleReihen(feld);
		for (int n = feld.length - 1; n <= feld.length; n++) {
			System.out.println("Auswertung für " + n + "-Gewinnt:");
			List<Reihe> gewinnReihen = filterReihen(reihen, 'r', n);
			gewinnReihen.addAll(filterReihen(reihen, 'b', n));
			
			for (Reihe r : gewinnReihen)
				System.out.println("- Diese Reihe gewinnt " + n + "-gewinnt:\n " + r);
			char[][] nGewinnt = markiereReihen(gewinnReihen, n, feld);
			System.out.println("\n" + feldToString(nGewinnt));
		}
	}
	

	/**
	 * Erzeugt ein neues Feld in dem nur die Gewinnerzeilen Dargestellt werden
	 * @param gewinnReihen Die Reihen die Gewonnen haben
	 * @param n Die feld Länge
	 * @param feld Das ursprüngliche feld
	 * @return Nur die gewinnzeilen
	 */
	private static char[][] markiereReihen(List<Reihe> gewinnReihen, int n, char[][] feld) throws ArrayIndexOutOfBoundsException {
		char[][] ret = new char[feld.length][feld[0].length];
		
		for (int i = 0; i < feld[0].length;i++) {
			for (int a = 0; a < feld.length;a++) {
				ret[i][a] = '.';
			}
		}
		
		for (Reihe row : gewinnReihen) {
			for (int l = 0; l < row.length; l++) {     
				ret[row.posX + (l * row.directionX)][row.posY + (l * row.directionY)] = row.character;
			}
		}
		
		
		
		return ret;
	}


	/**
	 * Filtert die Gewinner Zeilen aus den übrigen raus
	 * @param reihen Alle Reihen 
	 * @param c Das Zeichen nach dem gefiltert werden soll
	 * @param n die Länge nach der gefiltert werden soll 
	 * @return Alle gefilterten Zeilen
	 */
	private static List<Reihe> filterReihen(List<Reihe> reihen, char c, int n) {
		  List<Reihe> filterReihen = new LinkedList<Reihe>();
			  for (Reihe row : reihen)
			  if (row.character == c && row.length >= n ) {
				  filterReihen.add(row);
			  }
			  return filterReihen;
			 }
	

	/**Generiert ein zufälliges feld
	 * @param r  Anzahl der Reihen 
	 * @param c Anzahl der Zeilen
	 * @param z Enthält die Zeichen die zufällig eingesetzt werden sollen 
	 * @return Ein zufällig generiertes feld
	 */
	public static char[][] generiereZufaelligesFeld(int r, int c, String z) {
		
		char[][] ret = new char[r][c];
		for (int row = 0; row < r; row++) {
			for (int col = 0; col < c; col++) {
				ret[row][col] = randomChar(z);
			}
			
		}
		
		return ret;
	}
	
	/**
	 * Wandelt ein 2D char Array in einen String
	 * @param feld Ein 2D char Array
	 * @return Das 2D Array als String
	 */
	public static String feldToString(char[][] feld) {
		StringBuilder sb = new StringBuilder();
		for (int row = 0; row < feld.length; row++) {
			for (char b :feld[row]) {
				sb.append(" ").append(b);		
				}
			sb.append("\n");
		}
		
		
		
		return sb.toString();
	}
	
	
	/**
	 * Bestimmt alle Reihen in einem 2D char Array
	 * @param feld Das zu Analysirende char Array
	 * @return Eine Liste aller reihen im char Array
	 */
	private static List<Reihe> bestimmeAlleReihen(char[][] feld) {
		List<Reihe> ret = new LinkedList<Reihe>();
		int setX =0;
		int setY=0;
		for (int x =0; x < feld.length;x++) {
			for (int y = 0; y < feld[0].length;y++) {
				setX =0;
				setY =1; //nach Unten testen
				Reihe tmprow1 = new Reihe(setX, setY, feld[x][y], x, y, countrow(feld,setX,setY,x,y));
				ret.add(tmprow1);
				
				setX=1;
				setY=0; //nach rechts testen
				Reihe tmprow2 = new Reihe(setX, setY, feld[x][y], x, y, countrow(feld,setX,setY,x,y));
				ret.add(tmprow2);
				
				setX=1;
				setY=1; //nach Schäg unten
				Reihe tmprow3 = new Reihe(setX, setY, feld[x][y], x, y, countrow(feld,setX,setY,x,y));
				ret.add(tmprow3);
				
				setX=1;
				setY=-1; //nach schräg links
				Reihe tmprow4 = new Reihe(setX, setY, feld[x][y], x, y, countrow(feld,setX,setY,x,y));
				ret.add(tmprow4);
				
			}
		}
		return ret;
	}
	
	/**
	 * Zählt die Länge der aufeinanderfolgenden zeichen
	 * @param feld Das zu analysirende Array
	 * @param setX Start Richtung X
	 * @param setY Start Richtung Y
	 * @param x Positzion X
	 * @param y Positzion Y
	 * @return Die Länge der aufeinader volgenden zeichen
	 */
	private static int countrow(char[][] feld, int setX, int setY, int x, int y) {
		int count =0;
		while (x + count * setX < feld.length && y + count * setY < feld[0].length 
				&& x+count*setX >= 0 && y+count*setY >= 0 && feld[x+count*setX][y+count*setY] == feld[x][y]) {
			count++;
		}
		
		return count;
	}
	
	
	/**
	 * Wählt zufällig ein elemet aus einem string aus
	 * @param String Die elemente die ausgewählt werden sollen
	 * @return Ein zufälliges elemnt aus dem String
	 */
	public static char randomChar(String String) {
		try {
			int ran = (int)(Math.random()* (String.length()));
			return String.charAt(ran);
		}
		catch (StringIndexOutOfBoundsException e) {
			
			return 'X';
		}
		
		
	}
	
	
	
	
	

}
