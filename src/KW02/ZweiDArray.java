/**
	<b>*****TetrisIQ***** </b> <br>
	Autor: Alexander Werner <br>
	Projekt: FHL-Training <br>
	Classe: ZweiDArray.java <br>
	Datum: 19.12.2016 <br>
	Package: KW02 <br>
 */

package KW02;

public class ZweiDArray {

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		int[][] test = {{1,2,3,4,5},
				{6,7,8,9,10,},
				{11,12,13,14,15}};
		System.out.println(zeilenweise(test));
		
	}
	
	public static String zeilenweise(int[][] xs) {
		
		
		return null;
	}
	
	public static String row(int[][] xs) {
		StringBuilder sb = new StringBuilder();
		if (xs[0].length == 0) return sb.toString();
		sb.append(xs[0]); 
		xs.
		return row(xs) + sb.toString();
		
	}

}
