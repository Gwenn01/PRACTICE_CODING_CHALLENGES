package practice;

public class evenOddFunctionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Even: ");
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.print(i);
				if(i != 10) {
					System.out.print(", ");
				}
			}
		}
		System.out.println();
		System.out.print("Odd: ");
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.print(i);
				if(i != 9) {
					System.out.print(", ");
				}
			}
		}
		
	}
}
