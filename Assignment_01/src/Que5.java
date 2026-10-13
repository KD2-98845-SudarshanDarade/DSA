import java.util.Scanner;

public class Que5 {
	
	public static int recursion(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		return recursion(n - 1) + recursion( n - 2);
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a nth number :  ");
		int n = scanner.nextInt();
		
		int ans = recursion(n);
		
		System.out.println(ans);
		
		scanner.close();
	}
}
