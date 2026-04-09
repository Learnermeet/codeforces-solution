import java.util.*;

public class CF_1433A_BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int t = sc.nextInt();
                
        while (t-- > 0) {
            int x = sc.nextInt();            
            String s = String.valueOf(x);
            int len = s.length();
            int digit = s.charAt(0) - '0';            
            int result = (digit - 1) * 10 + (len * (len + 1)) / 2;            
            System.out.println(result);
        }
    }
}