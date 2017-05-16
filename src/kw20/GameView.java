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
import java.text.DecimalFormat;

public class GameView {
	protected GameModel model = new GameModel();
	protected GameControler control = new GameControler(this, model);
	List<Button> myButtons = makeButtons();

	private Button play = new Button();
	{
		updatePlay();

	}

	private JTextField timer = new JTextField();
	{
		this.timer.setEditable(false);
		this.timer.setSize(200, 60);
		updateTimer();
	}

	public GameView() {
		Panel t = new Panel();
		GridLayout gbLayout = new GridLayout(model.SIZEX, model.SIZEY);
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
		play.setFont(new Font("", 0, 20));
		play.setBackground(Color.ORANGE);
		timer.setFont(new Font("", 0, 20));
		timer.setBackground(Color.GRAY);
		// timer.setT

		f.add(play, BorderLayout.NORTH);
		f.add(t, BorderLayout.CENTER);
		f.add(timer, BorderLayout.PAGE_END);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(model.SIZEX * 120, model.SIZEY * 120);
		f.setVisible(true);
	}

	private List<Button> makeButtons() {
		List<Button> b = new LinkedList<>();
		for (int i = 0; i < model.SIZEX * model.SIZEY; i++) {
			b.add(new Button(model.getList().get(i).toString()));
			b.get(i).setName(i + ""); // index
			b.get(i).setFont(new Font("Dialog", 1, 15)); // größe setzen
			// b.setBackground(Color.white);
		}

		b.forEach(e -> e.setBackground(Color.WHITE));
		
		return b;

	}

	public void updateButtons() {
		for (int i = 0; i < myButtons.size(); i++) {
			myButtons.get(i).setLabel(model.getList().get(i).toString());
		}

	}

	public void updateButtons(int marker) {
		for (int i = 0; i < myButtons.size(); i++) {
			myButtons.get(i).setLabel(model.getList().get(i).toString());
			myButtons.get(i).setBackground(Color.ORANGE);
		}

	}

	public void updateTimer() {
		timer.setText("(" + model.percentReady() + "%)  " + model.getTime() + "sec.");
		if (model.percentReady() < 100)
			timer.setForeground(Color.RED);
		else
			timer.setForeground(Color.GREEN);

		// String newTime = model.time + "";
		// int x = 0;
		// if (newTime.length() <= 5) x = 4;
		// else x = 0;
		// timer.setLabel(newTime.substring(0, x));
	}

	public void updatePlay() {

		if (!(model.play())) {
			this.play.setLabel("Play");
			this.play.setBackground(Color.GREEN);
		} else {
			this.play.setLabel("Game is Runing");
			this.play.setBackground(Color.ORANGE);

		}
		this.play.addActionListener(e -> control.gameControl());

	}

	public void updateAll() {
		updateButtons();
		updatePlay();
		updateTimer();
	}

	public void markerButton(int f) {
		String s = f + "";
		for (Button b : myButtons) {
			if (b.getName().equals(s) && !b.getBackground().equals(Color.gray)) {
				b.setBackground(Color.gray);
			} else
				b.setBackground(Color.white);
		}

	}

	public void markerButton_(int f) {
		String s = f + "";
		for (Button b : myButtons) {
				b.setBackground(Color.white);
			}

	}
}
