package exercicioSecao8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2Employee {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Gross salary : ");
		Double grossSalary = sc.nextDouble();
		System.out.print("Tax : ");
		Double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary,tax);
		
		System.out.println();
		System.out.println("Employee: "+employee);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: "+employee);
		
		sc.close();
	}
}
