package T_DeepestLeftLeaf;

public class DeepestLeftLeaf {

	public int deepestLevel = 0;
	public int deepLeftNode;

	public int deepLeft(Node root) {
		find(root, 0, true);
		return deepLeftNode;
	}

	public void find(Node root, int level, boolean left) {
		if (root != null) {
			find(root.left, ++level, true);
			if (left && deepestLevel < level) {// check if it a left child and
												// current level is greater than
												// deepest level
				deepLeftNode = root.data; // update the deepest left node
				deepestLevel = level;   // update the deepest level
			}
			find(root.right, level, false);
		}
	}

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.right.left = new Node(9);
		root.left.left.right = new Node(8);
		root.left.left.right.left = new Node(10);
		root.left.left.right.left.left = new Node(11);

		DeepestLeftLeaf dp = new DeepestLeftLeaf();
		System.out.println("Deapest Left chils is: " + dp.deepLeft(root));

	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
