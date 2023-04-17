package practice;
import java.util.*;
public class TwodArrayMaxMinRowCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1 , 5, 1, 4, 3},
				{5, 8, 13, 16, 2},
				{17, 9, 21, 4, 3}
					  };
		
		System.out.println("The Max and Min Value in Rows: ");
		for(int i = 0; i <= 2; i++) {
			int max = 0, min = 100;
			for(int j = 0; j <= 4; j++) {
				if(arr[i][j] >= max) {
					max = arr[i][j];
				}
				if(arr[i][j] <= min) {
					min = arr[i][j];
				}
			}
			System.out.println("Rows" + (i+1 )+ ": " + " max = "+ max + " min = " + min);
		}
		

		System.out.println("The Max and Min Value in Colums: ");
		
		for(int i = 0; i <= 4; i++) {
			int max = 0, min = 100;
			for(int j = 0; j <= 2; j++) {
				if(arr[j][i] >= max) {
					max = arr[j][i];
				}
				if(arr[j][i] <= min) {
					min = arr[j][i];
				}
			}
			System.out.println("Colums" + (i+1 )+ ": " + " max = "+ max + " min = " + min);
		}
				
		
	}
}
