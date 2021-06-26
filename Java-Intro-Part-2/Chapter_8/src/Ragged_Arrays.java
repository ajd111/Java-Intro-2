/*
 * Ragged_Arrays.java
 * 
 * ragged array: different # of elements in each row
 * 
 * survey opinion program
 * 
 */

public class Ragged_Arrays {

	public static void main(String[] args) {
		
		int[][] choices = {
				{9},
				{7, 5},
				{4, 6, 1},
				{3, 1, 2, 8}
		};
		
		int nPeople = 0;
		
		for (int row = 0; row < choices.length; row++) {
			
			for (int col = 0; col < choices[row].length; col++) {
				nPeople += choices[row][col];
			}
		}
		System.out.printf("%d people gace their opinion.\n", nPeople);
		
	}

}
