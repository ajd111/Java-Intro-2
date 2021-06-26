/*
 * Objects_Part_1_Main.java
 * 
 * rectangle area program
 * 
 * objects let us build a data structure where the related pieces
 * of information and their methods are right along side each other
 * 
 * 
 */

public class Objects_Part_1_Main {
	
	//public static double getArea(double width, double height) {
	//	return width * height;
	//}
	
	//public static double getPerimeter(double width, double height) {
	//	return 2.0 * (width + height);
	//}

	public static void main(String[] args) {	
		//double r1Width = 3.5;
		//double r1Height = 4.0;
		//System.out.printf("Rectangle 1 area: %f, perimeter: %f\n", 
		//		getArea(r1Width, r1Height), 
		//		getPerimeter(r1Width, r1Height));
		//double r2Width = 7.0;
		//double r2Height = 3.0;
		//System.out.printf("Rectangle 2 area: %f, perimeter: %f\n", 
		//		getArea(r2Width, r2Height), 
		//		getPerimeter(r2Width, r2Height));
		
		
		
		
		
		/*
		 * TEST THE RECTANGLE (Objects_Part_1_Rectangle.java)
		 */
		
		// construct a rectangle
		// these are INSTANCED of the class
		Objects_Part_1_Rectangle r1 = new Objects_Part_1_Rectangle();
		Objects_Part_1_Rectangle r2 = 
				new Objects_Part_1_Rectangle(3.0, 5.5);
		
		double area1 = r1.getArea();
		double perim1 = r1.getPerimeter();
		
		double area2 = r2.getArea();
		double perim2 = r2.getPerimeter();
		
		System.out.printf("area: %f perimeter: %f\n", area1, perim1);
		System.out.printf("area: %f perimeter: %f\n", area2, perim2);
		
	}

}
