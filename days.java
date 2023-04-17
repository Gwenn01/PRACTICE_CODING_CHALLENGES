package practice;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int day;
		System.out.println("Enter a number between 1 to 7 to display the day: ");
		day = scan.nextInt();
		
		if(day == 1) {
			System.out.println("The Day Today is Monday");
		}else if(day == 2) {
			System.out.println("The Day Today is Tuesday");
		}else if(day == 3) {
			System.out.println("The Day Today is Wednesday");
		}else if(day == 4) {
			System.out.println("The Day Today is Thursday");
		}else if(day == 5) {
			System.out.println("The Day Today is Friday");
		}else if(day == 6) {
			System.out.println("The Day Today is Saturday");
		}else if(day == 7) {
			System.out.println("The Day Today is Sunday");
		}else{
			System.out.println("Invalid input pleas input a number between 1 to 7");
		}
	}

}
