package KW03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        // System.out.println(charStat("http://www.nkode.io/assets/programming/countmychars.txt"));
        try {
            System.out.println(getTxt("http://www.nkode.io/assets/programming/countmychars.txt"));

        } catch (IOException e) {
            // TODO Automatisch generierter Erfassungsblock
            e.printStackTrace();
        }

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
