package exercicioSecao15;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Account2Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		try {
			acc.withdraw(amount);
			System.out.println(acc.toString());
		}catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
