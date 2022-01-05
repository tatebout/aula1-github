package exercicioSecao8;

import java.util.Locale;
import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			
			account = new Account(number, holder, balance);
		}else {
			
			account = new Account(number, holder);
		}
		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		
		sc.close();
	}
}
