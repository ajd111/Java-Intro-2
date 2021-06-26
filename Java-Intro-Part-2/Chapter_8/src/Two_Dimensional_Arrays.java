/*
 * Two_Dimensional_Arrays.java
 * 
 * also works for MULTI-DIMENSIONAL ARRAYS
 * 
 * sales report program
 * 
 * dataType[][] arrayName = { {x, y, z, ...} }
 * 
 * [row #][column #]
 * 
 * ALWAYS ACCESS BY ROW FIRST (INNER LOOP) THEN COLUMN (OUTER LOOP)
 */

public class Two_Dimensional_Arrays {

	public static void main(String[] args) {
		
		double[][] sales = {
				{10, 11, 12, 13}, 
				{14, 15, 16, 17}, 
				{18, 19, 20, 21}
		};
		
		System.out.println("Length of sales is: " + sales.length);
		System.out.println("Number of columns in row 0 is: " + 
				sales[0].length);
		
		// grand total
		double grandTotal = 0.0;
		
		for (int row = 0; row < sales.length; row++) {
			
			for (int col = 0; col < sales[row].length; col++) {
				grandTotal = grandTotal + sales[row][col];
			}
		}
		System.out.printf("The grand total is $%.2f\n", grandTotal);
		
		// yearly totals
		final int BASE_YEAR = 2016;
		
		for (int row = 0; row < sales.length; row++) {
			double yearlyTotal = 0.0;
			
			for (int col = 0; col < sales[row].length; col++) {
				yearlyTotal += sales[row][col];
			}
			System.out.printf("Total for %d is $%.2f\n", BASE_YEAR + row, 
					yearlyTotal);
		}
		
		// quarterly totals
		for (int col = 0; col < sales[0].length; col++) {
			double quarterlyTotal = 0.0;
			
			for (int row = 0; row < sales.length; row++) {
				quarterlyTotal += sales[row][col];
			}
			System.out.printf("The total for Q%d is $%.2f\n", col + 1, 
					quarterlyTotal);
		}
		
	}

}
