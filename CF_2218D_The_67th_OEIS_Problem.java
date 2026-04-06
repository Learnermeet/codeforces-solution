import java.io.*;
import java.util.*;

public class CF_2218D_The_67th_OEIS_Problem {
    static List<Integer> getPrimes(int k) {
        int limit = 200000;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit && primes.size() < k; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        List<Integer> primes = getPrimes(10005);
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                long val = 1L * primes.get(i) * primes.get(i + 1);
                out.append(val).append(" ");
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}