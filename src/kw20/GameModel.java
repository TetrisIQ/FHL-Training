/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameModel.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.spi.RegisterableService;

import com.sun.org.apache.regexp.internal.recompile;

public class GameModel {

	private static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
	private static int register = 20;
	
	public static void createList() {
		List<Integer> ret = new LinkedList<Integer>();
		List<Integer> process = new LinkedList<Integer>(list);
		while (!process.isEmpty()) {
			ret.add(process.remove((int) (Math.random() * process.size())));
		}
		list = ret;
		

	}

	public static void swap(int i, int y) {
		int iWert = list.get(i);
		int yWert = list.get(y);

		list.set(i, yWert);
		list.set(y, iWert);

	}
	public static void swap(int i) {
		if (register == 20) //heißt leer 
			i = register;
		if (!(register == 20)) {
			swap(register, i);
			register = 20; // register wieder auf "leer" setzen 
		}
	}

	public static List<Integer> getList() {
		return list;
	}

	public static boolean isFinish() {
		boolean ready = false;
		for (int i = 0; i < list.size() -1 ; i++) {
			if (list.get(i) < list.get(i + 1))
				ready = true;
				else 
					return false;
		}
		return ready;
	}

}
