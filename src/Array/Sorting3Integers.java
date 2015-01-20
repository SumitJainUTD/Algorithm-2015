package Array;

public class Sorting3Integers {

	// sort 3 given integers, sort them with out using if conditions
	public void sort(int x, int y, int z){
		int max,mid,min;
		max = Math.max(x,Math.max(y, z));
		min = -Math.max(-x,Math.max(-y, -z));
		mid = (x+y+z)-(max+min);
		System.out.println("Sorted order " + min + " " + mid + " " + max);
	}
	public static void main(String[] args) {
		int x = 4;
		int y = 1;
		int z = 9;
		Sorting3Integers s = new Sorting3Integers();
		s.sort(x, y, z);
	}

}
