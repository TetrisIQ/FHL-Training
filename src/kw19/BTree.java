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

	//Insert methode um in bäume einzufügen 
	static <T extends Comparable<T>> void insert(T t, Node<T> tree) {
		if (tree == null) return;
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
//		if (n == null) return "";
//		return inorder(n.left) + n + inorder(n.right);
		
		if (t == null) return "";
		return inorder(t.left) + t + inorder(t.right);
		}
	
		
	

}
