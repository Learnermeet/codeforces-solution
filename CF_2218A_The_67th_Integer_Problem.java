import java.util.*;

public class CF_2218A_The_67th_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            
            if (x == 67) {
                System.out.println(67);
            } else {
                System.out.println(x + 1);
            }
        }
    }
}