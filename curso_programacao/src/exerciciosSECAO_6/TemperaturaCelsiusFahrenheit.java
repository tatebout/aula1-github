package exerciciosSECAO_6;

import java.util.Locale;
import java.util.Scanner;

public class TemperaturaCelsiusFahrenheit {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double c;
		char r;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			System.out.printf("Equivalente em Fahrenheit: %.1f%n",((9*c)/5+32));
			System.out.print("Deseja repetir (s/n)? ");
			r = sc.next().charAt(0);
			
		}while(r == 's');
		
		System.out.println("FIM");
		sc.close();
	}
}
