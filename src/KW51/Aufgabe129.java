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
		List<String> test = new ArrayList<String>(ret);
		return getShortestWords(test, ret.size(), 1, 1);
	}
	


	
	
	
	public static List<String> getShortestWords( List<String> ls,int origin, int counter, int second) {
			List<String> ret = new ArrayList<String>(ls);
			if (ret.isEmpty() || origin == counter ) return ret;	//|| ret.size() == 1
				if (ret.get(0).length() > ret.get(second).length()) ret.remove(0);
				else if (ret.get(0).length() < ret.get(second).length()) ret.remove(second);
				else if ((ret.get(0).length() == ret.get(second).length())) {
					second++;
				}
				counter++;
			
			return getShortestWords(ret, origin, counter, second);
		
	
	}

}
