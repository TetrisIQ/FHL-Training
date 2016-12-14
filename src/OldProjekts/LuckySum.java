package OldProjekts;
/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 7.8
	Classe: LuckySum.java
	Datum: 09.11.2016
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class LuckySum {

	/**
	 * Die LuckySum Methode addiert Zahlen auf bis zur Ziffer 13
	 * @param zahlen Die Zahlen
	 * @return Die Zahlen aufaddiert bis zur Ziffer 13
	 * @author Alexander 
	 */
	public static int luckysum(int[] zahlen) {
		int ret = 0;
		for (int x : zahlen) {
			if (x == 13) {
				break;
			}
			ret += x;
		}	
		return ret;
		
	}
	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben sie Zahlen ein. \nBei einem Buchstaben wird die Summe wie in der Aufgabe angegeben berrechnet: ");
		
		int[] numbers = new int[999];
		boolean br = true;
		int i = 0;
		while (br) {
			try {
			numbers[i] = scanner.nextInt();
			i++;
			}
		     catch (InputMismatchException e) {
		    	 br = false;
			}
		}
		scanner.close();
		System.out.println(String.format("Das Ergebnis ist: " + luckysum(numbers)));
	}

}
