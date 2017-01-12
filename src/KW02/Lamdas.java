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
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lamdas {
    
    /**
     * 
     * 
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Automatisch generierter Methodenstub

        BiFunction<Integer, String, String> link = (i,s) -> i <=0 ?"": Stream.generate(() -> s).limit(i).collect(Collectors.joining());
        System.out.println(link.apply(3, "Hallo"));
        
        Function<String, Integer> count = s -> s == null ? 0 : s.length();
        System.out.println(count.apply("1234567"));
//        System.out.println(count.apply("Hallo"));
//        System.out.println(count.apply(null));
//        System.out.println(count.apply("World"));
        
        Predicate<String> even = s -> s == null ? false : (s.length() % 2 == 0 ? true : false);
        System.out.println(even.test("TeST"));
        
//      Predicate<String> uneven = s -> s == null ? false : (s.length() % 2 == 0 ? false : true);
        Predicate<String> uneven = s -> s == null ? false : !even.test(s);
        System.out.println(uneven.test(null));
        
        BinaryOperator<Double> avg = (i,j) -> j == null ? 0.0 : i == null ? 0 : (i+j)/2;
        System.out.println(avg.apply(5.0, 6.0));
        System.out.println(avg.apply(null, 6.0));
        System.out.println(avg.apply(5.0, null));
        
//        BiFunction<String, String, Integer> shortest = (s,a) -> s.length() == a.length() ? 0 : (s.length() > a.length() ? 2 : 1);
        BinaryOperator<String> shortest = (s,a) -> s.length() == a.length() ? "Gleichlang" : (s.length() > a.length() ? a : s);
        System.out.println(shortest.apply("h", "h"));
        
    }

}
