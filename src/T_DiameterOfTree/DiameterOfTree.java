package T_DiameterOfTree;

public class DiameterOfTree {

	public int getHeight(Node root) {
		if (root != null) {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}
		return 0;
	}

	public int Diameter(Node root) {
		if (root != null) {
			// get the left and right subtree height
			int leftH = getHeight(root.left);
			int rightH = getHeight(root.right);

			// get the left diameter and right diameter recursively.
			int leftDiameter = Diameter(root.left);
			int rightDiameter = Diameter(root.right);

			// get the max leftsubtree, rightsubtree, longest path goes through
			// root.
			return getMax(leftH + rightH + 1, leftDiameter, rightDiameter);
		}
		return 0;
	}

	public int getMax(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.left.right = new Node(7);
		root.left.left.left = new Node(8);

		DiameterOfTree d = new DiameterOfTree();
		System.out.println("Diameter of Tree: " + d.Diameter(root));

	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}
