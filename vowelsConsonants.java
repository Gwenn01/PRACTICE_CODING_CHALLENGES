package practice;
import java.util.*;
public class vowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ennter a letter: ");
		char letter = s.next().charAt(0);
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println("The letter is vowels");
		}else {
			System.out.println("The letter is consonants");
		}
	}

}
