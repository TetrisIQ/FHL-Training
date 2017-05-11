/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameView.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class GameView {
	protected GameModel model = new GameModel();
	protected GameControler control = new GameControler(this, model);
	List<Button> myButtons = makeButtons();

	public GameView() {
		Panel t = new Panel();
		GridLayout gbLayout = new GridLayout(model.SIZE, model.SIZE);
		gbLayout.setHgap(5);
		gbLayout.setVgap(5);
		t.setLayout(gbLayout);

		JFrame f = new JFrame("Spiel");
		for (int i = 0; i < myButtons.size(); i++) {
			t.add(myButtons.get(i));
		}
		for (Button b : myButtons) {
			int i = Integer.parseInt(b.getName());

			b.addActionListener(e -> control.setField(i));
		}
//		f.add(play, BorderLayout.NORTH);
		f.add(t, BorderLayout.CENTER);
//		f.add(timer, BorderLayout.PAGE_END);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(model.SIZE * 120, model.SIZE * 120);
		f.setVisible(true);
	}

	private List<Button> makeButtons() {
		List<Button> b = new LinkedList<>();
		for (int i = 0; i < model.SIZE * model.SIZE; i++) {
			b.add(new Button(model.getList().get(i).toString()));
			b.get(i).setName(i +""); // index 
		}
		return b;

	}
	
	public void update() {
		for (int i =0; i < myButtons.size(); i++) {
			myButtons.get(i).setLabel(model.getList().get(i).toString());
		}
		
	}
	


}
