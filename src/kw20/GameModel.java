/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameModel.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import java.util.LinkedList;
import java.util.List;

import javax.swing.Timer;

public class GameModel {

	private boolean play = false;
	private static List<Integer> list = new LinkedList<>();
	private static int register = 20;
	public static final int SIZE = 2; // sollte größer gleich 2 sein: Default 4
	public static double time = 0.000;
	private static Timer timer = new Timer(20, e -> {
		time += 0.020;
	});

	public static void createList() {
		if (list.isEmpty())
			fillList();
		List<Integer> ret = new LinkedList<Integer>();
		List<Integer> process = new LinkedList<Integer>(list);
		while (!process.isEmpty()) {
			ret.add(process.remove((int) (Math.random() * process.size())));
		}
		list = ret;

	}

	private static void fillList() {
		for (int i = 0; i < SIZE * SIZE; i++) {
			list.add(i);
		}

	}

	public static void swap(int i, int y) {
		int iWert = list.get(i);
		int yWert = list.get(y);

		list.set(i, yWert);
		list.set(y, iWert);

	}

	public void swap(int i) {
		if (register == 20) // heißt leer
			register = i;
		else if (!(register == 20)) {
			swap(register, i);
			register = 20; // register wieder auf "leer" setzen
		}
	}

	public static List<Integer> getList() {
		return list;
	}

	public boolean isFinish() {
		boolean ready = false;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i + 1))
				ready = true;
			else
				return false;
		}
		return ready;
	}
	
	public void makeFinish() {
		list.sort((i1,i2) -> i1.compareTo(i2));
		
	}

	public boolean play() {
		return play;
	}
	public void setPlay(boolean b) {
		play = b;
	}

	public void reset() {
		time = 0.0;
		timer.stop();
		register = 20;
//		createList();
		
		
	}

	public void timerStart() {
		timer.start();
	}
	
	public void timerStop() {
		timer.stop();
	}
	
	public double percentReady() {
		int right = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == i) right++;
		}
		return (double) 100 / list.size() * right;
	}

}
