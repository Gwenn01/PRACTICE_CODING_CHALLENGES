package practice;
import java.util.*;
public class operatorReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Num1: ");
		int n1 = s.nextInt();
		System.out.print("Enter Num2: ");
		int n2 = s.nextInt();
		
		System.out.println("The sum of two number is " + sum(n1, n2));
		System.out.println("The different of two number is " + different(n1, n2));
		System.out.println("The product of two number is " + product(n1, n2));
		System.out.println("The quotient of two number is " + quotient(n1, n2));
	}
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static int different(int num1, int num2) {
		int different = num1 - num2;
		return different;
	}
	public static int product(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}
	public static int quotient(int num1, int num2) {
		int quotient = num1 / num2;
		return quotient;
	}
}
