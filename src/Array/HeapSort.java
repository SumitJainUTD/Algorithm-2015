package Array;

public class HeapSort {
	int size;
	int[] Heap;
	int position;

	public HeapSort(int size) {
		this.size = size;
		Heap = new int[size + 1];
		position = 0;
	}

	public void createHeap(int[] a) {
		for (int i = 0; i < a.length; i++) {
			insert(a[i]);
		}
	}

	public void insert(int x) {
		if (position == 0) {
			Heap[position + 1] = x;
			position = 2;
		} else {
			Heap[position] = x;
			position++;
			bubbleUp();
		}
	}

	public void bubbleUp() {
		int pos = position-1;
		while (pos > 0 && Heap[pos / 2] > Heap[pos]) {
			int temp = Heap[pos / 2];
			Heap[pos / 2] = Heap[pos];
			Heap[pos] = temp;
			pos = pos / 2;
		}
	}

	public int extractMin() {
		int min = Heap[1];
		Heap[1] = Heap[position - 1];
		Heap[position - 1] =0;
		position--;
		sinkDown(1);
		return min;
	}

	public void sinkDown(int k) {
		int smallest = k;
		if (2 * k < position && Heap[smallest] > Heap[2 * k]) {
			smallest = 2 * k;
		}
		if (2 * k + 1 < position && Heap[smallest] > Heap[2 * k + 1]) {
			smallest = 2 * k + 1;
		}
		if (smallest != k) {
			swap(k, smallest);
			sinkDown(smallest);
		}
	}

	public void swap(int a, int b) {
		int temp = Heap[a];
		Heap[a] = Heap[b];
		Heap[b] = temp;
	}

	public static void main(String[] args) {
		int[] A = { 1, 4, 9, 2, 5, 11, 3 };
		HeapSort h = new HeapSort(A.length);
		h.createHeap(A);
		System.out.println("Sorted Array : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print("  " + h.extractMin());
		}

	}

}
