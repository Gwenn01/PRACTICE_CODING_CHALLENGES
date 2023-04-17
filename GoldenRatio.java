package practice;
import java.util.*;
public class GoldenRatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		view();
		System.out.print("Enter what variable: a, b and ab: ");
		String variable = s.nextLine();
		
		switch(variable) {
			case "a":
				a();
			break;
			case "b":
				b();
			break;
			case "ab":
				ab();
			break;
			default:
				System.out.println("INVALID variable!!");
			break;
		}
		
	}
	
	public static void view() {
		System.out.println("     GOLDEN RATIO    ");
		System.out.println("      a           b  ");
		System.out.println("*------------*------*");
		System.out.println("----------a+b--------");	
	}
	public static void a() {
		Scanner s = new Scanner(System.in);
		double goldenratio = 1.618;
		System.out.println("Enter a value of a: to get the value of b and a+b");
		double a = s.nextDouble();
		double b = a / goldenratio;
		double ab = a + b;
		System.out.println("The Value of a = " + a);
		System.out.println("The Value of b = " + b);
		System.out.println("The Value of a+b = " + ab);
	}
	public static void b() {
		double goldenratio = 1.618;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of b: to get the value of a and a+b");
		double b = s.nextDouble();
		double a = goldenratio * b;
		double ab = a + b;
		System.out.println("The Value of a = " + a);
		System.out.println("The Value of b = " + b);
		System.out.println("The Value of a+b = " + ab);
	}
	public static void ab() {
		double goldenratio = 1.618;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of ab: to get the value of a and b");
		double ab = s.nextDouble();
		double a = ab / goldenratio;
		double b = ab - a;
		System.out.println("The Value of a = " + a);
		System.out.println("The Value of b = " + b);
		System.out.println("The Value of a+b = " + ab);
	}

}
