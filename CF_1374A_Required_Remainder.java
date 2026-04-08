import java.util.*;

public class CF_1374A_Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();

            long k = n - (n % x) + y;
            if (k > n) {
                k -= x;
            }

            System.out.println(k);
        }
    }
}