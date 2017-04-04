package KW03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import com.sun.org.apache.xml.internal.security.encryption.EncryptedType;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Buchstabenhäufigkeit.java <br>
 * Datum: 11.01.2017 <br>
 * Package: KW03 <br>
 */
public class NeuerVersuchBuchstaben {

    public static void main(String[] args) {

        BinaryOperator<Double> occur = (a, b) -> (100 / b) * a;

        try {
            System.out.println(charStat("http://www.nkode.io/assets/programming/countmychars.txt"));
        } catch (IOException e) {
            // TODO Automatisch generierter Erfassungsblock
            e.printStackTrace();
        }

    }

    public static String charStat(String string) throws IOException {

        String work = getTxt(string);
        Map<String, Integer> dummy = new TreeMap<String, Integer>();
        Map<String, Integer> map = MapRate(work, dummy, 0, countChar(work));
//        stats(map, work);
        return "";

    }

//    public static String stats(Map<String, Integer> map,String string) {
//        StringBuilder sb = new StringBuilder();
//        BinaryOperator<Double> occur = (a, b) -> (100 / b) * a;
//        Set<Entry<String, Integer>> set = map.entrySet();
//        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
//        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
//        {
//            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
//            {
//                return (o2.getValue()).compareTo( o1.getValue() );
//            }
//        }  );
//        
//        for(Map.Entry<String, Integer> entry:list){
////            sb.append("- '").append(entry.getKey()+"' : "+occur.apply(entry.getValue(),countChar(string)));
//        }
//    }
        
    

    public static Map<String, List<Double>> ConvertInList(Map<String, Double> map) {
        Map<String, List<Double>> res = new HashMap<String, List<Double>>();
        List<String> sorted = new LinkedList<String>();
        // map.forEach((k,v) -> res.put(k, sorted.addAll))) ;
        return res;
    }

    public static String uglyPrint(Map<String, Double> map) {
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append("- ").append(k).append(" ").append(v).append("\n"));

        return sb.toString();
    }

    public static double countChar(String string) {
        int length = string.replaceAll(" ", "").length();
        double dlength = length;
        return dlength;
    }

    public static Map<String, Integer> MapRate(String string, Map<String, Integer> ret, int i, double max) {
        String[] counts = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", ",", "-", ":", "ß" };

        int j = (string.length() - (string.replaceAll(counts[i], "").length()));

        ret.put(counts[i], j);
        i++;

        return i > counts.length - 1 ? ret : MapRate(string, ret, i, max);
    }

    public static String getTxt(BufferedReader in, String result) throws IOException {
        String inputLine = "";
        inputLine = in.readLine();
        return (inputLine != null) ? result += (inputLine + "\n") + getTxt(in, result) : "";
    }

    public static String getTxt(String string) throws IOException {
        URL url = new URL(string);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String ret = getTxt(in, "");
        in.close();
        return ret;
    }

}
