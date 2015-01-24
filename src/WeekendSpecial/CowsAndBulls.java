package WeekendSpecial;

public class CowsAndBulls {
	// The cows and bulls game, Player A chooses a word and player B guesses a
	// word. You say bulls when a character in the player B's guess match with a
	// character in player A's word and also it is in the corect position as in
	// A's word. You say cows, when a character in the player B's word match the
	// character in player A, but it is not in the correct position. The
	// characters are case insensitive. Given two words player A's and player
	// B's,Write a function that return the number of bulls and no of cows. For
	// example,
	// A - Picture B- Epic, bulls -0, cows - 4
	// A - forum B - four, bulls - 3 cows - 1
	public static void find(String A, String B) {
		int cows =0, bulls=0;
		if (A.length() == 0 || B.length() == 0) {
			System.out.println("INVALID Input");
		}
		for (int i = 0; i < B.length(); i++) {
			if (i < A.length()) {// incase length of B is greater than A
				if(B.charAt(i)==A.charAt(i)){
					bulls++;
				}else{
					if(A.indexOf(B.charAt(i))>=0){
						cows++;
					}
				}					
			}
		}
		System.out.println("bulls- " + bulls + " and cows- " + cows);
	}

	public static void main(String[] args) {
		String A = "picture";
		String B = "epic";
		find(A, B);
		A = "forum";
		B = "four";
		find(A, B);

	}

}
