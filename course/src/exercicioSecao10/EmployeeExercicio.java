package exercicioSecao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioSecao8.Employee;

public class EmployeeExercicio {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Emplyoee #"+i+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasID(list, id)) {
				System.out.println("Id already taken! Try again: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double grossSalary = sc.nextDouble();
			
			list.add(new Employee(id, name, grossSalary));
		}
		
		System.out.println();
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int buscarID = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == buscarID).findFirst().orElse(null);
		
//		Integer pos = position(list, buscarID);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
//			list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();
	}
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasID(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
