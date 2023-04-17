package practice;
import java.util.*;
public class UserEmailPass {

	public static void main(String[] args) {
		// TODO	 Auto-generated method stub
		int user;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter User: ");
		user = s.nextInt();
		System.out.println();
		
		String[] email = {"arnelgwen@gmail.com", "ben10@gmail.com", "shake@gmail.com"};
		String[] username = {"Gwen", "Ben", "Shake",};
		String[] password = {"gwen123", "ben12345", "shake2314"};
	    
		System.out.println("User      : " + user);
		System.out.println("Email     : " + email[user]);
		System.out.println("User Name : " + username[user]);
		System.out.println("Password  : " + password[user]);
	}

}
