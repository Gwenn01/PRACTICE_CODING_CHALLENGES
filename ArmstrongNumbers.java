package practice;
import java.util.*;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int rem, result = 0, mul = 1, cnt, count = 0; 
		
		System.out.print("Enter a Number: ");
		int number = s.nextInt(); // Ex 3
		
		int q = number; 
		while(q != 0) // 371 != 0, 37 != 0, 0 != 0 	which is false
		{
			  q = q/10; //37, 3, 0
			  count++;	//count = 1, count 2, count = 3
		}
		cnt = count;
		q = number;
		
		
		while(q != 0) // 371 != 0, 37 != 0, 0 != 0 which is false
		{
			rem = q%10; // 37.(1), 3.(7), 0.(3)
			
			while(count != 0) { //count = 3, count = 2, count = 1, count = 0 false
				mul = mul*rem;  // 1*1*1 = 1, 7*7*7 = 343, 3*3*3 = 27
				count--;
			}
			
			result = result + mul; // 1 + 343 + 27 = 371
			count = cnt; // count = 3;
			q = q/10;  // 37, 3, 0
			mul = 1;
		}
		
		if (result == number) {
			System.out.println("The number is Armstrong");
		}else
			System.out.println("The number is not Armstrong");
		
		
		
	}

}
