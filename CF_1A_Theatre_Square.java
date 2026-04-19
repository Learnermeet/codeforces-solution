import java.util.Scanner;

public class CF_1A_Theatre_Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
		long n = sc.nextLong();
		long a = sc.nextLong();
		
		long x = (m + a - 1) / a;
		long y = (n + a - 1) / a;
		
		System.out.println(x * y);
	}
}