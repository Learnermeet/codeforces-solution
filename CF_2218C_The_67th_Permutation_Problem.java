import java.util.*;

public class CF_2218C_The_67th_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = 1;
            int r = 3 * n;
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(l);
                result.add(r - 1);
                result.add(r);
                l++;
                r -= 2;
            }
            for (int x : result) {
                output.append(x).append(" ");
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}