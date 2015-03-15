package T_LeftSumTree;

public class LeftSumTree {
	// Given a binary tree, change the value in each node to sum of all the
	// values in the nodes on the left side of the node.
	//http://www.careercup.com/question?id=5073112714444800
	public int leftSTree(Node root, boolean left){
		if(root!=null){
			int leftSum = leftSTree(root.left, true);
			if(left){
				int newRootData = root.data + leftSum;
				root.data = newRootData;
			}			
			System.out.print(" " + root.data);
			int rightSum = leftSTree(root.right, false);
//			return newRootData + rightSum;
		}
		return 0;
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
//		root.left.left = new Node(4);
//		root.left.right = new Node(5);
//		root.right.left = new Node(6);
//		root.right.right = new Node(7);
//		root.left.right.left = new Node(9);
//		root.left.left.right = new Node(8);
//		root.left.left.right.left = new Node(10);
//		root.left.left.right.left.left = new Node(11);
//		root.left.left.right.left.left.right = new Node(12);

		LeftSumTree dp = new LeftSumTree();
		dp.leftSTree(root, true);

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