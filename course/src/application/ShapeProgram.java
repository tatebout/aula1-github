package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Shape;
import entities.enums.Color;
import exercicioSecao14.Rectangle;

public class ShapeProgram {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		Double width = 0.0, height = 0.0, radius = 0.0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #"+i+" data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char rc = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(rc == 'r') {
				System.out.print("Width: ");
				width = sc.nextDouble();
				
				System.out.print("Height: ");
				height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.print("Radius: ");
				radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
//			System.out.printf("%.2f%n", shape.area());
//			OU
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();
	}
}
