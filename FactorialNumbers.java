package practice;
import java.util.*;
public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = 4; 
		int q = n;
		int a, b;
		while(n != 2) {
			a = n - 1; // 4 - 1 = 3  //
			b = q * a; // 4 * 3 = 12 //
			
			System.out.println(b);
			
			q = b; // passing the value of b into q 
			n = a; // passing the value of a into a
		}
		
	
	}

}
