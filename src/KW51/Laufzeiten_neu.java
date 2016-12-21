package KW51;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: Aufgabe143.java <br>
 * Datum: 07.12.2016 <br>
 * Package: KW51 <br>
 */
public class Laufzeiten_neu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        while (true) {
            System.out.println("Wieviele Zahlen sollen sortiert werden (0 für Programmende)? ");
            int limit = in.nextInt();
            if (limit == 0)
                break;
            System.out.println(sort(limit));
        }

        in.close();

    }

    /**
     * Vergleicht die Laufzeiten von BinSort und Bubblesort mit den Selben
     * zufällig generierten Zahen
     * 
     * @param limit
     *            Die anzahl der zahlen die zufällig generiert werden sollen
     * @return Die Laufzeiten der Sortieralgorithmen
     */
    public static String sort(int limit) {
        StringBuilder sb = new StringBuilder();
        List<Integer> li = new LinkedList<Integer>(generateRandoms(limit));
        // Start Bubblesort
        long start1 = System.currentTimeMillis();
        List<Integer> bubblesort = (bubblesort(li)); // wird nicht gebraucht
                                                     // weil wir
        // nur die laufzeit vergleichen
        // wollen und uns die listen
        // nicht sortiert ausgeben
        // lassen wollen
        long end1 = System.currentTimeMillis();
        sb.append("Laufzeit für bubbleSort bei " + limit + " Zufallszahlen: ").append((end1 - start1))
                .append(" Millisekunden").append("\n").append("\n");
        // Ende Bubbelsort

        // Start binSort
        long start2 = System.currentTimeMillis();
        List<Integer> binsort = (binSort(li)); // wird nicht gebraucht weil wir
                                               // nur die
        // laufzeit vergleichen wollen und uns
        // die listen nicht sortiert ausgeben
        // lassen wollen
        long end2 = System.currentTimeMillis();
        sb.append("Laufzeit für binSort bei " + limit + " Zufallszahlen: ").append((end2 - start2))
                .append(" Millisekunden").append("\n").append("\n");
        // Ende binSort

        return sb.toString();
    }

    /**
     * BinSort Sortieralgorithmus, Legt eine Baumstruktur an <br>
     * und durchläuft diese inorder
     * 
     * @param s
     *            Die Zu sortierende Liste
     * @return Die Sortierte Liste
     */
    public static List<Integer> binSort(List<Integer> s) {
        if (s.isEmpty()) return Collections.emptyList();
        Node Tree = treebuilder(s);
        return inorder(Tree);
    }

    /**
     * Erzeugt einen Baumstruktur für den BinSort Algorithmus
     * 
     * @param s
     *            Die Liste die zu einem Baumstruktur überführt werden soll
     * @return Die Baumstruktur
     */
    public static Node treebuilder(List<Integer> s) {
        Node ret = new Node(s.get(0), null, null);
        s.remove(0);
        for (Integer i : s) {
            insert(i, ret);
        }
        return ret;
    }

    /**
     * Inorder Durchlauf der Baumstruktur
     * 
     * @param n
     *            Die Baumstruktur die durchlaufen werden soll
     * @return eine Sortierte Liste aller Knoten
     */
    public static List<Integer> inorder(Node n) {
        if (n == null)
            return Collections.emptyList();
        List<Integer> res = new LinkedList<>();
        res.addAll(inorder(n.left));
        res.add(n.value);
        res.addAll(inorder(n.right));
        return res;
    }

    /**
     * Zum einfügen in eine Bestehende Baumstruktur
     * 
     * @param v
     *            Der wert der eingefügt werden soll
     * @param tree
     *            Der Baum in den eingefügt werden soll
     */
    static void insert(int v, Node tree) {
        if (tree == null)
            return;
        if (tree.value == v)
            return;
        if (v < tree.value) {
            if (tree.left == null) {
                tree.left = new Node(v, null, null);
            } else
                insert(v, tree.left);
        }
        if (v > tree.value) {
            if (tree.right == null) {
                tree.right = new Node(v, null, null);
            } else
                insert(v, tree.right);
        }
    }

    /**
     * Bubblsort Sortieralgorithmus, Geht jedes element der Liste Sequenziell
     * durch und vertauscht jeweils 2 Elemnte
     * 
     * @param li
     *            Die Zu sortierende Liste
     * @return Die Sortierte Liste
     */
    public static List<Integer> bubblesort(List<Integer> li) {
        List<Integer> ret = new LinkedList<Integer>(li);
        int tmp;
        for (int i = 0; i < ret.size(); i++) {
            for (int j = i + 1; j < ret.size(); j++) {
                if (ret.get(i) > ret.get(j)) {
                    tmp = ret.get(j);
                    ret.set(j, ret.get(i));
                    ret.set(i, tmp);

                }

            }

        }

        return ret;
    }

    /**
     * Generiert zufällige zahlen bis 1 Millionen
     * 
     * @param n
     *            Die Anzahl der zufällig generierten Zahlen
     * @return Eine Liste mit Zufällig generierten zahlen
     */
    public static List<Integer> generateRandoms(int n) {

        List<Integer> ret = new LinkedList<Integer>();
        Stream<Integer> rand = Stream.generate(() -> (int) (Math.random() * 1000000));
        ret.addAll(rand.limit(n).collect(Collectors.toList()));
        return ret;
    }
}

/**
 * Zum speichern von Knoten und ihren Eigenschaften
 */
 class Node {
 public Node left;
 public Node right;
 public int value;

 /**
 * Konstruktor von Bäume
 *
 * @param v
 * Der Wert des Knoten
 * @param l
 * Der linke Kindknoten
 * @param r
 * Der rechte Kindknoten
 */
 public Node(int v, Node l, Node r) {
 value = v;
 left = l;
 right = r;
 }

 /**
 * toString Methode <br>
 * Gibt den Wert des obersten Wurzelknoten aus
 */
 public String toString() {
 return value + " ";
 }
 }
