
package practice;

import java.util.Scanner;

public class quizgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String correctAnswer = "java";
		
		int i = 3;
		while(i >= 0) {
			System.out.print("What is the best programming language? ");
			String answer = s.nextLine(); 
			
			if(answer.equals(correctAnswer)) {				
				System.out.println("YOU WON!!");
				break;
			}else {
				if(i == 0) {
					System.out.println("YOU LOSE!!");
				}else {
					System.out.println("Try again your chance " + i);	
				}
			}
			i--;
		}
	}

}
