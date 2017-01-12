package KW03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

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
//        System.out.println(charStat("http://www.nkode.io/assets/programming/countmychars.txt"));
        try {
            System.out.println(getTxt("http://www.nkode.io/assets/programming/countmychars.txt"));
        } catch (IOException e) {
            // TODO Automatisch generierter Erfassungsblock
            e.printStackTrace();
        }

    }

    public static String getTxt(BufferedReader in, URL url, String result) throws IOException {
        String line = in.readLine();
        String Last = (line != null) ? ((result += line) + "\n") + getTxt(in, url, result): "" ;
        return Last;
    }

    public static String getTxt(String string) throws IOException {
        URL  url = new URL(string);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        return getTxt(in, url, "");
    }

    public static String charStat(URL url) {
        oftenChar(url);
        rareChar(url);
        return "";
    }

    public static String oftenChar(URL url) {

        return "";
    }

    public static String rareChar(URL url) {

        return "";
    }

    public static String decliningChar(URL url) {

        return "";
    }

    public static String oftenUse(URL url) {

        return "";
    }

}
