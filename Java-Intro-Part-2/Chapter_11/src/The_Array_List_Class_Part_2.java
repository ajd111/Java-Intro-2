/*
 * The_Array_List_Class_Part_2.java 
 * 
 * convert to array list program
 * 
 * the arraylist class has many methods
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class The_Array_List_Class_Part_2 {

	public static void main(String[] args) {
		
		String[] chemArray = {"H20", "NaCl", "H2SO4", "Co2"};
		String[] planetArray = {"Mercury", "Venus", "Earth", "Mars", 
				"Jupiter"};
		
		// here's one way to convert 
		ArrayList<String> chemList = new ArrayList<>();
		for (String chemical: chemArray) {
			chemList.add(chemical);
		}
		System.out.println(chemList);
		
		// here's another way to convert
		ArrayList<String> planetList = new ArrayList<>(
			Arrays.asList(planetArray));
		System.out.println(planetList);
		
	}

}
