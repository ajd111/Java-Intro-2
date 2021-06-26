/*
 * Arrays_Of_Objects_Main.java 
 * 
 * tests element class: Array_Of_Objects_Elements.java
 * 
 * 
 * find average of elements program
 * 
 * for-each loops
 * 
 */

public class Arrays_Of_Objects_Main {

	public static void main(String[] args) {
		
		Arrays_Of_Objects_Elements[] chemicals = {
				new Arrays_Of_Objects_Elements("hydrogen", "H", 1.008,
						1, 1),
				new Arrays_Of_Objects_Elements("helium", "He", 4.0026,
						1, 18),
				new Arrays_Of_Objects_Elements("lithium", "Li", 6.94,
						2, 1),
				new Arrays_Of_Objects_Elements("beryllium", "Be", 
						9.0122, 2, 2)
		};

		double totalWeight = 0.0;
		for (Arrays_Of_Objects_Elements el: chemicals) {
			totalWeight += el.getWeight();
		}
		
		double averageWeight = totalWeight / chemicals.length;
		
		System.out.printf("Average atomic weight: %.3f\n", 
				averageWeight);

		
	}

}
