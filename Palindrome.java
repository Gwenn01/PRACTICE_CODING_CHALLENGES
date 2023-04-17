package practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			
		System.out.print("Enter a Number: ");
		int number = s.nextInt(); //example 1221
		int q, rem, result = 0;
		
		q = number;
		while(q!=0) //1221 !+ 0; 122 != 0; 12 != 0; 1 != 0; 0 != 0 Which is false
		{
			
			rem = q%10; //122.(1), 12.(2), 1.(2), 0.(1)
			result = result * 10 + rem; //0 * 10 = 0 + 1 = (1); 
										//1 * 10 = 10 + 2 = (12); 
										//12 * 10 = 120 + 2 = (122)
										//122 * 10  1220 + 1 = (1221)
			q = q/10; //122, 12, 1
			
		}
		if(result == number) {
			System.out.println("The Number is PALINDROME!");
		}else {
			System.out.println("The Number is not PALINDROME!");
		}
		
		
	}

}
