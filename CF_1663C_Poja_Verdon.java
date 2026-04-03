import java.util.*;

public class CF_1663C_Poja_Verdon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            sum += m;
        }
        System.out.println(sum);
    }
}