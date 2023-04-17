package practice;

public class ArrayRemoveReapetednum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 4, 5, 6, 3, 1, 2, 5, 6, 2, 1, 8, 9, 10};
		int count = arr.length;
		int[] store = new int[count];
		
		for(int i = 0; i <= arr.length-1; i++) {
			store[i] = arr[i];
			for(int j = i+1; j <= arr.length-1; j++) {
				if(store[i] == arr[j]) {
					arr[j] = 0;
				}
					
			}
			
		}
		
		for(int i = 0; i <= store.length-1; i++) {
				if(store[i] != 0) {
					System.out.print(store[i] + " ");
				}
		}
		
		
	}

}
