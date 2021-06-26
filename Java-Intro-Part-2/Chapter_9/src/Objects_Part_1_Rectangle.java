/*
 * Rectangle.java 
 * 
 * serves as a BLUEPRINT to show what a rectangle is made of
 * 
 * 
 * constructors: functions with no return type : DEFAULT behavior
 * 
 * getter & setter methods
 * 
 */

public class Objects_Part_1_Rectangle {
	
	// class properties: things a class HAS
	double width;
	double height; 
	
	// constructs the object
	Objects_Part_1_Rectangle() {
		
		width = 1.0;
		height = 1.0;
	}
	
	// parameterized constructor
	Objects_Part_1_Rectangle(double w, double h) {
		
		width = w;
		height = h;
	}
	
	// getters
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2.0 * (width + height);
	}
	
	
	
}
