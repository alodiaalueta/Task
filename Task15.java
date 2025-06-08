//TASK 15 ACTIVITY (

interface Shape {
	double calculateArea();
	double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
	String color;
	
	public AbstractShape(String color) {
		this.color = color;
	}
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}

class Circle extends AbstractShape {
	private final double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "\n==========" + "\n  CIRCLE" + "\n==========" + "\nColor = " + color + "\nRadius = " + radius;
	
}
}
class Rectangle extends AbstractShape {
	private final double length;
	private final double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	
	public double calculateArea() {
		return length * width;
	}
	

	public double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	
	public String toString() {
		return "===========" + "\n RECTANGLE" + "\n===========" + "\nColor = " + color +"\nLength = " + length +  "\nWidth = " + width;
	}
}

public class Task15 {
	public static void main(String[] args) {
		
		for (Shape shape: new Shape[]{
				new Circle("Yellow", 25.0),
				new Rectangle("Pink", 100.0, 60.0)}
		) {
			System.out.printf("\n%s\n", shape);
			System.out.printf("Area: %.2f \n", shape.calculateArea());
			System.out.printf("Perimeter: %.2f \n", shape.calculatePerimeter());
		}
	}
	
}