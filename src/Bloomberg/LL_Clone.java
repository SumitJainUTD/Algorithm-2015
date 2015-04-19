package Bloomberg;

public class LL_Clone {

	public static  Node clone(Node head) {
		// head of Clone Linked List
		Node cpyhead = null;
		// create the copy of every Node in original LL
		// and insert it into original LL,
		// Example create a node 1 copy and insert between 1 and 2
		Node orignal = head;
		while(orignal!=null){
			Node n = new Node(orignal.data);
			//assign the head to new list
			if(cpyhead==null){ 
				cpyhead = n;
			}
			n.next = orignal.next;
			orignal.next = n;
			orignal = orignal.next.next;			
		}
		orignal = head;
		//assign the random pointers to the newly created LL
		while(orignal!=null){
//			System.out.println(orignal.data);
			orignal.next.random = orignal.random.next;
			orignal = orignal.next.next;
		}
		//separate the copy list
		Node duplicate = cpyhead;
//		System.err.println(duplicate.data);
		while(duplicate.next!=null){
			duplicate.next = duplicate.next.next;
			duplicate = duplicate.next;
		}
		return cpyhead;		
	}
	public static void display(Node head){
		while(head!=null){
			System.out.print(head.data + " ");
			head= head.next;
		}
	}
	
	
	public static void displayRandom(Node head){
		int x = 0;
		while(head!=null && x<=3){
			System.out.print(head.data + " ");
			head= head.random;
			x++;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		
		head.next = n1;
		head.random = n2;
		
		n1.next = n2;
		n1.random = n3;
		
		n2.next = n3;
		n2.random = n1;
		
		n3.next = null;
		n3.random = head;
		
		Node x = clone(head);
		display(x);
		System.out.print("\nRandom pointers - ");
		displayRandom(x);

	}

}

class Node {
	int data;
	Node next;
	Node random;

	public Node(int data) {
		this.data = data;
		next = null;
		random = null;
	}
}
