import java.util.*;
public class CF_6A_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sticks = new int[4];
        for (int i = 0; i < 4; i++) {
            sticks[i] = sc.nextInt();
        }
        Arrays.sort(sticks);
        if (sticks[0] + sticks[1] > sticks[2] || sticks[1] + sticks[2] > sticks[3]) {
            System.out.println("TRIANGLE");
        } 
        else if (sticks[0] + sticks[1] == sticks[2] || sticks[1] + sticks[2] == sticks[3]) {
            System.out.println("SEGMENT");
        } 
        else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
