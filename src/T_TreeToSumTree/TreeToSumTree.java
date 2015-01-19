package T_TreeToSumTree;

public class TreeToSumTree {

	public int SumTree(Node root){
		if(root!=null){
			int left = SumTree(root.left);//take the left tree sum
			int right = SumTree(root.right);//take the right tree sum
			int retData = root.data+left+right; // return data left+right+root
			root.data = left+right; //update the root with left + right
			System.out.print(root.data + " ");
			return retData; //return 
		}
		return 0;
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);			
			display(root.right);
			System.out.print(root.data + "  " );
		}
	}
	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(-2);
		root.right = new Node(-3);
		root.left.left = new Node(4);
		root.left.right = new Node(-5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		TreeToSumTree t = new TreeToSumTree();
		System.out.print("Original Tree ");
		t.display(root);
		System.out.println();
		t.SumTree(root);
	}
}
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
	}
}
