package practice;
import java.util.*;
public class getBigestAndSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] values = new int[10];

		System.out.println("Enter 10 values to get the Biggest and Smallest: ");
		
		for(int i = 0; i <= values.length-1; i++) {
			values[i] = s.nextInt(); 
		}
		System.out.println();
		
		int biggest = Integer.MIN_VALUE;
		// get biggest number is array 
		for(int i = 0; i <= values.length-1; i++) {
			if(biggest <= values[i]){
				biggest = values[i];
			}
		}
		System.out.println("The biggest number is " + biggest);
		
		int smallest = Integer.MAX_VALUE;
		// get biggest number is array 
		for(int i = 0; i <= values.length-1; i++) {
			if(smallest >= values[i]){
				smallest = values[i];
			}
		}
		System.out.println("The biggest number is " + smallest);
	}
}
