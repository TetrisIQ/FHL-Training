/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Lamdas.java <br>
 * Datum: 21.12.2016 <br>
 * Package: KW02 <br>
 */

package KW02;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lamdas {

    public static void main(String[] args) {
        // TODO Automatisch generierter Methodenstub

        BiFunction<Integer, String, String> link = (i,s) -> i <=0 ?"": Stream.generate(() -> s).limit(i).collect(Collectors.joining());
        System.out.println(link.apply(3, "Hallo"));
        
        
    }

}
