package practice;
import java.util.Scanner;
public class NumLoopsDecreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = s.nextInt();
		
		for(int i = n; i >= 1; i--) {
			for(int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
