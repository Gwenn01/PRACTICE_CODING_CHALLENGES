package practice;
import java.util.*;
public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int i, j, k, h;
		System.out.print("Ente the size: ");
		int n = s.nextInt();
		
		for(i = 1; i <= n; i++) {
			for(j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for(k = 1; k < i; k++) {
				System.out.print("*");
			}
			for(h = 1; h <= i; h++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
			System.out.print(" ");
			}
			for(k = i; k < n; k++) {
			System.out.print("*");
			}
			for(h = i; h <= n; h++) {
				System.out.print("*");
				}
			
		System.out.println();
		}
		
		
	}
}
