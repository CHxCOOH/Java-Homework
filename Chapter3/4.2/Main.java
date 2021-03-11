public class Main {
	public static void main(String args[]) {
		System.out.println("Primes from 1 to 100: ");
		for ( int i = 2; i < 100; i++ ) {
			boolean isPrime = true;
			for ( int j = 2; j < i/2; j++) {
				if ( i%j == 0 ) {
					isPrime = false;
				}
			}
			if ( isPrime ) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
