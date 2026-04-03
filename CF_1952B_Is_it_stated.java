import java.util.Scanner;

public class CF_1952B_Is_it_stated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (s.contains("it")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
