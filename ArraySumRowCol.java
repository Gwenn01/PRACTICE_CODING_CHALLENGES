package practice;
import java.util.*;
public class ArraySumRowCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row1 = 0, row2 = 0, row3 = 0, row4 = 0, row5 = 0;
		int col1 = 0, col2 = 0, col3 = 0, col4 = 0, col5 = 0;
		int arr[][] = {
				{8, 3, 9, 0, 10},
				{3, 5, 17, 1, 1},
				{2, 8, 6, 23, 1},
				{15, 7, 3, 2, 9},
				{6, 14, 2, 6, 0}
				};
		
		for(int i = 0; i <= arr.length-1; i++) {
			for(int j = 0; j <= arr.length-1; j++) {
				if(arr[i] == arr[0]) {
					row1 = row1 + arr[0][j];	
				}else if(arr[i] == arr[1]) {
					row2 = row2 + arr[1][j];	
				}else if(arr[i] == arr[2]) {
					row3 = row3 + arr[2][j];	
				}else if(arr[i] == arr[3]) {
					row4 = row4 + arr[3][j];	
				}else if(arr[i] == arr[4]) {
					row5 = row5 + arr[4][j];	
				}
			}
			col1 = col1 + arr[i][0];
			col2 = col2 + arr[i][1];
			col3 = col3 + arr[i][2];
			col4 = col4 + arr[i][3];
			col5 = col5 + arr[i][4];
		}
		System.out.println("Row Total: " +  row1 + " " + row2 + " " + row3 + " " + row4 + " " + row5);
		System.out.println("Col Total: "  + col1 + " " + col2 + " " + col3 + " " + col4 + " " + col5);
		
		
	}

}
