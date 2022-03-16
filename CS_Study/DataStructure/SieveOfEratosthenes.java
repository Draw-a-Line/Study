package Study.CS_Study.DataStructure;

public class SieveOfEratosthenes {

    static int getPrimeList(int n) {
        int range = n+1;
        int sqrt = (int)(Math.sqrt(n)) + 1;
        int cnt = 0;

        boolean[] primeList = new boolean[range];
        for (int i = 0; i < range; i++)
            primeList[i] = true;

        for (int i = 2; i < sqrt; i++) {
            if (primeList[i]) {
                for (int j = i * i; j < range; j += i)
                    primeList[j] = false;
            }
        }

        for (int i = 2; i < range; i++){
            if (primeList[i])
                cnt ++;
        }

        return cnt;

    }
    public static void main(String[] args) {

        int prime_count = getPrimeList(50000);
        System.out.println(prime_count);
    }
}
