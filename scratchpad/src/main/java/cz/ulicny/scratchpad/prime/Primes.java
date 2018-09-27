package cz.ulicny.scratchpad.prime;

public class Primes {

    public static void main(String[] args) {
        Primes.sieveOfE(Integer.MAX_VALUE / 10);
    }

    public static void sieveOfE(int n) {
        int p = 2;
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        while (Math.pow(p, 2) <= (n - 1)) {
            double j = Math.pow(p, 2);
            while (j <= (n - 1)) {
                a[(int) j] = 0;
                j = j + p;
            }
            p++;
        }
    }

    // a^(n-1) % n = 1
    // a, 1 <= a < n
    public static boolean isPrime(int n) {
        int max = n - 2;
        boolean isPrime = false;
        for (int a = 2; a < max; a++) {
            double pow = Math.pow(a, n - 1);
            if ((pow % n) == 1) {
                isPrime = true;
                break;
            }
        }

        return isPrime;
    }
}
