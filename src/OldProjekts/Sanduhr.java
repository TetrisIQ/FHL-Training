package OldProjekts;
/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 7.9
	Classe: Sanduhr.java
	Datum: 09.11.2016
 */
import java.util.Scanner;
public class Sanduhr {

	/**
	 * @param args
	 * 
	 */
	public static String hourglass(String characters, int height) {
		if (height <= 0) { return "Bitte gib eine Zahl größer als 0 ein.\n"+ height + " ist nicht größer als 0"; }
		
		int hnew = height - 1;
		String ret = "";
		int space = 0;
		for (int i = 0; i < height /2; i++) {  			//erst leerzeiche 
			for (int y =0; y < space; y++){
				ret += " ";
				
			}
			for (int x = 0; x < hnew; x++){			//Zeichen
				ret += characters;
			}
			ret +="\n";								//Umbruch nach jeder zeile
			hnew -= 2;
			space += 1;
		}
		//++++ Unten  ++++
		for (int x = 1; x <= height/2; x++) {     		// x zählt die reihen 
			for (int i = x; i < height; i++) {			// i nimmt die aktuelle reihe und macht so lange " " bis i der eingegebenen zahl enspricht
				ret +=" ";
			}
			
			for (int i = 1; i <= x*2-1; i++) {			
				ret += characters;
			}
			ret += "\n";						// Umbruch nach jeder reihe 
			
		}
		
		return ret;
		
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Bitte gib ein Zeichen ein aus dem die Sanduhr gebaut werden soll: ");
		String c = in.nextLine();
		System.out.print("Bitte geben sie ein höhe ein die die Sanduhr haben soll: ");
		int h = in.nextInt();
		in.close();
		
		System.out.println(hourglass(c, h));
		
		
		
		
		
	}
}


