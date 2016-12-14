package OldProjekts;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 10.7
	Classe: Armstrong.java
	Datum: 27.11.2016
 */

public class Armstrong {

	/**
	 * @param args
	 * @author Alexander
	 */
	public static void main(String[] args) {

		//System.out.println(isArmstrong(153));
		 long start = System.currentTimeMillis();
		 int n = 1000000000;
		 System.out.println("Alle Armstrong-Zahlen bis " + n + ": ");
		 List<Integer> lance = listArmstrong(n);
		 Map<Integer, List<Integer>> grouped = groupByLength(lance);
		 String pretty = prettyPrint(grouped);
		 System.out.println(pretty);
		 long end = System.currentTimeMillis();
		 long dif = end - start;
		 System.out.println((dif / 1000 / 60) + " m :" + (dif / 1000 % 60)+" sek. \n" +dif+" Millisekunden" );
	}
	
	/**
	 * prettyPrint Gibt die geordnete liste wie gefordert aus.<br>
	 * Die Werte sind nach länge der zahlen sortiert
	 * @param grouped Die Map die die geordneten Zahlen enthält <br>
	 * Die Map darf nicht <b>Null</b> sein
	 * @return Die Geordneten Zahlen okay 
	 */
	public static String prettyPrint(Map<Integer, List<Integer>> grouped) {
		StringBuilder sb = new StringBuilder();
		List<Integer> keys = new LinkedList<Integer>(grouped.keySet());
		Collections.sort(keys);
		sb.append("{\n");
		for (Integer key : keys) {
			List<Integer> val = grouped.get(key);
			sb.append("   ").append(key).append("=> [");
			for (int i = 0; i < val.size(); i++) {
				sb.append(val.get(i));
				if (i != val.size() -1) sb.append(", ");
					
				
			}
			sb.append("]\n");
			
		}
		sb.append("}");
		
		return sb.toString();
	}
	
	/**
	 * groupByLength groupiert zahlen nach ihrer länge
	 * @param lance Die zu sortierende Liste
	 * @return Eine geordnete Map 
	 */
	public static Map<Integer, List<Integer>> groupByLength(List<Integer> lance) {
		Map<Integer, List<Integer>> grouped = new HashMap<>(); 
		
		for (Integer num : lance) {
			String temp = String.valueOf(num);
			int key = temp.length();
			List<Integer> numbers = grouped.get(key);
				if (numbers == null) {
					numbers = new LinkedList<>();
					grouped.put(key, numbers);
			}
			numbers.add(num);
		}
		return grouped;
	}

	/**
	 * listArmstrong erzeugt eine liste mit allen Narzistischen Armstrongzahlen <br>
	 * bis zu einem grenzwert
	 * @param limit Der grenzwert bis zu welchem die Armstrongzahlen ermittelt werden
	 * @return Eine Liste mit Armstrongzahlen
	 */
	public static List<Integer> listArmstrong(int limit) {
		List<Integer> ls = new LinkedList<Integer>();
		for (int i = 0; i <= limit; i++) {
			if (isArmstrong(i)) {
				ls.add(i);
			}
		}
		return ls;
	}
	
	/**
	 * isArmstrong ermittelt ob eine Zahl eine Narzistische Armstrongzahl ist
	 * @param a Die Zahl die Überprüft werden soll
	 * @return <b>True</b> wenn die Zahl eine Narzistische Armstrongzahl ist <br>
	 * <b>False</b> wenn die Zahl keine Narzistische Armstrongzahl ist
	 */
	public static boolean isArmstrong(int a) {
		int i = 0;
		double x =0;
		double solve=0;
		char[] numbers = Integer.toString(a).toCharArray();		//Erst die zahlen in von einem intiger in einen string und dann in ein char array // denn ein String ist ein array aus Char's
		double l = numbers.length;
					//System.out.println(l);

					//System.out.println(solve);
			while (i < l) {
				x = Integer.parseInt(Character.toString(numbers[i]));
				double y = Math.pow(x, l);
				solve = solve +y;
				i = i + 1;		
			}
			return solve == a ? true : false;
	}

}
