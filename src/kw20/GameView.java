/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: GameView.java <br>
 * Datum: 09.05.2017 <br>
 * Package: kw20 <br>
 */
package kw20;

import java.awt.Button;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class GameView {
	protected GameModel model = new GameModel();
	protected GameControler control = new GameControler(this, model);

	private JTextField play = new JTextField();
	{
		this.play.setEditable(false);
		this.play.setSize(200, 60);
	}

	private JTextField timer = new JTextField();
	{
		this.timer.setEditable(false);
		this.timer.setSize(200, 60);
	}

	public List<Button> buttons = Arrays.asList(
			// @formatter:off
			new Button(GameModel.getList().get(0).toString()), // Index
			new Button(GameModel.getList().get(1).toString()), // Index 1
			new Button(GameModel.getList().get(2).toString()), // Index 2
			new Button(GameModel.getList().get(3).toString()), // Index 3
			new Button(GameModel.getList().get(4).toString()), // Index 4
			new Button(GameModel.getList().get(5).toString()), // Index 5
			new Button(GameModel.getList().get(6).toString()), // Index 6
			new Button(GameModel.getList().get(7).toString()), // Index 7
			new Button(GameModel.getList().get(8).toString()), // Index 8
			new Button(GameModel.getList().get(9).toString()), // Index 9
			new Button(GameModel.getList().get(10).toString()), // Index 10
			new Button(GameModel.getList().get(11).toString()), // Index 11
			new Button(GameModel.getList().get(12).toString()), // Index 12
			new Button(GameModel.getList().get(13).toString()), // Index 13
			new Button(GameModel.getList().get(14).toString()), // Index 14
			new Button(GameModel.getList().get(15).toString()) // Index 15
	);
	// @formatter:on

	public GameView() {
		super();
		// this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JFrame f = new JFrame("Main Window");

		Panel feld = new Panel();
		GridLayout gbLayout = new GridLayout(4, 4);
		gbLayout.setHgap(5);
		gbLayout.setVgap(5);
		feld.setLayout(gbLayout);

		feld.add(this.buttons.get(0)); 

		feld.add(this.buttons.get(1));
		feld.add(this.buttons.get(2));
		feld.add(this.buttons.get(3));
		feld.add(this.buttons.get(4)); 

		feld.add(this.buttons.get(5));
		feld.add(this.buttons.get(6));
		feld.add(this.buttons.get(7));
		feld.add(this.buttons.get(8)); 

		feld.add(this.buttons.get(9));
		feld.add(this.buttons.get(10));
		feld.add(this.buttons.get(11));
		feld.add(this.buttons.get(12));

		feld.add(this.buttons.get(13)); 
		feld.add(this.buttons.get(14));
		feld.add(this.buttons.get(15)); 

		// Display des TR in die erste Zeile setzen
		// Das Bedienpanel direkt darunter
		f.add(play, BorderLayout.NORTH);
		f.add(feld, BorderLayout.CENTER);
		f.add(timer, BorderLayout.PAGE_END);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setVisible(true);

		// Alle Tasten des Rechners mit dem controlobjekt verknuepfen
//		 this.buttons.get(0).addActionListener(e ->
//		 control.zahlAnhaengen("0"));
		// this.buttons.get(1).addActionListener(e ->
		// control.zahlAnhaengen("1"));
		this.buttons.get(0).addActionListener(e -> control.setField(0));
		this.buttons.get(1).addActionListener(e -> control.setField(1));
		this.buttons.get(2).addActionListener(e -> control.setField(2));
		this.buttons.get(3).addActionListener(e -> control.setField(3));
		this.buttons.get(4).addActionListener(e -> control.setField(4));
		this.buttons.get(5).addActionListener(e -> control.setField(5));
		this.buttons.get(6).addActionListener(e -> control.setField(6));
		this.buttons.get(7).addActionListener(e -> control.setField(7));
		this.buttons.get(8).addActionListener(e -> control.setField(8));
		this.buttons.get(9).addActionListener(e -> control.setField(9));
		this.buttons.get(10).addActionListener(e -> control.setField(10));
		this.buttons.get(11).addActionListener(e -> control.setField(11));
		this.buttons.get(12).addActionListener(e -> control.setField(12));
		this.buttons.get(13).addActionListener(e -> control.setField(13));
		this.buttons.get(14).addActionListener(e -> control.setField(14));
		this.buttons.get(15).addActionListener(e -> control.setField(15));
	
	
	}
}
