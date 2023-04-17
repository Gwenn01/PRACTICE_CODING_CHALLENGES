package practice;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a Number: ");
		int num = scanner.nextInt();
		int result;
		
		for(int i = 1; i <= 10; i++) {
			result = i * num;
			System.out.println(num + " x " + i + " = " + result );
		}
		
	}
}
