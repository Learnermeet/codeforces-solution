import java.util.*;

public class CF_455A_Boredom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxVal = 100000;
        long[] cnt = new long[maxVal + 1];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            cnt[x]++;
        }
        long[] dp = new long[maxVal + 1];
        dp[1] = cnt[1] * 1;

        for (int i = 2; i <= maxVal; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * cnt[i]);
        }
        System.out.println(dp[maxVal]);
    }
}