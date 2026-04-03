import java.util.*;

public class CF_1663D_Is_it_rated_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        
        if ((s.equals("ABC") && x < 2000) ||
            (s.equals("ARC") && x < 2800) ||
            (s.equals("AGC") && x >= 1200)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}