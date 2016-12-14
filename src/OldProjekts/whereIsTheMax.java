package OldProjekts;
/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 9.6
	Classe: whereIsTheMax.java
	Datum: 22.11.2016
 */

public class whereIsTheMax {

	/**
	 * maxRow gibt den Index der Spalte mit dem höchsten Wert wieder
	 * @param daten Array mit Zahlen
	 * @return Gibt den Index Zeile der Höchsten zahl im Array zurück
	 */
	public static int maxRow(int[][] daten) {
		int ret = -1;
		Integer max = null;
		for (int rIndex = 0; rIndex < daten.length; rIndex++)		//Die erste, Zweite (rIndex) zeile wird in row geschrieben 
		{
			int[] row = daten[rIndex];
			
			for (int cNum = 0; cNum < row.length; cNum++) 			//Die größte zahl wird gesucht
			{
				if (max == null || row[cNum] > max) 
				{
					max = row[cNum];								//Der aktuell größte wert wird für die weiterverarbeitung gespeichert
					ret = rIndex;									//Die index Reihe wird für den Return gespeichert
				}
			}
		}
			
		return ret;													//Die Index Reihe wird zurück gegeben
	}
	
	/**
	 * maxCol gibt den index der Höchsten Spalte aus
	 * @param daten Array der Spalte
	 * @return Gibt den Index Spalte der Höchsten zahl im Array zurück
	 * @author Alexander
	 * 
	 */
	public static int maxCol(int[] daten) {
		int ret = -1;
		Integer max = null;
		
		for (int cMax = 0; cMax < daten.length; cMax++) 
		{			
			if (max == null || daten[cMax] > max) 
			{					//Der Maximale wert wird ermittelt 
				max = daten[cMax];									//Der Maximale wert wird für die weiterverarbeitung gespeichert
				ret = cMax;											//Der Spalten Index wird für den Return gespeichert	
			}	
		}
		return ret;													//Der Spalten Index wird ausgegeben
	}
	
	public static void main(String[] args) {
		 int[][] data = {
				 { 1, 2, 3, 4 },			//zeilen und spalten fangen bei null an
				 {},
				 { -1, 5, 100, 1 },
				 { 0, 2, 5, 6, 7, 8, 9 }
				 };
				 int row = maxRow(data);
				 int col = row == -1 ? -1: maxCol(data[row]);
				 System.out.println("Zeile und Spalte mit dem Maximumwert sind: (" + row + ", " + col + ")");
				// => (2, 2)	
				 
				 
		int[][] example = {
				{1,9,3,9,5,6},			//zeilen und spalten fangen bei null an
				{1,7,4,10,5,6},			
				{1,5,6,10,5,6}
				};
			int row1 = maxRow(example);
			int col1 = row1 == -1 ? -1 : maxCol(example[row1]);
			System.out.println("Zeile und Spalte mit dem Maximumwert sind: (" + row1 + ", " + col1 + ")");
			
		}
	}


