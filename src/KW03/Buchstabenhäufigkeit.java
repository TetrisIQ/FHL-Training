package KW03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Buchstabenhäufigkeit.java <br>
 * Datum: 11.01.2017 <br>
 * Package: KW03 <br>
 */
public class Buchstabenhäufigkeit {

    public static void main(String[] args) {
        try {
            System.out.println(charStat("http://www.nkode.io/assets/programming/countmychars.txt"));
        } catch (IOException e) {
            // TODO Automatisch generierter Erfassungsblock
            e.printStackTrace();
        }

    }

    public static String charStat(String string) throws IOException {

        String work = getTxt(string);
        Map<String, List<Double>> dummy = new HashMap<String, List<Double>>();
        Map<String, List<Double>> map = MapRate(work, dummy, 0, countChar(work));
        

        return map.toString();
    }
    
    
    
    public static String PrettyPrint(Map<String, Double> map) {
        List<Double> keys = new LinkedList<Double>();
        BiPredicate<Double, Double> test = (a,b) -> a > b ? true : false;
//        test.test(map.get);
        return  "";
    }

    public static double countChar(String string) {
        int length = string.replaceAll(" ", "").length();
        double dlength = length;
        return dlength;
    }

    public static Map<String, List<Double>> MapRate(String string, Map<String, List<Double>> ret, int i, double max) {
        String[] counts = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", ".", ",", "-", ":","ß" };

        Double j = (double) (string.length() - (string.replaceAll(counts[i], "").length()));
        BinaryOperator<Double> occur = (a,b) -> (100 /b) * a;
        List<Double> li = new LinkedList<Double>();
        li.add(occur.apply(j, max));
        ret.put(counts[i], li);
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
