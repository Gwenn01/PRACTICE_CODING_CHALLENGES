package practice;
import java.util.*;
public class EnterANumBetween1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Enter a number between 1 to 10: ");
			num = s.nextInt();
		if(!(num >= 1 && num <= 10)) {
			 System.out.println(num + " is not between 1 to 10");	 
		}else {
			System.out.println(num + " is between 1 to 10");
		}
		}while(!(num >= 1 && num <= 10));
		
		
		}
	
	}
