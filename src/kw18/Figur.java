/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Figur.java <br>
 * Datum: 27.04.2017 <br>
 * Package: kw18 <br>
 */
package kw18;

import java.util.LinkedList;
import java.util.List;

public class Figur {

	int x;
	int y;
	int z;
	private static List<Figur> figuren = new LinkedList<>();

	public Figur(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		figuren.add(this);
	}
	
	public static final int anzFiguren() {
		return figuren.size();
	}
	public static final List<Figur> getAlleFiguren() {
		return figuren;
	}
	
	public int getZ() {
		return this.z;
	}

	public static Figur getZsortierteFiguren() {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	
}

	