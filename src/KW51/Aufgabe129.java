package KW51;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
	*****alex***** 
	Autor: Alexander Werner
	Projekt: KW50
	Classe: Aufgabe111.java
	Datum: 12.12.2016
 */
public class Aufgabe129 {


	public static void main(String[] args) {
		 List<String> words = getShortestWords("Dies ist nur ein dummes Beispiel");
		 System.out.println(words);
		 // => [ist, nur, ein]
		 System.out.println(getShortestWords("Dies ist so ein dummes Beispiel"));
		 // => [so]
		 System.out.println(getShortestWords(""));
		 // => []

	}
	
	

	public static List<String> getShortestWords(String s) {
		String[] work = s.split(" ");
		List<String> ret = Arrays.asList(work);
//		ret = Arrays.asList(work);
//		if (s.length() <= 0) return ret;
		return getShortestWords(ret, 0, 1);
	}
	
	public static List<String> getShortestWords( List<String> ls, int counter, int second) {
			List<String> ret = new LinkedList<String>(ls);
			if (ret.isEmpty() || ret.size() == (counter) || ret.size() == 1) return ret;
				if (ret.get(0).length() > ret.get(second).length()) ret.remove(0);
				else if (ret.get(0).length() < ret.get(second).length()) ret.remove(second);
				else if ((ret.get(0).length() == ret.get(second).length())) {
					second++;
				}
//				if(!(ret.get(0).length() == ret.get(1).length())) ret.remove(1);

				counter++;
			
			return getShortestWords(ret, counter, second);
		
	
	}

}
