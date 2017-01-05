package KW02;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: ZweiDArray.java <br>
 * Datum: 19.12.2016 <br>
 * Package: KW02 <br>
 */
public class ZweiDArray {
    
    public static void main(String[] args) {
        // TODO Automatisch generierter Methodenstub
        int[][] test = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, }, { 11, 12, 13, 14, 15 } };
        System.out.println(zeilenweise(test));
        int[][] tests = { { 1, 2, 3, 4, 5 }, {}, { 11, 12, 13, 14, 15 } };
        System.out.println(zeilenweise(tests));

        int[][] test1 = { { 1, 2, 3, 4, 5 }, null, { 11, 12, 13, 14, 15 } };
        System.out.println(zeilenweise(test1));
    }

    /**
     * Durchläuft das Array Rekursiv
     * 
     * @param xs
     *            Das Array
     * @return Das Array als Zeichenkette
     */
    public static String zeilenweise(int[][] xs) {
        if (xs.length == 0 || xs == null)
            return "";
        return zeilenweise(0, xs);
    }

    /**
     * Durchläuft das Array Rekusiv
     * 
     * @param c
     *            Counter für die Aktuelle Reihe
     * @param xs
     *            Das 2D Array
     * @return Das Array als Zeichenkette
     */
    public static String zeilenweise(int c, int[][] xs) {
        if (xs.length == c)
            return "";
        StringBuilder sb = new StringBuilder();
        sb.append(row(0, "-", xs[c])).append("\n");
        sb.append(zeilenweise(c + 1, xs));
        return sb.toString();
    }

    /**
     * Durchläuft ein eindimensionales Array Rekursiv
     * 
     * @param c
     *            Counter für die Aktuelle Spalte
     * @param sep
     *            Der Seperator, der Zwischen den Zeichen Stehen soll
     * @param xs
     *            Das Eindimensionale Array
     * @return Das Array als Zeichenkette
     */
    public static String row(int c, String sep, int[] xs) {
        try {
            if (xs.length == c || xs == null)
                return "";
        } catch (Exception e) {
            return "";
        }
        return xs[c] + ((xs.length - 1) == c ? "" : sep) + row(c + 1, sep, xs);

    }

}
