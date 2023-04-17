package practice;
import java.util.Scanner;
public class N_to_ThePowerOf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		double num = scan.nextInt();
		System.out.print("Enter the Power: ");
		double power = scan.nextInt();
		
		double result = 1, pow = power; 
		if(power > 0) {
			while(power != 0) {
				result = result * num;
				power--;
			}
		System.out.println(num + " to the power of " + pow + " is equal to " + result);
		}else {
			while(power != 0) {
				result = result * (1.0/ num);
				power++;
			}
		System.out.println(num + " to the power of " + pow + " is equal to " + result);
		}
		
	}
}
