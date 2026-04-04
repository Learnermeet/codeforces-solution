import java.util.Scanner;

public class CF_2214C_And {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            
            int mid = a + b + c - (max + min);
 
            System.out.println((a ^ b ^ c) - mid); 
        }
    }
}