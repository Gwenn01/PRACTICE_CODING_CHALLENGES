package practice;
import java.util.*;
public class binaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		System.out.println("8421");
		int n = s.nextInt();
		int rem, result = 0, multipy = 1;
		
		while(n != 0 ) {
			rem = n % 10; // check the rem to get a multiple
			result = result + rem * multipy; // the multiply it when the rem get 1
			multipy = multipy * 2; // to bet this 1 2 4 8;
			n = n / 10;
		}
		System.out.println("The decimal is " + result);
	}

}
