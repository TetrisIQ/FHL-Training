package OldProjekts;
/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 9.5
	Classe: iseverywhere.java
	Datum: 16.11.2016
 */

public class iseverywhere {

	/**
	 * Die isEverywhere Metode überprüft ob eine Zahl im wechsel steht
	 * @param check Das zu überprüfende int Array
	 * @param number Die Zahl im wechsel stehen soll
	 * @return true oder false
	 * @author Alexander
	 */
	public static boolean isEverywhere(int[] check, int number) {
		if (check == null || check.length <= 0) return false;
		boolean ret = true;
		for (int i = 0; i < check.length && ret; i++) {
			if (check[i] == number || i > 0 && check[i - 1] == number || i + 1 < check.length && check[i + 1] == number) {
				ret = true;
			}
			else {
				ret = false;
			}
			
		}
	
	return ret;
	}
	
	public static void main(String[] args) {
		
		int[] check1 = { 1, 2, 1, 3 };
		System.out.println("([1, 2, 1, 3], 1) 	: " + isEverywhere(check1, 1)); // true

		int[] check2 = { 1, 2, 1, 3 };
		System.out.println("([1, 2, 1, 3], 2) 	: " + isEverywhere(check2, 2)); //false

		int[] check3 = { 1, 2, 1, 3, 4 };
		System.out.println("([1, 2, 1, 3, 4], 1)    : " + isEverywhere(check3, 1)); //false
		
		int[] check4 = {};
		System.out.println("([], 1)                 : " + isEverywhere(check4, 1)); //false
		
		
	}

}
