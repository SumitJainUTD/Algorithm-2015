package LL_IsPalindrome;

public class Palindrone {

	public boolean isPalindrome(Node head){
		Node mid = getMid(head); // get the middle node
		mid.next = reverse(mid.next);
		Node curr = mid.next;
		while(curr!=null){
			if(head.data == curr.data){
				head = head.next;
				curr = curr.next;
			}else{
				return false;
			}
		}
		return true;
		
	}
	public Node reverse(Node x){
		Node prev = null;		
		while(x.next!=null){
			Node y = x.next;
			x.next = prev;
			prev = x;
			x = y;
		}
		x.next = prev;
		return x;
	}
	public Node getMid(Node x){
		Node ptr1 = x;
		Node ptr2 = x;
		int i=0;
		while(ptr2!=null){
			ptr2 = ptr2.next;
			if(i%2==0){
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
			i++;
		}
		return ptr1;
	}
	public void display(Node head){
		Node n=head;
		while(n!=null){
			System.out.print("->" + n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next =  new Node(2);
		head.next.next =  new Node(3);
		head.next.next.next =  new Node(2);
		head.next.next.next.next =  new Node(1);
		
		Palindrone p = new Palindrone();
		System.out.println("List is Palindrome?? " + p.isPalindrome(head));
	}

}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
}
