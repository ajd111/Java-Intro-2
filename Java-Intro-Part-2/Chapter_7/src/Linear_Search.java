/*
 * Linear_Search.java
 * 
 * a common task is to find a number in an array
 * 
 * linear search algorithm program
 * 
 * ternary operator
 * 
 * TEST PROGRAMS AT BOUNDARIES = good practice!
 * 
 */
import java.util.Scanner;

public class Linear_Search {
	
	/*
	 * Alternate Method: O(n) time 
	 * 
	 * public static int linearSearch(int[] data, int value) {
	 *     int position = 0;
	 *     while (position < data.length && data[position] != value) {
	 *         position++;
	 *     }
	 *     return ((position < data.length) ? position : -1);
	 * }
	 */
	
	public static int linearSearch(int[] data, int value) {
		
		for (int position = 0; position < data.length; position++) {
			
			if (data[position] == value) {
				return position;
				
			}
		}
		return -1; 
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] data = {37, 24, 49, 15, 83, 56};
		int value = 0; 
		
		do {
			System.out.println("Enter number to find, or 0 to quit: ");
			value = input.nextInt();
			
			if (value != 0) {
				int foundAt = linearSearch(data, value);
				System.out.printf("%d found at index %d\n", value,
						foundAt);
			}
			
		} while (value != 0);

	}

}
