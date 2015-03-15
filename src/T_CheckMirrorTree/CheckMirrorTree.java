package T_CheckMirrorTree;

//YES
public class CheckMirrorTree {

	public boolean checkMirror(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if ((root1 == null && root2 != null)
				|| (root1 != null && root2 == null)) { // if any node doesn't
														// have corresponding
														// node in the another
														// tree, return false
			return false;
		}
		// check if left node in one tree is the right node in another tree, and
		// vice versa
		return checkMirror(root1.left, root2.right)
				&& checkMirror(root1.right, root2.left);

	}

	public static void main(String[] args) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.left.right = new Node(3);
		root1.right = new Node(4);

		Node root2 = new Node(1);
		root2.right = new Node(2);
		root2.right.left = new Node(3);
		root2.left = new Node(4);

		CheckMirrorTree i = new CheckMirrorTree();
		System.out.println("Is Mirror Trees : " + i.checkMirror(root1, root2));

	}

}

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
	}
}