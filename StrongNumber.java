package practice;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		Strong number is a number that like factorial number 
		Ex. 145 // 1 * 1 = 1 // 4 x 3 x 2 x 1 = 24 // 5 x 4 x 3 x 2 x 1 = 120
		and sum all the product
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		int q = n;
		int rem, fact = 1, result = 0;
		
		while(q != 0) //145 != 0// 14 != 0// 1 != 0// 0 == 0
		{
			rem = q % 10; //14.5 // 1.4 // 0.1
			for(int i = 1; i <= rem; i++) {
				fact = fact * i;// 1x1=1// 1x2=2// 2x3=6// 6x4=24// 24x5=120
								// 1x1=1// 1x2=2// 2x3=6// 6x4=24//
					
			}
			result = result + fact;//0+120=120// 120+24=144// 144+1=145
			fact = 1;
			q = q/10; // 14 // 1 //0
		}
		if(result == n)//CHECK IF THE RESULT IS EQUAL TO N
		{
			System.out.println(n + " is Strong Number");
		}else {
			System.out.println(n + " is NOT Strong Number");
		}
			

	}

}
