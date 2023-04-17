package practice;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNum = scanner.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = scanner.nextInt();
		System.out.println("Enter third number: ");
		int thirdNum = scanner.nextInt();
		System.out.println("Enter fourt number: ");
		int fourtdNum = scanner.nextInt();
		System.out.println("Enter fifth number: ");
		int fifthNum = scanner.nextInt();
		
		int result = firstNum + secondNum + thirdNum + fourtdNum + fifthNum;
		
		System.out.println("The average of five number is: " + result / 5);
		if(result >= 90) {
			System.out.println("With Honor");
		}else if(result >= 95) {
			System.out.println("With High Honors");
		}else if(result >= 98) {
			System.out.println("With Highest Honors");
		}
	}

}
