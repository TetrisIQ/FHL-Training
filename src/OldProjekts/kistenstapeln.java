package OldProjekts;
/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 6.7
	Classe: kistenstapeln.java
	Datum: 02.11.2016
 */
import java.util.Scanner;
public class kistenstapeln {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Geben Sie bitte die Anzahl kleiner Kisten ein: ");
		int smallthere = in.nextInt();
		System.out.print("Geben Sie bitte die Anzahl großer Kisten ein: ");
		int bigthere= in.nextInt();
		System.out.print("Geben Sie bitte die Höhe des Zielstapels ein: ");
		int height = in.nextInt();
		in.close();
		int heightposs = smallthere + bigthere * 5;
		int countbig = 0;
		int countsmall =0;
		int bigleft = bigthere;
		int heightleft = height;
		int smallleft = smallthere;
		//System.out.println(heightposs);
		if (bigthere <0 || smallthere <0 || height <= 0) {
			System.out.println("\nBitte geben sie eine Natürliche Zahl ein.");
			return;
		}
		if (height <= heightposs) {
			while (heightleft >= 1 && bigleft>=1) {
				heightleft = heightleft - 5;
				bigleft--;
				countbig++;
				
			}
			//System.out.println(countbig);
			//System.out.println(heightleft);
			while (heightleft >= 1 && smallleft>=1) {
				heightleft--;
				smallleft--;
				countsmall++;
				
			}
			//System.out.println(countsmall);
			//System.out.println(heightleft);
			System.out.println(heightleft>=0?"Ja, ein Stapel der Höhe " +height+" kann aus "+countbig+" großen und "+countsmall+" kleinen Kisten gebaut werden.":
				"Nein, ein Stapel der Höhe " +height+" kann nicht gebaut werden.");
		}
		else {
			System.out.println("Der Stapel ist nicht möglich, da die gewünschte Höhe nicht erreicht werden kann.");
		}
		
		
		
	}

}
