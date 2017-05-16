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
	
	boolean oneTime = false;
	private GameView view;
	private GameModel model;
	private Timer timeRun = new Timer(20, e-> {
		view.updateTimer();
//		view.updatePlay();
	});
	
	

	public GameControler(GameView gameView, GameModel gameModel) {
	      this.view = gameView;
	      this.model = gameModel;
	}
	
	public void setField(int f) {
		model.swap(f);
		view.updateButtons();
		if (model.isFinish()) {
			resetGame();
		}
	}
	
	public void gameControl() {
//		if (oneTime) {
//			resetGame();
//			oneTime = false;
//		}
//		else {
//			startGame();
//			oneTime = true;
//		}
		startGame();
		
	}

	public void startGame() {
		model.setPlay(true);
		model.reset();
		model.createList();
		view.updateButtons();
		model.timerStart();
		timeRun.start();
		view.updatePlay();
		
	}
	
	

	private void resetGame() {
		model.setPlay(false);
		model.makeFinish();
		timeRun.stop();
//		model.reset();
		view.updatePlay();
		view.updateTimer();
	}
	
	
	
	
	
	
}
