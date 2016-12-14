/**
	*****alex*****
	Autor: Alexander Werner
	Projekt: 13.2
	Classe: Baum.java
	Datum: 13.12.2016
 */

public class Baum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node tree = new Node(5, new Node(3, new Node(1, null, null), new Node(4, null, null)),
				new Node(8, new Node(6, null, null), new Node(9, null, null)));
		
		
		System.out.println("Die Anzahl der Kanten: " + countEdges(tree));
		System.out.println("Die Anzahl der Knoten: " + countNode(tree));
		System.out.println("Die Höhe des Baumes  : " + height(tree));
		System.out.println("Inorder durchlauf    : " + inorder(tree));
		System.out.println("");
		
//		Node tree2 = tree;
//		insert(10, tree2);
//		insert(11, tree2);
//		insert(12, tree2);
//		insert(13, tree2);
//
//		System.out.println("Die Anzahl der Kanten: " + countEdges(tree2));
//		System.out.println("Die Anzahl der Knoten: " + countNode(tree2));
//		System.out.println("Die Höhe des Baumes  : " + height(tree2));
//		System.out.println("Inorder durchlauf    : " + inorder(tree2));
//		System.out.println("");
		
		

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
	 * Gibt die höhe des Baumes aus
	 * @param n Die Baumstruktur dessen höhe bestimmt werden soll
	 * @return Die höhe der Baumstruktur
	 */
	public static int height(Node n) {
		if (n == null) return 0;
		return Math.max(rheight(n), lheight(n)) + 1;
	}
	
	/**
	 * Gibt die höhe des Rechten Teilbaumes aus
	 * @param n Die Baumstruktur dessen höhe bestimmt werden soll
	 * @return Die höhe des Rechten Teilbaumes
	 */
	public static int rheight(Node n) {
		if (n == null) return 0; 
		return (n.right!=null?1:0)+rheight(n.right);
	}
	
	/**
	 * Gibt die höhe des Linken Teilbaumes aus
	 * @param n Die Baumstruktur dessen höhe bestimmt werden soll
	 * @return Die höhe des Linken Teilbaumes
	 */
	public static int lheight(Node n) {
		if (n == null) return 0; 
		return (n.left!=null?1:0)+ lheight(n.left);
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