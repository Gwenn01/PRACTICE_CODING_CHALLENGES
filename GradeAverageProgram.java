package practice;
import java.util.*;
public class GradeAverageProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ave, math, english, science, computer; 
		Scanner s = new Scanner(System.in);
		System.out.print("Math     : ");
		math = s.nextInt();	
		System.out.print("English  : ");
		english = s.nextInt();	
		System.out.print("Science  : ");
		science = s.nextInt();	
		System.out.print("Computer : ");
		computer = s.nextInt();	
		
		ave = (math + english + science + computer) / 4;
		
		System.out.println("Average  : " + ave);
		if(ave > 100) {
			System.out.println("Invalid Grade");
		}else if(ave >= 98) {
			System.out.println("With Highest Honor");
		}else if(ave >= 95) {
			System.out.println("With high Honor");
		}else if(ave >= 90) {
			System.out.println("With Honor");
		}else if(ave >= 75) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

}
