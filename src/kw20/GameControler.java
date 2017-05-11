/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameControler.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import javax.swing.Timer;

public class GameControler {
	
	private GameView view;
	private GameModel model;
	private Timer timeRun = new Timer(20, e-> {
		view.updateTimer();
	});
	
	

	public GameControler(GameView gameView, GameModel gameModel) {
	      this.view = gameView;
	      this.model = gameModel;
	}
	
	public void setField(int f) {
		model.swap(f);
		view.update();
		if (model.isFinish()) {
			timeRun.stop();
			model.reset();
		}
	}

	public void startGame() {
		model.reset();
		view.update();
		model.timer.start();
		timeRun.start();
	}
	
	
	
	
}
