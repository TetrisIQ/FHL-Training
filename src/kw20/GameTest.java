/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameTest.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import java.sql.Time;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Timer;

import kw20.GameModel;

public class GameTest {
	static double time = 0.000000;
	/**
	 * getList
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GameModel.createList();
//		GameModel.swap(0, 1);
//		System.out.println(GameModel.getList());
//		System.out.println(GameModel.isFinish());
//
//		GameModel.swap(0);
//		GameModel.swap(1);
//		
//		System.out.println(GameModel.getList());
//		System.out.println(GameModel.isFinish());
		GameView r = new GameView();
		
		
//		Timer t = new Timer(20, e -> {
//			time += 0.001; 
//			timer.setText(time + "");

//		});
		
//		GameModel.timer.start();
//		while (GameModel.time < 1) {
//			System.out.println(Math.round(GameModel.time*1000)/1000.0);
//		}
		
//		GameModel.timer.stop();
	}
	
}
