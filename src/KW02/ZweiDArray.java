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
		int[][] tests = {{1,2,3,4,5},
				{},
				{11,12,13,14,15}};
		System.out.println(zeilenweise(tests));
		
		
	}
	
	public static String zeilenweise(int[][] xs) {
		if (xs.length == 0) return "";
		return zeilenweise(0, 0, xs);
	}
	
	public static String zeilenweise(int r,int c, int[][] xs) {
		if (xs.length == c) return "";
		StringBuilder sb = new StringBuilder();
		sb.append(row(r, "-", xs[c])).append("\n");
		sb.append(zeilenweise(r, c + 1, xs));
		return sb.toString();
	}
	
	
	public static String row(int c, String sep, int[] xs) {
		if (xs.length == c) return "";
		return xs[c] + ((xs.length -1) == c ? "" :sep) + row(c + 1, sep, xs);
		
	}
	

}
