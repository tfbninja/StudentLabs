package lab17a_refs_params_labs;

public class ArrayOfPrimes {

    //getPrimeList(int numPrimes) will return an array 
    //containing the first numPrimes primes starting at 2
    public static int[] getPrimeList(int numPrimes) {
        return getPrimeList(numPrimes, 2);
    }

    //getPrimeList(int numPrimes, int primeStart) will return an array 
    //containing the first numPrimes primes starting at primeStart
    public static int[] getPrimeList(int numPrimes, int primeStart) {
        int[] primes = new int[numPrimes];
        int counter = 0;
        for (int i = primeStart; counter < numPrimes; i++) {
            if (isPrime(i)) {
                primes[counter] = i;
                counter++;
            }
        }
        return primes;
    }

    //isPrime will return true if num is prime
    //a prime number is any number only divisible by 1 and itself
    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
