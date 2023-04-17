package practice;
import java.util.*;
public class ArraySumDifProdQuoti {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0, product = 1, different = 0;
		System.out.print("How many array to be input: ");
		int input = s.nextInt();
		int[] arr = new int[input];
		
		for(int i = 0; i <= input-1; i++) {
			System.out.print("Enter a number: ");
			int n = s.nextInt();
			arr[i] = n;
		}
		
		for(int i = 0; i <= arr.length-1;i++) {
			sum += arr[i];
			different = arr[i] - different;
			product *= arr[i];		
		}
		System.out.println("The total sum of array is " + sum);
		System.out.println("The total different of array is " + different);
		System.out.println("The total product of array is " + product);
	}
}
