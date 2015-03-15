package T_isBalanced;
//Written

public class IsBalanced {

	public boolean Balanced(Node root) { // This approach is not efficient, at
											// every node you are calculating
											// the height
		if (root != null) {
			int leftH = getHeight(root.left);
			int rightH = getHeight(root.right);
			if (Math.abs(leftH - rightH) > 1) {
				return false;
			}
			return Balanced(root.left) && Balanced(root.right);
		}
		return true;
	}

	public int getHeight(Node x) {
		if (x != null) {
			return 1 + Math.max(getHeight(x.left), getHeight(x.right));
		}
		return 0;
	}

	public int bal(Node root) { // This method is efficient, only one travsal will enough
		if (root != null) { // bottom up approach
			int leftHeight = bal(root.left); // go the extreme left and start moving up
			int rightHeight = bal(root.right);  // if tree is balanced at the node, return its height +1
			if (leftHeight == -1 || rightHeight == -1 // else return -1
					|| Math.abs(leftHeight - rightHeight) > 1) {
				return -1;
			}
			return 1 + Math.max(leftHeight, rightHeight);
		}
		return 0;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		// root.left.left.right.left = new Node(19);

		IsBalanced i = new IsBalanced();
		// System.out.println(i.Balanced(root));
		System.out.println(i.bal(root));

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
