package April;

import java.util.Arrays;

public class removeAlternate {

	public static int remove(int[] a, int size) {
		if (size == 1) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != -1) {
					return a[i];
				}
			}
		} else {
			boolean x = true;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != -1 && x == false) {
					a[i] = -1;
					x = true;
					size--;
				} else if(a[i]!=-1) {
					x = false;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return remove(a, size);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
				18, 19, 20 };
		System.out.println(remove(a, a.length));

	}

}
