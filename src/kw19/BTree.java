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

	// Insert methode um in bäume einzufügen

	public static <T extends Comparable<T>> String inorder(Node<T> tree) {

		if (tree == null)
			return "";
		return inorder(tree.left) + tree + inorder(tree.right);
	}

	public static <T extends Comparable<T>> List<T> bsort(List<T> ls) {
		Node<T> tree = buildTree(ls);

		List<T> ret = new LinkedList<>();
		ret = buildInOrderList(tree);

		return ret;

	}

	public static <T extends Comparable<T>> Node<T> buildTree(List<T> ls) {
		Node<T> tree = new Node<T>(null, null, null); // neuer Baum
		for (T t : ls) {
			insert(t, tree); // baut den baum aus einer liste
		}
		return tree;
	}

	static <T extends Comparable<T>> void insert(T t, Node<T> tree) {
		if (tree == null)
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
