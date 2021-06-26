/*
 * Passing_Objects_To_Methods.java
 * needs a Circle class to work *** 
 * 
 * 
 * references to objects get passed as parameters
 * 
 * better to return new objects
 * 
 */

public class Passing_Objects_To_Methods {
	
	public static void resize(Circle c, double factor) {
		
		Circle result = new Circle(c.getRadius() * factor);
		return result;
		
	}

	public static void main(String[] args) {
		
		Circle myCircle = new Circle(3.5);
		
		// creates and returns a new circle object
		Circle newCircle = resize(myCircle, 1.1);
		

	}

}
