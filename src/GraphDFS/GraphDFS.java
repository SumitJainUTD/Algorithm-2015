package GraphDFS;

import java.util.Stack;

public class GraphDFS {

	
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(3, 4);
		g.addEdge(2, 3);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.DFS(0);
	}

}
class Graph{
	int V; // number of vertices
	adjaList list [];
	
	public Graph(int V){
		this.V = V;
		list = new adjaList[V];
		//initialize the list and mark the head as null
		for(int i=0;i<V;i++){
			list[i] = new adjaList();
			list[i].head = null;
		}
		
	}
	public void addEdge(int source, int destination){
		//first create the node for the destination
		Node n = new Node(destination);
		//add the node to the Linked List for that particular source
		n.next = list[source].head;
		list[source].head = n;		
	}	
	public void DFS(int startVertex){
		Stack<Integer> s = new Stack<Integer>();
		boolean [] visited = new boolean[V];		
		s.add(startVertex);
		while(s.isEmpty()==false){
			int n = s.pop();
			System.out.print(" " + n);
			visited[n] = true;
			Node head = list[n].head;
			while(head!=null){				
				if(visited[head.destination]==false){
					s.add(head.destination);
					visited[head.destination] = true;
				}
				head = head.next;
			}
		}
	}
}

class adjaList{ //adjacency list
	Node head;
}
class Node{
	int destination;
	Node next;
	public Node(int dest){
		this.destination = dest;
		next = null;
	}
}
