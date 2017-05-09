/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameControler.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

public class GameControler {
	
	private GameView view;
	private GameModel model;
	

	public GameControler(GameView gameView, GameModel gameModel) {
	      this.view = gameView;
	      this.model = gameModel;
	}
	
	public void setField(int f) {
		model.swap(f);
	}
	
	

}
