package practice;
import java.util.*;
public class boxLoops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = s.nextInt();
		
		for(int i=1 ;i<=n ; i++) {
			if(i == 1 || i == n) {
				for(int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 1; j <= n; j++) {
					if(j == 1 || j == n) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=1 ;i<=n ; i++) {
			if(i == 1 || i == n) {
				for(int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 1; j <= n; j++) {
					if(j == 1 || j == n) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		
	}
}