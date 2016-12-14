package KW51;

import java.util.List;
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
		String[] work = s.split("+ ");
		List<String> ret = new LinkedList<String>(Arrays.asList(work));
//		ret = Arrays.asList(work);
		if (s.length() <= 0) return ret;
		return ret;
	}
	
	public static List<String> getShortestWords(List<String> ls) {
		List<String> ret = new LinkedList<String>();
		if (ls == null || ls.isEmpty()) return ret;
		if (ls.size() == 1) return ret;
		
		if (ls.get(0).length() < ls.get(1).length())
			ls.remove(1);
		else
			ls.remove(0);
		return getShortestWords(ls);
		
	
	}

}
