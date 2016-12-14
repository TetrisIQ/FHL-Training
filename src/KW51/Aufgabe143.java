package KW51;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aufgabe143 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean stop = true;
		while (stop) {
			int input = in.nextInt();
			if (input != 0) sort(input);
			else stop = false;
		}
		in.close();
		
		
	}
	
	public static String sort(int limit) {
		StringBuilder sb = new StringBuilder();
		List<Integer> li = new LinkedList<Integer>(generateRandoms(limit));
//		Start Bubblesort
		long start1 = System.currentTimeMillis();
		String bubblesort = (bubblesort(li));
		long end = System.currentTimeMillis();
		long laufzeit = end - start1; // gemessene
		
		
		
		return sb.toString();
	}
	
	public static String binSort(List<Integer> s) {
		return null;
	}
	public static String bubblesort(List<Integer> s) {
		return null;
	}
	
	
	
	
	
	/**
	 * Generiert zufällige zahlen zwischen 2 Werten
	 * @param start Der start Wert
	 * @param end Der end Wert
	 * @param n Die Anzahl der zufällig generierten Zahlen
	 * @return Eine Liste mit Zufällig generierten zahlen
	 */
	public static List<Integer> generateRandoms( int n) {

		List<Integer> ret = new LinkedList<Integer>();
		Stream<Integer>	rand = Stream.generate(() -> ((int) Math.random() * n)); 	
		ret.addAll(rand.limit(n).collect(Collectors.toList()));	
		return ret;
	}

	/**
	 * Zählt die Kanten!
	 * @param n Die Baumstruktur in der Gezählt werden soll
	 * @return Die Anzahl der Kanten
	 */
	public static int countEdges(Node n){
		if (n == null) return 0;
		return (n.left!=null?1:0) + countEdges(n.left) + (n.right!=null?1:0) +countEdges(n.right);
	}
	
	/**
	 * Zählt die Anzahl der Knoten!
	 * @param n Die Baumstruktur in der Gezählt werden soll
	 * @return Die Anzahl der Knoten
	 */
	public static int countNode(Node n) {
		if (n == null) return 0;
		return countEdges(n)+1;
	}
	


	/**
	 * Inorder Durchlauf der Baumstruktur
	 * @param n Die Baumstruktur die durchlaufen werden soll
	 * @return eine Sortierte Liste aller Knoten
	 */
	public static String inorder(Node n) {
		if (n == null) return "";
		return inorder(n.left) + n + inorder(n.right);
		}

	/**
	 * Zum einfügen in eine Bestehende Baumstruktur
	 * @param v Der wert der eingefügt werden soll
	 * @param tree Der Baum in den eingefügt werden soll
	 */
	static void insert(int v, Node tree) {
		if (tree == null) return;
		if (tree.value == v) return;
		if (v < tree.value) {
			if (tree.left == null) {
				tree.left = new Node(v,	null, null);
			}
			else
				insert(v, tree.left);
			}
		if (v > tree.value) {
			if (tree.right == null) {
				tree.right = new Node(v,null,null);
			}
				else insert(v, tree.right);
		}
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
	 * @param v Der Wert des Knoten
	 * @param l Der linke Kindknoten
	 * @param r Der rechte Kindknoten
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
