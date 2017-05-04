/**
 * <b>*****TetrisIQ***** </b> <br>
 * Autor: Alexander Werner <br>
 * Projekt: FHL-Training <br>
 * Classe: BTree.java <br>
 * Datum: 02.05.2017 <br>
 * Package: kw19 <br>
 */
package kw19;

public class BTree<T extends Comparable<T>> {

	static <T extends Comparable<T>> void insert(T t, Node tree) {
		if (tree == null)
			return;
		if (tree.value.equals(t))
			return;
		if (t < tree.value) {
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
	
	

}
