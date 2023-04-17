package practice;
import java.util.*;
public class OddandEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//oddNumbers();
		//System.out.println();
		//evenNumbers();
		
		//EVEN NUMBERS
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println("Even " + i);
			}
		}	
		//ODD NUMBERS
		System.out.println("Enter a nuMBER: ");
		int n1 = s.nextInt();
		for(int i = 1; i <= n1; i++) {
			if(i % 2 != 0) {
				System.out.println("Odd " + i);
			}
		}	

		
		//Check a number if its odd or even in a method
	}
	public static void oddNumbers() {
		Scanner odd = new Scanner(System.in);
		System.out.print("Enter a Odd Numbers: ");
		int num = odd.nextInt();
		int result = 1;
		System.out.println("1");
		for(int i = 2; i <= num; i++) {
			result = result + 2;
			System.out.println(result);	
		}
	}

public static void evenNumbers() {
	Scanner even = new Scanner(System.in);
	System.out.print("Enter a Even Numbers: ");
	int num = even.nextInt();
	int result = 2;
	System.out.println("2");
	for(int i = 2; i <= num; i++) {
		result = result + 2;
		System.out.println(result);	
		}
	}

}
