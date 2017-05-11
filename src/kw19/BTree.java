/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: BTree.java <br>
 * Datum: 02.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;

import java.util.LinkedList;
import java.util.List;
import kw19.Node;

public class BTree<T extends Comparable<T>> {

	/**
	 * Inorder durchlauf eines Sortierten Baumes
	 * 
	 * @param tree
	 *            Der baum der Sortiert werden soll
	 * @return Den Baum sortiert als String
	 */
	public static <T extends Comparable<T>> String inorder(Node<T> tree) {

		if (tree == null)
			return "";
		return inorder(tree.left) + tree + inorder(tree.right);
	}

	/**
	 * Sortiert eine Liste indem ein sortierter Binär Baum aufgebaut wird
	 * 
	 * @param ls
	 *            Eine Liste mit zu sortierenden elementen
	 * @return Eine Liste mit den Sortierten Elementen
	 */
	public static <T extends Comparable<T>> List<T> bsort(List<T> ls) {
		Node<T> tree = buildTree(ls);

		List<T> ret = new LinkedList<>();
		ret = buildInOrderList(tree);

		return ret;

	}

	/**
	 * Baut einen Baum aus Einer Liste auf
	 * 
	 * @param ls
	 *            Eine Liste aus der der Baum gebaut werden soll
	 * @return Ein Sortierten Baum
	 */
	private static <T extends Comparable<T>> Node<T> buildTree(List<T> ls) {
		Node<T> tree = new Node<T>(null, null, null); // neuer Baum
		for (T t : ls) {
			insert(t, tree); // baut den baum aus einer liste
		}
		return tree;
	}

	/**
	 * Fügt eine element eienem Baum hinzu
	 * 
	 * @param t
	 *            das Element das hinzugefügt werden soll
	 * @param tree
	 *            Der Baum zu dem hinzugefügt werden soll
	 */
	static <T extends Comparable<T>> void insert(T t, Node<T> tree) {
		if (tree == null)
			return;
		if (t == null)
			return;
		if (tree.value == null || t.compareTo(tree.value) == 0)
			if (tree.value == null)
				tree.value = t;
			else if (tree.left == null) {
				tree.left = new Node<T>(t, null, null);
			} else
				insert(t, tree.left);
		if ((!(tree.value == null)) && t.compareTo(tree.value) > 0) {
			if (tree.left == null) {
				tree.left = new Node<T>(t, null, null);
			} else
				insert(t, tree.left);
		}
		if ((!(tree.value == null)) && t.compareTo(tree.value) < 0) {
			if (tree.right == null) {
				tree.right = new Node<T>(t, null, null);
			} else
				insert(t, tree.right);
		}
	}

	/**
	 * Geht einen Baum inOrder durch und erzeugt eine Liste
	 * 
	 * @param node
	 *            Der Baum der zu einer Liste gewandelt werden soll
	 * @return Eine sortierte Liste
	 */
	public static <T extends Comparable<T>> List<T> buildInOrderList(Node<T> node) {
		List<T> ret = new LinkedList<>();
		if (node == null)
			return ret;
		ret.addAll(buildInOrderList(node.left));
		ret.add(node.value);
		ret.addAll(buildInOrderList(node.right));
		return ret;

	}

}
