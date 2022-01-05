package util;

public class Calculator {
	
	public final double PI = 3.14159;
	
	public double volume(double radius) {
		return 4*PI*radius*radius*radius/3;
	}

	public double circumference(double radius) {
		return 2.0*PI*radius;
	}
}
