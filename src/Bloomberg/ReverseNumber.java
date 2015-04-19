package Bloomberg;

public class ReverseNumber {
	public static int reverse(int n) {
		int reverse=0;
		while(n>0){
			int reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n =n/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		int n = 265;
		System.out.println(reverse(n));
	}
}
