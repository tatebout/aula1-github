package exercicioSecao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;

public class TaxPayerProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ic == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployess = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployess));
			}
		}
		
		
		Double totalTax=0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxPayer : list) {

			double tax = taxPayer.tax();
			
			System.out.println(taxPayer.getName()
								+": $ "
								+String.format("%.2f", tax));
			
			totalTax += tax;
		}
		
		System.out.println("TOTAL TAXES: "+String.format("%.2f", totalTax));
		
		sc.close();
	}
}
