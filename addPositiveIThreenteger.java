package practice;
import java.util.*;
public class addPositiveIThreenteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a more than 2 digits numbers: ");
		int n = s.nextInt();
		int rem, result = 0;
		
		while(n != 0) {
			rem = n % 10; // get the rem of n 
			result += rem; // then add it 
			n = n / 10; // to end the loops 
			
		}
		System.out.println("The sum is " + result);
	}

}
