import java.util.Scanner;

public class CF_1812G_Colour_Vision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String row1 = sc.next();
            String row2 = sc.next();
            row1 = row1.replace('G', 'B');
            row2 = row2.replace('G', 'B');
            if (row1.equals(row2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}