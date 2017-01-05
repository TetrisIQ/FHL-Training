package KW02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Html.java <br>
 * Datum: 05.01.2017 <br>
 * Package: KW02 <br>
 */

public class Html {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Dies", "ist", "ein", "Beispiel");
        System.out.println(toHtmlList(strings));
        System.out.println(" ");

    }

    public static String toHtmlList(List<String> ls) {
        Function<String, String> li = s -> "<li>" + s + "</li>";
        return "<ul>\n" + ls.stream().map(li).collect(Collectors.joining("\n")) + "\n</ul>";
    }
}
