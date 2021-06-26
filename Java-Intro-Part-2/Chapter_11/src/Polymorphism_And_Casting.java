/*
 * Polymorphism_And_Casting.java
 * 
 * needs the other classes to work **** 
 * 
 * always use instanceOf 
 * 
 */

public class Polymorphism_And_Casting {

	public static void main(String[] args) {
		
		GeometricObject geo = new GeometricObject();
		Circle c = new Circle(3.0, "blue", true);
		Rectangle r = new Rectangle(4.5, "green", false);
		
		// this is the only one that will work! 
		double area1 = ((GeometricObject) c).getArea();
		System.out.printf("Cast Circle to GeometricObject area: "
				+ " %.3f\n", area1);
		
		
		double area2 = ((Circle) geo).getArea();
		System.out.printf("Cast Circle to GeometricObject area: "
				+ " %.3f\n", area2);
		
	}

}
