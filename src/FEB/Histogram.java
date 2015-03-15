package FEB;

import java.util.Stack;

public class Histogram {

	public static int MaxRectangle(int[] A) {
		Stack<Integer> s = new Stack<Integer>();
		int maxArea = 0, currentArea = 0;
		int i=0;
		while(i<A.length){
			if (s.isEmpty() || A[i] >= s.peek()) {
				s.push(A[i]);
				i++;
			} else {
				int topIndex = s.size()-1;
				s.pop();
				if (s.empty()) {
					currentArea = A[topIndex] * i;
				} else {
					currentArea = A[topIndex] * (i - topIndex);
				}
				if (maxArea < currentArea) {
					maxArea = currentArea;
				}
			}
		}
		i--;
		while (!s.empty()) {			
			int topIndex = s.size()-1;
			s.pop();
			if (s.empty()) {
				currentArea = A[topIndex] * i;
			} else {
				currentArea = A[topIndex] * (i - topIndex);
			}
			if (maxArea < currentArea) {
				maxArea = currentArea;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int [] A = {2,2};
		System.out.println(MaxRectangle(A));

	}

}
