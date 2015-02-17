package LL_reverseDLL;

public class reverseDLL {

	public static Node head=null; 
	public static Node tail = null;
	public static int size = 0;

	public void reverse(Node n, Node prev) {
		 if (n == null) { head = prev; return; }
		 reverse(n.next, n);
		 n.next = prev;
		}
	public void print(Node head){
		Node current = head;
		while(current!=null){
			System.out.print("->" + current.data);
			
			current = current.next;
		}
	}
	
	public void add(int data){
		Node n = new Node(data);
		if(head==null){
			head = n;
			tail = n;
		}else{
			head.prev = n;
			n.next = head;
			head = n;
		}
		size++;
	}
	public static void main(String args[]){
		reverseDLL r = new reverseDLL();
		r.add(1);r.add(2);r.add(3);r.add(4);
		r.print(head);		
		System.out.println("");
		r.reverse(head, null);
		r.print(head);
	}
}

class Node{
	int data;
	Node next;
	Node prev;
	public Node(int data){
		this.data =data;
		this.next = null;
		this.prev = null;
	}
}