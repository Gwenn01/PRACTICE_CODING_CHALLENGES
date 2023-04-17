package practice;
import java.util.*;
import java.util.Scanner;

public class compareTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int n1 = s.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = s.nextInt();
		
		if(n1 == n2) {
			System.out.println(n1 + " == " + n2);
		}else if(n1 != n2) {
			System.out.println(n1 + " != " + n2);
		}
		if(n1 > n2) {
			System.out.println(n1 + " > " + n2);
		}else if(n1 < n2) {
				System.out.println(n1 + " < " + n2);
		}
		//////////
		if(n1 >= n2) {
			System.out.println(n1 + " >= " + n2);
		}else if(n1 <= n2) {
				System.out.println(n1 + " <= " + n2);
		}
	}

}
