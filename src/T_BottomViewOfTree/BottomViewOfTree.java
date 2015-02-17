package T_BottomViewOfTree;

import java.util.Set;
import java.util.TreeMap;

public class BottomViewOfTree {
	public static TreeMap<Integer, Integer> ht = new TreeMap<>();;

	public Node BottomView(Node root, int level) {
		if (root == null)
			return null;
		ht.put(level, root.data); // keep updating the recently visited node.

		Node x = BottomView(root.left, --level);
		if (x == null) {
			level++;
		}
		return BottomView(root.right, ++level);
	}

	public void display() {   // print the bottom view.
		Set<Integer> keys = ht.keySet();
		for (Integer key : keys) {
			System.out.print(ht.get(key) + " ");
		}

	}

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right = new Node(5);
		// root.right.left = new Node(6);
		root.right.right = new Node(7);

		BottomViewOfTree p = new BottomViewOfTree();
		p.BottomView(root, 0);
		p.display();
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
