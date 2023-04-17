package practice;
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter how man pyramid: ");
		int pyramid = s.nextInt();
		
		int i, j, k;
				
		for(i = 1; i <= pyramid; i++) {
			for(j = i; j <= pyramid; j++) {
				System.out.print(" ");
			}
			for(k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}

}
