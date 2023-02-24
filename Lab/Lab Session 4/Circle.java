package Shapes; // Declares the package name for this class.

public class Circle { // Defines a new class named Circle.

	private float radius; // Declares a private instance variable for the radius.
	float pi; // Declares a package-private instance variable for the value of pi.

	private Circle() { // Defines a private constructor for the Circle class.
		super(); // Calls the superclass constructor.
		this.radius = 1.5f; // Initializes the radius to a default value of 1.5.
	}

	Circle(float radius) { // Defines a public constructor that takes a radius as an argument.
		this(radius, 3.5f); // Calls the private constructor with a default value for pi.
	}

	private Circle(float radius, float pi) { // Defines a private constructor that takes a radius and pi value as arguments.
		super(); // Calls the superclass constructor.
		this.radius = radius; // Initializes the radius with the value passed in.
		this.pi = pi; // Initializes the pi value with the value passed in.
	}

	double calculateCircleArea(float radius) { // Defines a method to calculate the area of the circle based on the radius.
		double result; // Declares a local variable to hold the calculation result.
		result = pi * radius * radius; // Calculates the area using the formula.
		return result; // Returns the result.
	}

	double calculateCircumference(float radius) { // Defines a method to calculate the circumference of the circle based on the radius.
		double result; // Declares a local variable to hold the calculation result.
		result = 2 * pi * radius; // Calculates the circumference using the formula.
		return result; // Returns the result.
	}

	public static void main(String[] args) { // Defines the main method for the class.
		Circle circle = new Circle(25); // Creates a new Circle object with a radius of 25.
		double area = circle.calculateCircleArea(25); // Calculates the area of the circle and assigns it to a variable.
		System.out.println("Area of the circle is: " + area); // Prints out the calculated area.
		double circumference = circle.calculateCircumference(25); // Calculates the circumference of the circle and assigns it to a variable.
		System.out.println("Circumference of the circle is: " + circumference); // Prints out the calculated circumference.
	}
