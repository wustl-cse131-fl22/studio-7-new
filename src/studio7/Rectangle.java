package studio7;


public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double calculateArea() {
		return length * width;
	}
	
	public double calculatePerimeter() {
		return 2*(length+width);
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true; 
		} else {
			return false;
		}
	}
	
	public boolean isSmallerThanAnotherRect(Rectangle r) {
		double areaR1 = calculateArea();
		double areaR2 = r.calculateArea();
		
		if (areaR1 < areaR2) {
			return true;
		} else {
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(3.0, 4.0);
		Rectangle rect2 = new Rectangle(10,10);
		System.out.println("The area of this rectangle is " + rect1.calculateArea());
		System.out.println("The perimeter of this rectangle is " + rect1.calculatePerimeter());
		System.out.println("Wheather the rectangle is a square: " + rect1.isSquare());
		System.out.println("Wheather rect1 is smaller than rect2: " + rect1.isSmallerThanAnotherRect(rect2));
	}
}
