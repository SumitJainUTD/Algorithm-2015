package WeekendSpecial;

public class printPrimeNo {

	// Sieve of Eratosthenes
	public static void printPrimes(int x) {
		int[] primes = new int[x + 1];

		for (int i = 1; i < primes.length; i++) {
			primes[i] = i;
		}
		for (int i = 2; i < Math.sqrt(x); i++) {
			if (primes[i] != 0) {
				int counter = 2;
				int j = i * counter;
				while (j <= x) {
					primes[j] = 0;
					counter++;
					j = i * counter;
				}
			}
		}
		for (int i = 1; i < primes.length; i++) {
			if (primes[i] != 0) {
				System.out.print(primes[i] + " ");
			}
		}

	}

	public static boolean isPrime(int x) {
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimes(20);
		System.out.println(isPrime(15));
		System.out.println(isPrime(17));
	}

}
