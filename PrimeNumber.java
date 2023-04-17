package practice;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 Check whether the number is prime or not
		 prime number is 1, 2, 3, 5, 7, 13...
		 a number that is divisible by 1
		 */
		otherFormula();
	}
	public static void otherFormula(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = s.nextInt();
		
		if(n%2 == 0 || n%3 == 0 || n%5 == 0) {
				if(n == 2 || n == 3 || n == 5) {
				System.out.println(n + " is a prime number");	
				}else {
				System.out.println(n + " is not a prime number");	
				}
				
		}else {
				if(n == 1) {
				System.out.println(n + " is not a prime number");	
				}else {
				System.out.println(n + " is a prime number");
				}
				
		}
	
	
	}
}
