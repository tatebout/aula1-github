package exerciciosSECAO_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercisio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, num2, quantidade, quantidade2;
		double valor, valor2;
		
		num = sc.nextInt();
		quantidade = sc.nextInt();
		valor = sc.nextDouble();
		sc.nextLine();
		
		num2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: %.2f%n", ((quantidade*valor)+(valor2*quantidade2)));
		
		sc.close();
	}
}
