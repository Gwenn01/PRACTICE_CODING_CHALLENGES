package practice;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the term: ");
		long term = scanner.nextLong();
		
		double fn1 = Math.pow(1.618, term) - Math.pow(0.618, term);
		double fn2 = Math.sqrt(5);
		double result = fn1 / fn2;
		
		System.out.println(Math.round(result) + "\n");
		
		long a = 0L, b = 1L, c;
		
		System.out.println(a); // print 0
		System.out.println(b);// print 1
		
		for(int i = 2; i <= term; i++) 
		{
			c = a + b; //0+1=1//1+1=2//1+2=3//2+3=5//
			System.out.println(c);//print 1, 2, 3, 5
			a = b;//a become 1//a become 1//a become 2
			b = c;//b become 1//b become 2//a become 3
		}	
	}

}
