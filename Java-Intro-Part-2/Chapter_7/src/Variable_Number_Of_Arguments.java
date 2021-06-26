/*
 * Variable_Number_Of_Arguments.java
 * 
 * look in method header of max --> the "..." lets Java know about 
 * an unknown number of arguments, * treats it as an array *
 * 
 * 
 * 
 */

public class Variable_Number_Of_Arguments {

	public static int max(int...numbers) {
		
		int maximum = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		}
		return maximum;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.printf("%d\n", 22);
		System.out.printf("%d %d\n",23, 24);
		System.out.printf("%d %d %d\n", 35, 36, 37);
		
		System.out.println(max(3, 4));
		System.out.println(max(7, 2, 10));
		System.out.println(max(7, 8, 4, 9, 3, 6, 5));
		
		int[] data = {3, 18, 2, 5, 12};
		System.out.println(max(data));
	}

}
