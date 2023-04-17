package practice;
import java.util.*;
public class QuessPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String password = "gwen123";
		String pass;
		
		
		do {
			System.out.print("Enter a password: ");
			pass = s.nextLine();
			if(pass.equals(password)) {
				System.out.println("Welcome User");
				break;
			}else {
				System.out.println("Invalid Password");
			}
		}while(pass != password);
		
	}

}
