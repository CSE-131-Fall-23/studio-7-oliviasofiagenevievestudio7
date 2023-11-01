package studio7;

public class Rectangle {

	 // public double distanceBetween(int x1, int y1, int x2, int y2) {
	     
	private double length;
	private double width;
	
public Rectangle (double initLength, double initWidth) {
	
	length = initLength;
	width = initWidth;
	
}
	//calculate method
// is smaller than method
// is square
// get length or width method

public double getLength() {
	return length;
}

public double getWidth() {
	return width;
}


public double calculateArea() {
	
	double area = length * width;

		return area;
	}

public double calculatePerimeter() {
	
	double perimeter = (length*2) + (width*2);

		return perimeter;
}

public boolean isSmaller (Rectangle r) {
	if (r.calculateArea() < this.calculateArea()) {
		return true;
	}
	else {
		return false;
	}
}

public boolean isSquare () {
	
	if (length == width) {
		return true;
	}
	
	else {
		return false;
	}
	
}
	//  public double distanceBetween(Point p1, Point p2) {
		    
//every class should have its toString() method defined, so that the class can return a String with some meaningful information about the class. Generally, toString() methods should avoid invoking the toString() methods of any other class.

//Instance variables should be defined where necessary, but declared private to guard against accidental access or modification outside of the class holding the instance variables.	
public static void main(String[] args) {

	
	
	}
}
