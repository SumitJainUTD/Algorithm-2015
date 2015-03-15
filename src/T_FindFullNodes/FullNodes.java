package T_FindFullNodes;

public class FullNodes {

	public void FindFullNodes(Node root) {
		// do the traversal and print all the nodes which has left and right
		// child
		if (root != null) {
			FindFullNodes(root.left);
			if (root.left != null && root.right != null) {
				System.out.print(root.data + " ");
			}
			FindFullNodes(root.right);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(8);

		FullNodes f = new FullNodes();
		System.out.print("Full Nodes are ");
		f.FindFullNodes(root);

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
