package GraphBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class GraphBFS {
	public static void main(String args[]) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(3, 4);
		g.addEdge(2, 3);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.BFS(0);
		
//		Node head = g.array[4].head;
//		while(head!=null){
//			System.out.println(head.src + "  " + head.dest);
//			head = head.next;
//		}
	}
}

class Node {
	int src;
	int dest;
	Node next;

	public Node(int s, int d) {
		src = s;
		dest = d;
		next = null;
	}
}

class adjList {
	Node head;
}

class Graph {
	int V;
	adjList[] array;

	public Graph(int V) {
		this.V = V;
		array = new adjList[V];

		for (int i = 0; i < V; i++) {
			array[i] = new adjList();
			array[i].head = null;
		}
	}

	public void addEdge(int src, int dest) {
		Node n = new Node(src, dest);
		n.next = array[src].head;
		array[src].head = n;
	}

	public void BFS(int startVertex) {
		boolean [] visited = new boolean[V];
		Queue<Integer> s = new LinkedList<Integer>();	
		
		s.add(startVertex);
		while(s.isEmpty()==false){
			int n = s.poll();
			System.out.print(" " + n);
			visited[n] = true;
			Node head = array[n].head;
			while(head!=null){				
				if(visited[head.dest]==false){
					s.add(head.dest);
					visited[head.dest] = true;
				}
				head = head.next;
			}
		}
		}
	}
