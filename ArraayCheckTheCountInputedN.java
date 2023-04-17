package practice;
import java.util.*;
public class ArraayCheckTheCountInputedN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = {1, 2, 3, 3, 2, 5, 6, 3};
		int n = 0;
		System.out.print("The repeated Integers in array is ");
		for(int i = 0; i <= arr.length-1; i++) {
			for(int j = i+1; j <= arr.length-1; j++) {
				if(arr[i] == arr[j]) {
					if(n != arr[j])
					System.out.print(arr[i] + " ");
					n = arr[j];
				}
			}
		
		}	
	}

}
