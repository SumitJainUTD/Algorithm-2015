package T_DeepestNode;

public class DeepestNode {
	int deepestlevel ;
	int value;
	public int Deep(Node root){
		find(root,0);
		return value;
	}
	public void find(Node root, int level){
		if(root!=null){
			find(root.left, ++level);
			if(level>deepestlevel){
				value = root.data;
				deepestlevel = level;
			}
			find(root.right, ++level);
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
		root.left.left.right.left.left.right = new Node(12);

		DeepestNode dp = new DeepestNode();
		System.out.println("Deapest Left chils is: " + dp.Deep(root));

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

