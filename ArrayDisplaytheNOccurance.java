package practice;
import java.util.*;
public class ArrayDisplaytheNOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = {1, 2, 3, 3, 2, 5, 6, 3, 7, 7, 1};
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter a number to check the occurance: ");
		int n = s.nextInt();
		
		System.out.println();
		System.out.println("Count: " + checkOcc(arr, n));
	}
	public static int checkOcc(int[] arr, int n) {
		int count = 0;
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] == n) {
				count++;
			}
		}
		return count;
	}
}
