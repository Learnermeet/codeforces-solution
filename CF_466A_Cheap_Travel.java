import java.util.*;

public class CF_466A_Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a * m <= b) {
            System.out.println(n * a);
            return;
        }
        int cost1 = (n / m) * b + (n % m) * a;
        int cost2 = (n / m + 1) * b;
        System.out.println(Math.min(cost1, cost2));
    }
}