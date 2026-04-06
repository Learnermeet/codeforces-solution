import java.util.*;

public class CF_2218B_The_67th_67_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[7];
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
            }
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 7; i++) {
                int current = 0;
                
                for (int j = 0; j < 7; j++) {
                    if (i == j) 
                        current += arr[j];
                    else 
                        current -= arr[j];
                }
                best = Math.max(best, current);
            }
            System.out.println(best);
        }
    }
}