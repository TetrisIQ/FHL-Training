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
		List<String> result = new LinkedList<String>();
		List<String> test = new LinkedList<String>(ret);
		return getShortestWords(test, 0, result);
	}
	

	public static List<String> getShortestWords(List<String> ls, int counter, List<String> result) {
//		List<String> result = new LinkedList<String>();
		if (ls.isEmpty() || ls.size() == counter || ls.size() == 1) return result;
		if (ls.get(0).length() > ls.get(1).length()) {
			result.add(ls.get(1));
			ls.remove(0);
			counter++;
		}
		else if (ls.get(0).length() < ls.get(1).length()) {
			result.add(ls.get(0));
			ls.remove(1);
			counter++;
		}
		else if (ls.get(0).length() == ls.get(1).length()) {
			result.add(ls.get(0));
			result.add(ls.get(1));
			ls.remove(0);
			ls.remove(1);
			counter++;
			
		}
		
		return getShortestWords(ls, counter, result);
	

}
	

	
	
	
//	public static List<String> getShortestWords( List<String> ls, int counter, int second) {
//			List<String> ret = new LinkedList<String>(ls);
//			if (ret.isEmpty() || ret.size() == (counter)  ) return ret;	//|| ret.size() == 1
//				if (ret.get(0).length() > ret.get(second).length()) ret.remove(0);
//				else if (ret.get(0).length() < ret.get(second).length()) ret.remove(second);
//				else if ((ret.get(0).length() == ret.get(second).length())) {
//					second++;
//				}
////				if(!(ret.get(0).length() == ret.get(1).length())) ret.remove(1);
//
//				counter++;
//			
//			return getShortestWords(ret, counter, second);
//		
//	
//	}

}
