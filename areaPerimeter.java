package practice;

import java.util.Scanner;

public class areaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the radius of circle and square: ");
		double radius = scanner.nextDouble();
		
		
		double AreaofCircle, PerimeterofSquare;
		
		AreaofCircle = Math.PI * radius * radius; 
		PerimeterofSquare = radius * 4;
		
		System.out.println("The area of circle is " + AreaofCircle);
		System.out.println("The perimter of square is " + PerimeterofSquare);
			
	}

}
