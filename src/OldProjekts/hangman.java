package OldProjekts;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.text.StringContent;
/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 7.5 Hangman
	Classe: hangman.java
	Datum: 22.11.2016
 */

public class hangman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(genWord());
		System.out.println(Hangmanbuilder(4));
		
		/*Scanner in = new Scanner(System.in);
		for (int i =0; i<=6;i++) {
			System.out.println("Bitte gib einen Buchstaben ein: " );
			String test = in.next();
		//	PlayHangman(test, i);
		}
		in.close();
		*/
		
		
	}

	
	/**
	 * Die genWord Methode
	 * @return Ein zufälliges Wort aus einer kleinen Liste
	 */
	public static String genWord() {
		String words = "TITANIC SCHIFFAHRTSGESELLSCHAFT COMPUTERABSTURZ VORSTANDSSPRECHER "
				+ "MAGAZIN ZUFALL CYBERSEX KONTAKTANZEIGEN KOSTENPFLICHTIG KREDITKARTE "
				+ "EISENBAHN WIRRUNGEN FAMILIENLEBEN ATLANTIK TYPENVIELFALT";
		String[] ar = words.split(" ");
		int z = (int)(Math.random()*ar.length);
		try {
		return ar[z];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return "NETZWERKUMGEBUNG";
		}
		
		
		
		
		
		/*
		//File file = new File("words.txt");
		BufferedReader br = null;
		try 
		{
			String line = "";
			br = new BufferedReader(new FileReader("words.txt"));
				while ((line = br.readLine()) != null)
				{
					ret += line;
				}
				br.close();
		}
			catch (IOException e)
			{
				return "nope";
			}
		return ret;
		*/
}
	
	/**
	 * PlayHangman überprüft die vorkommenden Buchstaben
	 * @param Charakter Das zeichen was eingegeben wird
	 * @param playertrys Die Anzahl der fehlversuche
	 * @return <b>Bei erfolg: </b>Gibt das unvollständige wort aus <p>
	 *         <b>Bei fehlschlag: </b>Gibt das unvollständige wort aus und den Hangman aus
	 */
	public static String PlayHangman(char Charakter, int playertrys) {
		String word = genWord();
		boolean test;
		for (char c : word.toLowerCase().toCharArray()) {
			if (c == Charakter) {
				test = true;
			}
		}
		test = false;
		
		while (playertrys <= 6) {
			if (test) {
		
			//if (Charakter == c[i])	
				return "Der Buchstabe"+Charakter+" kommt vor";
			}
			
			
		}
		return "Der Buchstabe kommt nicht vor"+Hangmanbuilder(playertrys++);

	}
		
		
	
	
	
	/**
	 * Hangmanbuilder Baut das passende Galgenmänchen
	 * @param i Die Fehlgeschlagenden versuche
	 * @return Das Entsprechende Galgenmänchen
	 */
	public static String Hangmanbuilder(int i) {
		String hangman ="";
		hangman +=          "  +-----+         \n";
		hangman += i >= 1 ? "  |/    O         \n" :"  |/              \n";
		hangman += i == 2 ? "  |     +         \n":"";
		hangman += i == 3 ? "  |   --+         \n":"";
		hangman += i > 3  ? "  |   --+--       \n":"";
		hangman += i == 2 || i == 3 || i > 3 ? "  |     |         \n":"  |              \n";
		hangman += i == 4 && i != 5  ? "  |    /         \n" :"";
		hangman += i > 5  ? "  |    / \\         \n":"";
		hangman +=" ***              \n";
		hangman +="************      \n";
		return hangman;
	}
}
