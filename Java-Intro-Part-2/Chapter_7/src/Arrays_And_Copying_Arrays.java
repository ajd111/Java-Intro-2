/*
 * Arrays_And_Copying_Arrays.java
 * 
 * temperature program 
 * 
 * arrays START AT 0 
 * 
 * once initialized, arrays will need to be copied to change the
 * amount of indices
 * 
 * 
 * ARRAYS ARE REFERENCE TYPES
 */

public class Arrays_And_Copying_Arrays {

	public static void main(String[] args) {
		
		/* 
		 * alternate declaration and initialization: 
		 * 
		 * double[] temperatures = {27.2, 20.0, 20.4, 21.5, 22.8, 
		 *		20.7, 26.9};
		 */
		
		double[] temperatures = new double[7];
		  
		temperatures[0] = 27.2;
		temperatures[1] = 20.0;
		temperatures[2] = 20.4;
		temperatures[3] = 21.5;
		temperatures[4] = 22.8;
		temperatures[5] = 20.7;
		temperatures[6] = 26.9;

		double sum = 0;
		
		for (int index = 0; index < temperatures.length; index++) {
			sum = sum + temperatures[index]; 
		}

		double average = sum / temperatures.length;
		
		int nAbove = 0;
		for (int index = 0; index < temperatures.length; index++) {
			if (temperatures[index] > average) {
				nAbove++;
			}
		}
		
		System.out.printf("Average temperature for %d days: %.1fC\n",
				temperatures.length, average);
		System.out.printf("# of days above average: %d\n", nAbove);
		System.out.printf("# of days at or below average: %d\n", 
				temperatures.length - nAbove);
				
		/*
		 * Copying Arrays
		 */
		
		// method 1
		int[] arrayA = {100, 101, 102};
		int[] arrayC = new int[3];
		for (int i = 0; i < arrayA.length; i++) {
			arrayC[i] = arrayA[i];
		}
		
		// method 2
		int[] array1 = {1, 2, 3};
		
		int[] array3 = new int[array1.length];
		System.arraycopy(array1, 0, array3, 0, array1.length);
		
		
		
	}

}
