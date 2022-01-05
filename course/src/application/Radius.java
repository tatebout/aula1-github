package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Radius {
	
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		Calculator cal = new Calculator();
		
		double c = cal.circumference(radius);
		
		double v = cal.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n",cal.PI);
		
		sc.close();
	}

	
}
