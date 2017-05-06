/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: BTree.java <br>
 * Datum: 02.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kw19.Node;

public class BTree<T extends Comparable<T>>  {

	// Insert methode um in bäume einzufügen
	static <T extends Comparable<T>> void insert(T t, Node<T> tree) {
		if (tree.value == null || tree == null)
			return;
		if (tree.value.compareTo(t) == 0) {
			if (tree.left == null) {
				tree.left = new Node<T>(t, null, null);
			}
		}
		if (tree.value.compareTo(t) > 0) {
			if (tree.right == null) {
				tree.right = new Node<T>(t, null, null);
			}
		}
		if (tree.value.compareTo(t) < 0) {
			if (tree.left == null) {
				tree.left = new Node<T>(t, null, null);
			}
		}
	}

	public String inorder(Node<T> t) {

		if (t == null)
			return "";
		return inorder(t.left) + t + inorder(t.right);
	}
	


	public static <T extends Comparable<T>> List<T> bsort(List<T> ls) {
		Node<T> tree = new Node<T>(null, null, null); //neuer Baum
		for (T t : ls) {
			insert(t, tree);	//baut den baum aus einer liste
		}
		List<T> ret = tree.buildInOrderList(tree);
		
		
		return ret;

	}

}
