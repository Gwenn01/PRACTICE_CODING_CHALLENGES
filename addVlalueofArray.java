package practice;
import java.util.*;
public class addVlalueofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] arr = {20, 5, 30, 18, 7, 8, 10, 20, 30, 40};
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("The total sum of array is " + sum);
	}

}
