package WeekendSpecial;

public class GoldbachConjecture {

	public static void Goldbach(int x){
		if(x%2!=0){
			System.out.println("Not Even");
			return;
		}
		if(x<=2){
			System.out.println("Less than 2");
			return;
		}
		for(int i = 3;i<x/2;i++){
			if(isPrime(i) && isPrime(x-i)){
				System.out.println("Goldbach no are " + i + " " + (x-i) );
			}
		}
	}
	public static boolean isPrime(int x){
		for(int i=2;i<x/2;i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Goldbach(200);

	}

}
