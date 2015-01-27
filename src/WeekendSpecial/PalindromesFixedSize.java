package WeekendSpecial;

public class PalindromesFixedSize {

//	Print all palindromes of size greater than equal to 3 of a given string
	public static boolean isPalindrome(String S) {
		int i = 0;
		int j = S.length() - 1;
		while (i < j) {
			if (S.charAt(i) != S.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void printPalindrome(String x, int k){
		for(int i=0;i<x.length();i++){
			for(int j=i+k;j<x.length();j++){
				if(isPalindrome(x.substring(i,j))){
					System.out.println(x.substring(i, j));
				}
			}
		}
	}
	public static void main(String[] args) {
		String A = "AAAbabababaAAA";
		printPalindrome(A, 3);

	}

}
