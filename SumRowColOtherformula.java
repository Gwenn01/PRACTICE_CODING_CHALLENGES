package practice;
import java.util.*;
public class SumRowColOtherformula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 0, col = 0;
		int arr[][] = {
				{8, 3, 9, 0, 10},
				{3, 5, 17, 1, 1},
				{2, 8, 6, 23, 1},
				{15, 7, 3, 2, 9},
				{6, 14, 2, 6, 0}
				};
		
		System.out.print("Row total: ");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				row = row + arr[i][j];
			}
			System.out.print(row + " ");
			row = 0;
		}
		
		System.out.println();

		System.out.print("Col total: ");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				col = col + arr[j][i];
			}
			System.out.print(col + " ");
			col = 0;
		}
	
	
	
	
	}
}
