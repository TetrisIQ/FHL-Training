/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameTest.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kw20.GameModel;

public class GameTest {

	/**
	 * getList
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GameModel.createList();
//		System.out.println(GameModel.getList());
//	
//		System.out.println(GameModel.isFinish());
//		GameModel.swap(0, 1);
//		System.out.println(GameModel.getList());
//		System.out.println(GameModel.isFinish());
		GameView r = new GameView();
	}

}
