package exercicioSecao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emoloyee;
import entities.OutsourcedEmployee;

public class EmployeeProgram {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Emoloyee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+" data:");
			
			System.out.print("Outsourced (y/n)? ");
			char yn = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(yn == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Emoloyee(name, hours, valuePerHour));
			}
			
			
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Emoloyee emoloyee : list) {
			System.out.println(emoloyee.getName() + " - $ "
					+String.format("%.2f", emoloyee.payment()));
		}
		
		sc.close();
	}
}
