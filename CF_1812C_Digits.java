import java.util.*;

public class CF_1812C_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String pi = "31415926535897932384626433832795";
        for (int i = 0; i < t; i++) {
            int n = pi.charAt(i) - '0';
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            long ans = 1;
            for (int j = 0; j < n; j++) {
                ans *= sc.nextInt();
            }
            System.out.println(ans);
        }
    }
}
