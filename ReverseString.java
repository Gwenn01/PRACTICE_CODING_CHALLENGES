package practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = s.nextLine();
		char[] arr = str.toCharArray();
		
		String result = " ";
		
		for(int i = arr.length-1; i >= 0;i--) {
			result += arr[i];
		}
		System.out.print("The revese word is: ");
		System.out.print(result);
		
		
	}

}
