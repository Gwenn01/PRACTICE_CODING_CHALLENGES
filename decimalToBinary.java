package practice;
import java.util.*;
public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = s.nextInt();
		int rem;
		String result = "";
		
		while(n != 0) {
			rem = n % 2; // check the rem if it 1 to get the binary value 
			result += rem; // then add it
			n = n / 2; // then check the n until it become 0
		}
		System.out.print("The binary is " + result);
	}

}
